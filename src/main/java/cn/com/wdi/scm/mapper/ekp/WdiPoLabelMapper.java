package cn.com.wdi.scm.mapper.ekp;

import static cn.com.wdi.scm.mapper.ekp.WdiPoLabelDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.com.wdi.scm.model.ekp.WdiPoLabel;
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
public interface WdiPoLabelMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.933+08:00", comments="Source Table: wdi_po_label")
    BasicColumn[] selectList = BasicColumn.columnList(fdId, fdComId, fdSaleOrder, fdMaterial, fdName, fdQuantity, fdStock, fdProduceClass, fdUserId, docCreateTime, fdStockId, docCreateName, fdPackType, fdProductTime, fdMark, fdFlag, fdInspectionStatus, fdLabelStatus, fdTotalQuantity);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.932+08:00", comments="Source Table: wdi_po_label")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.932+08:00", comments="Source Table: wdi_po_label")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.932+08:00", comments="Source Table: wdi_po_label")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<WdiPoLabel> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.932+08:00", comments="Source Table: wdi_po_label")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<WdiPoLabel> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.932+08:00", comments="Source Table: wdi_po_label")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("WdiPoLabelResult")
    Optional<WdiPoLabel> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.932+08:00", comments="Source Table: wdi_po_label")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="WdiPoLabelResult", value = {
        @Result(column="fd_id", property="fdId", jdbcType=JdbcType.NVARCHAR, id=true),
        @Result(column="fd_com_id", property="fdComId", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_sale_order", property="fdSaleOrder", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_material", property="fdMaterial", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_name", property="fdName", jdbcType=JdbcType.VARCHAR),
        @Result(column="fd_quantity", property="fdQuantity", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_stock", property="fdStock", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_produce_class", property="fdProduceClass", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_user_id", property="fdUserId", jdbcType=JdbcType.NVARCHAR),
        @Result(column="doc_create_time", property="docCreateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="fd_stock_id", property="fdStockId", jdbcType=JdbcType.NVARCHAR),
        @Result(column="doc_create_name", property="docCreateName", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_pack_type", property="fdPackType", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_product_time", property="fdProductTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="fd_mark", property="fdMark", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_flag", property="fdFlag", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_inspection_status", property="fdInspectionStatus", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_label_status", property="fdLabelStatus", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_total_quantity", property="fdTotalQuantity", jdbcType=JdbcType.NVARCHAR)
    })
    List<WdiPoLabel> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.933+08:00", comments="Source Table: wdi_po_label")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.933+08:00", comments="Source Table: wdi_po_label")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, wdiPoLabel, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.933+08:00", comments="Source Table: wdi_po_label")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, wdiPoLabel, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.933+08:00", comments="Source Table: wdi_po_label")
    default int deleteByPrimaryKey(String fdId_) {
        return delete(c -> 
            c.where(fdId, isEqualTo(fdId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.933+08:00", comments="Source Table: wdi_po_label")
    default int insert(WdiPoLabel record) {
        return MyBatis3Utils.insert(this::insert, record, wdiPoLabel, c ->
            c.map(fdId).toProperty("fdId")
            .map(fdComId).toProperty("fdComId")
            .map(fdSaleOrder).toProperty("fdSaleOrder")
            .map(fdMaterial).toProperty("fdMaterial")
            .map(fdName).toProperty("fdName")
            .map(fdQuantity).toProperty("fdQuantity")
            .map(fdStock).toProperty("fdStock")
            .map(fdProduceClass).toProperty("fdProduceClass")
            .map(fdUserId).toProperty("fdUserId")
            .map(docCreateTime).toProperty("docCreateTime")
            .map(fdStockId).toProperty("fdStockId")
            .map(docCreateName).toProperty("docCreateName")
            .map(fdPackType).toProperty("fdPackType")
            .map(fdProductTime).toProperty("fdProductTime")
            .map(fdMark).toProperty("fdMark")
            .map(fdFlag).toProperty("fdFlag")
            .map(fdInspectionStatus).toProperty("fdInspectionStatus")
            .map(fdLabelStatus).toProperty("fdLabelStatus")
            .map(fdTotalQuantity).toProperty("fdTotalQuantity")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.933+08:00", comments="Source Table: wdi_po_label")
    default int insertMultiple(Collection<WdiPoLabel> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, wdiPoLabel, c ->
            c.map(fdId).toProperty("fdId")
            .map(fdComId).toProperty("fdComId")
            .map(fdSaleOrder).toProperty("fdSaleOrder")
            .map(fdMaterial).toProperty("fdMaterial")
            .map(fdName).toProperty("fdName")
            .map(fdQuantity).toProperty("fdQuantity")
            .map(fdStock).toProperty("fdStock")
            .map(fdProduceClass).toProperty("fdProduceClass")
            .map(fdUserId).toProperty("fdUserId")
            .map(docCreateTime).toProperty("docCreateTime")
            .map(fdStockId).toProperty("fdStockId")
            .map(docCreateName).toProperty("docCreateName")
            .map(fdPackType).toProperty("fdPackType")
            .map(fdProductTime).toProperty("fdProductTime")
            .map(fdMark).toProperty("fdMark")
            .map(fdFlag).toProperty("fdFlag")
            .map(fdInspectionStatus).toProperty("fdInspectionStatus")
            .map(fdLabelStatus).toProperty("fdLabelStatus")
            .map(fdTotalQuantity).toProperty("fdTotalQuantity")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.933+08:00", comments="Source Table: wdi_po_label")
    default int insertSelective(WdiPoLabel record) {
        return MyBatis3Utils.insert(this::insert, record, wdiPoLabel, c ->
            c.map(fdId).toPropertyWhenPresent("fdId", record::getFdId)
            .map(fdComId).toPropertyWhenPresent("fdComId", record::getFdComId)
            .map(fdSaleOrder).toPropertyWhenPresent("fdSaleOrder", record::getFdSaleOrder)
            .map(fdMaterial).toPropertyWhenPresent("fdMaterial", record::getFdMaterial)
            .map(fdName).toPropertyWhenPresent("fdName", record::getFdName)
            .map(fdQuantity).toPropertyWhenPresent("fdQuantity", record::getFdQuantity)
            .map(fdStock).toPropertyWhenPresent("fdStock", record::getFdStock)
            .map(fdProduceClass).toPropertyWhenPresent("fdProduceClass", record::getFdProduceClass)
            .map(fdUserId).toPropertyWhenPresent("fdUserId", record::getFdUserId)
            .map(docCreateTime).toPropertyWhenPresent("docCreateTime", record::getDocCreateTime)
            .map(fdStockId).toPropertyWhenPresent("fdStockId", record::getFdStockId)
            .map(docCreateName).toPropertyWhenPresent("docCreateName", record::getDocCreateName)
            .map(fdPackType).toPropertyWhenPresent("fdPackType", record::getFdPackType)
            .map(fdProductTime).toPropertyWhenPresent("fdProductTime", record::getFdProductTime)
            .map(fdMark).toPropertyWhenPresent("fdMark", record::getFdMark)
            .map(fdFlag).toPropertyWhenPresent("fdFlag", record::getFdFlag)
            .map(fdInspectionStatus).toPropertyWhenPresent("fdInspectionStatus", record::getFdInspectionStatus)
            .map(fdLabelStatus).toPropertyWhenPresent("fdLabelStatus", record::getFdLabelStatus)
            .map(fdTotalQuantity).toPropertyWhenPresent("fdTotalQuantity", record::getFdTotalQuantity)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.933+08:00", comments="Source Table: wdi_po_label")
    default Optional<WdiPoLabel> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, wdiPoLabel, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.933+08:00", comments="Source Table: wdi_po_label")
    default List<WdiPoLabel> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, wdiPoLabel, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.933+08:00", comments="Source Table: wdi_po_label")
    default List<WdiPoLabel> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, wdiPoLabel, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.933+08:00", comments="Source Table: wdi_po_label")
    default Optional<WdiPoLabel> selectByPrimaryKey(String fdId_) {
        return selectOne(c ->
            c.where(fdId, isEqualTo(fdId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.933+08:00", comments="Source Table: wdi_po_label")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, wdiPoLabel, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.934+08:00", comments="Source Table: wdi_po_label")
    static UpdateDSL<UpdateModel> updateAllColumns(WdiPoLabel record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(fdId).equalTo(record::getFdId)
                .set(fdComId).equalTo(record::getFdComId)
                .set(fdSaleOrder).equalTo(record::getFdSaleOrder)
                .set(fdMaterial).equalTo(record::getFdMaterial)
                .set(fdName).equalTo(record::getFdName)
                .set(fdQuantity).equalTo(record::getFdQuantity)
                .set(fdStock).equalTo(record::getFdStock)
                .set(fdProduceClass).equalTo(record::getFdProduceClass)
                .set(fdUserId).equalTo(record::getFdUserId)
                .set(docCreateTime).equalTo(record::getDocCreateTime)
                .set(fdStockId).equalTo(record::getFdStockId)
                .set(docCreateName).equalTo(record::getDocCreateName)
                .set(fdPackType).equalTo(record::getFdPackType)
                .set(fdProductTime).equalTo(record::getFdProductTime)
                .set(fdMark).equalTo(record::getFdMark)
                .set(fdFlag).equalTo(record::getFdFlag)
                .set(fdInspectionStatus).equalTo(record::getFdInspectionStatus)
                .set(fdLabelStatus).equalTo(record::getFdLabelStatus)
                .set(fdTotalQuantity).equalTo(record::getFdTotalQuantity);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.934+08:00", comments="Source Table: wdi_po_label")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(WdiPoLabel record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(fdId).equalToWhenPresent(record::getFdId)
                .set(fdComId).equalToWhenPresent(record::getFdComId)
                .set(fdSaleOrder).equalToWhenPresent(record::getFdSaleOrder)
                .set(fdMaterial).equalToWhenPresent(record::getFdMaterial)
                .set(fdName).equalToWhenPresent(record::getFdName)
                .set(fdQuantity).equalToWhenPresent(record::getFdQuantity)
                .set(fdStock).equalToWhenPresent(record::getFdStock)
                .set(fdProduceClass).equalToWhenPresent(record::getFdProduceClass)
                .set(fdUserId).equalToWhenPresent(record::getFdUserId)
                .set(docCreateTime).equalToWhenPresent(record::getDocCreateTime)
                .set(fdStockId).equalToWhenPresent(record::getFdStockId)
                .set(docCreateName).equalToWhenPresent(record::getDocCreateName)
                .set(fdPackType).equalToWhenPresent(record::getFdPackType)
                .set(fdProductTime).equalToWhenPresent(record::getFdProductTime)
                .set(fdMark).equalToWhenPresent(record::getFdMark)
                .set(fdFlag).equalToWhenPresent(record::getFdFlag)
                .set(fdInspectionStatus).equalToWhenPresent(record::getFdInspectionStatus)
                .set(fdLabelStatus).equalToWhenPresent(record::getFdLabelStatus)
                .set(fdTotalQuantity).equalToWhenPresent(record::getFdTotalQuantity);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.934+08:00", comments="Source Table: wdi_po_label")
    default int updateByPrimaryKey(WdiPoLabel record) {
        return update(c ->
            c.set(fdComId).equalTo(record::getFdComId)
            .set(fdSaleOrder).equalTo(record::getFdSaleOrder)
            .set(fdMaterial).equalTo(record::getFdMaterial)
            .set(fdName).equalTo(record::getFdName)
            .set(fdQuantity).equalTo(record::getFdQuantity)
            .set(fdStock).equalTo(record::getFdStock)
            .set(fdProduceClass).equalTo(record::getFdProduceClass)
            .set(fdUserId).equalTo(record::getFdUserId)
            .set(docCreateTime).equalTo(record::getDocCreateTime)
            .set(fdStockId).equalTo(record::getFdStockId)
            .set(docCreateName).equalTo(record::getDocCreateName)
            .set(fdPackType).equalTo(record::getFdPackType)
            .set(fdProductTime).equalTo(record::getFdProductTime)
            .set(fdMark).equalTo(record::getFdMark)
            .set(fdFlag).equalTo(record::getFdFlag)
            .set(fdInspectionStatus).equalTo(record::getFdInspectionStatus)
            .set(fdLabelStatus).equalTo(record::getFdLabelStatus)
            .set(fdTotalQuantity).equalTo(record::getFdTotalQuantity)
            .where(fdId, isEqualTo(record::getFdId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.934+08:00", comments="Source Table: wdi_po_label")
    default int updateByPrimaryKeySelective(WdiPoLabel record) {
        return update(c ->
            c.set(fdComId).equalToWhenPresent(record::getFdComId)
            .set(fdSaleOrder).equalToWhenPresent(record::getFdSaleOrder)
            .set(fdMaterial).equalToWhenPresent(record::getFdMaterial)
            .set(fdName).equalToWhenPresent(record::getFdName)
            .set(fdQuantity).equalToWhenPresent(record::getFdQuantity)
            .set(fdStock).equalToWhenPresent(record::getFdStock)
            .set(fdProduceClass).equalToWhenPresent(record::getFdProduceClass)
            .set(fdUserId).equalToWhenPresent(record::getFdUserId)
            .set(docCreateTime).equalToWhenPresent(record::getDocCreateTime)
            .set(fdStockId).equalToWhenPresent(record::getFdStockId)
            .set(docCreateName).equalToWhenPresent(record::getDocCreateName)
            .set(fdPackType).equalToWhenPresent(record::getFdPackType)
            .set(fdProductTime).equalToWhenPresent(record::getFdProductTime)
            .set(fdMark).equalToWhenPresent(record::getFdMark)
            .set(fdFlag).equalToWhenPresent(record::getFdFlag)
            .set(fdInspectionStatus).equalToWhenPresent(record::getFdInspectionStatus)
            .set(fdLabelStatus).equalToWhenPresent(record::getFdLabelStatus)
            .set(fdTotalQuantity).equalToWhenPresent(record::getFdTotalQuantity)
            .where(fdId, isEqualTo(record::getFdId))
        );
    }
}