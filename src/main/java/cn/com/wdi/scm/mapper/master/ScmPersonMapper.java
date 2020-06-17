package cn.com.wdi.scm.mapper.master;

import cn.com.wdi.scm.model.master.ScmPerson;
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

import static cn.com.wdi.scm.mapper.master.ScmPersonDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Mapper
public interface ScmPersonMapper {
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-03-19T14:44:43.025+08:00", comments = "Source Table: scm_person")
    BasicColumn[] selectList = BasicColumn.columnList(ScmPersonDynamicSqlSupport.id, ScmPersonDynamicSqlSupport.name, ScmPersonDynamicSqlSupport.phone, telephone, ScmPersonDynamicSqlSupport.address, ScmPersonDynamicSqlSupport.enabled, ScmPersonDynamicSqlSupport.locked, ScmPersonDynamicSqlSupport.username, ScmPersonDynamicSqlSupport.password, ScmPersonDynamicSqlSupport.userface, ScmPersonDynamicSqlSupport.remark);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-03-19T14:44:43.025+08:00", comments = "Source Table: scm_person")
    BasicColumn[] selectJoinRoleList = BasicColumn.columnList(ScmPersonDynamicSqlSupport.id, ScmPersonDynamicSqlSupport.name, ScmPersonDynamicSqlSupport.phone, telephone, ScmPersonDynamicSqlSupport.address, ScmPersonDynamicSqlSupport.enabled, ScmPersonDynamicSqlSupport.locked, ScmPersonDynamicSqlSupport.username, ScmPersonDynamicSqlSupport.password, ScmPersonDynamicSqlSupport.userface, ScmPersonDynamicSqlSupport.remark, ScmRoleDynamicSqlSupport.id.as("r_id"), ScmRoleDynamicSqlSupport.name.as("r_name"), ScmRoleDynamicSqlSupport.nameZh.as("r_name_zh"));

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.223+08:00", comments="Source Table: scm_person")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.224+08:00", comments="Source Table: scm_person")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.225+08:00", comments="Source Table: scm_person")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="select replace(newid(),'-','') ", keyProperty="record.id", before=true, resultType=String.class)
    int insert(InsertStatementProvider<ScmPerson> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.228+08:00", comments="Source Table: scm_person")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ScmPersonResult")
    Optional<ScmPerson> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.228+08:00", comments="Source Table: scm_person")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ScmPersonResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.CHAR),
        @Result(column="telephone", property="telephone", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="enabled", property="enabled", jdbcType=JdbcType.TINYINT),
        @Result(column="locked", property="locked", jdbcType=JdbcType.TINYINT),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="userface", property="userface", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR)
    })
    List<ScmPerson> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.229+08:00", comments="Source Table: scm_person")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.229+08:00", comments="Source Table: scm_person")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, scmPerson, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.229+08:00", comments="Source Table: scm_person")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, scmPerson, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.23+08:00", comments="Source Table: scm_person")
    default int deleteByPrimaryKey(String id_) {
        return delete(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.23+08:00", comments="Source Table: scm_person")
    default int insert(ScmPerson record) {
        return MyBatis3Utils.insert(this::insert, record, scmPerson, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(phone).toProperty("phone")
            .map(telephone).toProperty("telephone")
            .map(address).toProperty("address")
            .map(enabled).toProperty("enabled")
            .map(locked).toProperty("locked")
            .map(username).toProperty("username")
            .map(password).toProperty("password")
            .map(userface).toProperty("userface")
            .map(remark).toProperty("remark")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.232+08:00", comments="Source Table: scm_person")
    default int insertSelective(ScmPerson record) {
        return MyBatis3Utils.insert(this::insert, record, scmPerson, c ->
            c.map(id).toProperty("id")
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(phone).toPropertyWhenPresent("phone", record::getPhone)
            .map(telephone).toPropertyWhenPresent("telephone", record::getTelephone)
            .map(address).toPropertyWhenPresent("address", record::getAddress)
            .map(enabled).toPropertyWhenPresent("enabled", record::getEnabled)
            .map(locked).toPropertyWhenPresent("locked", record::getLocked)
            .map(username).toPropertyWhenPresent("username", record::getUsername)
            .map(password).toPropertyWhenPresent("password", record::getPassword)
            .map(userface).toPropertyWhenPresent("userface", record::getUserface)
            .map(remark).toPropertyWhenPresent("remark", record::getRemark)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.235+08:00", comments="Source Table: scm_person")
    default Optional<ScmPerson> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, scmPerson, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.236+08:00", comments="Source Table: scm_person")
    default List<ScmPerson> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, scmPerson, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.236+08:00", comments="Source Table: scm_person")
    default List<ScmPerson> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, scmPerson, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.236+08:00", comments="Source Table: scm_person")
    default Optional<ScmPerson> selectByPrimaryKey(String id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.237+08:00", comments="Source Table: scm_person")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, scmPerson, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.238+08:00", comments="Source Table: scm_person")
    static UpdateDSL<UpdateModel> updateAllColumns(ScmPerson record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(phone).equalTo(record::getPhone)
                .set(telephone).equalTo(record::getTelephone)
                .set(address).equalTo(record::getAddress)
                .set(enabled).equalTo(record::getEnabled)
                .set(locked).equalTo(record::getLocked)
                .set(username).equalTo(record::getUsername)
                .set(password).equalTo(record::getPassword)
                .set(userface).equalTo(record::getUserface)
                .set(remark).equalTo(record::getRemark);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.239+08:00", comments="Source Table: scm_person")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ScmPerson record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(phone).equalToWhenPresent(record::getPhone)
                .set(telephone).equalToWhenPresent(record::getTelephone)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(enabled).equalToWhenPresent(record::getEnabled)
                .set(locked).equalToWhenPresent(record::getLocked)
                .set(username).equalToWhenPresent(record::getUsername)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(userface).equalToWhenPresent(record::getUserface)
                .set(remark).equalToWhenPresent(record::getRemark);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.24+08:00", comments="Source Table: scm_person")
    default int updateByPrimaryKey(ScmPerson record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(phone).equalTo(record::getPhone)
            .set(telephone).equalTo(record::getTelephone)
            .set(address).equalTo(record::getAddress)
            .set(enabled).equalTo(record::getEnabled)
            .set(locked).equalTo(record::getLocked)
            .set(username).equalTo(record::getUsername)
            .set(password).equalTo(record::getPassword)
            .set(userface).equalTo(record::getUserface)
            .set(remark).equalTo(record::getRemark)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-21T15:39:53.241+08:00", comments="Source Table: scm_person")
    default int updateByPrimaryKeySelective(ScmPerson record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(phone).equalToWhenPresent(record::getPhone)
            .set(telephone).equalToWhenPresent(record::getTelephone)
            .set(address).equalToWhenPresent(record::getAddress)
            .set(enabled).equalToWhenPresent(record::getEnabled)
            .set(locked).equalToWhenPresent(record::getLocked)
            .set(username).equalToWhenPresent(record::getUsername)
            .set(password).equalToWhenPresent(record::getPassword)
            .set(userface).equalToWhenPresent(record::getUserface)
            .set(remark).equalToWhenPresent(record::getRemark)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-03-25T16:27:43.029+08:00", comments = "Source Table: scm_person")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @ResultMap("joinRoleResult")
    Optional<ScmPerson> selectOneJoin(SelectStatementProvider selectStatementProvider);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-03-25T16:27:43.029+08:00", comments = "Source Table: scm_person")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @ResultMap("joinRoleResult")
    List<ScmPerson> selectManyJoin(SelectStatementProvider selectStatementProvider);
}