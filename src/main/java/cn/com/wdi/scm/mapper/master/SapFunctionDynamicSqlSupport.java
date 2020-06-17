package cn.com.wdi.scm.mapper.master;

import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

import javax.annotation.Generated;
import java.sql.JDBCType;

public final class SapFunctionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.951+08:00", comments="Source Table: sap_function")
    public static final SapFunction sapFunction = new SapFunction();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.952+08:00", comments="Source field: sap_function.id")
    public static final SqlColumn<String> id = sapFunction.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.952+08:00", comments="Source field: sap_function.config_id")
    public static final SqlColumn<String> configId = sapFunction.configId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.952+08:00", comments="Source field: sap_function.call_name")
    public static final SqlColumn<String> callName = sapFunction.callName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.952+08:00", comments="Source field: sap_function.function_name")
    public static final SqlColumn<String> functionName = sapFunction.functionName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-11T16:47:31.951+08:00", comments="Source Table: sap_function")
    public static final class SapFunction extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> configId = column("config_id", JDBCType.VARCHAR);

        public final SqlColumn<String> callName = column("call_name", JDBCType.VARCHAR);

        public final SqlColumn<String> functionName = column("function_name", JDBCType.VARCHAR);

        public SapFunction() {
            super("sap_function");
        }
    }
}