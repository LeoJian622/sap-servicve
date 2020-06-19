package cn.com.wdi.scm.controller;

import cn.com.wdi.scm.model.master.SapConfig;
import cn.com.wdi.scm.query.SapConfigQuery;
import cn.com.wdi.scm.sap.api.service.SapConfigService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * SAP服务器连接信息
 *
 * @author liyongjian
 * @create 2020-05-11 16:20
 */

@Api(value = "SAPf服务器信息接口", tags = "SAP-Server-Config-controller")
@RestController
@RequestMapping("/sap")
public class SapConfigController {

    @Autowired
    SapConfigService sapConfigService;

    /**
     * 获取SAP配置信息
     *
     * @param id 主键ID
     * @return SapConfig SAP服务器配置
     * @throws Exception
     */
    @ApiOperation(value = "获取SAP配置信息", notes = "根据ID号获取SAP服务器配置信息")
    @ApiImplicitParam(name = "id", value = "主键ID", required = true, dataType = "String")
    @RequestMapping(value = "/sapConfig/{id}", method = RequestMethod.GET)
    public SapConfig getOne(@PathVariable String id) throws Exception {
        return sapConfigService.selectById(id);
    }

    /**
     * 获取SAP配置信息
     *
     * @param ids 主键ID数组
     * @return List<SapConfig> SAP服务器配置List对象
     * @throws Exception
     */
    @ApiOperation(value = "获取SAP配置信息", notes = "根据多个ID号获取SAP服务器配置信息")
    @ApiImplicitParam(name = "ids", value = "主键ID数组", required = true, dataType = "String[]")
    @RequestMapping(value = "/sapConfig", method = RequestMethod.GET)
    public List<SapConfig> getMany(String[] ids) throws Exception {
        return sapConfigService.selectByIds(ids);
    }

    /**
     * 获取SAP配置线
     *
     * @param sapConfigQuery 查询条件
     * @return List<SapConfig> SAP服务器配置List对象
     * @throws Exception
     */
    @ApiOperation(value = "获取SAP配置信息", notes = "根据查询条件获取SAP服务器配置信息")
    @ApiImplicitParam(name = "sapConfigQuery", value = "查询条件对象", required = true, dataType = "SapConfigQuery")
    @RequestMapping(value = "/sapConfig", method = RequestMethod.GET)
    public List<SapConfig> getByQuery(SapConfigQuery sapConfigQuery) throws Exception {
        return sapConfigService.selectBySapConfigQuery(sapConfigQuery);
    }

    /**
     * 添加SAP服务器配置
     *
     * @param sapConfig SAP服务器配置
     * @return SapConfig SAP服务器配置
     * @throws Exception
     */
    @ApiOperation(value = "添加SAP配置信息", notes = "添加新的SAP链接配置信息")
    @ApiImplicitParam(name = "sapConfig", value = "SAP配置信息", required = true, dataType = "SapConfig")
    @RequestMapping(value = "/sapConfig", method = RequestMethod.POST)
    public SapConfig add(@RequestBody SapConfig sapConfig) throws Exception {
        return sapConfigService.save(sapConfig);
    }

    /**
     * 更新SAP服务器信息
     *
     * @param sapConfig SAP服务器配置
     * @return SapConfig SAP服务器配置
     * @throws Exception
     */
    @ApiOperation(value = "更新SAP配置信息", notes = "根据主键ID更新SAP链接配置信息")
    @ApiImplicitParam(name = "sapConfig", value = "带主键ID的SAP配置信息", required = true, dataType = "SapConfig")
    @RequestMapping(value = "/sapConfig", method = RequestMethod.PUT)
    public SapConfig update(@RequestBody SapConfig sapConfig) throws Exception {
        return sapConfigService.update(sapConfig);
    }

    /**
     * 移除SAP服务器配置
     *
     * @param id 主键ID
     * @return int 移除的数量
     * @throws Exception
     */
    @ApiOperation(value = "删除SAP配置信息", notes = "根据ID号移除SAP服务器配置信息")
    @ApiImplicitParam(name = "id", value = "主键ID", required = true, dataType = "String")
    @RequestMapping(value = "/sapConfig/{id}", method = RequestMethod.DELETE)
    public int delete(@PathVariable String id) throws Exception {
        return sapConfigService.delete(id);
    }

    /**
     * 移除SAP服务器配置
     *
     * @param ids 主键ID数组
     * @return int 移除的数量
     * @throws Exception
     */
    @ApiOperation(value = "删除SAP配置信息", notes = "根据多个ID号删除SAP服务器配置信息")
    @ApiImplicitParam(name = "ids", value = "主键ID数组", required = true, dataType = "String[]")
    @RequestMapping(value = "/sapConfig", method = RequestMethod.DELETE)
    public int deleteAll(String[] ids) throws Exception {
        return sapConfigService.delete(ids);
    }
}
