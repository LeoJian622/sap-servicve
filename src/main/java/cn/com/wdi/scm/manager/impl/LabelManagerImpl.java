package cn.com.wdi.scm.manager.impl;

import cn.com.wdi.scm.converter.OutOfSaleLabelDTO2WdiPoLabelConverter;
import cn.com.wdi.scm.dto.MaterialInfoDTO;
import cn.com.wdi.scm.dto.OutOfSaleLabelDTO;
import cn.com.wdi.scm.dto.PurchaseOrdersDTO;
import cn.com.wdi.scm.dto.WdiPoPakeDTO;
import cn.com.wdi.scm.exception.ScmException;
import cn.com.wdi.scm.manager.LabelManager;
import cn.com.wdi.scm.mapper.ekp.*;
import cn.com.wdi.scm.model.ekp.*;
import cn.com.wdi.scm.model.master.ScmPerson;
import cn.com.wdi.scm.sap.api.service.CustomJcoService;
import cn.com.wdi.scm.sap.api.utils.R;
import cn.com.wdi.scm.util.UserUtil;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

import static org.mybatis.dynamic.sql.SqlBuilder.*;

/**
 * 外购标签信息服务实现
 *
 * @author liyongjian
 * @create 2020-04-10 11:10
 */
@Slf4j
@Service
public class LabelManagerImpl implements LabelManager {

    @Autowired
    private WdiMatnrMaktMapper wdiMatnrMaktMapper;

    @Autowired
    private WdiMatnrMarcMapper wdiMatnrMarcMapper;

    @Autowired
    private WdiMatnrMardMapper wdiMatnrMardMapper;

    @Autowired
    private WdiPoIdjlMapper wdiPoIdjlMapper;

    @Autowired
    private WdiPoLabelMapper wdiPoLabelMapper;

    @Autowired
    private WdiPoPakeMapper wdiPoPakeMapper;

    @Autowired
    private CustomJcoService customJcoService;


    /**
     * 查询物料号相关信息
     *
     * @param materialNo 物料号
     * @param supplierNo 供应商编号
     * @return MaterialInfoVO 物料基础信息
     */
    @SuppressWarnings("unchecked")
    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
    public MaterialInfoDTO queryMaterialOutSaleLabelInfo(String materialNo, String supplierNo) throws ScmException {
        MaterialInfoDTO materialInfoDTO = new MaterialInfoDTO();
        try {
            materialInfoDTO.setDescription(getMaktInfo(materialNo));
            materialInfoDTO.setStock(getMardInfo(materialNo));
            materialInfoDTO.setStockId(getMarcInfo(materialNo));
            materialInfoDTO.setPakes(getPacketInfo(materialNo)
                    .stream()
                    .map(x -> WdiPoPakeDTO.builder().fdPackType(x.getFdPackType()).fdQty(x.getFdQty()).build())
                    .collect(Collectors.toList())
            );

            Map<String, Object> sapPoList = getSapPoList(materialNo, supplierNo, "2");
            if (StringEnum.E.equals(sapPoList.get(StringEnum.FLAGE.getValue()))) {
                log.error("SAP查询PO失败：[{}]", sapPoList.get(StringEnum.MSG.getValue()));
                throw new ScmException("SAP查询PO失败：" + sapPoList.get(StringEnum.MSG.getValue()));
            }
            List<Map<String, Object>> poList = (List<Map<String, Object>>) sapPoList.get("OMDEZ");
            List<PurchaseOrdersDTO> purchaseOrdersDTOList = new ArrayList<>(poList.size());
            for (Map<String, Object> v : poList) {
                PurchaseOrdersDTO purchaseOrdersDTO = new PurchaseOrdersDTO();
                Optional<Object> Stringpo = Optional.ofNullable(v).map(x -> x.get("EXTRA"));
                purchaseOrdersDTO.setPoNo((String) Stringpo.orElse(""));
                purchaseOrdersDTOList.add(purchaseOrdersDTO);
            }
            materialInfoDTO.setPurchaseOrderses(purchaseOrdersDTOList);

        } catch (ScmException e) {
            log.error("物料信息查询失败：[{}]", e.getMessage());
            throw e;
        }
        return materialInfoDTO;
    }


