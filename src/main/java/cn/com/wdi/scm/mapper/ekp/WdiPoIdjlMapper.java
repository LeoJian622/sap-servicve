package cn.com.wdi.scm.mapper.ekp;

import static cn.com.wdi.scm.mapper.ekp.WdiPoIdjlDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.com.wdi.scm.config.dynamicdatasource.TargetDataSource;
import cn.com.wdi.scm.model.ekp.WdiPoIdjl;
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
public interface WdiPoIdjlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.921+08:00", comments="Source Table: wdi_po_idjl")
    BasicColumn[] selectList = BasicColumn.columnList(fdId, fdPrefix, fdValue);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.911+08:00", comments="Source Table: wdi_po_idjl")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.912+08:00", comments="Source Table: wdi_po_idjl")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.912+08:00", comments="Source Table: wdi_po_idjl")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<WdiPoIdjl> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.913+08:00", comments="Source Table: wdi_po_idjl")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<WdiPoIdjl> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.914+08:00", comments="Source Table: wdi_po_idjl")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("WdiPoIdjlResult")
    Optional<WdiPoIdjl> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.914+08:00", comments="Source Table: wdi_po_idjl")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="WdiPoIdjlResult", value = {
        @Result(column="fd_id", property="fdId", jdbcType=JdbcType.NVARCHAR, id=true),
        @Result(column="fd_prefix", property="fdPrefix", jdbcType=JdbcType.NVARCHAR),
        @Result(column="fd_value", property="fdValue", jdbcType=JdbcType.INTEGER)
    })
    List<WdiPoIdjl> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.915+08:00", comments="Source Table: wdi_po_idjl")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.916+08:00", comments="Source Table: wdi_po_idjl")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, wdiPoIdjl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.916+08:00", comments="Source Table: wdi_po_idjl")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, wdiPoIdjl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.916+08:00", comments="Source Table: wdi_po_idjl")
    default int deleteByPrimaryKey(String fdId_) {
        return delete(c -> 
            c.where(fdId, isEqualTo(fdId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.917+08:00", comments="Source Table: wdi_po_idjl")
    default int insert(WdiPoIdjl record) {
        return MyBatis3Utils.insert(this::insert, record, wdiPoIdjl, c ->
            c.map(fdId).toProperty("fdId")
            .map(fdPrefix).toProperty("fdPrefix")
            .map(fdValue).toProperty("fdValue")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.918+08:00", comments="Source Table: wdi_po_idjl")
    default int insertMultiple(Collection<WdiPoIdjl> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, wdiPoIdjl, c ->
            c.map(fdId).toProperty("fdId")
            .map(fdPrefix).toProperty("fdPrefix")
            .map(fdValue).toProperty("fdValue")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.919+08:00", comments="Source Table: wdi_po_idjl")
    default int insertSelective(WdiPoIdjl record) {
        return MyBatis3Utils.insert(this::insert, record, wdiPoIdjl, c ->
            c.map(fdId).toPropertyWhenPresent("fdId", record::getFdId)
            .map(fdPrefix).toPropertyWhenPresent("fdPrefix", record::getFdPrefix)
            .map(fdValue).toPropertyWhenPresent("fdValue", record::getFdValue)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.922+08:00", comments="Source Table: wdi_po_idjl")
    default Optional<WdiPoIdjl> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, wdiPoIdjl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.922+08:00", comments="Source Table: wdi_po_idjl")
    default List<WdiPoIdjl> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, wdiPoIdjl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.922+08:00", comments="Source Table: wdi_po_idjl")
    default List<WdiPoIdjl> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, wdiPoIdjl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.923+08:00", comments="Source Table: wdi_po_idjl")
    default Optional<WdiPoIdjl> selectByPrimaryKey(String fdId_) {
        return selectOne(c ->
            c.where(fdId, isEqualTo(fdId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.924+08:00", comments="Source Table: wdi_po_idjl")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, wdiPoIdjl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.924+08:00", comments="Source Table: wdi_po_idjl")
    static UpdateDSL<UpdateModel> updateAllColumns(WdiPoIdjl record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(fdId).equalTo(record::getFdId)
                .set(fdPrefix).equalTo(record::getFdPrefix)
                .set(fdValue).equalTo(record::getFdValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.925+08:00", comments="Source Table: wdi_po_idjl")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(WdiPoIdjl record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(fdId).equalToWhenPresent(record::getFdId)
                .set(fdPrefix).equalToWhenPresent(record::getFdPrefix)
                .set(fdValue).equalToWhenPresent(record::getFdValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.926+08:00", comments="Source Table: wdi_po_idjl")
    default int updateByPrimaryKey(WdiPoIdjl record) {
        return update(c ->
            c.set(fdPrefix).equalTo(record::getFdPrefix)
            .set(fdValue).equalTo(record::getFdValue)
            .where(fdId, isEqualTo(record::getFdId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.926+08:00", comments="Source Table: wdi_po_idjl")
    default int updateByPrimaryKeySelective(WdiPoIdjl record) {
        return update(c ->
            c.set(fdPrefix).equalToWhenPresent(record::getFdPrefix)
            .set(fdValue).equalToWhenPresent(record::getFdValue)
            .where(fdId, isEqualTo(record::getFdId))
        );
    }
}