package cn.com.wdi.scm.service;

import cn.com.wdi.scm.model.master.ScmPersonRole;

import java.util.List;

/**
 * 用户角色表
 *
 * @author liyongjian
 * @date 2020-05-29 13:49
 */

public interface ScmPersonRoleService {

    /**
     * 保存新的用戶角色映射对象
     *
     * @param scmPersonRole 新的用戶角色映射对象
     * @return ScmPersonRole 用戶角色映射对象
     * @throws Exception
     */
    ScmPersonRole save(ScmPersonRole scmPersonRole) throws Exception;


    /**
     * 更新用戶角色映射对象
     *
     * @param scmPersonRole 修改的用戶角色映射对象
     * @return ScmPersonRole 用戶角色映射对象
     * @throws Exception
     */
    ScmPersonRole update(ScmPersonRole scmPersonRole)  throws Exception;

    /**
     * 根据ID删除用戶角色映射对象
     *
     * @param id 对象ID
     * @return 删除的数量
     * @throws Exception
     */
    int delete(String id)  throws Exception;

    /**
     * 根据ID数组删除用戶角色映射对象
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
     * @return 用戶角色映射对象
     * @throws Exception
     */
    ScmPersonRole selectById(String id)  throws Exception;

    /**
     * 根据ID数组查找对象
     *
     * @param ids  对象ID数组
     * @return 用戶角色映射对象LIST
     * @throws Exception
     */
    List<ScmPersonRole> selectById(String[] ids)  throws Exception;

    /**
     * 根据查询对象查找对象
     *
     * @param scmPersonRoleQuery  查询对象
     * @return 用戶角色映射对象
     * @throws Exception
     */
    List<ScmPersonRole>  selectByQuery(ScmPersonRoleQuery scmPersonRoleQuery)  throws Exception;
}
