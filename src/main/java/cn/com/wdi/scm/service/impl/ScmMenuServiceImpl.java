package cn.com.wdi.scm.service.impl;

import cn.com.wdi.scm.exception.ScmException;
import cn.com.wdi.scm.mapper.master.ScmMenuDynamicSqlSupport;
import cn.com.wdi.scm.mapper.master.ScmMenuMapper;
import cn.com.wdi.scm.model.master.ScmMenu;
import cn.com.wdi.scm.query.ScmMenuQuery;
import cn.com.wdi.scm.service.ScmMenuService;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectModel;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static cn.com.wdi.scm.mapper.master.ScmMenuDynamicSqlSupport.*;
import static cn.com.wdi.scm.mapper.master.ScmMenuRoleDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

/**
 * 菜单信息服务实现
 *
 * @author liyongjian
 * @date 2020-05-26 15:09
 */

@Service
@Slf4j
public class ScmMenuServiceImpl implements ScmMenuService {

    @Autowired
    ScmMenuMapper scmMenuMapper;

    /**
     * 保存新的菜单对象
     *
     * @param scmMenu 新的菜单对象
     * @return ScmMenu 菜单对象
     * @throws Exception
     */
    @Override
    public ScmMenu save(ScmMenu scmMenu) throws Exception {
        scmMenuMapper.insert(scmMenu);
        log.info("insert success, id: [{}]", scmMenu.getId());
        return scmMenu;
    }

    /**
     * 更新菜单对象
     *
     * @param scmMenu 修改的菜单对象
     * @return ScmMenu 菜单对象
     * @throws Exception
     */
    @Override
    public ScmMenu update(ScmMenu scmMenu) throws Exception {
        scmMenuMapper.updateByPrimaryKeySelective(scmMenu);
        log.info("update success, id: [{}]", scmMenu.getId());
        Optional<ScmMenu> scmMenuOptional = scmMenuMapper.selectByPrimaryKey(scmMenu.getId());
        return scmMenuOptional.orElse(scmMenu);
    }

    /**
     * 根据ID删除菜单对象
     *
     * @param id 对象ID
     * @return 删除的数量
     * @throws Exception
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int delete(String id) throws Exception {
        return scmMenuMapper.deleteByPrimaryKey(id);
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
    public ScmMenu selectById(String id) throws Exception {
        return scmMenuMapper.selectByPrimaryKey(id).orElseThrow(() -> new ScmException("查无该ID的记录"));
    }

    /**
     * 根据ID数组查找对象
     *
     * @param ids 对象ID数组
     * @return 菜单对象LIST
     * @throws Exception
     */
    @Override
    public List<ScmMenu> selectById(String[] ids) throws Exception {
        SelectStatementProvider selectStatementProvider = select(ScmMenuMapper.selectList)
                .from(scmMenu)
                .where(ScmMenuDynamicSqlSupport.id, isIn(ids))
                .build()
                .render(RenderingStrategies.MYBATIS3);
        return scmMenuMapper.selectMany(selectStatementProvider);
    }

    /**
     * 根据查询对象查找对象
     *
     * @param scmMenuQuery 查询对象
     * @return 菜单对象
     * @throws Exception
     */
    @Override
    public List<ScmMenu> selectByQuery(ScmMenuQuery scmMenuQuery) throws Exception {
        QueryExpressionDSL<SelectModel>.QueryExpressionWhereBuilder builder = select(ScmMenuMapper.selectList)
                .from(scmMenu)
                .where();
        if (Optional.ofNullable(scmMenuQuery.getName()).isPresent()) {
            builder.where(name, isEqualTo(scmMenuQuery.getName()));
        }

        if (Optional.ofNullable(scmMenuQuery.getPath()).isPresent()) {
            builder.where(path, isEqualTo(scmMenuQuery.getPath()));
        }

        if (Optional.ofNullable(scmMenuQuery.getUrl()).isPresent()) {
            builder.where(url, isEqualTo(scmMenuQuery.getUrl()));
        }

        SelectStatementProvider selectStatementProvider = builder
                .build()
                .render(RenderingStrategies.MYBATIS3);

        return scmMenuMapper.selectMany(selectStatementProvider);
    }

    /**
     * 根据ID查询角色关联的菜单
     *
     * @param id 角色ID
     * @return
     */
    @Override
    public List<ScmMenu> selectByRoleId(String id) {
        SelectStatementProvider selectStatementProvider = select(ScmMenuDynamicSqlSupport.id, name, url)
                .from(scmMenu)
                .leftJoin(scmMenuRole)
                .on(ScmMenuDynamicSqlSupport.id,equalTo(mid))
                .where(rid,isEqualTo(id))
                .build()
                .render(RenderingStrategies.MYBATIS3);
        return scmMenuMapper.selectMany(selectStatementProvider);
    }
}
