package cn.com.wdi.scm.service;

import cn.com.wdi.scm.model.master.ScmRole;
import cn.com.wdi.scm.query.ScmRoleQuery;

import java.util.List;

/**
 * 角色信息服务
 *
 * @author liyongjian
 * @date 2020-05-26 11:46
 */

public interface ScmRoleService {

    /**
     * 保存新的菜单对象
     *
     * @param scmRole 新的菜单对象
     * @return ScmRole 菜单对象
     * @throws Exception
     */
    ScmRole save(ScmRole scmRole) throws Exception;

    /**
     * 更新菜单对象
     *
     * @param scmRole 修改的菜单对象
     * @return ScmRole 菜单对象
     * @throws Exception
     */
    ScmRole update(ScmRole scmRole)  throws Exception;

    /**
     * 根据ID删除菜单对象
     *
     * @param id 对象ID
     * @return 删除的数量
     * @throws Exception
     */
    int delete(String id)  throws Exception;

    /**
     * 根据ID数组删除菜单对象
     *
     * @param ids 对象ID数组
     * @return 删除的数量
     * @throws Exception
     */
    int delete(String[] ids)  throws Exception;

    /**
     * 根据ID查找对象
     *
     * @param id  对象ID
     * @return 菜单对象
     * @throws Exception
     */
    ScmRole selectById(String id)  throws Exception;

    /**
     * 根据ID数组查找对象
     *
     * @param ids  对象ID数组
     * @return 菜单对象LIST
     * @throws Exception
     */
    List<ScmRole> selectById(String[] ids)  throws Exception;

    /**
     * 根据查询对象查找对象
     *
     * @param scmRoleQuery  查询对象
     * @return 菜单对象
     * @throws Exception
     */
    List<ScmRole>  selectByQuery(ScmRoleQuery scmRoleQuery)  throws Exception;

    /**
     * 根据ID查询账户拥有的角色
     * @param id 用户ID
     * @return
     */
    List<ScmRole> selectByPersonId(String id);

    /**
     * 根据ID查询菜单分配的角色
     * @param id 菜单ID
     * @return
     */
    List<ScmRole> selectByMenuId(String id);
}
