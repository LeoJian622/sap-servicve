package cn.com.wdi.scm.service;

import cn.com.wdi.scm.model.master.ScmMenuRole;

import java.util.List;

/**
 * 菜单角色关系表
 *
 * @author liyongjian
 * @date 2020-05-29 11:55
 */

public interface ScmMenuRoleService {

    /**
     * 保存新的菜单角色映射对象
     *
     * @param scmMenuRole 新的菜单角色映射对象
     * @return ScmMenuRole 菜单角色映射对象
     * @throws Exception
     */
    ScmMenuRole save(ScmMenuRole scmMenuRole) throws Exception;


    /**
     * 更新菜单角色映射对象
     *
     * @param scmMenuRole 修改的菜单角色映射对象
     * @return ScmMenuRole 菜单角色映射对象
     * @throws Exception
     */
    ScmMenuRole update(ScmMenuRole scmMenuRole)  throws Exception;

    /**
     * 根据ID删除菜单角色映射对象
     *
     * @param id 对象ID
     * @return 删除的数量
     * @throws Exception
     */
    int delete(String id)  throws Exception;

    /**
     * 根据ID数组删除菜单角色映射对象
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
     * @return 菜单角色映射对象
     * @throws Exception
     */
    ScmMenuRole selectById(String id)  throws Exception;

    /**
     * 根据ID数组查找对象
     *
     * @param ids  对象ID数组
     * @return 菜单角色映射对象LIST
     * @throws Exception
     */
    List<ScmMenuRole> selectById(String[] ids)  throws Exception;

    /**
     * 根据查询对象查找对象
     *
     * @param scmMenuRoleQuery  查询对象
     * @return 菜单角色映射对象
     * @throws Exception
     */
    List<ScmMenuRole>  selectByQuery(ScmMenuRoleQuery scmMenuRoleQuery)  throws Exception;
}
