package cn.com.wdi.scm.mapper.ekp;

import static cn.com.wdi.scm.mapper.ekp.WdiMatnrMardDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.com.wdi.scm.model.ekp.WdiMatnrMard;
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
public interface WdiMatnrMardMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.961+08:00", comments="Source Table: wdi_matnr_mard")
    BasicColumn[] selectList = BasicColumn.columnList(fdId, fdMatnr, fdWerks, fdLgort, fdPstat, fdLfgja, fdLfmon, fdUmlme, fdInsme, fdSpeme, fdHerkl, fdLgpbe, fdKlabs, fdKinsm, fdKeinm, fdKspem, fdDlinl, fdPrctl, fdErsda, fdMandt);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.96+08:00", comments="Source Table: wdi_matnr_mard")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.96+08:00", comments="Source Table: wdi_matnr_mard")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.96+08:00", comments="Source Table: wdi_matnr_mard")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<WdiMatnrMard> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.961+08:00", comments="Source Table: wdi_matnr_mard")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<WdiMatnrMard> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.961+08:00", comments="Source Table: wdi_matnr_mard")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("WdiMatnrMardResult")
    Optional<WdiMatnrMard> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.961+08:00", comments="Source Table: wdi_matnr_mard")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="WdiMatnrMardResult", value = {
        @Result(column="fd_id", property="fdId", jdbcType=JdbcType.NVARCHAR, id=true),
        @Result(column="fd_matnr", property="fdMatnr", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_werks", property="fdWerks", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_lgort", property="fdLgort", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_pstat", property="fdPstat", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_lfgja", property="fdLfgja", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_lfmon", property="fdLfmon", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_umlme", property="fdUmlme", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_insme", property="fdInsme", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_speme", property="fdSpeme", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_herkl", property="fdHerkl", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_lgpbe", property="fdLgpbe", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_klabs", property="fdKlabs", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_kinsm", property="fdKinsm", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_keinm", property="fdKeinm", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_kspem", property="fdKspem", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_dlinl", property="fdDlinl", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_prctl", property="fdPrctl", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_ersda", property="fdErsda", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_mandt", property="fdMandt", jdbcType=JdbcType.NVARCHAR)
    })
    List<WdiMatnrMard> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.961+08:00", comments="Source Table: wdi_matnr_mard")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.961+08:00", comments="Source Table: wdi_matnr_mard")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, wdiMatnrMard, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.961+08:00", comments="Source Table: wdi_matnr_mard")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, wdiMatnrMard, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.961+08:00", comments="Source Table: wdi_matnr_mard")
    default int deleteByPrimaryKey(String fdId_) {
        return delete(c -> 
            c.where(fdId, isEqualTo(fdId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.961+08:00", comments="Source Table: wdi_matnr_mard")
    default int insert(WdiMatnrMard record) {
        return MyBatis3Utils.insert(this::insert, record, wdiMatnrMard, c ->
            c.map(fdId).toProperty("fdId")
            .map(fdMatnr).toProperty("fdMatnr")
            .map(fdWerks).toProperty("fdWerks")
            .map(fdLgort).toProperty("fdLgort")
            .map(fdPstat).toProperty("fdPstat")
            .map(fdLfgja).toProperty("fdLfgja")
            .map(fdLfmon).toProperty("fdLfmon")
            .map(fdUmlme).toProperty("fdUmlme")
            .map(fdInsme).toProperty("fdInsme")
            .map(fdSpeme).toProperty("fdSpeme")
            .map(fdHerkl).toProperty("fdHerkl")
            .map(fdLgpbe).toProperty("fdLgpbe")
            .map(fdKlabs).toProperty("fdKlabs")
            .map(fdKinsm).toProperty("fdKinsm")
            .map(fdKeinm).toProperty("fdKeinm")
            .map(fdKspem).toProperty("fdKspem")
            .map(fdDlinl).toProperty("fdDlinl")
            .map(fdPrctl).toProperty("fdPrctl")
            .map(fdErsda).toProperty("fdErsda")
            .map(fdMandt).toProperty("fdMandt")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.961+08:00", comments="Source Table: wdi_matnr_mard")
    default int insertMultiple(Collection<WdiMatnrMard> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, wdiMatnrMard, c ->
            c.map(fdId).toProperty("fdId")
            .map(fdMatnr).toProperty("fdMatnr")
            .map(fdWerks).toProperty("fdWerks")
            .map(fdLgort).toProperty("fdLgort")
            .map(fdPstat).toProperty("fdPstat")
            .map(fdLfgja).toProperty("fdLfgja")
            .map(fdLfmon).toProperty("fdLfmon")
            .map(fdUmlme).toProperty("fdUmlme")
            .map(fdInsme).toProperty("fdInsme")
            .map(fdSpeme).toProperty("fdSpeme")
            .map(fdHerkl).toProperty("fdHerkl")
            .map(fdLgpbe).toProperty("fdLgpbe")
            .map(fdKlabs).toProperty("fdKlabs")
            .map(fdKinsm).toProperty("fdKinsm")
            .map(fdKeinm).toProperty("fdKeinm")
            .map(fdKspem).toProperty("fdKspem")
            .map(fdDlinl).toProperty("fdDlinl")
            .map(fdPrctl).toProperty("fdPrctl")
            .map(fdErsda).toProperty("fdErsda")
            .map(fdMandt).toProperty("fdMandt")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.961+08:00", comments="Source Table: wdi_matnr_mard")
    default int insertSelective(WdiMatnrMard record) {
        return MyBatis3Utils.insert(this::insert, record, wdiMatnrMard, c ->
            c.map(fdId).toPropertyWhenPresent("fdId", record::getFdId)
            .map(fdMatnr).toPropertyWhenPresent("fdMatnr", record::getFdMatnr)
            .map(fdWerks).toPropertyWhenPresent("fdWerks", record::getFdWerks)
            .map(fdLgort).toPropertyWhenPresent("fdLgort", record::getFdLgort)
            .map(fdPstat).toPropertyWhenPresent("fdPstat", record::getFdPstat)
            .map(fdLfgja).toPropertyWhenPresent("fdLfgja", record::getFdLfgja)
            .map(fdLfmon).toPropertyWhenPresent("fdLfmon", record::getFdLfmon)
            .map(fdUmlme).toPropertyWhenPresent("fdUmlme", record::getFdUmlme)
            .map(fdInsme).toPropertyWhenPresent("fdInsme", record::getFdInsme)
            .map(fdSpeme).toPropertyWhenPresent("fdSpeme", record::getFdSpeme)
            .map(fdHerkl).toPropertyWhenPresent("fdHerkl", record::getFdHerkl)
            .map(fdLgpbe).toPropertyWhenPresent("fdLgpbe", record::getFdLgpbe)
            .map(fdKlabs).toPropertyWhenPresent("fdKlabs", record::getFdKlabs)
            .map(fdKinsm).toPropertyWhenPresent("fdKinsm", record::getFdKinsm)
            .map(fdKeinm).toPropertyWhenPresent("fdKeinm", record::getFdKeinm)
            .map(fdKspem).toPropertyWhenPresent("fdKspem", record::getFdKspem)
            .map(fdDlinl).toPropertyWhenPresent("fdDlinl", record::getFdDlinl)
            .map(fdPrctl).toPropertyWhenPresent("fdPrctl", record::getFdPrctl)
            .map(fdErsda).toPropertyWhenPresent("fdErsda", record::getFdErsda)
            .map(fdMandt).toPropertyWhenPresent("fdMandt", record::getFdMandt)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.961+08:00", comments="Source Table: wdi_matnr_mard")
    default Optional<WdiMatnrMard> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, wdiMatnrMard, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.961+08:00", comments="Source Table: wdi_matnr_mard")
    default List<WdiMatnrMard> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, wdiMatnrMard, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.961+08:00", comments="Source Table: wdi_matnr_mard")
    default List<WdiMatnrMard> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, wdiMatnrMard, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.961+08:00", comments="Source Table: wdi_matnr_mard")
    default Optional<WdiMatnrMard> selectByPrimaryKey(String fdId_) {
        return selectOne(c ->
            c.where(fdId, isEqualTo(fdId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.961+08:00", comments="Source Table: wdi_matnr_mard")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, wdiMatnrMard, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.961+08:00", comments="Source Table: wdi_matnr_mard")
    static UpdateDSL<UpdateModel> updateAllColumns(WdiMatnrMard record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(fdId).equalTo(record::getFdId)
                .set(fdMatnr).equalTo(record::getFdMatnr)
                .set(fdWerks).equalTo(record::getFdWerks)
                .set(fdLgort).equalTo(record::getFdLgort)
                .set(fdPstat).equalTo(record::getFdPstat)
                .set(fdLfgja).equalTo(record::getFdLfgja)
                .set(fdLfmon).equalTo(record::getFdLfmon)
                .set(fdUmlme).equalTo(record::getFdUmlme)
                .set(fdInsme).equalTo(record::getFdInsme)
                .set(fdSpeme).equalTo(record::getFdSpeme)
                .set(fdHerkl).equalTo(record::getFdHerkl)
                .set(fdLgpbe).equalTo(record::getFdLgpbe)
                .set(fdKlabs).equalTo(record::getFdKlabs)
                .set(fdKinsm).equalTo(record::getFdKinsm)
                .set(fdKeinm).equalTo(record::getFdKeinm)
                .set(fdKspem).equalTo(record::getFdKspem)
                .set(fdDlinl).equalTo(record::getFdDlinl)
                .set(fdPrctl).equalTo(record::getFdPrctl)
                .set(fdErsda).equalTo(record::getFdErsda)
                .set(fdMandt).equalTo(record::getFdMandt);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.961+08:00", comments="Source Table: wdi_matnr_mard")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(WdiMatnrMard record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(fdId).equalToWhenPresent(record::getFdId)
                .set(fdMatnr).equalToWhenPresent(record::getFdMatnr)
                .set(fdWerks).equalToWhenPresent(record::getFdWerks)
                .set(fdLgort).equalToWhenPresent(record::getFdLgort)
                .set(fdPstat).equalToWhenPresent(record::getFdPstat)
                .set(fdLfgja).equalToWhenPresent(record::getFdLfgja)
                .set(fdLfmon).equalToWhenPresent(record::getFdLfmon)
                .set(fdUmlme).equalToWhenPresent(record::getFdUmlme)
                .set(fdInsme).equalToWhenPresent(record::getFdInsme)
                .set(fdSpeme).equalToWhenPresent(record::getFdSpeme)
                .set(fdHerkl).equalToWhenPresent(record::getFdHerkl)
                .set(fdLgpbe).equalToWhenPresent(record::getFdLgpbe)
                .set(fdKlabs).equalToWhenPresent(record::getFdKlabs)
                .set(fdKinsm).equalToWhenPresent(record::getFdKinsm)
                .set(fdKeinm).equalToWhenPresent(record::getFdKeinm)
                .set(fdKspem).equalToWhenPresent(record::getFdKspem)
                .set(fdDlinl).equalToWhenPresent(record::getFdDlinl)
                .set(fdPrctl).equalToWhenPresent(record::getFdPrctl)
                .set(fdErsda).equalToWhenPresent(record::getFdErsda)
                .set(fdMandt).equalToWhenPresent(record::getFdMandt);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.961+08:00", comments="Source Table: wdi_matnr_mard")
    default int updateByPrimaryKey(WdiMatnrMard record) {
        return update(c ->
            c.set(fdMatnr).equalTo(record::getFdMatnr)
            .set(fdWerks).equalTo(record::getFdWerks)
            .set(fdLgort).equalTo(record::getFdLgort)
            .set(fdPstat).equalTo(record::getFdPstat)
            .set(fdLfgja).equalTo(record::getFdLfgja)
            .set(fdLfmon).equalTo(record::getFdLfmon)
            .set(fdUmlme).equalTo(record::getFdUmlme)
            .set(fdInsme).equalTo(record::getFdInsme)
            .set(fdSpeme).equalTo(record::getFdSpeme)
            .set(fdHerkl).equalTo(record::getFdHerkl)
            .set(fdLgpbe).equalTo(record::getFdLgpbe)
            .set(fdKlabs).equalTo(record::getFdKlabs)
            .set(fdKinsm).equalTo(record::getFdKinsm)
            .set(fdKeinm).equalTo(record::getFdKeinm)
            .set(fdKspem).equalTo(record::getFdKspem)
            .set(fdDlinl).equalTo(record::getFdDlinl)
            .set(fdPrctl).equalTo(record::getFdPrctl)
            .set(fdErsda).equalTo(record::getFdErsda)
            .set(fdMandt).equalTo(record::getFdMandt)
            .where(fdId, isEqualTo(record::getFdId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.961+08:00", comments="Source Table: wdi_matnr_mard")
    default int updateByPrimaryKeySelective(WdiMatnrMard record) {
        return update(c ->
            c.set(fdMatnr).equalToWhenPresent(record::getFdMatnr)
            .set(fdWerks).equalToWhenPresent(record::getFdWerks)
            .set(fdLgort).equalToWhenPresent(record::getFdLgort)
            .set(fdPstat).equalToWhenPresent(record::getFdPstat)
            .set(fdLfgja).equalToWhenPresent(record::getFdLfgja)
            .set(fdLfmon).equalToWhenPresent(record::getFdLfmon)
            .set(fdUmlme).equalToWhenPresent(record::getFdUmlme)
            .set(fdInsme).equalToWhenPresent(record::getFdInsme)
            .set(fdSpeme).equalToWhenPresent(record::getFdSpeme)
            .set(fdHerkl).equalToWhenPresent(record::getFdHerkl)
            .set(fdLgpbe).equalToWhenPresent(record::getFdLgpbe)
            .set(fdKlabs).equalToWhenPresent(record::getFdKlabs)
            .set(fdKinsm).equalToWhenPresent(record::getFdKinsm)
            .set(fdKeinm).equalToWhenPresent(record::getFdKeinm)
            .set(fdKspem).equalToWhenPresent(record::getFdKspem)
            .set(fdDlinl).equalToWhenPresent(record::getFdDlinl)
            .set(fdPrctl).equalToWhenPresent(record::getFdPrctl)
            .set(fdErsda).equalToWhenPresent(record::getFdErsda)
            .set(fdMandt).equalToWhenPresent(record::getFdMandt)
            .where(fdId, isEqualTo(record::getFdId))
        );
    }
}