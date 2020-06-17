package cn.com.wdi.scm.mapper.master;

import cn.com.wdi.scm.model.master.ScmMenuRole;
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

import static cn.com.wdi.scm.mapper.master.ScmMenuRoleDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Mapper
public interface ScmMenuRoleMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.266+08:00", comments="Source Table: scm_menu_role")
    BasicColumn[] selectList = BasicColumn.columnList(id, mid, rid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.266+08:00", comments="Source Table: scm_menu_role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.266+08:00", comments="Source Table: scm_menu_role")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.266+08:00", comments="Source Table: scm_menu_role")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="select replace(newid(),'-','') ", keyProperty="record.id", before=true, resultType=String.class)
    int insert(InsertStatementProvider<ScmMenuRole> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.266+08:00", comments="Source Table: scm_menu_role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ScmMenuRoleResult")
    Optional<ScmMenuRole> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.266+08:00", comments="Source Table: scm_menu_role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ScmMenuRoleResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="mid", property="mid", jdbcType=JdbcType.VARCHAR),
        @Result(column="rid", property="rid", jdbcType=JdbcType.VARCHAR)
    })
    List<ScmMenuRole> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.266+08:00", comments="Source Table: scm_menu_role")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.266+08:00", comments="Source Table: scm_menu_role")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, scmMenuRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.266+08:00", comments="Source Table: scm_menu_role")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, scmMenuRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.266+08:00", comments="Source Table: scm_menu_role")
    default int deleteByPrimaryKey(String id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.266+08:00", comments="Source Table: scm_menu_role")
    default int insert(ScmMenuRole record) {
        return MyBatis3Utils.insert(this::insert, record, scmMenuRole, c ->
            c.map(id).toProperty("id")
            .map(mid).toProperty("mid")
            .map(rid).toProperty("rid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.266+08:00", comments="Source Table: scm_menu_role")
    default int insertSelective(ScmMenuRole record) {
        return MyBatis3Utils.insert(this::insert, record, scmMenuRole, c ->
            c.map(id).toProperty("id")
            .map(mid).toPropertyWhenPresent("mid", record::getMid)
            .map(rid).toPropertyWhenPresent("rid", record::getRid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.267+08:00", comments="Source Table: scm_menu_role")
    default Optional<ScmMenuRole> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, scmMenuRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.267+08:00", comments="Source Table: scm_menu_role")
    default List<ScmMenuRole> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, scmMenuRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.267+08:00", comments="Source Table: scm_menu_role")
    default List<ScmMenuRole> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, scmMenuRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.267+08:00", comments="Source Table: scm_menu_role")
    default Optional<ScmMenuRole> selectByPrimaryKey(String id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.267+08:00", comments="Source Table: scm_menu_role")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, scmMenuRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.267+08:00", comments="Source Table: scm_menu_role")
    static UpdateDSL<UpdateModel> updateAllColumns(ScmMenuRole record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(mid).equalTo(record::getMid)
                .set(rid).equalTo(record::getRid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.267+08:00", comments="Source Table: scm_menu_role")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ScmMenuRole record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(mid).equalToWhenPresent(record::getMid)
                .set(rid).equalToWhenPresent(record::getRid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.267+08:00", comments="Source Table: scm_menu_role")
    default int updateByPrimaryKey(ScmMenuRole record) {
        return update(c ->
            c.set(mid).equalTo(record::getMid)
            .set(rid).equalTo(record::getRid)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.267+08:00", comments="Source Table: scm_menu_role")
    default int updateByPrimaryKeySelective(ScmMenuRole record) {
        return update(c ->
            c.set(mid).equalToWhenPresent(record::getMid)
            .set(rid).equalToWhenPresent(record::getRid)
            .where(id, isEqualTo(record::getId))
        );
    }
}