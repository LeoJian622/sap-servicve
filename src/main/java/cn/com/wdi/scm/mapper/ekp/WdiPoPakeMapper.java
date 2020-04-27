package cn.com.wdi.scm.mapper.ekp;

import static cn.com.wdi.scm.mapper.ekp.WdiPoPakeDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.com.wdi.scm.model.ekp.WdiPoPake;
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
public interface WdiPoPakeMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.937+08:00", comments="Source Table: wdi_po_pake")
    BasicColumn[] selectList = BasicColumn.columnList(fdId, fdSupplier, fdMaterial, fdQty, fdPackType, docCreateTime, docCreatorId, docAlterTime, docAlterorId, fdPackingDescription);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.936+08:00", comments="Source Table: wdi_po_pake")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.936+08:00", comments="Source Table: wdi_po_pake")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.936+08:00", comments="Source Table: wdi_po_pake")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<WdiPoPake> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.937+08:00", comments="Source Table: wdi_po_pake")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<WdiPoPake> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.937+08:00", comments="Source Table: wdi_po_pake")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("WdiPoPakeResult")
    Optional<WdiPoPake> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.937+08:00", comments="Source Table: wdi_po_pake")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="WdiPoPakeResult", value = {
        @Result(column="fd_id", property="fdId", jdbcType=JdbcType.NVARCHAR, id=true),
        @Result(column="fd_supplier", property="fdSupplier", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_material", property="fdMaterial", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_qty", property="fdQty", jdbcType=JdbcType.INTEGER),
        @Result(column="fd_pack_type", property="fdPackType", jdbcType=JdbcType.NVARCHAR),
        @Result(column="doc_create_time", property="docCreateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="doc_creator_id", property="docCreatorId", jdbcType=JdbcType.NVARCHAR),
        @Result(column="doc_alter_time", property="docAlterTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="doc_alteror_id", property="docAlterorId", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_packing_description", property="fdPackingDescription", jdbcType=JdbcType.NVARCHAR)
    })
    List<WdiPoPake> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.937+08:00", comments="Source Table: wdi_po_pake")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.937+08:00", comments="Source Table: wdi_po_pake")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, wdiPoPake, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.937+08:00", comments="Source Table: wdi_po_pake")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, wdiPoPake, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.937+08:00", comments="Source Table: wdi_po_pake")
    default int deleteByPrimaryKey(String fdId_) {
        return delete(c -> 
            c.where(fdId, isEqualTo(fdId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.937+08:00", comments="Source Table: wdi_po_pake")
    default int insert(WdiPoPake record) {
        return MyBatis3Utils.insert(this::insert, record, wdiPoPake, c ->
            c.map(fdId).toProperty("fdId")
            .map(fdSupplier).toProperty("fdSupplier")
            .map(fdMaterial).toProperty("fdMaterial")
            .map(fdQty).toProperty("fdQty")
            .map(fdPackType).toProperty("fdPackType")
            .map(docCreateTime).toProperty("docCreateTime")
            .map(docCreatorId).toProperty("docCreatorId")
            .map(docAlterTime).toProperty("docAlterTime")
            .map(docAlterorId).toProperty("docAlterorId")
            .map(fdPackingDescription).toProperty("fdPackingDescription")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.937+08:00", comments="Source Table: wdi_po_pake")
    default int insertMultiple(Collection<WdiPoPake> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, wdiPoPake, c ->
            c.map(fdId).toProperty("fdId")
            .map(fdSupplier).toProperty("fdSupplier")
            .map(fdMaterial).toProperty("fdMaterial")
            .map(fdQty).toProperty("fdQty")
            .map(fdPackType).toProperty("fdPackType")
            .map(docCreateTime).toProperty("docCreateTime")
            .map(docCreatorId).toProperty("docCreatorId")
            .map(docAlterTime).toProperty("docAlterTime")
            .map(docAlterorId).toProperty("docAlterorId")
            .map(fdPackingDescription).toProperty("fdPackingDescription")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.937+08:00", comments="Source Table: wdi_po_pake")
    default int insertSelective(WdiPoPake record) {
        return MyBatis3Utils.insert(this::insert, record, wdiPoPake, c ->
            c.map(fdId).toPropertyWhenPresent("fdId", record::getFdId)
            .map(fdSupplier).toPropertyWhenPresent("fdSupplier", record::getFdSupplier)
            .map(fdMaterial).toPropertyWhenPresent("fdMaterial", record::getFdMaterial)
            .map(fdQty).toPropertyWhenPresent("fdQty", record::getFdQty)
            .map(fdPackType).toPropertyWhenPresent("fdPackType", record::getFdPackType)
            .map(docCreateTime).toPropertyWhenPresent("docCreateTime", record::getDocCreateTime)
            .map(docCreatorId).toPropertyWhenPresent("docCreatorId", record::getDocCreatorId)
            .map(docAlterTime).toPropertyWhenPresent("docAlterTime", record::getDocAlterTime)
            .map(docAlterorId).toPropertyWhenPresent("docAlterorId", record::getDocAlterorId)
            .map(fdPackingDescription).toPropertyWhenPresent("fdPackingDescription", record::getFdPackingDescription)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.937+08:00", comments="Source Table: wdi_po_pake")
    default Optional<WdiPoPake> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, wdiPoPake, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.937+08:00", comments="Source Table: wdi_po_pake")
    default List<WdiPoPake> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, wdiPoPake, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.937+08:00", comments="Source Table: wdi_po_pake")
    default List<WdiPoPake> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, wdiPoPake, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.937+08:00", comments="Source Table: wdi_po_pake")
    default Optional<WdiPoPake> selectByPrimaryKey(String fdId_) {
        return selectOne(c ->
            c.where(fdId, isEqualTo(fdId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.937+08:00", comments="Source Table: wdi_po_pake")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, wdiPoPake, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.937+08:00", comments="Source Table: wdi_po_pake")
    static UpdateDSL<UpdateModel> updateAllColumns(WdiPoPake record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(fdId).equalTo(record::getFdId)
                .set(fdSupplier).equalTo(record::getFdSupplier)
                .set(fdMaterial).equalTo(record::getFdMaterial)
                .set(fdQty).equalTo(record::getFdQty)
                .set(fdPackType).equalTo(record::getFdPackType)
                .set(docCreateTime).equalTo(record::getDocCreateTime)
                .set(docCreatorId).equalTo(record::getDocCreatorId)
                .set(docAlterTime).equalTo(record::getDocAlterTime)
                .set(docAlterorId).equalTo(record::getDocAlterorId)
                .set(fdPackingDescription).equalTo(record::getFdPackingDescription);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.937+08:00", comments="Source Table: wdi_po_pake")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(WdiPoPake record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(fdId).equalToWhenPresent(record::getFdId)
                .set(fdSupplier).equalToWhenPresent(record::getFdSupplier)
                .set(fdMaterial).equalToWhenPresent(record::getFdMaterial)
                .set(fdQty).equalToWhenPresent(record::getFdQty)
                .set(fdPackType).equalToWhenPresent(record::getFdPackType)
                .set(docCreateTime).equalToWhenPresent(record::getDocCreateTime)
                .set(docCreatorId).equalToWhenPresent(record::getDocCreatorId)
                .set(docAlterTime).equalToWhenPresent(record::getDocAlterTime)
                .set(docAlterorId).equalToWhenPresent(record::getDocAlterorId)
                .set(fdPackingDescription).equalToWhenPresent(record::getFdPackingDescription);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.938+08:00", comments="Source Table: wdi_po_pake")
    default int updateByPrimaryKey(WdiPoPake record) {
        return update(c ->
            c.set(fdSupplier).equalTo(record::getFdSupplier)
            .set(fdMaterial).equalTo(record::getFdMaterial)
            .set(fdQty).equalTo(record::getFdQty)
            .set(fdPackType).equalTo(record::getFdPackType)
            .set(docCreateTime).equalTo(record::getDocCreateTime)
            .set(docCreatorId).equalTo(record::getDocCreatorId)
            .set(docAlterTime).equalTo(record::getDocAlterTime)
            .set(docAlterorId).equalTo(record::getDocAlterorId)
            .set(fdPackingDescription).equalTo(record::getFdPackingDescription)
            .where(fdId, isEqualTo(record::getFdId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.938+08:00", comments="Source Table: wdi_po_pake")
    default int updateByPrimaryKeySelective(WdiPoPake record) {
        return update(c ->
            c.set(fdSupplier).equalToWhenPresent(record::getFdSupplier)
            .set(fdMaterial).equalToWhenPresent(record::getFdMaterial)
            .set(fdQty).equalToWhenPresent(record::getFdQty)
            .set(fdPackType).equalToWhenPresent(record::getFdPackType)
            .set(docCreateTime).equalToWhenPresent(record::getDocCreateTime)
            .set(docCreatorId).equalToWhenPresent(record::getDocCreatorId)
            .set(docAlterTime).equalToWhenPresent(record::getDocAlterTime)
            .set(docAlterorId).equalToWhenPresent(record::getDocAlterorId)
            .set(fdPackingDescription).equalToWhenPresent(record::getFdPackingDescription)
            .where(fdId, isEqualTo(record::getFdId))
        );
    }
}