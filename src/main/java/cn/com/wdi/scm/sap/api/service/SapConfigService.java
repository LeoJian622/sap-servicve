package cn.com.wdi.scm.sap.api.service;

import cn.com.wdi.scm.model.master.SapConfig;
import cn.com.wdi.scm.query.SapConfigQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * SAP服务器配置服务
 *
 * @author liyongjian
 * @create 2020-05-14 15:03
 */

public interface SapConfigService {

    /**
     * 新增SAP服务器配置
     *
     * @param sapConfig 函数配置对象
     * @return SapConfig 返回函数配置对象
     * @throws Exception
     */
    SapConfig save(SapConfig sapConfig) throws Exception;

    /**
     * 更新SAP服务器配置
     *
     * @param sapConfig 配置更新对象
     * @return SapConfig 返回函数更新后对象
     * @throws Exception
     */
    SapConfig update(SapConfig sapConfig) throws Exception;

    /**
     * 删除SAP服务器配置
     *
     * @param id 删除对象的主键值
     * @return int 返回删除条数
     * @throws Exception
     */
    int delete(String id) throws Exception;

    /**
     * 批量删除SAP服务器配置
     *
     * @param ids 删除对象的主键数组
     * @return 返回删除条数
     * @throws Exception
     */
    int delete(String[] ids) throws Exception;

    /**
     * 根据主键查询对象
     *
     * @param id 查询的主键值
     * @return SapConfig 返回查询结果
     * @throws Exception
     */
    SapConfig selectById(String id) throws Exception;

    /**
     * s
     * 根据主键数组查询对象
     *
     * @param ids 查询的主键数组
     * @return 返回查询结果
     * @throws Exception
     */
    List<SapConfig> selectByIds(String[] ids) throws Exception;

    /**
     * 通过查询条件查询
     *
     * @param sapConfigQuery 查询条件对象
     * @return List<SapConfig> 结果对象
     * @throws Exception
     */
    List<SapConfig> selectBySapConfigQuery(SapConfigQuery sapConfigQuery) throws Exception;
}
