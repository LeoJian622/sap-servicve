package cn.com.wdi.scm.sap.api.service.impl;

import cn.com.wdi.scm.converter.SapConfig2PropertiesConverter;
import cn.com.wdi.scm.mapper.master.SapConfigDynamicSqlSupport;
import cn.com.wdi.scm.mapper.master.SapConfigMapper;
import cn.com.wdi.scm.mapper.master.SapFunctionDynamicSqlSupport;
import cn.com.wdi.scm.mapper.master.SapFunctionMapper;
import cn.com.wdi.scm.model.master.SapConfig;
import cn.com.wdi.scm.model.master.SapFunction;
import cn.com.wdi.scm.sap.CustomJcoStringEnum;
import cn.com.wdi.scm.sap.api.config.CustomDestinationDataProvider;
import cn.com.wdi.scm.sap.api.exception.CustomBusinessException;
import cn.com.wdi.scm.sap.api.service.CustomJcoService;
import cn.com.wdi.scm.sap.api.utils.R;
import com.alibaba.druid.util.StringUtils;
import com.sap.conn.jco.*;
import com.sap.conn.jco.ext.Environment;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static org.mybatis.dynamic.sql.SqlBuilder.select;

/**
 * SAP RFC 调用服务类实现
 *
 * @author liyongjian
 * @create 2020-03-14 14:25
 */

@Slf4j
@Service
public class CustomJcoServiceImpl implements CustomJcoService {

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    private final CustomDestinationDataProvider customDestinationDataProvider;

    private final SapConfigMapper sapConfigMapper;

    private final SapFunctionMapper sapFunctionMapper;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    public CustomJcoServiceImpl(CustomDestinationDataProvider customDestinationDataProvider, SapConfigMapper sapConfigMapper, SapFunctionMapper sapFunctionMapper) {
        this.customDestinationDataProvider = customDestinationDataProvider;
        this.sapConfigMapper = sapConfigMapper;
        this.sapFunctionMapper = sapFunctionMapper;
    }

    /**
     * 获取输出参数列表
     *
     * @param jCoFunction 函数
     * @param resultMap   返回值
     */
    public static void getExportParameterList(JCoFunction jCoFunction, Map resultMap) {
        for (Iterator<JCoField> iterator = jCoFunction.getExportParameterList().iterator(); iterator.hasNext(); ) {
            traversalField(resultMap, iterator);
        }
    }

    /**
     * 获取表格输出列表
     *
     * @param jCoFunction 函数
     * @param resultMap   返回值
     */
    public static void getTableParameterList(JCoFunction jCoFunction, Map resultMap) {
        for (Iterator<JCoField> iterator = jCoFunction.getTableParameterList().iterator(); iterator.hasNext(); ) {
            traversalField(resultMap, iterator);
        }
    }

    /**
     * 遍历字段
     *
     * @param resultMap 返回值
     * @param iterator  迭代器
     */
    private static void traversalField(Map resultMap, Iterator<JCoField> iterator) {
        JCoField jCoField = iterator.next();
        if (jCoField.isTable()) {
            JCoTable table = jCoField.getTable();
            List resultList = new ArrayList();
            for (int i = 0, len = table.getNumRows(); i < len; i++) {
                Map retMap = new HashMap();
                table.setRow(i);
                for (JCoRecordFieldIterator jCoRecordFieldIterator = table.getRecordFieldIterator(); jCoRecordFieldIterator.hasNextField(); ) {
                    JCoField field = jCoRecordFieldIterator.nextRecordField();
                    retMap.put(field.getName(), field.getValue());
                }
                resultList.add(retMap);
            }
            resultMap.put(jCoField.getName(), resultList);
        } else if (jCoField.isStructure()) {
            JCoStructure jCoStructure = (JCoStructure) jCoField;
            Map resultStructureMap = new HashMap();
            for (JCoFieldIterator jCoFieldIterator = jCoStructure.getFieldIterator(); jCoFieldIterator.hasNextField(); ) {
                JCoField jcf = jCoFieldIterator.nextField();
                resultStructureMap.put(jcf.getName(), jcf.getValue());
            }
            resultMap.put(jCoField.getName(), resultStructureMap);
        } else {
            resultMap.put(jCoField.getName(), jCoField.getValue());
        }
    }

