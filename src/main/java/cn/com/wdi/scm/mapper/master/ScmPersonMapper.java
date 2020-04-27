package cn.com.wdi.scm.mapper.master;

import cn.com.wdi.scm.model.master.ScmPerson;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
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
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Mapper
public interface ScmPersonMapper {
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-03-19T14:44:43.025+08:00", comments = "Source Table: scm_person")
    BasicColumn[] selectList = BasicColumn.columnList(ScmPersonDynamicSqlSupport.id, ScmPersonDynamicSqlSupport.name, ScmPersonDynamicSqlSupport.phone, ScmPersonDynamicSqlSupport.telephone, ScmPersonDynamicSqlSupport.address, ScmPersonDynamicSqlSupport.enabled, ScmPersonDynamicSqlSupport.locked, ScmPersonDynamicSqlSupport.username, ScmPersonDynamicSqlSupport.password, ScmPersonDynamicSqlSupport.userface, ScmPersonDynamicSqlSupport.remark);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-03-19T14:44:43.025+08:00", comments = "Source Table: scm_person")
    BasicColumn[] selectJoinRoleList = BasicColumn.columnList(ScmPersonDynamicSqlSupport.id, ScmPersonDynamicSqlSupport.name, ScmPersonDynamicSqlSupport.phone, ScmPersonDynamicSqlSupport.telephone, ScmPersonDynamicSqlSupport.address, ScmPersonDynamicSqlSupport.enabled, ScmPersonDynamicSqlSupport.locked, ScmPersonDynamicSqlSupport.username, ScmPersonDynamicSqlSupport.password, ScmPersonDynamicSqlSupport.userface, ScmPersonDynamicSqlSupport.remark, ScmRoleDynamicSqlSupport.id.as("r_id"), ScmRoleDynamicSqlSupport.name.as("r_name"), ScmRoleDynamicSqlSupport.nameZh.as("r_name_zh"));

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-03-19T14:44:43.027+08:00", comments = "Source Table: scm_person")
    static UpdateDSL<UpdateModel> updateAllColumns(ScmPerson record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(ScmPersonDynamicSqlSupport.id).equalTo(record::getId)
                .set(ScmPersonDynamicSqlSupport.name).equalTo(record::getName)
                .set(ScmPersonDynamicSqlSupport.phone).equalTo(record::getPhone)
                .set(ScmPersonDynamicSqlSupport.telephone).equalTo(record::getTelephone)
                .set(ScmPersonDynamicSqlSupport.address).equalTo(record::getAddress)
                .set(ScmPersonDynamicSqlSupport.enabled).equalTo(record::getEnabled)
                .set(ScmPersonDynamicSqlSupport.locked).equalTo(record::getLocked)
                .set(ScmPersonDynamicSqlSupport.username).equalTo(record::getUsername)
                .set(ScmPersonDynamicSqlSupport.password).equalTo(record::getPassword)
                .set(ScmPersonDynamicSqlSupport.userface).equalTo(record::getUserface)
                .set(ScmPersonDynamicSqlSupport.remark).equalTo(record::getRemark);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-03-19T14:44:43.028+08:00", comments = "Source Table: scm_person")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ScmPerson record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(ScmPersonDynamicSqlSupport.id).equalToWhenPresent(record::getId)
                .set(ScmPersonDynamicSqlSupport.name).equalToWhenPresent(record::getName)
                .set(ScmPersonDynamicSqlSupport.phone).equalToWhenPresent(record::getPhone)
                .set(ScmPersonDynamicSqlSupport.telephone).equalToWhenPresent(record::getTelephone)
                .set(ScmPersonDynamicSqlSupport.address).equalToWhenPresent(record::getAddress)
                .set(ScmPersonDynamicSqlSupport.enabled).equalToWhenPresent(record::getEnabled)
                .set(ScmPersonDynamicSqlSupport.locked).equalToWhenPresent(record::getLocked)
                .set(ScmPersonDynamicSqlSupport.username).equalToWhenPresent(record::getUsername)
                .set(ScmPersonDynamicSqlSupport.password).equalToWhenPresent(record::getPassword)
                .set(ScmPersonDynamicSqlSupport.userface).equalToWhenPresent(record::getUserface)
                .set(ScmPersonDynamicSqlSupport.remark).equalToWhenPresent(record::getRemark);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-03-19T14:44:43.013+08:00", comments = "Source Table: scm_person")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-03-19T14:44:43.014+08:00", comments = "Source Table: scm_person")
    @DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-03-19T14:44:43.015+08:00", comments = "Source Table: scm_person")
    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    @SelectKey(statement="select replace(newid(),'-','') ", keyProperty="record.id", before=true, resultType=String.class)
    int insert(InsertStatementProvider<ScmPerson> insertStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-03-19T14:44:43.015+08:00", comments = "Source Table: scm_person")
    @InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<ScmPerson> multipleInsertStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-03-19T14:44:43.016+08:00", comments = "Source Table: scm_person")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @ResultMap("ScmPersonResult")
    Optional<ScmPerson> selectOne(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-03-19T14:44:43.016+08:00", comments = "Source Table: scm_person")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @Results(id = "ScmPersonResult", value = {
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "phone", property = "phone", jdbcType = JdbcType.CHAR),
            @Result(column = "telephone", property = "telephone", jdbcType = JdbcType.VARCHAR),
            @Result(column = "address", property = "address", jdbcType = JdbcType.VARCHAR),
            @Result(column = "enabled", property = "enabled", jdbcType = JdbcType.TINYINT),
            @Result(column = "locked", property = "locked", jdbcType = JdbcType.TINYINT),
            @Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR),
            @Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
            @Result(column = "userface", property = "userface", jdbcType = JdbcType.VARCHAR),
            @Result(column = "remark", property = "remark", jdbcType = JdbcType.VARCHAR)
    })
    List<ScmPerson> selectMany(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-03-19T14:44:43.017+08:00", comments = "Source Table: scm_person")
    @UpdateProvider(type = SqlProviderAdapter.class, method = "update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-03-19T14:44:43.018+08:00", comments = "Source Table: scm_person")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, ScmPersonDynamicSqlSupport.scmPerson, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-03-19T14:44:43.019+08:00", comments = "Source Table: scm_person")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, ScmPersonDynamicSqlSupport.scmPerson, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-03-19T14:44:43.019+08:00", comments = "Source Table: scm_person")
    default int deleteByPrimaryKey(String id_) {
        return delete(c ->
                c.where(ScmPersonDynamicSqlSupport.id, isEqualTo(id_))
        );
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-03-19T14:44:43.02+08:00", comments = "Source Table: scm_person")
    default int insert(ScmPerson record) {
        return MyBatis3Utils.insert(this::insert, record, ScmPersonDynamicSqlSupport.scmPerson, c ->
                c.map(ScmPersonDynamicSqlSupport.id).toProperty("id")
                        .map(ScmPersonDynamicSqlSupport.name).toProperty("name")
                        .map(ScmPersonDynamicSqlSupport.phone).toProperty("phone")
                        .map(ScmPersonDynamicSqlSupport.telephone).toProperty("telephone")
                        .map(ScmPersonDynamicSqlSupport.address).toProperty("address")
                        .map(ScmPersonDynamicSqlSupport.enabled).toProperty("enabled")
                        .map(ScmPersonDynamicSqlSupport.locked).toProperty("locked")
                        .map(ScmPersonDynamicSqlSupport.username).toProperty("username")
                        .map(ScmPersonDynamicSqlSupport.password).toProperty("password")
                        .map(ScmPersonDynamicSqlSupport.userface).toProperty("userface")
                        .map(ScmPersonDynamicSqlSupport.remark).toProperty("remark")
        );
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-03-19T14:44:43.022+08:00", comments = "Source Table: scm_person")
    default int insertMultiple(Collection<ScmPerson> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, ScmPersonDynamicSqlSupport.scmPerson, c ->
                c.map(ScmPersonDynamicSqlSupport.id).toProperty("id")
                        .map(ScmPersonDynamicSqlSupport.name).toProperty("name")
                        .map(ScmPersonDynamicSqlSupport.phone).toProperty("phone")
                        .map(ScmPersonDynamicSqlSupport.telephone).toProperty("telephone")
                        .map(ScmPersonDynamicSqlSupport.address).toProperty("address")
                        .map(ScmPersonDynamicSqlSupport.enabled).toProperty("enabled")
                        .map(ScmPersonDynamicSqlSupport.locked).toProperty("locked")
                        .map(ScmPersonDynamicSqlSupport.username).toProperty("username")
                        .map(ScmPersonDynamicSqlSupport.password).toProperty("password")
                        .map(ScmPersonDynamicSqlSupport.userface).toProperty("userface")
                        .map(ScmPersonDynamicSqlSupport.remark).toProperty("remark")
        );
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-03-19T14:44:43.022+08:00", comments = "Source Table: scm_person")
    default int insertSelective(ScmPerson record) {
        return MyBatis3Utils.insert(this::insert, record, ScmPersonDynamicSqlSupport.scmPerson, c ->
                c.map(ScmPersonDynamicSqlSupport.id).toPropertyWhenPresent("id", record::getId)
                        .map(ScmPersonDynamicSqlSupport.name).toPropertyWhenPresent("name", record::getName)
                        .map(ScmPersonDynamicSqlSupport.phone).toPropertyWhenPresent("phone", record::getPhone)
                        .map(ScmPersonDynamicSqlSupport.telephone).toPropertyWhenPresent("telephone", record::getTelephone)
                        .map(ScmPersonDynamicSqlSupport.address).toPropertyWhenPresent("address", record::getAddress)
                        .map(ScmPersonDynamicSqlSupport.enabled).toPropertyWhenPresent("enabled", record::getEnabled)
                        .map(ScmPersonDynamicSqlSupport.locked).toPropertyWhenPresent("locked", record::getLocked)
                        .map(ScmPersonDynamicSqlSupport.username).toPropertyWhenPresent("username", record::getUsername)
                        .map(ScmPersonDynamicSqlSupport.password).toPropertyWhenPresent("password", record::getPassword)
                        .map(ScmPersonDynamicSqlSupport.userface).toPropertyWhenPresent("userface", record::getUserface)
                        .map(ScmPersonDynamicSqlSupport.remark).toPropertyWhenPresent("remark", record::getRemark)
        );
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-03-19T14:44:43.026+08:00", comments = "Source Table: scm_person")
    default Optional<ScmPerson> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, ScmPersonDynamicSqlSupport.scmPerson, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-03-19T14:44:43.026+08:00", comments = "Source Table: scm_person")
    default List<ScmPerson> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, ScmPersonDynamicSqlSupport.scmPerson, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-03-19T14:44:43.026+08:00", comments = "Source Table: scm_person")
    default List<ScmPerson> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, ScmPersonDynamicSqlSupport.scmPerson, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-03-19T14:44:43.027+08:00", comments = "Source Table: scm_person")
    default Optional<ScmPerson> selectByPrimaryKey(String id_) {
        return selectOne(c ->
                c.where(ScmPersonDynamicSqlSupport.id, isEqualTo(id_))
        );
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-03-19T14:44:43.027+08:00", comments = "Source Table: scm_person")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, ScmPersonDynamicSqlSupport.scmPerson, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-03-19T14:44:43.029+08:00", comments = "Source Table: scm_person")
    default int updateByPrimaryKey(ScmPerson record) {
        return update(c ->
                c.set(ScmPersonDynamicSqlSupport.name).equalTo(record::getName)
                        .set(ScmPersonDynamicSqlSupport.phone).equalTo(record::getPhone)
                        .set(ScmPersonDynamicSqlSupport.telephone).equalTo(record::getTelephone)
                        .set(ScmPersonDynamicSqlSupport.address).equalTo(record::getAddress)
                        .set(ScmPersonDynamicSqlSupport.enabled).equalTo(record::getEnabled)
                        .set(ScmPersonDynamicSqlSupport.locked).equalTo(record::getLocked)
                        .set(ScmPersonDynamicSqlSupport.username).equalTo(record::getUsername)
                        .set(ScmPersonDynamicSqlSupport.password).equalTo(record::getPassword)
                        .set(ScmPersonDynamicSqlSupport.userface).equalTo(record::getUserface)
                        .set(ScmPersonDynamicSqlSupport.remark).equalTo(record::getRemark)
                        .where(ScmPersonDynamicSqlSupport.id, isEqualTo(record::getId))
        );
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-03-19T14:44:43.029+08:00", comments = "Source Table: scm_person")
    default int updateByPrimaryKeySelective(ScmPerson record) {
        return update(c ->
                c.set(ScmPersonDynamicSqlSupport.name).equalToWhenPresent(record::getName)
                        .set(ScmPersonDynamicSqlSupport.phone).equalToWhenPresent(record::getPhone)
                        .set(ScmPersonDynamicSqlSupport.telephone).equalToWhenPresent(record::getTelephone)
                        .set(ScmPersonDynamicSqlSupport.address).equalToWhenPresent(record::getAddress)
                        .set(ScmPersonDynamicSqlSupport.enabled).equalToWhenPresent(record::getEnabled)
                        .set(ScmPersonDynamicSqlSupport.locked).equalToWhenPresent(record::getLocked)
                        .set(ScmPersonDynamicSqlSupport.username).equalToWhenPresent(record::getUsername)
                        .set(ScmPersonDynamicSqlSupport.password).equalToWhenPresent(record::getPassword)
                        .set(ScmPersonDynamicSqlSupport.userface).equalToWhenPresent(record::getUserface)
                        .set(ScmPersonDynamicSqlSupport.remark).equalToWhenPresent(record::getRemark)
                        .where(ScmPersonDynamicSqlSupport.id, isEqualTo(record::getId))
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