    /**
     * 生成标签
     *
     * @param unit              单位数量
     * @param total             总数量
     * @param outOfSaleLabelDTO 标签基础信息
     * @return List<WdiPoLabel> 标签List
     * @throws ScmException 系统异常信息
     */
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public List<WdiPoLabel> insertLabels(Integer unit, Integer total, OutOfSaleLabelDTO outOfSaleLabelDTO) throws ScmException {
        int count = total % unit == 0 ? total / unit : total / unit + 1;
        int rest = total % unit;
        int starIndex = updateLabelId(count);

        Map<String, Object> sapPoList = getSapPoList(outOfSaleLabelDTO.getMaterialId(), outOfSaleLabelDTO.getSupplyId(), "3");
        if (StringEnum.E.equals(sapPoList.get(StringEnum.FLAGE.getValue()))) {
            log.error("SAP查询PO失败：[{}]", sapPoList.get(StringEnum.MSG.getValue()));
            throw new ScmException("SAP查询PO失败：" + sapPoList.get(StringEnum.MSG.getValue()));
        }
        String flag = (String) Optional.ofNullable(sapPoList.get("SBDKZ")).orElseThrow(() -> new ScmException("订单类型查询失败！"));

        List<WdiPoLabel> newLabelList = new ArrayList<>(count);
        //获取登录用户名
        String user = Optional.ofNullable(UserUtil.getLoginUser()).map(ScmPerson::getName).orElse("");
        for (int i = 0; i < count; i++) {
            WdiPoLabel temp = OutOfSaleLabelDTO2WdiPoLabelConverter.convert(outOfSaleLabelDTO);
            if (i + 1 == count && rest != 0) {
                temp.setFdQuantity(Integer.toString(rest));
            } else {
                temp.setFdQuantity(Integer.toString(unit));
            }
            temp.setFdTotalQuantity(Integer.toString(total));
            temp.setFdFlag(flag);
            temp.setFdId(getLabelSerialID(++starIndex));
            temp.setDocCreateName(user);
            temp.setFdUserId(user);
            temp.setDocCreateTime(new Date());
            temp.setFdLabelStatus("已打印");
            newLabelList.add(temp);
        }
        wdiPoLabelMapper.insertMultiple(newLabelList);
        return newLabelList;
    }

    /**
     * 获取标签ID
     *
     * @param count 生成标签的数量
     * @return
     */
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
    public int updateLabelId(int count) {
        SelectStatementProvider selectStatementProvider = select(WdiPoIdjlMapper.selectList)
                .from(WdiPoIdjlDynamicSqlSupport.wdiPoIdjl)
                .where(WdiPoIdjlDynamicSqlSupport.fdPrefix, isEqualTo("WS"))
                .build()
                .render(RenderingStrategies.MYBATIS3);
        WdiPoIdjl wdiPoIdjl = wdiPoIdjlMapper.selectOne(selectStatementProvider).orElse(new WdiPoIdjl());
        int startIndex = wdiPoIdjl.getFdValue();
        wdiPoIdjl.setFdValue(startIndex + count);
        wdiPoIdjlMapper.updateByPrimaryKey(wdiPoIdjl);
        return startIndex;
    }

    /**
     * 通过物料号查询物料描述
     *
     * @param material 物料号
     * @return description 物料描述
     * @throws ScmException
     */
    private String getMaktInfo(String material) throws ScmException {
        SelectStatementProvider selectStatementProvider = select(WdiMatnrMaktMapper.selectList)
                .from(WdiMatnrMaktDynamicSqlSupport.wdiMatnrMakt)
                .where(WdiMatnrMaktDynamicSqlSupport.fdMatnr, isEqualTo(material))
                .and(WdiMatnrMaktDynamicSqlSupport.fdSpras, isEqualTo("1"))
                .build()
                .render(RenderingStrategies.MYBATIS3);
        return wdiMatnrMaktMapper.selectOne(selectStatementProvider).map(WdiMatnrMakt::getFdMaktx).orElseThrow(() -> new ScmException("物料：" + material + "找不到相关描述"));
    }