    /**
     * 初始化时候注册provider
     */
    @PostConstruct
    public void init() {
        log.info("init and registered provider start");
        Environment.registerDestinationDataProvider(customDestinationDataProvider);
        SelectStatementProvider selectStatementProvider = select(SapConfigDynamicSqlSupport.id, SapConfigDynamicSqlSupport.destName, SapConfigDynamicSqlSupport.ashost, SapConfigDynamicSqlSupport.sysnr, SapConfigDynamicSqlSupport.client, SapConfigDynamicSqlSupport.username, SapConfigDynamicSqlSupport.paswword, SapConfigDynamicSqlSupport.poolCapacity, SapConfigDynamicSqlSupport.peakLimit, SapConfigDynamicSqlSupport.sapRouter, SapConfigDynamicSqlSupport.lang)
                .from(SapConfigDynamicSqlSupport.sapConfig)
                .build()
                .render(RenderingStrategies.MYBATIS3);
        List<SapConfig> sapServerConfigList = sapConfigMapper.selectMany(selectStatementProvider);
        for (SapConfig value : sapServerConfigList) {
            try {
                customDestinationDataProvider.changeProperties(value.getDestName(), SapConfig2PropertiesConverter.convert(value));
            } catch (Exception e) {
                log.error("init failed : [{}]", ExceptionUtils.getFullStackTrace(e));
            }
        }
        log.info("init and registered provider end！");

    }

    /**
     * SAP链接测试
     *
     * @param destName 服务器名
     * @return
     */
    @Override
    public R pingCalls(String destName) {
        JCoDestination destination = null;
        try {
            destination = JCoDestinationManager.getDestination(destName);
            destination.ping();
            return new R<>(R.SUCCESS, "success");
        } catch (JCoException e) {
            return new R<>(R.FAIL, ExceptionUtils.getFullStackTrace(e));
        }


    }

    /**
     * 传入功能名称和Map类型参数
     * 用于执行单个SAP函数
     *
     * @param callName 函数名
     * @param paramMap 参数
     * @return R
     */

    @Override
    public R execute(String callName, Map<String, Object> paramMap) {
        Map resultMap = new HashMap<>();

        //传入参数---------------------------------------------------------

        try {
            SapFunction sapFunction = getFunctionName(callName);
            String destName = getDestName(sapFunction.getConfigId());
            JCoDestination jCoDestination = getJcoDestination(destName);
            JCoFunction jCoFunction = setFunctionParameter(jCoDestination, sapFunction.getFunctionName(), paramMap);

            JCoContext.begin(jCoDestination);

            try {
                jCoFunction.execute(jCoDestination);
            } finally {
                JCoContext.end(jCoDestination);
            }

            if (null != jCoFunction.getExportParameterList()) {
                getExportParameterList(jCoFunction, resultMap);
            }

            if (null != jCoFunction.getTableParameterList()) {
                getTableParameterList(jCoFunction, resultMap);
            }

        } catch (Exception e) {
            return new R(R.FAIL, ExceptionUtils.getFullStackTrace(e));
        }
        return new R<Map>(resultMap);
    }

    /**
     * 获取JCO链接
     *
     * @param destName 库名
     * @return
     * @throws JCoException
     */
    public JCoDestination getJcoDestination(String destName) throws JCoException {
        return JCoDestinationManager.getDestination(destName);
    }

    /**
     * 设置函数参数
     *
     * @param jCoDestination JCO链接
     * @param functionName   函数名
     * @param paramMap       参数
     * @return function
     * @throws CustomBusinessException
     * @throws JCoException
     */
    @SuppressWarnings("unchecked")
    public JCoFunction setFunctionParameter(JCoDestination jCoDestination, String functionName, Map<String, Object> paramMap) throws CustomBusinessException, JCoException {
        JCoFunction function = jCoDestination.getRepository().getFunction((functionName));
        if (null == function) {
            throw new CustomBusinessException(functionName + "不存在");
        }

        JCoParameterList input = function.getImportParameterList();
        if (null != paramMap) {
            for (Iterator<Map.Entry<String, Object>> it = paramMap.entrySet().iterator(); it.hasNext(); ) {
                Map.Entry<String, Object> pairs = it.next();
                if (pairs.getValue() instanceof List) {
                    setTableParamList(function, pairs);
                } else if (pairs.getValue() instanceof Map) {
                    setImportParameterList(function, pairs);
                } else {
                    input.setValue(pairs.getKey(), pairs.getValue());
                }
            }
        }
        return function;
    }

