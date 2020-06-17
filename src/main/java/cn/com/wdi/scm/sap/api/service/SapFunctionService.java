package cn.com.wdi.scm.sap.api.service;

import cn.com.wdi.scm.model.master.SapFunction;
import cn.com.wdi.scm.query.SapFunctionQuery;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * SAP函数配置服务
 *
 * @author liyongjian
 * @create 2020-05-14 15:04
 */

public interface SapFunctionService {

    /**
     *  新增函数配置
     * @param sapFunction 函数配置对象
     * @return
     */
    SapFunction save(SapFunction sapFunction) throws Exception;


    /**
     *  更新函数配置
     * @param sapFunction
     * @return
     * @throws Exception
     */
    SapFunction update(SapFunction sapFunction) throws Exception;

    /**
     *  删除函数配置
     * @param id
     * @return
     * @throws Exception
     */
    int delete(String id) throws Exception;

    /**
     *  批量删除函数配置
     *
     * @param ids
     * @return
     * @throws Exception
     */
    int delete(String[] ids) throws Exception;

    /**
     * 根据主键查询对象
     *
     * @param id
     * @return
     * @throws Exception
     */
    SapFunction selectById(String id) throws Exception;

    /**s
     * 根据主键数组查询对象
     *
     * @param ids
     * @return
     * @throws Exception
     */
    List<SapFunction> selectByIds(String[] ids) throws Exception;

    /**
     * 通过查询条件查询
     *
     * @param sapFunctionQuery
     * @return
     * @throws Exception
     */
    List<SapFunction> selectBySapFunctionQuery(SapFunctionQuery sapFunctionQuery) throws Exception;
}
