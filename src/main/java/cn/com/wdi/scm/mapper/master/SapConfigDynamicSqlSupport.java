package cn.com.wdi.scm.mapper.master;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SapConfigDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-23T16:00:22.623+08:00", comments="Source Table: sap_config")
    public static final SapConfig sapConfig = new SapConfig();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-23T16:00:22.623+08:00", comments="Source field: sap_config.id")
    public static final SqlColumn<String> id = sapConfig.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-23T16:00:22.623+08:00", comments="Source field: sap_config.dest_name")
    public static final SqlColumn<String> destName = sapConfig.destName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-23T16:00:22.623+08:00", comments="Source field: sap_config.ashost")
    public static final SqlColumn<String> ashost = sapConfig.ashost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-23T16:00:22.623+08:00", comments="Source field: sap_config.sysnr")
    public static final SqlColumn<String> sysnr = sapConfig.sysnr;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-23T16:00:22.623+08:00", comments="Source field: sap_config.client")
    public static final SqlColumn<String> client = sapConfig.client;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-23T16:00:22.623+08:00", comments="Source field: sap_config.username")
    public static final SqlColumn<String> username = sapConfig.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-23T16:00:22.623+08:00", comments="Source field: sap_config.paswword")
    public static final SqlColumn<String> paswword = sapConfig.paswword;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-23T16:00:22.623+08:00", comments="Source field: sap_config.pool_capacity")
    public static final SqlColumn<String> poolCapacity = sapConfig.poolCapacity;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-23T16:00:22.623+08:00", comments="Source field: sap_config.peak_limit")
    public static final SqlColumn<String> peakLimit = sapConfig.peakLimit;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-23T16:00:22.623+08:00", comments="Source field: sap_config.sap_router")
    public static final SqlColumn<String> sapRouter = sapConfig.sapRouter;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-23T16:00:22.623+08:00", comments="Source field: sap_config.lang")
    public static final SqlColumn<String> lang = sapConfig.lang;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-04-23T16:00:22.623+08:00", comments="Source Table: sap_config")
    public static final class SapConfig extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> destName = column("dest_name", JDBCType.VARCHAR);

        public final SqlColumn<String> ashost = column("ashost", JDBCType.VARCHAR);

        public final SqlColumn<String> sysnr = column("sysnr", JDBCType.VARCHAR);

        public final SqlColumn<String> client = column("client", JDBCType.VARCHAR);

        public final SqlColumn<String> username = column("username", JDBCType.VARCHAR);

        public final SqlColumn<String> paswword = column("paswword", JDBCType.VARCHAR);

        public final SqlColumn<String> poolCapacity = column("pool_capacity", JDBCType.VARCHAR);

        public final SqlColumn<String> peakLimit = column("peak_limit", JDBCType.VARCHAR);

        public final SqlColumn<String> sapRouter = column("sap_router", JDBCType.VARCHAR);

        public final SqlColumn<String> lang = column("lang", JDBCType.CHAR);

        public SapConfig() {
            super("sap_config");
        }
    }
}