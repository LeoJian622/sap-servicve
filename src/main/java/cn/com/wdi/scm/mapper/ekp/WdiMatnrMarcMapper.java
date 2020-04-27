package cn.com.wdi.scm.mapper.ekp;

import static cn.com.wdi.scm.mapper.ekp.WdiMatnrMarcDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.com.wdi.scm.model.ekp.WdiMatnrMarc;
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
public interface WdiMatnrMarcMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.954+08:00", comments="Source Table: wdi_matnr_marc")
    BasicColumn[] selectList = BasicColumn.columnList(fdId, fdMatnr, fdWerks, fdPstat, fdMaabc, fdKzkri, fdEkgrp, fdDispo, fdKzdie, fdPlifz, fdWebaz, fdPerkz, fdBeskz, fdSobsl, fdEisbe, fdBstmi, fdBstma, fdBstfe, fdMabst, fdRgekm, fdStalt, fdStlan, fdPlnnr, fdPlnal, fdSobsk, fdFrtme, fdLgpro, fdMandt);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.953+08:00", comments="Source Table: wdi_matnr_marc")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.953+08:00", comments="Source Table: wdi_matnr_marc")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.953+08:00", comments="Source Table: wdi_matnr_marc")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<WdiMatnrMarc> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.953+08:00", comments="Source Table: wdi_matnr_marc")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<WdiMatnrMarc> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.953+08:00", comments="Source Table: wdi_matnr_marc")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("WdiMatnrMarcResult")
    Optional<WdiMatnrMarc> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.953+08:00", comments="Source Table: wdi_matnr_marc")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="WdiMatnrMarcResult", value = {
        @Result(column="fd_id", property="fdId", jdbcType=JdbcType.NVARCHAR, id=true),
        @Result(column="fd_matnr", property="fdMatnr", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_werks", property="fdWerks", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_pstat", property="fdPstat", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_maabc", property="fdMaabc", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_kzkri", property="fdKzkri", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_ekgrp", property="fdEkgrp", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_dispo", property="fdDispo", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_kzdie", property="fdKzdie", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_plifz", property="fdPlifz", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_webaz", property="fdWebaz", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_perkz", property="fdPerkz", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_beskz", property="fdBeskz", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_sobsl", property="fdSobsl", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_eisbe", property="fdEisbe", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_bstmi", property="fdBstmi", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_bstma", property="fdBstma", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_bstfe", property="fdBstfe", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_mabst", property="fdMabst", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_rgekm", property="fdRgekm", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_stalt", property="fdStalt", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_stlan", property="fdStlan", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_plnnr", property="fdPlnnr", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_plnal", property="fdPlnal", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_sobsk", property="fdSobsk", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_frtme", property="fdFrtme", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_lgpro", property="fdLgpro", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_mandt", property="fdMandt", jdbcType=JdbcType.NVARCHAR)
    })
    List<WdiMatnrMarc> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.953+08:00", comments="Source Table: wdi_matnr_marc")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.953+08:00", comments="Source Table: wdi_matnr_marc")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, wdiMatnrMarc, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.953+08:00", comments="Source Table: wdi_matnr_marc")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, wdiMatnrMarc, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.953+08:00", comments="Source Table: wdi_matnr_marc")
    default int deleteByPrimaryKey(String fdId_) {
        return delete(c -> 
            c.where(fdId, isEqualTo(fdId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.953+08:00", comments="Source Table: wdi_matnr_marc")
    default int insert(WdiMatnrMarc record) {
        return MyBatis3Utils.insert(this::insert, record, wdiMatnrMarc, c ->
            c.map(fdId).toProperty("fdId")
            .map(fdMatnr).toProperty("fdMatnr")
            .map(fdWerks).toProperty("fdWerks")
            .map(fdPstat).toProperty("fdPstat")
            .map(fdMaabc).toProperty("fdMaabc")
            .map(fdKzkri).toProperty("fdKzkri")
            .map(fdEkgrp).toProperty("fdEkgrp")
            .map(fdDispo).toProperty("fdDispo")
            .map(fdKzdie).toProperty("fdKzdie")
            .map(fdPlifz).toProperty("fdPlifz")
            .map(fdWebaz).toProperty("fdWebaz")
            .map(fdPerkz).toProperty("fdPerkz")
            .map(fdBeskz).toProperty("fdBeskz")
            .map(fdSobsl).toProperty("fdSobsl")
            .map(fdEisbe).toProperty("fdEisbe")
            .map(fdBstmi).toProperty("fdBstmi")
            .map(fdBstma).toProperty("fdBstma")
            .map(fdBstfe).toProperty("fdBstfe")
            .map(fdMabst).toProperty("fdMabst")
            .map(fdRgekm).toProperty("fdRgekm")
            .map(fdStalt).toProperty("fdStalt")
            .map(fdStlan).toProperty("fdStlan")
            .map(fdPlnnr).toProperty("fdPlnnr")
            .map(fdPlnal).toProperty("fdPlnal")
            .map(fdSobsk).toProperty("fdSobsk")
            .map(fdFrtme).toProperty("fdFrtme")
            .map(fdLgpro).toProperty("fdLgpro")
            .map(fdMandt).toProperty("fdMandt")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.953+08:00", comments="Source Table: wdi_matnr_marc")
    default int insertMultiple(Collection<WdiMatnrMarc> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, wdiMatnrMarc, c ->
            c.map(fdId).toProperty("fdId")
            .map(fdMatnr).toProperty("fdMatnr")
            .map(fdWerks).toProperty("fdWerks")
            .map(fdPstat).toProperty("fdPstat")
            .map(fdMaabc).toProperty("fdMaabc")
            .map(fdKzkri).toProperty("fdKzkri")
            .map(fdEkgrp).toProperty("fdEkgrp")
            .map(fdDispo).toProperty("fdDispo")
            .map(fdKzdie).toProperty("fdKzdie")
            .map(fdPlifz).toProperty("fdPlifz")
            .map(fdWebaz).toProperty("fdWebaz")
            .map(fdPerkz).toProperty("fdPerkz")
            .map(fdBeskz).toProperty("fdBeskz")
            .map(fdSobsl).toProperty("fdSobsl")
            .map(fdEisbe).toProperty("fdEisbe")
            .map(fdBstmi).toProperty("fdBstmi")
            .map(fdBstma).toProperty("fdBstma")
            .map(fdBstfe).toProperty("fdBstfe")
            .map(fdMabst).toProperty("fdMabst")
            .map(fdRgekm).toProperty("fdRgekm")
            .map(fdStalt).toProperty("fdStalt")
            .map(fdStlan).toProperty("fdStlan")
            .map(fdPlnnr).toProperty("fdPlnnr")
            .map(fdPlnal).toProperty("fdPlnal")
            .map(fdSobsk).toProperty("fdSobsk")
            .map(fdFrtme).toProperty("fdFrtme")
            .map(fdLgpro).toProperty("fdLgpro")
            .map(fdMandt).toProperty("fdMandt")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.954+08:00", comments="Source Table: wdi_matnr_marc")
    default int insertSelective(WdiMatnrMarc record) {
        return MyBatis3Utils.insert(this::insert, record, wdiMatnrMarc, c ->
            c.map(fdId).toPropertyWhenPresent("fdId", record::getFdId)
            .map(fdMatnr).toPropertyWhenPresent("fdMatnr", record::getFdMatnr)
            .map(fdWerks).toPropertyWhenPresent("fdWerks", record::getFdWerks)
            .map(fdPstat).toPropertyWhenPresent("fdPstat", record::getFdPstat)
            .map(fdMaabc).toPropertyWhenPresent("fdMaabc", record::getFdMaabc)
            .map(fdKzkri).toPropertyWhenPresent("fdKzkri", record::getFdKzkri)
            .map(fdEkgrp).toPropertyWhenPresent("fdEkgrp", record::getFdEkgrp)
            .map(fdDispo).toPropertyWhenPresent("fdDispo", record::getFdDispo)
            .map(fdKzdie).toPropertyWhenPresent("fdKzdie", record::getFdKzdie)
            .map(fdPlifz).toPropertyWhenPresent("fdPlifz", record::getFdPlifz)
            .map(fdWebaz).toPropertyWhenPresent("fdWebaz", record::getFdWebaz)
            .map(fdPerkz).toPropertyWhenPresent("fdPerkz", record::getFdPerkz)
            .map(fdBeskz).toPropertyWhenPresent("fdBeskz", record::getFdBeskz)
            .map(fdSobsl).toPropertyWhenPresent("fdSobsl", record::getFdSobsl)
            .map(fdEisbe).toPropertyWhenPresent("fdEisbe", record::getFdEisbe)
            .map(fdBstmi).toPropertyWhenPresent("fdBstmi", record::getFdBstmi)
            .map(fdBstma).toPropertyWhenPresent("fdBstma", record::getFdBstma)
            .map(fdBstfe).toPropertyWhenPresent("fdBstfe", record::getFdBstfe)
            .map(fdMabst).toPropertyWhenPresent("fdMabst", record::getFdMabst)
            .map(fdRgekm).toPropertyWhenPresent("fdRgekm", record::getFdRgekm)
            .map(fdStalt).toPropertyWhenPresent("fdStalt", record::getFdStalt)
            .map(fdStlan).toPropertyWhenPresent("fdStlan", record::getFdStlan)
            .map(fdPlnnr).toPropertyWhenPresent("fdPlnnr", record::getFdPlnnr)
            .map(fdPlnal).toPropertyWhenPresent("fdPlnal", record::getFdPlnal)
            .map(fdSobsk).toPropertyWhenPresent("fdSobsk", record::getFdSobsk)
            .map(fdFrtme).toPropertyWhenPresent("fdFrtme", record::getFdFrtme)
            .map(fdLgpro).toPropertyWhenPresent("fdLgpro", record::getFdLgpro)
            .map(fdMandt).toPropertyWhenPresent("fdMandt", record::getFdMandt)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.954+08:00", comments="Source Table: wdi_matnr_marc")
    default Optional<WdiMatnrMarc> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, wdiMatnrMarc, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.954+08:00", comments="Source Table: wdi_matnr_marc")
    default List<WdiMatnrMarc> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, wdiMatnrMarc, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.954+08:00", comments="Source Table: wdi_matnr_marc")
    default List<WdiMatnrMarc> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, wdiMatnrMarc, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.954+08:00", comments="Source Table: wdi_matnr_marc")
    default Optional<WdiMatnrMarc> selectByPrimaryKey(String fdId_) {
        return selectOne(c ->
            c.where(fdId, isEqualTo(fdId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.954+08:00", comments="Source Table: wdi_matnr_marc")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, wdiMatnrMarc, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.954+08:00", comments="Source Table: wdi_matnr_marc")
    static UpdateDSL<UpdateModel> updateAllColumns(WdiMatnrMarc record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(fdId).equalTo(record::getFdId)
                .set(fdMatnr).equalTo(record::getFdMatnr)
                .set(fdWerks).equalTo(record::getFdWerks)
                .set(fdPstat).equalTo(record::getFdPstat)
                .set(fdMaabc).equalTo(record::getFdMaabc)
                .set(fdKzkri).equalTo(record::getFdKzkri)
                .set(fdEkgrp).equalTo(record::getFdEkgrp)
                .set(fdDispo).equalTo(record::getFdDispo)
                .set(fdKzdie).equalTo(record::getFdKzdie)
                .set(fdPlifz).equalTo(record::getFdPlifz)
                .set(fdWebaz).equalTo(record::getFdWebaz)
                .set(fdPerkz).equalTo(record::getFdPerkz)
                .set(fdBeskz).equalTo(record::getFdBeskz)
                .set(fdSobsl).equalTo(record::getFdSobsl)
                .set(fdEisbe).equalTo(record::getFdEisbe)
                .set(fdBstmi).equalTo(record::getFdBstmi)
                .set(fdBstma).equalTo(record::getFdBstma)
                .set(fdBstfe).equalTo(record::getFdBstfe)
                .set(fdMabst).equalTo(record::getFdMabst)
                .set(fdRgekm).equalTo(record::getFdRgekm)
                .set(fdStalt).equalTo(record::getFdStalt)
                .set(fdStlan).equalTo(record::getFdStlan)
                .set(fdPlnnr).equalTo(record::getFdPlnnr)
                .set(fdPlnal).equalTo(record::getFdPlnal)
                .set(fdSobsk).equalTo(record::getFdSobsk)
                .set(fdFrtme).equalTo(record::getFdFrtme)
                .set(fdLgpro).equalTo(record::getFdLgpro)
                .set(fdMandt).equalTo(record::getFdMandt);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.954+08:00", comments="Source Table: wdi_matnr_marc")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(WdiMatnrMarc record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(fdId).equalToWhenPresent(record::getFdId)
                .set(fdMatnr).equalToWhenPresent(record::getFdMatnr)
                .set(fdWerks).equalToWhenPresent(record::getFdWerks)
                .set(fdPstat).equalToWhenPresent(record::getFdPstat)
                .set(fdMaabc).equalToWhenPresent(record::getFdMaabc)
                .set(fdKzkri).equalToWhenPresent(record::getFdKzkri)
                .set(fdEkgrp).equalToWhenPresent(record::getFdEkgrp)
                .set(fdDispo).equalToWhenPresent(record::getFdDispo)
                .set(fdKzdie).equalToWhenPresent(record::getFdKzdie)
                .set(fdPlifz).equalToWhenPresent(record::getFdPlifz)
                .set(fdWebaz).equalToWhenPresent(record::getFdWebaz)
                .set(fdPerkz).equalToWhenPresent(record::getFdPerkz)
                .set(fdBeskz).equalToWhenPresent(record::getFdBeskz)
                .set(fdSobsl).equalToWhenPresent(record::getFdSobsl)
                .set(fdEisbe).equalToWhenPresent(record::getFdEisbe)
                .set(fdBstmi).equalToWhenPresent(record::getFdBstmi)
                .set(fdBstma).equalToWhenPresent(record::getFdBstma)
                .set(fdBstfe).equalToWhenPresent(record::getFdBstfe)
                .set(fdMabst).equalToWhenPresent(record::getFdMabst)
                .set(fdRgekm).equalToWhenPresent(record::getFdRgekm)
                .set(fdStalt).equalToWhenPresent(record::getFdStalt)
                .set(fdStlan).equalToWhenPresent(record::getFdStlan)
                .set(fdPlnnr).equalToWhenPresent(record::getFdPlnnr)
                .set(fdPlnal).equalToWhenPresent(record::getFdPlnal)
                .set(fdSobsk).equalToWhenPresent(record::getFdSobsk)
                .set(fdFrtme).equalToWhenPresent(record::getFdFrtme)
                .set(fdLgpro).equalToWhenPresent(record::getFdLgpro)
                .set(fdMandt).equalToWhenPresent(record::getFdMandt);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.954+08:00", comments="Source Table: wdi_matnr_marc")
    default int updateByPrimaryKey(WdiMatnrMarc record) {
        return update(c ->
            c.set(fdMatnr).equalTo(record::getFdMatnr)
            .set(fdWerks).equalTo(record::getFdWerks)
            .set(fdPstat).equalTo(record::getFdPstat)
            .set(fdMaabc).equalTo(record::getFdMaabc)
            .set(fdKzkri).equalTo(record::getFdKzkri)
            .set(fdEkgrp).equalTo(record::getFdEkgrp)
            .set(fdDispo).equalTo(record::getFdDispo)
            .set(fdKzdie).equalTo(record::getFdKzdie)
            .set(fdPlifz).equalTo(record::getFdPlifz)
            .set(fdWebaz).equalTo(record::getFdWebaz)
            .set(fdPerkz).equalTo(record::getFdPerkz)
            .set(fdBeskz).equalTo(record::getFdBeskz)
            .set(fdSobsl).equalTo(record::getFdSobsl)
            .set(fdEisbe).equalTo(record::getFdEisbe)
            .set(fdBstmi).equalTo(record::getFdBstmi)
            .set(fdBstma).equalTo(record::getFdBstma)
            .set(fdBstfe).equalTo(record::getFdBstfe)
            .set(fdMabst).equalTo(record::getFdMabst)
            .set(fdRgekm).equalTo(record::getFdRgekm)
            .set(fdStalt).equalTo(record::getFdStalt)
            .set(fdStlan).equalTo(record::getFdStlan)
            .set(fdPlnnr).equalTo(record::getFdPlnnr)
            .set(fdPlnal).equalTo(record::getFdPlnal)
            .set(fdSobsk).equalTo(record::getFdSobsk)
            .set(fdFrtme).equalTo(record::getFdFrtme)
            .set(fdLgpro).equalTo(record::getFdLgpro)
            .set(fdMandt).equalTo(record::getFdMandt)
            .where(fdId, isEqualTo(record::getFdId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.954+08:00", comments="Source Table: wdi_matnr_marc")
    default int updateByPrimaryKeySelective(WdiMatnrMarc record) {
        return update(c ->
            c.set(fdMatnr).equalToWhenPresent(record::getFdMatnr)
            .set(fdWerks).equalToWhenPresent(record::getFdWerks)
            .set(fdPstat).equalToWhenPresent(record::getFdPstat)
            .set(fdMaabc).equalToWhenPresent(record::getFdMaabc)
            .set(fdKzkri).equalToWhenPresent(record::getFdKzkri)
            .set(fdEkgrp).equalToWhenPresent(record::getFdEkgrp)
            .set(fdDispo).equalToWhenPresent(record::getFdDispo)
            .set(fdKzdie).equalToWhenPresent(record::getFdKzdie)
            .set(fdPlifz).equalToWhenPresent(record::getFdPlifz)
            .set(fdWebaz).equalToWhenPresent(record::getFdWebaz)
            .set(fdPerkz).equalToWhenPresent(record::getFdPerkz)
            .set(fdBeskz).equalToWhenPresent(record::getFdBeskz)
            .set(fdSobsl).equalToWhenPresent(record::getFdSobsl)
            .set(fdEisbe).equalToWhenPresent(record::getFdEisbe)
            .set(fdBstmi).equalToWhenPresent(record::getFdBstmi)
            .set(fdBstma).equalToWhenPresent(record::getFdBstma)
            .set(fdBstfe).equalToWhenPresent(record::getFdBstfe)
            .set(fdMabst).equalToWhenPresent(record::getFdMabst)
            .set(fdRgekm).equalToWhenPresent(record::getFdRgekm)
            .set(fdStalt).equalToWhenPresent(record::getFdStalt)
            .set(fdStlan).equalToWhenPresent(record::getFdStlan)
            .set(fdPlnnr).equalToWhenPresent(record::getFdPlnnr)
            .set(fdPlnal).equalToWhenPresent(record::getFdPlnal)
            .set(fdSobsk).equalToWhenPresent(record::getFdSobsk)
            .set(fdFrtme).equalToWhenPresent(record::getFdFrtme)
            .set(fdLgpro).equalToWhenPresent(record::getFdLgpro)
            .set(fdMandt).equalToWhenPresent(record::getFdMandt)
            .where(fdId, isEqualTo(record::getFdId))
        );
    }
}