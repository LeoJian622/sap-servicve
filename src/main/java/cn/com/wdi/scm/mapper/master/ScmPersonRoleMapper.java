package cn.com.wdi.scm.mapper.master;

import cn.com.wdi.scm.model.master.ScmPersonRole;
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

import static cn.com.wdi.scm.mapper.master.ScmPersonRoleDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Mapper
public interface ScmPersonRoleMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.25+08:00", comments="Source Table: scm_person_role")
    BasicColumn[] selectList = BasicColumn.columnList(id, personId, roleId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.249+08:00", comments="Source Table: scm_person_role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.249+08:00", comments="Source Table: scm_person_role")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.249+08:00", comments="Source Table: scm_person_role")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="select replace(newid(),'-','') ", keyProperty="record.id", before=true, resultType=String.class)
    int insert(InsertStatementProvider<ScmPersonRole> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.25+08:00", comments="Source Table: scm_person_role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ScmPersonRoleResult")
    Optional<ScmPersonRole> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.25+08:00", comments="Source Table: scm_person_role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ScmPersonRoleResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="person_id", property="personId", jdbcType=JdbcType.VARCHAR),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.VARCHAR)
    })
    List<ScmPersonRole> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.25+08:00", comments="Source Table: scm_person_role")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.25+08:00", comments="Source Table: scm_person_role")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, scmPersonRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.25+08:00", comments="Source Table: scm_person_role")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, scmPersonRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.25+08:00", comments="Source Table: scm_person_role")
    default int deleteByPrimaryKey(String id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.25+08:00", comments="Source Table: scm_person_role")
    default int insert(ScmPersonRole record) {
        return MyBatis3Utils.insert(this::insert, record, scmPersonRole, c ->
            c.map(id).toProperty("id")
            .map(personId).toProperty("personId")
            .map(roleId).toProperty("roleId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.25+08:00", comments="Source Table: scm_person_role")
    default int insertSelective(ScmPersonRole record) {
        return MyBatis3Utils.insert(this::insert, record, scmPersonRole, c ->
            c.map(id).toProperty("id")
            .map(personId).toPropertyWhenPresent("personId", record::getPersonId)
            .map(roleId).toPropertyWhenPresent("roleId", record::getRoleId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.25+08:00", comments="Source Table: scm_person_role")
    default Optional<ScmPersonRole> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, scmPersonRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.251+08:00", comments="Source Table: scm_person_role")
    default List<ScmPersonRole> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, scmPersonRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.251+08:00", comments="Source Table: scm_person_role")
    default List<ScmPersonRole> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, scmPersonRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.251+08:00", comments="Source Table: scm_person_role")
    default Optional<ScmPersonRole> selectByPrimaryKey(String id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.251+08:00", comments="Source Table: scm_person_role")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, scmPersonRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.251+08:00", comments="Source Table: scm_person_role")
    static UpdateDSL<UpdateModel> updateAllColumns(ScmPersonRole record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(personId).equalTo(record::getPersonId)
                .set(roleId).equalTo(record::getRoleId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.251+08:00", comments="Source Table: scm_person_role")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ScmPersonRole record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(personId).equalToWhenPresent(record::getPersonId)
                .set(roleId).equalToWhenPresent(record::getRoleId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.251+08:00", comments="Source Table: scm_person_role")
    default int updateByPrimaryKey(ScmPersonRole record) {
        return update(c ->
            c.set(personId).equalTo(record::getPersonId)
            .set(roleId).equalTo(record::getRoleId)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.251+08:00", comments="Source Table: scm_person_role")
    default int updateByPrimaryKeySelective(ScmPersonRole record) {
        return update(c ->
            c.set(personId).equalToWhenPresent(record::getPersonId)
            .set(roleId).equalToWhenPresent(record::getRoleId)
            .where(id, isEqualTo(record::getId))
        );
    }
}