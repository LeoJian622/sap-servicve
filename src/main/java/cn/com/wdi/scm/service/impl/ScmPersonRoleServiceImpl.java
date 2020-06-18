package cn.com.wdi.scm.service.impl;

import cn.com.wdi.scm.exception.ScmException;
import cn.com.wdi.scm.mapper.master.ScmPersonRoleDynamicSqlSupport;
import cn.com.wdi.scm.mapper.master.ScmPersonRoleMapper;
import cn.com.wdi.scm.model.master.ScmPersonRole;
import cn.com.wdi.scm.query.ScmPersonRoleQuery;
import cn.com.wdi.scm.service.ScmPersonRoleService;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectModel;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static cn.com.wdi.scm.mapper.master.ScmPersonRoleDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

/**
 * 用户角色关联表服务
 *
 * @author liyongjian
 * @date 2020-06-18 9:19
 */

@Service
@Slf4j
public class ScmPersonRoleServiceImpl implements ScmPersonRoleService {

    @Autowired
    ScmPersonRoleMapper scmPersonRoleMapper;

    /**
     * 保存新的用戶角色映射对象
     *
     * @param scmPersonRole 新的用戶角色映射对象
     * @return ScmPersonRole 用戶角色映射对象
     * @throws Exception
     */
    @Override
    public ScmPersonRole save(ScmPersonRole scmPersonRole) throws Exception {
        scmPersonRoleMapper.insert(scmPersonRole);
        log.info("insert success, id: [{}]", scmPersonRole.getId());
        return scmPersonRole;
    }

    /**
     * 更新用戶角色映射对象
     *
     * @param scmPersonRole 修改的用戶角色映射对象
     * @return ScmPersonRole 用戶角色映射对象
     * @throws Exception
     */
    @Override
    public ScmPersonRole update(ScmPersonRole scmPersonRole) throws Exception {
        scmPersonRoleMapper.updateByPrimaryKeySelective(scmPersonRole);
        log.info("update success, id: [{}]", scmPersonRole.getId());
        Optional<ScmPersonRole> scmPersonRoleOptional = scmPersonRoleMapper.selectByPrimaryKey(scmPersonRole.getId());
        return scmPersonRoleOptional.orElse(scmPersonRole);
    }

    /**
     * 根据ID删除用戶角色映射对象
     *
     * @param id 对象ID
     * @return 删除的数量
     * @throws Exception
     */
    @Override
    public int delete(String id) throws Exception {
        return scmPersonRoleMapper.deleteByPrimaryKey(id);
    }

    /**
     * 根据ID数组删除用戶角色映射对象
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
     * @return 用戶角色映射对象
     * @throws Exception
     */
    @Override
    public ScmPersonRole selectById(String id) throws Exception {
        return scmPersonRoleMapper.selectByPrimaryKey(id).orElseThrow(() -> new ScmException("查无该ID的记录"));
    }

    /**
     * 根据ID数组查找对象
     *
     * @param ids 对象ID数组
     * @return 用戶角色映射对象LIST
     * @throws Exception
     */
    @Override
    public List<ScmPersonRole> selectById(String[] ids) throws Exception {
        SelectStatementProvider selectStatementProvider = select(ScmPersonRoleMapper.selectList)
                .from(scmPersonRole)
                .where(ScmPersonRoleDynamicSqlSupport.id, isIn(ids))
                .build()
                .render(RenderingStrategies.MYBATIS3);
        return scmPersonRoleMapper.selectMany(selectStatementProvider);
    }

    /**
     * 根据查询对象查找对象
     *
     * @param scmPersonRoleQuery 查询对象
     * @return 用戶角色映射对象
     * @throws Exception
     */
    @Override
    public List<ScmPersonRole> selectByQuery(ScmPersonRoleQuery scmPersonRoleQuery) throws Exception {
        QueryExpressionDSL<SelectModel>.QueryExpressionWhereBuilder builder = select(ScmPersonRoleMapper.selectList)
                .from(scmPersonRole)
                .where();
        if (Optional.ofNullable(scmPersonRoleQuery.getPersonId()).isPresent()) {
            builder.where(personId, isEqualTo(scmPersonRoleQuery.getPersonId()));
        }

        if (Optional.ofNullable(scmPersonRoleQuery.getRoleId()).isPresent()) {
            builder.where(roleId, isEqualTo(scmPersonRoleQuery.getRoleId()));
        }


        SelectStatementProvider selectStatementProvider = builder
                .build()
                .render(RenderingStrategies.MYBATIS3);

        return scmPersonRoleMapper.selectMany(selectStatementProvider);
    }
}
