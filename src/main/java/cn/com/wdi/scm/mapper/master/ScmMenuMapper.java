package cn.com.wdi.scm.mapper.master;

import cn.com.wdi.scm.model.master.ScmMenu;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

import javax.annotation.Generated;
import java.util.List;
import java.util.Optional;

import static cn.com.wdi.scm.mapper.master.ScmMenuDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Mapper
public interface ScmMenuMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.264+08:00", comments="Source Table: scm_menu")
    BasicColumn[] selectList = BasicColumn.columnList(id, url, path, component, name, iconCls, keepAlive, requireAuth, parentId, enabled);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-03-27T16:13:29.37+08:00", comments = "Source Table: scm_menu")
    BasicColumn[] selectJoinRoleList = BasicColumn.columnList(id, url, path, component, name, iconCls, keepAlive, requireAuth, parentId, enabled, ScmRoleDynamicSqlSupport.id.as("r_id"), ScmRoleDynamicSqlSupport.name.as("r_name"), ScmRoleDynamicSqlSupport.nameZh.as("r_name_zh"));

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.262+08:00", comments="Source Table: scm_menu")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.262+08:00", comments="Source Table: scm_menu")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.262+08:00", comments="Source Table: scm_menu")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="select replace(newid(),'-','') ", keyProperty="record.id", before=true, resultType=String.class)
    int insert(InsertStatementProvider<ScmMenu> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.262+08:00", comments="Source Table: scm_menu")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ScmMenuResult")
    Optional<ScmMenu> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.262+08:00", comments="Source Table: scm_menu")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ScmMenuResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="path", property="path", jdbcType=JdbcType.VARCHAR),
        @Result(column="component", property="component", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="icon_cls", property="iconCls", jdbcType=JdbcType.VARCHAR),
        @Result(column="keep_alive", property="keepAlive", jdbcType=JdbcType.TINYINT),
        @Result(column="require_auth", property="requireAuth", jdbcType=JdbcType.TINYINT),
        @Result(column="parent_id", property="parentId", jdbcType=JdbcType.INTEGER),
        @Result(column="enabled", property="enabled", jdbcType=JdbcType.TINYINT)
    })
    List<ScmMenu> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.263+08:00", comments="Source Table: scm_menu")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.263+08:00", comments="Source Table: scm_menu")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, scmMenu, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.263+08:00", comments="Source Table: scm_menu")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, scmMenu, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.263+08:00", comments="Source Table: scm_menu")
    default int deleteByPrimaryKey(String id_) {
        return delete(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.263+08:00", comments="Source Table: scm_menu")
    default int insert(ScmMenu record) {
        return MyBatis3Utils.insert(this::insert, record, scmMenu, c ->
            c.map(id).toProperty("id")
            .map(url).toProperty("url")
            .map(path).toProperty("path")
            .map(component).toProperty("component")
            .map(name).toProperty("name")
            .map(iconCls).toProperty("iconCls")
            .map(keepAlive).toProperty("keepAlive")
            .map(requireAuth).toProperty("requireAuth")
            .map(parentId).toProperty("parentId")
            .map(enabled).toProperty("enabled")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.263+08:00", comments="Source Table: scm_menu")
    default int insertSelective(ScmMenu record) {
        return MyBatis3Utils.insert(this::insert, record, scmMenu, c ->
            c.map(id).toProperty("id")
            .map(url).toPropertyWhenPresent("url", record::getUrl)
            .map(path).toPropertyWhenPresent("path", record::getPath)
            .map(component).toPropertyWhenPresent("component", record::getComponent)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(iconCls).toPropertyWhenPresent("iconCls", record::getIconCls)
            .map(keepAlive).toPropertyWhenPresent("keepAlive", record::getKeepAlive)
            .map(requireAuth).toPropertyWhenPresent("requireAuth", record::getRequireAuth)
            .map(parentId).toPropertyWhenPresent("parentId", record::getParentId)
            .map(enabled).toPropertyWhenPresent("enabled", record::getEnabled)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.264+08:00", comments="Source Table: scm_menu")
    default Optional<ScmMenu> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, scmMenu, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.264+08:00", comments="Source Table: scm_menu")
    default List<ScmMenu> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, scmMenu, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.264+08:00", comments="Source Table: scm_menu")
    default List<ScmMenu> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, scmMenu, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.264+08:00", comments="Source Table: scm_menu")
    default Optional<ScmMenu> selectByPrimaryKey(String id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.264+08:00", comments="Source Table: scm_menu")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, scmMenu, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.264+08:00", comments="Source Table: scm_menu")
    static UpdateDSL<UpdateModel> updateAllColumns(ScmMenu record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(url).equalTo(record::getUrl)
                .set(path).equalTo(record::getPath)
                .set(component).equalTo(record::getComponent)
                .set(name).equalTo(record::getName)
                .set(iconCls).equalTo(record::getIconCls)
                .set(keepAlive).equalTo(record::getKeepAlive)
                .set(requireAuth).equalTo(record::getRequireAuth)
                .set(parentId).equalTo(record::getParentId)
                .set(enabled).equalTo(record::getEnabled);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.264+08:00", comments="Source Table: scm_menu")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ScmMenu record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(url).equalToWhenPresent(record::getUrl)
                .set(path).equalToWhenPresent(record::getPath)
                .set(component).equalToWhenPresent(record::getComponent)
                .set(name).equalToWhenPresent(record::getName)
                .set(iconCls).equalToWhenPresent(record::getIconCls)
                .set(keepAlive).equalToWhenPresent(record::getKeepAlive)
                .set(requireAuth).equalToWhenPresent(record::getRequireAuth)
                .set(parentId).equalToWhenPresent(record::getParentId)
                .set(enabled).equalToWhenPresent(record::getEnabled);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.264+08:00", comments="Source Table: scm_menu")
    default int updateByPrimaryKey(ScmMenu record) {
        return update(c ->
            c.set(url).equalTo(record::getUrl)
            .set(path).equalTo(record::getPath)
            .set(component).equalTo(record::getComponent)
            .set(name).equalTo(record::getName)
            .set(iconCls).equalTo(record::getIconCls)
            .set(keepAlive).equalTo(record::getKeepAlive)
            .set(requireAuth).equalTo(record::getRequireAuth)
            .set(parentId).equalTo(record::getParentId)
            .set(enabled).equalTo(record::getEnabled)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.264+08:00", comments="Source Table: scm_menu")
    default int updateByPrimaryKeySelective(ScmMenu record) {
        return update(c ->
            c.set(url).equalToWhenPresent(record::getUrl)
            .set(path).equalToWhenPresent(record::getPath)
            .set(component).equalToWhenPresent(record::getComponent)
            .set(name).equalToWhenPresent(record::getName)
            .set(iconCls).equalToWhenPresent(record::getIconCls)
            .set(keepAlive).equalToWhenPresent(record::getKeepAlive)
            .set(requireAuth).equalToWhenPresent(record::getRequireAuth)
            .set(parentId).equalToWhenPresent(record::getParentId)
            .set(enabled).equalToWhenPresent(record::getEnabled)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-03-27T16:50:29.371+08:00", comments = "Source Table: scm_menu")
    @SelectProvider(value = SqlProviderAdapter.class, method = "select")
    @ResultMap("joinRoleResult")
    Optional<ScmMenu> selectOneJoin(SelectStatementProvider selectStatementProvider);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-03-27T16:50:29.371+08:00", comments = "Source Table: scm_menu")
    @SelectProvider(value = SqlProviderAdapter.class, method = "select")
    @ResultMap("joinRoleResult")
    List<ScmMenu> selectManyJoin(SelectStatementProvider selectStatementProvider);
}