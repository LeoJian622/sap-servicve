package cn.com.wdi.scm.mapper.ekp;

import static cn.com.wdi.scm.mapper.ekp.WdiMatnrMaraDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.com.wdi.scm.config.dynamicdatasource.TargetDataSource;
import cn.com.wdi.scm.model.ekp.WdiMatnrMara;
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
public interface WdiMatnrMaraMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.947+08:00", comments="Source Table: wdi_matnr_mara")
    BasicColumn[] selectList = BasicColumn.columnList(fdId, fdMatnr, fdErsda, fdErnam, fdLaeda, fdAenam, fdVpsta, fdPstat, fdMtart, fdMbrsh, fdMatkl, fdBismt, fdMeins, fdBstme, fdGroes, fdWrkst, fdBrgew, fdNtgew, fdGewei, fdVolum, fdVolen, fdBehvo, fdRaube, fdLaeng, fdBreit, fdHoehe, fdMeabm, fdMandt);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.946+08:00", comments="Source Table: wdi_matnr_mara")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.946+08:00", comments="Source Table: wdi_matnr_mara")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.946+08:00", comments="Source Table: wdi_matnr_mara")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<WdiMatnrMara> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.946+08:00", comments="Source Table: wdi_matnr_mara")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<WdiMatnrMara> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.946+08:00", comments="Source Table: wdi_matnr_mara")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("WdiMatnrMaraResult")
    Optional<WdiMatnrMara> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.946+08:00", comments="Source Table: wdi_matnr_mara")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="WdiMatnrMaraResult", value = {
        @Result(column="fd_id", property="fdId", jdbcType=JdbcType.NVARCHAR, id=true),
        @Result(column="fd_matnr", property="fdMatnr", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_ersda", property="fdErsda", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_ernam", property="fdErnam", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_laeda", property="fdLaeda", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_aenam", property="fdAenam", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_vpsta", property="fdVpsta", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_pstat", property="fdPstat", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_mtart", property="fdMtart", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_mbrsh", property="fdMbrsh", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_matkl", property="fdMatkl", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_bismt", property="fdBismt", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_meins", property="fdMeins", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_bstme", property="fdBstme", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_groes", property="fdGroes", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_wrkst", property="fdWrkst", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_brgew", property="fdBrgew", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_ntgew", property="fdNtgew", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_gewei", property="fdGewei", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_volum", property="fdVolum", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_volen", property="fdVolen", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_behvo", property="fdBehvo", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_raube", property="fdRaube", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_laeng", property="fdLaeng", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_breit", property="fdBreit", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_hoehe", property="fdHoehe", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_meabm", property="fdMeabm", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_mandt", property="fdMandt", jdbcType=JdbcType.NVARCHAR)
    })
    List<WdiMatnrMara> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.947+08:00", comments="Source Table: wdi_matnr_mara")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.947+08:00", comments="Source Table: wdi_matnr_mara")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, wdiMatnrMara, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.947+08:00", comments="Source Table: wdi_matnr_mara")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, wdiMatnrMara, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.947+08:00", comments="Source Table: wdi_matnr_mara")
    default int deleteByPrimaryKey(String fdId_) {
        return delete(c -> 
            c.where(fdId, isEqualTo(fdId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.947+08:00", comments="Source Table: wdi_matnr_mara")
    default int insert(WdiMatnrMara record) {
        return MyBatis3Utils.insert(this::insert, record, wdiMatnrMara, c ->
            c.map(fdId).toProperty("fdId")
            .map(fdMatnr).toProperty("fdMatnr")
            .map(fdErsda).toProperty("fdErsda")
            .map(fdErnam).toProperty("fdErnam")
            .map(fdLaeda).toProperty("fdLaeda")
            .map(fdAenam).toProperty("fdAenam")
            .map(fdVpsta).toProperty("fdVpsta")
            .map(fdPstat).toProperty("fdPstat")
            .map(fdMtart).toProperty("fdMtart")
            .map(fdMbrsh).toProperty("fdMbrsh")
            .map(fdMatkl).toProperty("fdMatkl")
            .map(fdBismt).toProperty("fdBismt")
            .map(fdMeins).toProperty("fdMeins")
            .map(fdBstme).toProperty("fdBstme")
            .map(fdGroes).toProperty("fdGroes")
            .map(fdWrkst).toProperty("fdWrkst")
            .map(fdBrgew).toProperty("fdBrgew")
            .map(fdNtgew).toProperty("fdNtgew")
            .map(fdGewei).toProperty("fdGewei")
            .map(fdVolum).toProperty("fdVolum")
            .map(fdVolen).toProperty("fdVolen")
            .map(fdBehvo).toProperty("fdBehvo")
            .map(fdRaube).toProperty("fdRaube")
            .map(fdLaeng).toProperty("fdLaeng")
            .map(fdBreit).toProperty("fdBreit")
            .map(fdHoehe).toProperty("fdHoehe")
            .map(fdMeabm).toProperty("fdMeabm")
            .map(fdMandt).toProperty("fdMandt")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.947+08:00", comments="Source Table: wdi_matnr_mara")
    default int insertMultiple(Collection<WdiMatnrMara> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, wdiMatnrMara, c ->
            c.map(fdId).toProperty("fdId")
            .map(fdMatnr).toProperty("fdMatnr")
            .map(fdErsda).toProperty("fdErsda")
            .map(fdErnam).toProperty("fdErnam")
            .map(fdLaeda).toProperty("fdLaeda")
            .map(fdAenam).toProperty("fdAenam")
            .map(fdVpsta).toProperty("fdVpsta")
            .map(fdPstat).toProperty("fdPstat")
            .map(fdMtart).toProperty("fdMtart")
            .map(fdMbrsh).toProperty("fdMbrsh")
            .map(fdMatkl).toProperty("fdMatkl")
            .map(fdBismt).toProperty("fdBismt")
            .map(fdMeins).toProperty("fdMeins")
            .map(fdBstme).toProperty("fdBstme")
            .map(fdGroes).toProperty("fdGroes")
            .map(fdWrkst).toProperty("fdWrkst")
            .map(fdBrgew).toProperty("fdBrgew")
            .map(fdNtgew).toProperty("fdNtgew")
            .map(fdGewei).toProperty("fdGewei")
            .map(fdVolum).toProperty("fdVolum")
            .map(fdVolen).toProperty("fdVolen")
            .map(fdBehvo).toProperty("fdBehvo")
            .map(fdRaube).toProperty("fdRaube")
            .map(fdLaeng).toProperty("fdLaeng")
            .map(fdBreit).toProperty("fdBreit")
            .map(fdHoehe).toProperty("fdHoehe")
            .map(fdMeabm).toProperty("fdMeabm")
            .map(fdMandt).toProperty("fdMandt")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.947+08:00", comments="Source Table: wdi_matnr_mara")
    default int insertSelective(WdiMatnrMara record) {
        return MyBatis3Utils.insert(this::insert, record, wdiMatnrMara, c ->
            c.map(fdId).toPropertyWhenPresent("fdId", record::getFdId)
            .map(fdMatnr).toPropertyWhenPresent("fdMatnr", record::getFdMatnr)
            .map(fdErsda).toPropertyWhenPresent("fdErsda", record::getFdErsda)
            .map(fdErnam).toPropertyWhenPresent("fdErnam", record::getFdErnam)
            .map(fdLaeda).toPropertyWhenPresent("fdLaeda", record::getFdLaeda)
            .map(fdAenam).toPropertyWhenPresent("fdAenam", record::getFdAenam)
            .map(fdVpsta).toPropertyWhenPresent("fdVpsta", record::getFdVpsta)
            .map(fdPstat).toPropertyWhenPresent("fdPstat", record::getFdPstat)
            .map(fdMtart).toPropertyWhenPresent("fdMtart", record::getFdMtart)
            .map(fdMbrsh).toPropertyWhenPresent("fdMbrsh", record::getFdMbrsh)
            .map(fdMatkl).toPropertyWhenPresent("fdMatkl", record::getFdMatkl)
            .map(fdBismt).toPropertyWhenPresent("fdBismt", record::getFdBismt)
            .map(fdMeins).toPropertyWhenPresent("fdMeins", record::getFdMeins)
            .map(fdBstme).toPropertyWhenPresent("fdBstme", record::getFdBstme)
            .map(fdGroes).toPropertyWhenPresent("fdGroes", record::getFdGroes)
            .map(fdWrkst).toPropertyWhenPresent("fdWrkst", record::getFdWrkst)
            .map(fdBrgew).toPropertyWhenPresent("fdBrgew", record::getFdBrgew)
            .map(fdNtgew).toPropertyWhenPresent("fdNtgew", record::getFdNtgew)
            .map(fdGewei).toPropertyWhenPresent("fdGewei", record::getFdGewei)
            .map(fdVolum).toPropertyWhenPresent("fdVolum", record::getFdVolum)
            .map(fdVolen).toPropertyWhenPresent("fdVolen", record::getFdVolen)
            .map(fdBehvo).toPropertyWhenPresent("fdBehvo", record::getFdBehvo)
            .map(fdRaube).toPropertyWhenPresent("fdRaube", record::getFdRaube)
            .map(fdLaeng).toPropertyWhenPresent("fdLaeng", record::getFdLaeng)
            .map(fdBreit).toPropertyWhenPresent("fdBreit", record::getFdBreit)
            .map(fdHoehe).toPropertyWhenPresent("fdHoehe", record::getFdHoehe)
            .map(fdMeabm).toPropertyWhenPresent("fdMeabm", record::getFdMeabm)
            .map(fdMandt).toPropertyWhenPresent("fdMandt", record::getFdMandt)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.947+08:00", comments="Source Table: wdi_matnr_mara")
    default Optional<WdiMatnrMara> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, wdiMatnrMara, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.947+08:00", comments="Source Table: wdi_matnr_mara")
    default List<WdiMatnrMara> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, wdiMatnrMara, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.947+08:00", comments="Source Table: wdi_matnr_mara")
    default List<WdiMatnrMara> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, wdiMatnrMara, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.947+08:00", comments="Source Table: wdi_matnr_mara")
    default Optional<WdiMatnrMara> selectByPrimaryKey(String fdId_) {
        return selectOne(c ->
            c.where(fdId, isEqualTo(fdId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.947+08:00", comments="Source Table: wdi_matnr_mara")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, wdiMatnrMara, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.947+08:00", comments="Source Table: wdi_matnr_mara")
    static UpdateDSL<UpdateModel> updateAllColumns(WdiMatnrMara record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(fdId).equalTo(record::getFdId)
                .set(fdMatnr).equalTo(record::getFdMatnr)
                .set(fdErsda).equalTo(record::getFdErsda)
                .set(fdErnam).equalTo(record::getFdErnam)
                .set(fdLaeda).equalTo(record::getFdLaeda)
                .set(fdAenam).equalTo(record::getFdAenam)
                .set(fdVpsta).equalTo(record::getFdVpsta)
                .set(fdPstat).equalTo(record::getFdPstat)
                .set(fdMtart).equalTo(record::getFdMtart)
                .set(fdMbrsh).equalTo(record::getFdMbrsh)
                .set(fdMatkl).equalTo(record::getFdMatkl)
                .set(fdBismt).equalTo(record::getFdBismt)
                .set(fdMeins).equalTo(record::getFdMeins)
                .set(fdBstme).equalTo(record::getFdBstme)
                .set(fdGroes).equalTo(record::getFdGroes)
                .set(fdWrkst).equalTo(record::getFdWrkst)
                .set(fdBrgew).equalTo(record::getFdBrgew)
                .set(fdNtgew).equalTo(record::getFdNtgew)
                .set(fdGewei).equalTo(record::getFdGewei)
                .set(fdVolum).equalTo(record::getFdVolum)
                .set(fdVolen).equalTo(record::getFdVolen)
                .set(fdBehvo).equalTo(record::getFdBehvo)
                .set(fdRaube).equalTo(record::getFdRaube)
                .set(fdLaeng).equalTo(record::getFdLaeng)
                .set(fdBreit).equalTo(record::getFdBreit)
                .set(fdHoehe).equalTo(record::getFdHoehe)
                .set(fdMeabm).equalTo(record::getFdMeabm)
                .set(fdMandt).equalTo(record::getFdMandt);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.947+08:00", comments="Source Table: wdi_matnr_mara")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(WdiMatnrMara record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(fdId).equalToWhenPresent(record::getFdId)
                .set(fdMatnr).equalToWhenPresent(record::getFdMatnr)
                .set(fdErsda).equalToWhenPresent(record::getFdErsda)
                .set(fdErnam).equalToWhenPresent(record::getFdErnam)
                .set(fdLaeda).equalToWhenPresent(record::getFdLaeda)
                .set(fdAenam).equalToWhenPresent(record::getFdAenam)
                .set(fdVpsta).equalToWhenPresent(record::getFdVpsta)
                .set(fdPstat).equalToWhenPresent(record::getFdPstat)
                .set(fdMtart).equalToWhenPresent(record::getFdMtart)
                .set(fdMbrsh).equalToWhenPresent(record::getFdMbrsh)
                .set(fdMatkl).equalToWhenPresent(record::getFdMatkl)
                .set(fdBismt).equalToWhenPresent(record::getFdBismt)
                .set(fdMeins).equalToWhenPresent(record::getFdMeins)
                .set(fdBstme).equalToWhenPresent(record::getFdBstme)
                .set(fdGroes).equalToWhenPresent(record::getFdGroes)
                .set(fdWrkst).equalToWhenPresent(record::getFdWrkst)
                .set(fdBrgew).equalToWhenPresent(record::getFdBrgew)
                .set(fdNtgew).equalToWhenPresent(record::getFdNtgew)
                .set(fdGewei).equalToWhenPresent(record::getFdGewei)
                .set(fdVolum).equalToWhenPresent(record::getFdVolum)
                .set(fdVolen).equalToWhenPresent(record::getFdVolen)
                .set(fdBehvo).equalToWhenPresent(record::getFdBehvo)
                .set(fdRaube).equalToWhenPresent(record::getFdRaube)
                .set(fdLaeng).equalToWhenPresent(record::getFdLaeng)
                .set(fdBreit).equalToWhenPresent(record::getFdBreit)
                .set(fdHoehe).equalToWhenPresent(record::getFdHoehe)
                .set(fdMeabm).equalToWhenPresent(record::getFdMeabm)
                .set(fdMandt).equalToWhenPresent(record::getFdMandt);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.947+08:00", comments="Source Table: wdi_matnr_mara")
    default int updateByPrimaryKey(WdiMatnrMara record) {
        return update(c ->
            c.set(fdMatnr).equalTo(record::getFdMatnr)
            .set(fdErsda).equalTo(record::getFdErsda)
            .set(fdErnam).equalTo(record::getFdErnam)
            .set(fdLaeda).equalTo(record::getFdLaeda)
            .set(fdAenam).equalTo(record::getFdAenam)
            .set(fdVpsta).equalTo(record::getFdVpsta)
            .set(fdPstat).equalTo(record::getFdPstat)
            .set(fdMtart).equalTo(record::getFdMtart)
            .set(fdMbrsh).equalTo(record::getFdMbrsh)
            .set(fdMatkl).equalTo(record::getFdMatkl)
            .set(fdBismt).equalTo(record::getFdBismt)
            .set(fdMeins).equalTo(record::getFdMeins)
            .set(fdBstme).equalTo(record::getFdBstme)
            .set(fdGroes).equalTo(record::getFdGroes)
            .set(fdWrkst).equalTo(record::getFdWrkst)
            .set(fdBrgew).equalTo(record::getFdBrgew)
            .set(fdNtgew).equalTo(record::getFdNtgew)
            .set(fdGewei).equalTo(record::getFdGewei)
            .set(fdVolum).equalTo(record::getFdVolum)
            .set(fdVolen).equalTo(record::getFdVolen)
            .set(fdBehvo).equalTo(record::getFdBehvo)
            .set(fdRaube).equalTo(record::getFdRaube)
            .set(fdLaeng).equalTo(record::getFdLaeng)
            .set(fdBreit).equalTo(record::getFdBreit)
            .set(fdHoehe).equalTo(record::getFdHoehe)
            .set(fdMeabm).equalTo(record::getFdMeabm)
            .set(fdMandt).equalTo(record::getFdMandt)
            .where(fdId, isEqualTo(record::getFdId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.948+08:00", comments="Source Table: wdi_matnr_mara")
    default int updateByPrimaryKeySelective(WdiMatnrMara record) {
        return update(c ->
            c.set(fdMatnr).equalToWhenPresent(record::getFdMatnr)
            .set(fdErsda).equalToWhenPresent(record::getFdErsda)
            .set(fdErnam).equalToWhenPresent(record::getFdErnam)
            .set(fdLaeda).equalToWhenPresent(record::getFdLaeda)
            .set(fdAenam).equalToWhenPresent(record::getFdAenam)
            .set(fdVpsta).equalToWhenPresent(record::getFdVpsta)
            .set(fdPstat).equalToWhenPresent(record::getFdPstat)
            .set(fdMtart).equalToWhenPresent(record::getFdMtart)
            .set(fdMbrsh).equalToWhenPresent(record::getFdMbrsh)
            .set(fdMatkl).equalToWhenPresent(record::getFdMatkl)
            .set(fdBismt).equalToWhenPresent(record::getFdBismt)
            .set(fdMeins).equalToWhenPresent(record::getFdMeins)
            .set(fdBstme).equalToWhenPresent(record::getFdBstme)
            .set(fdGroes).equalToWhenPresent(record::getFdGroes)
            .set(fdWrkst).equalToWhenPresent(record::getFdWrkst)
            .set(fdBrgew).equalToWhenPresent(record::getFdBrgew)
            .set(fdNtgew).equalToWhenPresent(record::getFdNtgew)
            .set(fdGewei).equalToWhenPresent(record::getFdGewei)
            .set(fdVolum).equalToWhenPresent(record::getFdVolum)
            .set(fdVolen).equalToWhenPresent(record::getFdVolen)
            .set(fdBehvo).equalToWhenPresent(record::getFdBehvo)
            .set(fdRaube).equalToWhenPresent(record::getFdRaube)
            .set(fdLaeng).equalToWhenPresent(record::getFdLaeng)
            .set(fdBreit).equalToWhenPresent(record::getFdBreit)
            .set(fdHoehe).equalToWhenPresent(record::getFdHoehe)
            .set(fdMeabm).equalToWhenPresent(record::getFdMeabm)
            .set(fdMandt).equalToWhenPresent(record::getFdMandt)
            .where(fdId, isEqualTo(record::getFdId))
        );
    }
}