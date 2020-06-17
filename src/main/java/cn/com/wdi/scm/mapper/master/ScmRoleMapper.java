package cn.com.wdi.scm.mapper.master;

import cn.com.wdi.scm.model.master.ScmRole;
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

import static cn.com.wdi.scm.mapper.master.ScmRoleDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Mapper
public interface ScmRoleMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.247+08:00", comments="Source Table: scm_role")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, nameZh);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.247+08:00", comments="Source Table: scm_role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.247+08:00", comments="Source Table: scm_role")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.247+08:00", comments="Source Table: scm_role")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="select replace(newid(),'-','') ", keyProperty="record.id", before=true, resultType=String.class)
    int insert(InsertStatementProvider<ScmRole> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.247+08:00", comments="Source Table: scm_role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ScmRoleResult")
    Optional<ScmRole> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.247+08:00", comments="Source Table: scm_role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ScmRoleResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="name_zh", property="nameZh", jdbcType=JdbcType.VARCHAR)
    })
    List<ScmRole> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.247+08:00", comments="Source Table: scm_role")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.247+08:00", comments="Source Table: scm_role")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, scmRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.247+08:00", comments="Source Table: scm_role")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, scmRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.247+08:00", comments="Source Table: scm_role")
    default int deleteByPrimaryKey(String id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.247+08:00", comments="Source Table: scm_role")
    default int insert(ScmRole record) {
        return MyBatis3Utils.insert(this::insert, record, scmRole, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(nameZh).toProperty("nameZh")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.247+08:00", comments="Source Table: scm_role")
    default int insertSelective(ScmRole record) {
        return MyBatis3Utils.insert(this::insert, record, scmRole, c ->
            c.map(id).toProperty("id")
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(nameZh).toPropertyWhenPresent("nameZh", record::getNameZh)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.247+08:00", comments="Source Table: scm_role")
    default Optional<ScmRole> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, scmRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.247+08:00", comments="Source Table: scm_role")
    default List<ScmRole> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, scmRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.247+08:00", comments="Source Table: scm_role")
    default List<ScmRole> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, scmRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.247+08:00", comments="Source Table: scm_role")
    default Optional<ScmRole> selectByPrimaryKey(String id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.248+08:00", comments="Source Table: scm_role")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, scmRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.248+08:00", comments="Source Table: scm_role")
    static UpdateDSL<UpdateModel> updateAllColumns(ScmRole record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(nameZh).equalTo(record::getNameZh);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.248+08:00", comments="Source Table: scm_role")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ScmRole record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(nameZh).equalToWhenPresent(record::getNameZh);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.248+08:00", comments="Source Table: scm_role")
    default int updateByPrimaryKey(ScmRole record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(nameZh).equalTo(record::getNameZh)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.248+08:00", comments="Source Table: scm_role")
    default int updateByPrimaryKeySelective(ScmRole record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(nameZh).equalToWhenPresent(record::getNameZh)
            .where(id, isEqualTo(record::getId))
        );
    }

}