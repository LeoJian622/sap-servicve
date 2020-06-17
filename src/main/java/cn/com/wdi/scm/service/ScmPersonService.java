package cn.com.wdi.scm.service;

import cn.com.wdi.scm.model.master.ScmPerson;
import cn.com.wdi.scm.query.ScmPersonQuery;

import java.util.List;

/**
 * 用户信息服务
 *
 * @author liyongjian
 * @date 2020-05-26 11:44
 */

public interface ScmPersonService {


    /**
     * 保存新的菜单对象
     *
     * @param scmPerson 新的菜单对象
     * @return ScmPerson 菜单对象
     * @throws Exception
     */
    ScmPerson save(ScmPerson scmPerson) throws Exception;

    /**
     * 更新菜单对象
     *
     * @param scmPerson 修改的菜单对象
     * @return ScmPerson 菜单对象
     * @throws Exception
     */
    ScmPerson update(ScmPerson scmPerson) throws Exception;

    /**
     * 根据ID删除菜单对象
     *
     * @param id 对象ID
     * @return 删除的数量
     * @throws Exception
     */
    int delete(String id) throws Exception;

    /**
     * 根据ID数组删除菜单对象
     *
     * @param ids 对象ID数组
     * @return 删除的数量
     * @throws Exception
     */
    int delete(String[] ids) throws Exception;

    /**
     * 根据ID查找对象
     *
     * @param id 对象ID
     * @return 菜单对象
     * @throws Exception
     */
    ScmPerson selectById(String id) throws Exception;

    /**
     * 根据ID数组查找对象
     *
     * @param ids 对象ID数组
     * @return 菜单对象LIST
     * @throws Exception
     */
    List<ScmPerson> selectById(String[] ids) throws Exception;

    /**
     * 根据查询对象查找对象
     *
     * @param scmPersonQuery 查询对象
     * @return 菜单对象
     * @throws Exception
     */
    List<ScmPerson> selectByQuery(ScmPersonQuery scmPersonQuery) throws Exception;

    /**
     * 根据ID查询角色关联的账户
     * @param id 角色ID
     * @return
     */
    List<ScmPerson> selectByRoleId(String id);

}
