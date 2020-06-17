package cn.com.wdi.scm.service.impl;

import cn.com.wdi.scm.exception.ScmException;
import cn.com.wdi.scm.mapper.master.*;
import cn.com.wdi.scm.model.master.ScmPerson;
import cn.com.wdi.scm.query.ScmPersonQuery;
import cn.com.wdi.scm.service.ScmPersonService;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectModel;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static cn.com.wdi.scm.mapper.master.ScmPersonDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

/**
 * 用户信息服务实现
 *
 * @author liyongjian
 * @date 2020-05-26 15:10
 */

@Service
@Slf4j
public class ScmPersonServiceImpl implements ScmPersonService {

    @Autowired
    ScmPersonMapper scmPersonMapper;

    /**
     * 保存新的菜单对象
     *
     * @param scmPerson 新的菜单对象
     * @return ScmPerson 菜单对象
     * @throws Exception
     */
    @Override
    public ScmPerson save(ScmPerson scmPerson) throws Exception {
        scmPersonMapper.insert(scmPerson);
        log.info("insert success, id: [{}]", scmPerson.getId());
        return scmPerson;
    }

    /**
     * 更新菜单对象
     *
     * @param scmPerson 修改的菜单对象
     * @return ScmPerson 菜单对象
     * @throws Exception
     */
    @Override
    public ScmPerson update(ScmPerson scmPerson) throws Exception {
        scmPersonMapper.updateByPrimaryKeySelective(scmPerson);
        log.info("update success, id: [{}]", scmPerson.getId());
        Optional<ScmPerson> scmMenuOptional = scmPersonMapper.selectByPrimaryKey(scmPerson.getId());
        return scmMenuOptional.orElse(scmPerson);
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
        return scmPersonMapper.deleteByPrimaryKey(id);
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
    public ScmPerson selectById(String id) throws Exception {
        return scmPersonMapper.selectByPrimaryKey(id).orElseThrow(() -> new ScmException("查无该ID的记录"));
    }

    /**
     * 根据ID数组查找对象
     *
     * @param ids 对象ID数组
     * @return 菜单对象LIST
     * @throws Exception
     */
    @Override
    public List<ScmPerson> selectById(String[] ids) throws Exception {
        SelectStatementProvider selectStatementProvider = select(ScmPersonMapper.selectList)
                .from(scmPerson)
                .where(id, isIn(ids))
                .build()
                .render(RenderingStrategies.MYBATIS3);
        return scmPersonMapper.selectMany(selectStatementProvider);
    }

    /**
     * 根据查询对象查找对象
     *
     * @param scmPersonQuery 查询对象
     * @return 菜单对象
     * @throws Exception
     */
    @Override
    public List<ScmPerson> selectByQuery(ScmPersonQuery scmPersonQuery) throws Exception {
        QueryExpressionDSL<SelectModel>.QueryExpressionWhereBuilder builder = select(ScmPersonRoleMapper.selectList)
                .from(scmPerson)
                .where();

        if (Optional.ofNullable(scmPersonQuery.getName()).isPresent()) {
            builder.where(name, isEqualTo(scmPersonQuery.getName()));
        }

        if (Optional.ofNullable(scmPersonQuery.getUserName()).isPresent()) {
            builder.where(username, isEqualTo(scmPersonQuery.getUserName()));
        }

        if (Optional.ofNullable(scmPersonQuery.getPhone()).isPresent()) {
            builder.where(phone, isEqualTo(scmPersonQuery.getPhone()));
        }

        if (Optional.ofNullable(scmPersonQuery.getTelephone()).isPresent()) {
            builder.where(telephone, isEqualTo(scmPersonQuery.getTelephone()));
        }

        if (Optional.ofNullable(scmPersonQuery.getAddress()).isPresent()) {
            builder.where(address, isEqualTo(scmPersonQuery.getAddress()));
        }

        if (Optional.ofNullable(scmPersonQuery.getEnabled()).isPresent()) {
            builder.where(enabled, isEqualTo(scmPersonQuery.getEnabled()));
        }

        if (Optional.ofNullable(scmPersonQuery.getLocked()).isPresent()) {
            builder.where(locked, isEqualTo(scmPersonQuery.getLocked()));
        }


        SelectStatementProvider selectStatementProvider = builder
                .build()
                .render(RenderingStrategies.MYBATIS3);

        return scmPersonMapper.selectMany(selectStatementProvider);
    }

    /**
     * 根据ID查询角色关联的账户
     * @param id 角色ID
     * @return
     */
    @Override
    public List<ScmPerson> selectByRoleId(String id) {
        SelectStatementProvider selectStatementProvider = select(ScmPersonDynamicSqlSupport.id, username, name)
                .from(scmPerson)
                .leftJoin(ScmPersonRoleDynamicSqlSupport.scmPersonRole)
                .on(ScmPersonDynamicSqlSupport.id,equalTo(ScmPersonRoleDynamicSqlSupport.personId))
                .where(ScmPersonRoleDynamicSqlSupport.roleId,isEqualTo(id))
                .build()
                .render(RenderingStrategies.MYBATIS3);
        return scmPersonMapper.selectMany(selectStatementProvider);
    }

}
