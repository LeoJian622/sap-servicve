package cn.com.wdi.scm.mapper.master;

import cn.com.wdi.scm.model.master.SapFunction;
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

import static cn.com.wdi.scm.mapper.master.SapFunctionDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Mapper
public interface SapFunctionMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.964+08:00", comments="Source Table: sap_function")
    BasicColumn[] selectList = BasicColumn.columnList(id, configId, callName, functionName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.953+08:00", comments="Source Table: sap_function")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.954+08:00", comments="Source Table: sap_function")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.954+08:00", comments="Source Table: sap_function")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="select replace(newid(),'-','') ", keyProperty="record.id", before=true, resultType=String.class)
    int insert(InsertStatementProvider<SapFunction> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.957+08:00", comments="Source Table: sap_function")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SapFunctionResult")
    Optional<SapFunction> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.957+08:00", comments="Source Table: sap_function")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SapFunctionResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="config_id", property="configId", jdbcType=JdbcType.VARCHAR),
        @Result(column="call_name", property="callName", jdbcType=JdbcType.VARCHAR),
        @Result(column="function_name", property="functionName", jdbcType=JdbcType.VARCHAR)
    })
    List<SapFunction> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.959+08:00", comments="Source Table: sap_function")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.959+08:00", comments="Source Table: sap_function")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sapFunction, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.96+08:00", comments="Source Table: sap_function")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sapFunction, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.96+08:00", comments="Source Table: sap_function")
    default int deleteByPrimaryKey(String id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.96+08:00", comments="Source Table: sap_function")
    default int insert(SapFunction record) {
        return MyBatis3Utils.insert(this::insert, record, sapFunction, c ->
            c.map(id).toProperty("id")
            .map(configId).toProperty("configId")
            .map(callName).toProperty("callName")
            .map(functionName).toProperty("functionName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.961+08:00", comments="Source Table: sap_function")
    default int insertSelective(SapFunction record) {
        return MyBatis3Utils.insert(this::insert, record, sapFunction, c ->
            c.map(id).toProperty("id")
            .map(configId).toPropertyWhenPresent("configId", record::getConfigId)
            .map(callName).toPropertyWhenPresent("callName", record::getCallName)
            .map(functionName).toPropertyWhenPresent("functionName", record::getFunctionName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.965+08:00", comments="Source Table: sap_function")
    default Optional<SapFunction> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sapFunction, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.965+08:00", comments="Source Table: sap_function")
    default List<SapFunction> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sapFunction, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.966+08:00", comments="Source Table: sap_function")
    default List<SapFunction> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sapFunction, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.966+08:00", comments="Source Table: sap_function")
    default Optional<SapFunction> selectByPrimaryKey(String id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.967+08:00", comments="Source Table: sap_function")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sapFunction, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.968+08:00", comments="Source Table: sap_function")
    static UpdateDSL<UpdateModel> updateAllColumns(SapFunction record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(configId).equalTo(record::getConfigId)
                .set(callName).equalTo(record::getCallName)
                .set(functionName).equalTo(record::getFunctionName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.968+08:00", comments="Source Table: sap_function")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SapFunction record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(configId).equalToWhenPresent(record::getConfigId)
                .set(callName).equalToWhenPresent(record::getCallName)
                .set(functionName).equalToWhenPresent(record::getFunctionName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.969+08:00", comments="Source Table: sap_function")
    default int updateByPrimaryKey(SapFunction record) {
        return update(c ->
            c.set(configId).equalTo(record::getConfigId)
            .set(callName).equalTo(record::getCallName)
            .set(functionName).equalTo(record::getFunctionName)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.97+08:00", comments="Source Table: sap_function")
    default int updateByPrimaryKeySelective(SapFunction record) {
        return update(c ->
            c.set(configId).equalToWhenPresent(record::getConfigId)
            .set(callName).equalToWhenPresent(record::getCallName)
            .set(functionName).equalToWhenPresent(record::getFunctionName)
            .where(id, isEqualTo(record::getId))
        );
    }
}