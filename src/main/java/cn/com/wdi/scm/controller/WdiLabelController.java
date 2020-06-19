package cn.com.wdi.scm.controller;

import cn.com.wdi.scm.converter.WdiPoLabel2OutOfSaleLabelVOConverter;
import cn.com.wdi.scm.dto.MaterialInfoDTO;
import cn.com.wdi.scm.manager.LabelManager;
import cn.com.wdi.scm.model.ekp.WdiPoLabel;
import cn.com.wdi.scm.query.WdiPoLabelQuery;
import cn.com.wdi.scm.service.WdiPoLabelService;
import cn.com.wdi.scm.util.UserUtil;
import cn.com.wdi.scm.vo.OutOfSaleLabelGenerateVO;
import cn.com.wdi.scm.vo.OutOfSaleLabelVO;
import cn.com.wdi.scm.vo.QueryDataVO;
import cn.com.wdi.scm.vo.ReturnBodyVO;
import com.alibaba.druid.util.StringUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 标签生成控制器
 *
 * @author liyongjian
 * @date 2020-04-15 16:52
 */

@Api(value = "标签接口", tags = "label-controller")
@RequestMapping("/label")
@RestController
public class WdiLabelController {

    @Autowired
    LabelManager labelManager;

    @Autowired
    WdiPoLabelService wdiPoLabelService;

