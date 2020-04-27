package cn.com.wdi.scm.mapper.master;

import static cn.com.wdi.scm.mapper.master.SapConfigDynamicSqlSupport.*;

import cn.com.wdi.scm.model.master.SapConfig;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
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

@Mapper
public interface SapConfigMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-23T16:00:22.625+08:00", comments="Source Table: sap_config")
    BasicColumn[] selectList = BasicColumn.columnList(id, destName, ashost, sysnr, client, username, paswword, poolCapacity, peakLimit, sapRouter, lang);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-23T16:00:22.623+08:00", comments="Source Table: sap_config")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-23T16:00:22.623+08:00", comments="Source Table: sap_config")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-23T16:00:22.623+08:00", comments="Source Table: sap_config")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="select replace(newid(),'-','') ", keyProperty="record.id", before=true, resultType=String.class)
    int insert(InsertStatementProvider<SapConfig> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-23T16:00:22.624+08:00", comments="Source Table: sap_config")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SapConfigResult")
    Optional<SapConfig> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-23T16:00:22.625+08:00", comments="Source Table: sap_config")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SapConfigResult", value = {
            @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR),
            @Result(column="dest_name", property="destName", jdbcType=JdbcType.VARCHAR),
            @Result(column="ashost", property="ashost", jdbcType=JdbcType.VARCHAR),
            @Result(column="sysnr", property="sysnr", jdbcType=JdbcType.VARCHAR),
            @Result(column="client", property="client", jdbcType=JdbcType.VARCHAR),
            @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
            @Result(column="paswword", property="paswword", jdbcType=JdbcType.VARCHAR),
            @Result(column="pool_capacity", property="poolCapacity", jdbcType=JdbcType.VARCHAR),
            @Result(column="peak_limit", property="peakLimit", jdbcType=JdbcType.VARCHAR),
            @Result(column="sap_router", property="sapRouter", jdbcType=JdbcType.VARCHAR),
            @Result(column="lang", property="lang", jdbcType=JdbcType.CHAR)
    })
    List<SapConfig> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-23T16:00:22.625+08:00", comments="Source Table: sap_config")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-23T16:00:22.625+08:00", comments="Source Table: sap_config")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sapConfig, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-23T16:00:22.625+08:00", comments="Source Table: sap_config")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sapConfig, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-23T16:00:22.625+08:00", comments="Source Table: sap_config")
    default int insert(SapConfig record) {
        return MyBatis3Utils.insert(this::insert, record, sapConfig, c ->
                c.map(id).toProperty("id")
                        .map(destName).toProperty("destName")
                        .map(ashost).toProperty("ashost")
                        .map(sysnr).toProperty("sysnr")
                        .map(client).toProperty("client")
                        .map(username).toProperty("username")
                        .map(paswword).toProperty("paswword")
                        .map(poolCapacity).toProperty("poolCapacity")
                        .map(peakLimit).toProperty("peakLimit")
                        .map(sapRouter).toProperty("sapRouter")
                        .map(lang).toProperty("lang")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-23T16:00:22.625+08:00", comments="Source Table: sap_config")
    default int insertSelective(SapConfig record) {
        return MyBatis3Utils.insert(this::insert, record, sapConfig, c ->
                c.map(id).toProperty("id")
                        .map(destName).toPropertyWhenPresent("destName", record::getDestName)
                        .map(ashost).toPropertyWhenPresent("ashost", record::getAshost)
                        .map(sysnr).toPropertyWhenPresent("sysnr", record::getSysnr)
                        .map(client).toPropertyWhenPresent("client", record::getClient)
                        .map(username).toPropertyWhenPresent("username", record::getUsername)
                        .map(paswword).toPropertyWhenPresent("paswword", record::getPaswword)
                        .map(poolCapacity).toPropertyWhenPresent("poolCapacity", record::getPoolCapacity)
                        .map(peakLimit).toPropertyWhenPresent("peakLimit", record::getPeakLimit)
                        .map(sapRouter).toPropertyWhenPresent("sapRouter", record::getSapRouter)
                        .map(lang).toPropertyWhenPresent("lang", record::getLang)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-23T16:00:22.625+08:00", comments="Source Table: sap_config")
    default Optional<SapConfig> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sapConfig, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-23T16:00:22.625+08:00", comments="Source Table: sap_config")
    default List<SapConfig> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sapConfig, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-23T16:00:22.625+08:00", comments="Source Table: sap_config")
    default List<SapConfig> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sapConfig, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-23T16:00:22.625+08:00", comments="Source Table: sap_config")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sapConfig, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-23T16:00:22.625+08:00", comments="Source Table: sap_config")
    static UpdateDSL<UpdateModel> updateAllColumns(SapConfig record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(destName).equalTo(record::getDestName)
                .set(ashost).equalTo(record::getAshost)
                .set(sysnr).equalTo(record::getSysnr)
                .set(client).equalTo(record::getClient)
                .set(username).equalTo(record::getUsername)
                .set(paswword).equalTo(record::getPaswword)
                .set(poolCapacity).equalTo(record::getPoolCapacity)
                .set(peakLimit).equalTo(record::getPeakLimit)
                .set(sapRouter).equalTo(record::getSapRouter)
                .set(lang).equalTo(record::getLang);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-23T16:00:22.625+08:00", comments="Source Table: sap_config")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SapConfig record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(destName).equalToWhenPresent(record::getDestName)
                .set(ashost).equalToWhenPresent(record::getAshost)
                .set(sysnr).equalToWhenPresent(record::getSysnr)
                .set(client).equalToWhenPresent(record::getClient)
                .set(username).equalToWhenPresent(record::getUsername)
                .set(paswword).equalToWhenPresent(record::getPaswword)
                .set(poolCapacity).equalToWhenPresent(record::getPoolCapacity)
                .set(peakLimit).equalToWhenPresent(record::getPeakLimit)
                .set(sapRouter).equalToWhenPresent(record::getSapRouter)
                .set(lang).equalToWhenPresent(record::getLang);
    }
}