    /**
     * 根据函数调用 获取服务器连接名
     *
     * @param callName 调用函数名
     * @return 服务器连接名
     * @throws CustomBusinessException
     */
    private SapFunction getFunctionName(String callName) throws Exception {
        SelectStatementProvider selectStatementProvider = select(SapFunctionMapper.selectList)
                .from(SapFunctionDynamicSqlSupport.sapFunction)
                .where(SapFunctionDynamicSqlSupport.callName, isEqualTo(callName))
                .build()
                .render(RenderingStrategies.MYBATIS3);
         return sapFunctionMapper.selectOne(selectStatementProvider).orElseThrow(() -> new Exception("找不到函数配置"));
    }

    /**
     * 根据函数调用 获取服务器连接名
     *
     * @param sapConfigId 调用函数名
     * @return 服务器连接名
     * @throws CustomBusinessException
     */
    private String getDestName(String sapConfigId) throws Exception {
        SelectStatementProvider selectStatementProvider1 = select(SapConfigDynamicSqlSupport.destName)
                .from(SapConfigDynamicSqlSupport.sapConfig)
                .where(SapConfigDynamicSqlSupport.id,isEqualTo(sapConfigId))
                .build()
                .render(RenderingStrategies.MYBATIS3);
        return sapConfigMapper.selectOne(selectStatementProvider1).map(SapConfig::getDestName).orElseThrow(() -> new Exception("找不到服务器配置"));
    }


    /**
     * 设置表格参数
     *
     * @param function SAP函数
     * @param pairs    参数
     * @throws CustomBusinessException
     */
    private void setTableParamList(JCoFunction function, Map.Entry<String, Object> pairs) throws CustomBusinessException {
        Map<String, String> pairsMap = (Map<String, String>) pairs.getValue();
        //根据表名获取表参数结构
        JCoTable jCoTable = function.getTableParameterList().getTable(pairs.getKey());
        List ls = (List) pairs.getValue();

        for (int i = 0, len = ls.size(); i < len; i++) {
            Map<String, String> rowData = (Map<String, String>) ls.get(i);
            jCoTable.appendRow();
            //循环表的列字段进行数据填充
            setFieldValue(rowData, jCoTable.getFieldIterator());
        }
    }

    /**
     * 列表参数填充
     *
     * @param function SAP函数
     * @param paris    参数
     * @throws CustomBusinessException
     */
    @SuppressWarnings("unchecked")
    private void setImportParameterList(JCoFunction function, Map.Entry<String, Object> paris) throws CustomBusinessException {
        Map<String, String> pairsMap = (Map<String, String>) paris.getValue();
        JCoStructure jCoStructure = function.getImportParameterList().getStructure(paris.getKey());
        setFieldValue(pairsMap, jCoStructure.getFieldIterator());
    }

    /**
     * 设置字段值
     *
     * @param rowData       参数值
     * @param fieldIterator 迭代器
     * @throws CustomBusinessException
     */
    private void setFieldValue(Map<String, String> rowData, JCoFieldIterator fieldIterator) throws CustomBusinessException {
        for (JCoFieldIterator jCoFieldIterator = fieldIterator; jCoFieldIterator.hasNextField(); ) {
            JCoField jCoField = jCoFieldIterator.nextField();

            if (rowData.containsKey(jCoField.getName())) {
                if (CustomJcoStringEnum.DATA_TYPE_DATE.getValue().equalsIgnoreCase(jCoField.getTypeAsString())) {
                    //日期时间参数的值要进行解析
                    if (!StringUtils.isEmpty(rowData.get(jCoField.getName()))) {
                        try {
                            jCoField.setValue(simpleDateFormat.parse(rowData.get(jCoField.getName())));
                        } catch (ParseException e) {
                            e.printStackTrace();
                            log.error("SAP表格参数输入，时间解析错误。");
                            throw new CustomBusinessException(e);
                        }
                    } else {
                        jCoField.setValue("");
                    }
                } else {
                    //非日期时间参数填充
                    if (null == rowData.get(jCoField.getName())) {
                        log.error("参数 [{}] 为null", jCoField.getName());
                        throw new CustomBusinessException("参数: " + jCoField.getName() + " 为null");
                    }
                    jCoField.setValue(rowData.get(jCoField.getName()));
                }
            }
        }
    }

}
