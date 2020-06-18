package cn.com.wdi.scm.service.impl;

import cn.com.wdi.scm.exception.ScmException;
import cn.com.wdi.scm.mapper.master.ScmMenuRoleDynamicSqlSupport;
import cn.com.wdi.scm.mapper.master.ScmMenuRoleMapper;
import cn.com.wdi.scm.model.master.ScmMenuRole;
import cn.com.wdi.scm.query.ScmMenuRoleQuery;
import cn.com.wdi.scm.service.ScmMenuRoleService;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectModel;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static cn.com.wdi.scm.mapper.master.ScmMenuRoleDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

/**
 * 菜单角色关联表查询服务实现
 *
 * @author liyongjian
 * @date 2020-06-17 17:01
 */

@Service
@Slf4j
public class ScmMenuRoleServiceImpl implements ScmMenuRoleService {

    @Autowired
    ScmMenuRoleMapper scmMenuRoleMapper;

    /**
     * 保存新的菜单角色映射对象
     *
     * @param scmMenuRole 新的菜单角色映射对象
     * @return ScmMenuRole 菜单角色映射对象
     * @throws Exception
     */
    @Override
    public ScmMenuRole save(ScmMenuRole scmMenuRole) throws Exception {
        scmMenuRoleMapper.insert(scmMenuRole);
        log.info("insert success, id: [{}]", scmMenuRole.getId());
        return scmMenuRole;
    }

    /**
     * 更新菜单角色映射对象
     *
     * @param scmMenuRole 修改的菜单角色映射对象
     * @return ScmMenuRole 菜单角色映射对象
     * @throws Exception
     */
    @Override
    public ScmMenuRole update(ScmMenuRole scmMenuRole) throws Exception {
        scmMenuRoleMapper.updateByPrimaryKeySelective(scmMenuRole);
        log.info("update success, id: [{}]", scmMenuRole.getId());
        Optional<ScmMenuRole> scmMenuRoleOptional = scmMenuRoleMapper.selectByPrimaryKey(scmMenuRole.getId());
        return scmMenuRoleOptional.orElse(scmMenuRole);
    }

    /**
     * 根据ID删除菜单角色映射对象
     *
     * @param id 对象ID
     * @return 删除的数量
     * @throws Exception
     */
    @Override
    public int delete(String id) throws Exception {
        return scmMenuRoleMapper.deleteByPrimaryKey(id);
    }

    /**
     * 根据ID数组删除菜单角色映射对象
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
     * @return 菜单角色映射对象
     * @throws Exception
     */
    @Override
    public ScmMenuRole selectById(String id) throws Exception {
        return scmMenuRoleMapper.selectByPrimaryKey(id).orElseThrow(() -> new ScmException("查无该ID的记录"));
    }

    /**
     * 根据ID数组查找对象
     *
     * @param ids 对象ID数组
     * @return 菜单角色映射对象LIST
     * @throws Exception
     */
    @Override
    public List<ScmMenuRole> selectById(String[] ids) throws Exception {
        SelectStatementProvider selectStatementProvider = select(ScmMenuRoleMapper.selectList)
                .from(scmMenuRole)
                .where(ScmMenuRoleDynamicSqlSupport.id, isIn(ids))
                .build()
                .render(RenderingStrategies.MYBATIS3);
        return scmMenuRoleMapper.selectMany(selectStatementProvider);
    }

    /**
     * 根据查询对象查找对象
     *
     * @param scmMenuRoleQuery 查询对象
     * @return 菜单角色映射对象
     * @throws Exception
     */
    @Override
    public List<ScmMenuRole> selectByQuery(ScmMenuRoleQuery scmMenuRoleQuery) throws Exception {
        QueryExpressionDSL<SelectModel>.QueryExpressionWhereBuilder builder = select(ScmMenuRoleMapper.selectList)
                .from(scmMenuRole)
                .where();
        if (Optional.ofNullable(scmMenuRoleQuery.getMid()).isPresent()) {
            builder.where(mid, isEqualTo(scmMenuRoleQuery.getMid()));
        }

        if (Optional.ofNullable(scmMenuRoleQuery.getRid()).isPresent()) {
            builder.where(rid, isEqualTo(scmMenuRoleQuery.getRid()));
        }

        SelectStatementProvider selectStatementProvider = builder
                .build()
                .render(RenderingStrategies.MYBATIS3);

        return scmMenuRoleMapper.selectMany(selectStatementProvider);
    }
}