    /**
     * 通过物料号查询储位
     *
     * @param material 物料号
     * @return stock    储位
     * @throws ScmException
     */
    private String getMardInfo(String material) throws ScmException {
        SelectStatementProvider selectStatementProvider = select(WdiMatnrMardMapper.selectList)
                .from(WdiMatnrMardDynamicSqlSupport.wdiMatnrMard)
                .where(WdiMatnrMardDynamicSqlSupport.fdMatnr, isEqualTo(material))
                .build()
                .render(RenderingStrategies.MYBATIS3);
        List<WdiMatnrMard> result = wdiMatnrMardMapper.selectMany(selectStatementProvider);
        Optional<WdiMatnrMard> optionalWdiMatnrMarc = Optional.ofNullable(result).filter(v -> !v.isEmpty()).map(v -> v.get(0));
        return optionalWdiMatnrMarc.map(WdiMatnrMard::getFdLgpbe).orElseThrow(() -> new ScmException("物料：" + material + "找不到相关储位"));
    }

    /**
     * 通过物料号查询库位
     *
     * @param material 物料号
     * @return stockId 库位
     * @throws ScmException
     */
    private String getMarcInfo(String material) throws ScmException {
        SelectStatementProvider selectStatementProvider = select(WdiMatnrMarcMapper.selectList)
                .from(WdiMatnrMarcDynamicSqlSupport.wdiMatnrMarc)
                .where(WdiMatnrMarcDynamicSqlSupport.fdMatnr, isEqualTo(material))
                .build()
                .render(RenderingStrategies.MYBATIS3);
        List<WdiMatnrMarc> result = wdiMatnrMarcMapper.selectMany(selectStatementProvider);
        Optional<WdiMatnrMarc> optionalWdiMatnrMarc = Optional.ofNullable(result).filter(v -> !v.isEmpty()).map(v -> v.get(0));
        return optionalWdiMatnrMarc.map(WdiMatnrMarc::getFdLgpro).orElseThrow(() -> new ScmException("物料：" + material + "找不到相关库位"));
    }

    /**
     * 通过物料号查询物料描述
     *
     * @param material 物料号
     * @return packet 包装方式列表
     * @throws ScmException
     */
    private List<WdiPoPake> getPacketInfo(String material) throws ScmException {
        SelectStatementProvider selectStatementProvider = select(WdiPoPakeMapper.selectList)
                .from(WdiPoPakeDynamicSqlSupport.wdiPoPake)
                .where(WdiPoPakeDynamicSqlSupport.fdMaterial, isEqualTo(material))
                .build()
                .render(RenderingStrategies.MYBATIS3);
        List<WdiPoPake> result;
        result = wdiPoPakeMapper.selectMany(selectStatementProvider);
        return Optional.ofNullable(result).orElse(new ArrayList<WdiPoPake>());
    }


    /**
     * SAP采购订单查询
     *
     * @param material   物料号
     * @param supplierNo 供应商编号
     * @param type       查询类型
     * @return sap返回对象
     * @throws ScmException
     */
    @SuppressWarnings({"unchecked"})
    private Map<String, Object> getSapPoList(String material, String supplierNo, String type) throws ScmException {
        Map<String, Object> input = new HashMap<>();
        input.put(StringEnum.LIFNR.getValue(), supplierNo);
        input.put(StringEnum.MATNR.getValue(), material);
        input.put(StringEnum.TYPEX.getValue(), type);
        //执行SAP函数
        R result = customJcoService.execute(StringEnum.Z_OA_LJCPOMRP.getValue(), StringEnum.PRD800.getValue(), input);
        Map<String, Object> dataMap = (Map<String, Object>) result.getData();
        return Optional.ofNullable(dataMap).orElseThrow(() -> new ScmException("物料:" + material + "SAP查询PO失败"));
    }

    /**
     * 标签ID格式化
     *
     * @param x
     * @return
     */
    private String getLabelSerialID(int x) {
        return String.format("WS%08d", x);
    }

    /**
     * SAP调用相关枚举
     */
    private enum StringEnum {
        /**
         * SAP数据库名
         */
        PRD800("PRD800"),
        /**
         * 函数名
         */
        Z_OA_LJCPOMRP("Z_OA_LJCPOMRP"),
        /**
         * 供应商参数名
         */
        LIFNR("LIFNR"),
        /**
         * 物料参数名
         */
        MATNR("MATNR"),
        /**
         * 类型参数名
         */
        TYPEX("TYPEX"),
        /**
         * 返回值参数名
         */
        FLAGE("FLAG"),
        /**
         * FLAG成功返回值
         */
        E("E"),
        /**
         * FLAG失败返回值
         */
        S("S"),
        /**
         * 返回信息
         */
        MSG("MSG"),
        ;

        private String value;

        StringEnum(String value) {
            this.value = value;

        }

        public String getValue() {
            return value;
        }
    }

}