    /**
     * 根据供应商和料号查询料号采购信息等
     *
     * @param material 物料号
     * @param supplier 供应商编号
     * @return 标签信息
     * @throws Exception
     */
    @ApiOperation(value = "查询标签信息", notes = "根据物料和供应商编码查询标签采购信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "material", value = "物料号", required = true, dataType = "String"),
            @ApiImplicitParam(name = "supplier", value = "供应商编号", required = true, dataType = "String"),
    })
    @GetMapping("/info/{material}/{supplier}")
    public ReturnBodyVO<MaterialInfoDTO> info(@PathVariable String material, @PathVariable String supplier) throws Exception {
        return new ReturnBodyVO<>(labelManager.queryMaterialOutSaleLabelInfo(material, supplier));
    }

    /**
     * 生成标签
     *
     * @param outOfSaleLabelGenerateVO 标签信息
     * @return 生成的标签列表
     * @throws Exception
     */
    @ApiOperation(value = "生成标签", notes = "根据所填标签信息及数量，生成标签")
    @ApiImplicitParam(name = "outOfSaleLabelGenerateVO", value = "标签信息实体OutOfSaleLabelGenerateVO", required = true, dataType = "OutOfSaleLabelGenerateVO")
    @PostMapping("/generate")
    public ReturnBodyVO<List<OutOfSaleLabelVO>> generate(@RequestBody OutOfSaleLabelGenerateVO outOfSaleLabelGenerateVO) throws Exception {
        List<WdiPoLabel> labelList = labelManager.insertLabels(outOfSaleLabelGenerateVO.getUnit(), outOfSaleLabelGenerateVO.getTotal(), outOfSaleLabelGenerateVO.getOutOfSaleLabel());

        return new ReturnBodyVO<>(labelList.stream().map(WdiPoLabel2OutOfSaleLabelVOConverter::convert).collect(Collectors.toList()));
    }


    /**
     * 显示标签列表
     * 根据物料号、供应商编号、登陆名查询
     *
     * @param targetId 标签ID
     * @param material 物料号
     * @param userName 创建账号
     * @param supplyId 供应商编号
     * @param sDate    日期起始
     * @param eDate    日期结束
     * @param page     页数
     * @param row      每页行数
     * @return List<OutOfSaleLabelVO>标签信息
     * @throws Exception
     */
    @ApiOperation(value = "查询标签信息", notes = "查询标签，并可根据标签ID、物料号、供应商编号、生产时间-开始、生产时间-结束")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "targetId", value = "标签ID", dataType = "String"),
            @ApiImplicitParam(name = "material", value = "物料编号", dataType = "String"),
            @ApiImplicitParam(name = "userName", value = "用户名", dataType = "String"),
            @ApiImplicitParam(name = "supplyId", value = "供应商编号", dataType = "String"),
            @ApiImplicitParam(name = "sDate", value = "起始日期", dataType = "Date"),
            @ApiImplicitParam(name = "eDate", value = "结束日期", dataType = "Date"),
            @ApiImplicitParam(name = "page", value = "页数", dataType = "Integer", defaultValue = "1"),
            @ApiImplicitParam(name = "row", value = "每页行数", dataType = "Integer", defaultValue = "15")
    })
    @GetMapping("/search")
    public ReturnBodyVO<QueryDataVO> list(String targetId,
                             String material,
                             String userName,
                             String supplyId,
                             Date sDate,
                             Date eDate,
                             @RequestParam(value = "page", defaultValue = "1") Integer page,
                             @RequestParam(value = "row", defaultValue = "15") Integer row) throws Exception {
        userName = Optional.ofNullable(userName).filter(StringUtils::isEmpty)
                .orElse(Objects.requireNonNull(UserUtil.getLoginUser()).getName());
        WdiPoLabelQuery wdiPoLabelQuery = WdiPoLabelQuery
                .builder()
                .targetId(targetId)
                .supplyId(supplyId)
                .material(material)
                .name(userName)
                .sDate(sDate)
                .eDate(eDate)
                .page(page)
                .row(row)
                .build();

        List<WdiPoLabel> result = wdiPoLabelService.selectByWdiPoLabelQuery(wdiPoLabelQuery);

        QueryDataVO queryDataVO = QueryDataVO.builder()
                .targetId(targetId)
                .material(material)
                .userName(userName)
                .supplyId(supplyId)
                .sDate(sDate)
                .eDate(eDate)
                .page(page)
                .row(row)
                .pageList(result.stream()
                        .skip(row * page)
                        .limit(row)
                        .map(WdiPoLabel2OutOfSaleLabelVOConverter::convert)
                        .collect(Collectors.toList()))
                .build();
        return new ReturnBodyVO<>(queryDataVO);
    }

    /**
     * 显示全部标签列表
     *
     * @param targetId 标签ID
     * @param material 物料号
     * @param userName 创建账号
     * @param supplyId 供应商编号
     * @param sDate    日期起始
     * @param eDate    日期结束
     * @param page     页数
     * @param row      每页行数
     * @return List<OutOfSaleLabelVO>标签信息
     * @throws Exception
     */
    @ApiOperation(value = "标签列表", notes = "查询全部标签，并可根据标签ID、物料号、供应商编号、创建人、生产时间-开始、生产时间-结束")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "targetId", value = "标签ID", dataType = "String"),
            @ApiImplicitParam(name = "material", value = "物料编号", dataType = "String"),
            @ApiImplicitParam(name = "userName", value = "用户名", dataType = "String"),
            @ApiImplicitParam(name = "supplyId", value = "供应商编号", dataType = "String"),
            @ApiImplicitParam(name = "sDate", value = "起始日期", dataType = "Date"),
            @ApiImplicitParam(name = "eDate", value = "结束日期", dataType = "Date"),
            @ApiImplicitParam(name = "page", value = "页数", dataType = "Integer", defaultValue = "1"),
            @ApiImplicitParam(name = "row", value = "每页行数", dataType = "Integer", defaultValue = "15")
    })
    @GetMapping("/listall")
    public ReturnBodyVO<QueryDataVO> listall(String targetId,
                                String material,
                                String userName,
                                String supplyId,
                                Date sDate,
                                Date eDate,
                                @RequestParam(defaultValue = "1") Integer page,
                                @RequestParam(defaultValue = "15") Integer row) throws Exception {
        WdiPoLabelQuery wdiPoLabelQuery = WdiPoLabelQuery
                .builder()
                .targetId(targetId)
                .supplyId(supplyId)
                .material(material)
                .name(userName)
                .sDate(sDate)
                .eDate(eDate)
                .page(page)
                .row(row)
                .build();
        List<WdiPoLabel> result = wdiPoLabelService.selectByWdiPoLabelQuery(wdiPoLabelQuery);
        QueryDataVO queryDataVO = QueryDataVO.builder()
                .targetId(targetId)
                .material(material)
                .userName(userName)
                .supplyId(supplyId)
                .sDate(sDate)
                .eDate(eDate)
                .page(page)
                .row(row)
                .pageList(result.stream()
                        .skip(row * page)
                        .limit(row)
                        .map(WdiPoLabel2OutOfSaleLabelVOConverter::convert)
                        .collect(Collectors.toList()))
                .build();
        return new ReturnBodyVO<>(queryDataVO);
    }

}
