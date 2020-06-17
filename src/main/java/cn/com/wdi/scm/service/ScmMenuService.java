package cn.com.wdi.scm.service;

import cn.com.wdi.scm.model.master.ScmMenu;
import cn.com.wdi.scm.query.ScmMenuQuery;

import java.util.List;

/**
 * 菜单信息服务
 *
 * @author liyongjian
 * @date 2020-05-26 11:45
 */

public interface ScmMenuService {

    /**
     * 保存新的菜单对象
     *
     * @param scmMenu 新的菜单对象
     * @return ScmMenu 菜单对象
     * @throws Exception
     */
    ScmMenu save(ScmMenu scmMenu) throws Exception;


    /**
     * 更新菜单对象
     *
     * @param scmMenu 修改的菜单对象
     * @return ScmMenu 菜单对象
     * @throws Exception
     */
    ScmMenu update(ScmMenu scmMenu)  throws Exception;

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
    ScmMenu selectById(String id)  throws Exception;

    /**
     * 根据ID数组查找对象
     *
     * @param ids  对象ID数组
     * @return 菜单对象LIST
     * @throws Exception
     */
    List<ScmMenu> selectById(String[] ids)  throws Exception;

    /**
     * 根据查询对象查找对象
     *
     * @param scmMenuQuery  查询对象
     * @return 菜单对象
     * @throws Exception
     */
    List<ScmMenu>  selectByQuery(ScmMenuQuery scmMenuQuery)  throws Exception;

    /**
     * 根据ID查询角色关联的菜单
     * @param id 角色ID
     * @return
     */
    List<ScmMenu> selectByRoleId(String id);

}
