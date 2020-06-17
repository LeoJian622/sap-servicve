package cn.com.wdi.scm.service.impl;

import cn.com.wdi.scm.exception.ScmException;
import cn.com.wdi.scm.mapper.master.*;
import cn.com.wdi.scm.model.master.ScmRole;
import cn.com.wdi.scm.query.ScmRoleQuery;
import cn.com.wdi.scm.service.ScmRoleService;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectModel;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static cn.com.wdi.scm.mapper.master.ScmRoleDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

/**
 * 角色信息服务实现
 *
 * @author liyongjian
 * @date 2020-05-26 15:10
 */

@Service
@Slf4j
public class ScmRoleServiceImpl implements ScmRoleService {

    @Autowired
    ScmRoleMapper scmRoleMapper;

    /**
     * 保存新的菜单对象
     *
     * @param scmRole 新的菜单对象
     * @return ScmRole 菜单对象
     * @throws Exception
     */
    @Override
    public ScmRole save(ScmRole scmRole) throws Exception {
        scmRoleMapper.insert(scmRole);
        log.info("insert success, id: [{}]", scmRole.getId());
        return scmRole;
    }

    /**
     * 更新菜单对象
     *
     * @param scmRole 修改的菜单对象
     * @return ScmRole 菜单对象
     * @throws Exception
     */
    @Override
    public ScmRole update(ScmRole scmRole) throws Exception {
        scmRoleMapper.updateByPrimaryKeySelective(scmRole);
        log.info("update success, id: [{}]", scmRole.getId());
        Optional<ScmRole> scmMenuOptional = scmRoleMapper.selectByPrimaryKey(scmRole.getId());
        return scmMenuOptional.orElse(scmRole);
    }

    /**
     * 根据ID删除菜单对象
     *
     * @param id 对象ID
     * @return 删除的数量
     * @throws Exception
     */
    @Override
    public int delete(String id) throws Exception {
        return scmRoleMapper.deleteByPrimaryKey(id);
    }

    /**
     * 根据ID数组删除菜单对象
     *
     * @param ids 对象ID数组
     * @return 删除的数量
     * @throws Exception
     */
    @Override
    public int delete(String[] ids) throws Exception {
        int total = 0;
        for (String id : ids) {
            total += delete(id);
        }
        return total;
    }

    /**
     * 根据ID查找对象
     *
     * @param id 对象ID
     * @return 菜单对象
     * @throws Exception
     */
    @Override
    public ScmRole selectById(String id) throws Exception {
        return scmRoleMapper.selectByPrimaryKey(id).orElseThrow(() -> new ScmException("查无该ID的记录"));
    }

    /**
     * 根据ID数组查找对象
     *
     * @param ids 对象ID数组
     * @return 菜单对象LIST
     * @throws Exception
     */
    @Override
    public List<ScmRole> selectById(String[] ids) throws Exception {
        SelectStatementProvider selectStatementProvider = select(ScmMenuMapper.selectList)
                .from(scmRole)
                .where(id, isIn(ids))
                .build()
                .render(RenderingStrategies.MYBATIS3);
        return scmRoleMapper.selectMany(selectStatementProvider);
    }

    /**
     * 根据查询对象查找对象
     *
     * @param scmRoleQuery 查询对象
     * @return 菜单对象
     * @throws Exception
     */
    @Override
    public List<ScmRole> selectByQuery(ScmRoleQuery scmRoleQuery) throws Exception {
        QueryExpressionDSL<SelectModel>.QueryExpressionWhereBuilder builder = select(ScmRoleMapper.selectList)
                .from(scmRole)
                .where();
        if (Optional.ofNullable(scmRoleQuery.getName()).isPresent()) {
            builder.where(name, isEqualTo(scmRoleQuery.getName()));
        }

        if (Optional.ofNullable(scmRoleQuery.getNameZh()).isPresent()) {
            builder.where(nameZh, isEqualTo(scmRoleQuery.getNameZh()));
        }

        SelectStatementProvider selectStatementProvider = builder
                .build()
                .render(RenderingStrategies.MYBATIS3);

        return scmRoleMapper.selectMany(selectStatementProvider);
    }

    /**
     * 根据ID查询账户拥有的角色
     *
     * @param id 用户ID
     * @return
     */
    @Override
    public List<ScmRole> selectByPersonId(String id) {
        SelectStatementProvider selectStatementProvider = select(ScmRoleMapper.selectList)
                .from(ScmRoleDynamicSqlSupport.scmRole)
                .leftJoin(ScmPersonRoleDynamicSqlSupport.scmPersonRole)
                .on(ScmRoleDynamicSqlSupport.id,equalTo(ScmPersonRoleDynamicSqlSupport.roleId))
                .where(ScmPersonRoleDynamicSqlSupport.personId,isEqualTo(id))
                .build()
                .render(RenderingStrategies.MYBATIS3);
        return scmRoleMapper.selectMany(selectStatementProvider);
    }

    /**
     * 根据ID查询菜单分配的角色
     *
     * @param id 菜单ID
     * @return
     */
    @Override
    public List<ScmRole> selectByMenuId(String id) {
        SelectStatementProvider selectStatementProvider = select(ScmRoleMapper.selectList)
                .from(ScmRoleDynamicSqlSupport.scmRole)
                .leftJoin(ScmMenuRoleDynamicSqlSupport.scmMenuRole)
                .on(ScmRoleDynamicSqlSupport.id,equalTo(ScmMenuRoleDynamicSqlSupport.rid))
                .where(ScmMenuRoleDynamicSqlSupport.mid,isEqualTo(id))
                .build()
                .render(RenderingStrategies.MYBATIS3);
        return scmRoleMapper.selectMany(selectStatementProvider);
    }
}
