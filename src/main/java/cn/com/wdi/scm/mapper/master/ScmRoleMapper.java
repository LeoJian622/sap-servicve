package cn.com.wdi.scm.mapper.master;

import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.com.wdi.scm.model.master.ScmRole;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

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

@Mapper
public interface ScmRoleMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.034+08:00", comments="Source Table: scm_role")
    BasicColumn[] selectList = BasicColumn.columnList(ScmRoleDynamicSqlSupport.id, ScmRoleDynamicSqlSupport.name, ScmRoleDynamicSqlSupport.nameZh);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.033+08:00", comments="Source Table: scm_role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.033+08:00", comments="Source Table: scm_role")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.034+08:00", comments="Source Table: scm_role")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="select replace(newid(),'-','') ", keyProperty="record.id", before=true, resultType=String.class)
    int insert(InsertStatementProvider<ScmRole> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.034+08:00", comments="Source Table: scm_role")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<ScmRole> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.034+08:00", comments="Source Table: scm_role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ScmRoleResult")
    Optional<ScmRole> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.034+08:00", comments="Source Table: scm_role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ScmRoleResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="name_zh", property="nameZh", jdbcType=JdbcType.VARCHAR)
    })
    List<ScmRole> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.034+08:00", comments="Source Table: scm_role")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.034+08:00", comments="Source Table: scm_role")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, ScmRoleDynamicSqlSupport.scmRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.034+08:00", comments="Source Table: scm_role")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, ScmRoleDynamicSqlSupport.scmRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.034+08:00", comments="Source Table: scm_role")
    default int deleteByPrimaryKey(String id_) {
        return delete(c -> 
            c.where(ScmRoleDynamicSqlSupport.id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.034+08:00", comments="Source Table: scm_role")
    default int insert(ScmRole record) {
        return MyBatis3Utils.insert(this::insert, record, ScmRoleDynamicSqlSupport.scmRole, c ->
            c.map(ScmRoleDynamicSqlSupport.id).toProperty("id")
            .map(ScmRoleDynamicSqlSupport.name).toProperty("name")
            .map(ScmRoleDynamicSqlSupport.nameZh).toProperty("nameZh")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.034+08:00", comments="Source Table: scm_role")
    default int insertMultiple(Collection<ScmRole> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, ScmRoleDynamicSqlSupport.scmRole, c ->
            c.map(ScmRoleDynamicSqlSupport.id).toProperty("id")
            .map(ScmRoleDynamicSqlSupport.name).toProperty("name")
            .map(ScmRoleDynamicSqlSupport.nameZh).toProperty("nameZh")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.034+08:00", comments="Source Table: scm_role")
    default int insertSelective(ScmRole record) {
        return MyBatis3Utils.insert(this::insert, record, ScmRoleDynamicSqlSupport.scmRole, c ->
            c.map(ScmRoleDynamicSqlSupport.id).toPropertyWhenPresent("id", record::getId)
            .map(ScmRoleDynamicSqlSupport.name).toPropertyWhenPresent("name", record::getName)
            .map(ScmRoleDynamicSqlSupport.nameZh).toPropertyWhenPresent("nameZh", record::getNameZh)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.034+08:00", comments="Source Table: scm_role")
    default Optional<ScmRole> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, ScmRoleDynamicSqlSupport.scmRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.034+08:00", comments="Source Table: scm_role")
    default List<ScmRole> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, ScmRoleDynamicSqlSupport.scmRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.034+08:00", comments="Source Table: scm_role")
    default List<ScmRole> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, ScmRoleDynamicSqlSupport.scmRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.034+08:00", comments="Source Table: scm_role")
    default Optional<ScmRole> selectByPrimaryKey(String id_) {
        return selectOne(c ->
            c.where(ScmRoleDynamicSqlSupport.id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.034+08:00", comments="Source Table: scm_role")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, ScmRoleDynamicSqlSupport.scmRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.034+08:00", comments="Source Table: scm_role")
    static UpdateDSL<UpdateModel> updateAllColumns(ScmRole record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(ScmRoleDynamicSqlSupport.id).equalTo(record::getId)
                .set(ScmRoleDynamicSqlSupport.name).equalTo(record::getName)
                .set(ScmRoleDynamicSqlSupport.nameZh).equalTo(record::getNameZh);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.035+08:00", comments="Source Table: scm_role")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ScmRole record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(ScmRoleDynamicSqlSupport.id).equalToWhenPresent(record::getId)
                .set(ScmRoleDynamicSqlSupport.name).equalToWhenPresent(record::getName)
                .set(ScmRoleDynamicSqlSupport.nameZh).equalToWhenPresent(record::getNameZh);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.035+08:00", comments="Source Table: scm_role")
    default int updateByPrimaryKey(ScmRole record) {
        return update(c ->
            c.set(ScmRoleDynamicSqlSupport.name).equalTo(record::getName)
            .set(ScmRoleDynamicSqlSupport.nameZh).equalTo(record::getNameZh)
            .where(ScmRoleDynamicSqlSupport.id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.035+08:00", comments="Source Table: scm_role")
    default int updateByPrimaryKeySelective(ScmRole record) {
        return update(c ->
            c.set(ScmRoleDynamicSqlSupport.name).equalToWhenPresent(record::getName)
            .set(ScmRoleDynamicSqlSupport.nameZh).equalToWhenPresent(record::getNameZh)
            .where(ScmRoleDynamicSqlSupport.id, isEqualTo(record::getId))
        );
    }
}