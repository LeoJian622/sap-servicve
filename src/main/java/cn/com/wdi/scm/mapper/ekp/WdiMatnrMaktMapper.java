package cn.com.wdi.scm.mapper.ekp;

import static cn.com.wdi.scm.mapper.ekp.WdiMatnrMaktDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.com.wdi.scm.config.dynamicdatasource.TargetDataSource;
import cn.com.wdi.scm.model.ekp.WdiMatnrMakt;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
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

@Mapper
public interface WdiMatnrMaktMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.94+08:00", comments="Source Table: wdi_matnr_makt")
    BasicColumn[] selectList = BasicColumn.columnList(fdId, fdMatnr, fdSpras, fdMaktx, fdMaktg, fdMandt);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.939+08:00", comments="Source Table: wdi_matnr_makt")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.939+08:00", comments="Source Table: wdi_matnr_makt")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.939+08:00", comments="Source Table: wdi_matnr_makt")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<WdiMatnrMakt> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.939+08:00", comments="Source Table: wdi_matnr_makt")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<WdiMatnrMakt> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.939+08:00", comments="Source Table: wdi_matnr_makt")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("WdiMatnrMaktResult")
    Optional<WdiMatnrMakt> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.939+08:00", comments="Source Table: wdi_matnr_makt")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="WdiMatnrMaktResult", value = {
        @Result(column="fd_id", property="fdId", jdbcType=JdbcType.NVARCHAR, id=true),
        @Result(column="fd_matnr", property="fdMatnr", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_spras", property="fdSpras", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_maktx", property="fdMaktx", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_maktg", property="fdMaktg", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_mandt", property="fdMandt", jdbcType=JdbcType.NVARCHAR)
    })
    List<WdiMatnrMakt> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.94+08:00", comments="Source Table: wdi_matnr_makt")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.94+08:00", comments="Source Table: wdi_matnr_makt")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, wdiMatnrMakt, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.94+08:00", comments="Source Table: wdi_matnr_makt")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, wdiMatnrMakt, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.94+08:00", comments="Source Table: wdi_matnr_makt")
    default int deleteByPrimaryKey(String fdId_) {
        return delete(c -> 
            c.where(fdId, isEqualTo(fdId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.94+08:00", comments="Source Table: wdi_matnr_makt")
    default int insert(WdiMatnrMakt record) {
        return MyBatis3Utils.insert(this::insert, record, wdiMatnrMakt, c ->
            c.map(fdId).toProperty("fdId")
            .map(fdMatnr).toProperty("fdMatnr")
            .map(fdSpras).toProperty("fdSpras")
            .map(fdMaktx).toProperty("fdMaktx")
            .map(fdMaktg).toProperty("fdMaktg")
            .map(fdMandt).toProperty("fdMandt")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.94+08:00", comments="Source Table: wdi_matnr_makt")
    default int insertMultiple(Collection<WdiMatnrMakt> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, wdiMatnrMakt, c ->
            c.map(fdId).toProperty("fdId")
            .map(fdMatnr).toProperty("fdMatnr")
            .map(fdSpras).toProperty("fdSpras")
            .map(fdMaktx).toProperty("fdMaktx")
            .map(fdMaktg).toProperty("fdMaktg")
            .map(fdMandt).toProperty("fdMandt")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.94+08:00", comments="Source Table: wdi_matnr_makt")
    default int insertSelective(WdiMatnrMakt record) {
        return MyBatis3Utils.insert(this::insert, record, wdiMatnrMakt, c ->
            c.map(fdId).toPropertyWhenPresent("fdId", record::getFdId)
            .map(fdMatnr).toPropertyWhenPresent("fdMatnr", record::getFdMatnr)
            .map(fdSpras).toPropertyWhenPresent("fdSpras", record::getFdSpras)
            .map(fdMaktx).toPropertyWhenPresent("fdMaktx", record::getFdMaktx)
            .map(fdMaktg).toPropertyWhenPresent("fdMaktg", record::getFdMaktg)
            .map(fdMandt).toPropertyWhenPresent("fdMandt", record::getFdMandt)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.94+08:00", comments="Source Table: wdi_matnr_makt")
    default Optional<WdiMatnrMakt> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, wdiMatnrMakt, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.94+08:00", comments="Source Table: wdi_matnr_makt")
    default List<WdiMatnrMakt> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, wdiMatnrMakt, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.94+08:00", comments="Source Table: wdi_matnr_makt")
    default List<WdiMatnrMakt> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, wdiMatnrMakt, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.94+08:00", comments="Source Table: wdi_matnr_makt")
    default Optional<WdiMatnrMakt> selectByPrimaryKey(String fdId_) {
        return selectOne(c ->
            c.where(fdId, isEqualTo(fdId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.94+08:00", comments="Source Table: wdi_matnr_makt")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, wdiMatnrMakt, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.94+08:00", comments="Source Table: wdi_matnr_makt")
    static UpdateDSL<UpdateModel> updateAllColumns(WdiMatnrMakt record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(fdId).equalTo(record::getFdId)
                .set(fdMatnr).equalTo(record::getFdMatnr)
                .set(fdSpras).equalTo(record::getFdSpras)
                .set(fdMaktx).equalTo(record::getFdMaktx)
                .set(fdMaktg).equalTo(record::getFdMaktg)
                .set(fdMandt).equalTo(record::getFdMandt);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.941+08:00", comments="Source Table: wdi_matnr_makt")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(WdiMatnrMakt record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(fdId).equalToWhenPresent(record::getFdId)
                .set(fdMatnr).equalToWhenPresent(record::getFdMatnr)
                .set(fdSpras).equalToWhenPresent(record::getFdSpras)
                .set(fdMaktx).equalToWhenPresent(record::getFdMaktx)
                .set(fdMaktg).equalToWhenPresent(record::getFdMaktg)
                .set(fdMandt).equalToWhenPresent(record::getFdMandt);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.941+08:00", comments="Source Table: wdi_matnr_makt")
    default int updateByPrimaryKey(WdiMatnrMakt record) {
        return update(c ->
            c.set(fdMatnr).equalTo(record::getFdMatnr)
            .set(fdSpras).equalTo(record::getFdSpras)
            .set(fdMaktx).equalTo(record::getFdMaktx)
            .set(fdMaktg).equalTo(record::getFdMaktg)
            .set(fdMandt).equalTo(record::getFdMandt)
            .where(fdId, isEqualTo(record::getFdId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.941+08:00", comments="Source Table: wdi_matnr_makt")
    default int updateByPrimaryKeySelective(WdiMatnrMakt record) {
        return update(c ->
            c.set(fdMatnr).equalToWhenPresent(record::getFdMatnr)
            .set(fdSpras).equalToWhenPresent(record::getFdSpras)
            .set(fdMaktx).equalToWhenPresent(record::getFdMaktx)
            .set(fdMaktg).equalToWhenPresent(record::getFdMaktg)
            .set(fdMandt).equalToWhenPresent(record::getFdMandt)
            .where(fdId, isEqualTo(record::getFdId))
        );
    }
}