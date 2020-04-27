package cn.com.wdi.scm.mapper.ekp;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class WdiMatnrMaktDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.939+08:00", comments="Source Table: wdi_matnr_makt")
    public static final WdiMatnrMakt wdiMatnrMakt = new WdiMatnrMakt();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.939+08:00", comments="Source field: wdi_matnr_makt.fd_id")
    public static final SqlColumn<String> fdId = wdiMatnrMakt.fdId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.939+08:00", comments="Source field: wdi_matnr_makt.fd_matnr")
    public static final SqlColumn<String> fdMatnr = wdiMatnrMakt.fdMatnr;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.939+08:00", comments="Source field: wdi_matnr_makt.fd_spras")
    public static final SqlColumn<String> fdSpras = wdiMatnrMakt.fdSpras;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.939+08:00", comments="Source field: wdi_matnr_makt.fd_maktx")
    public static final SqlColumn<String> fdMaktx = wdiMatnrMakt.fdMaktx;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.939+08:00", comments="Source field: wdi_matnr_makt.fd_maktg")
    public static final SqlColumn<String> fdMaktg = wdiMatnrMakt.fdMaktg;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.939+08:00", comments="Source field: wdi_matnr_makt.fd_mandt")
    public static final SqlColumn<String> fdMandt = wdiMatnrMakt.fdMandt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.939+08:00", comments="Source Table: wdi_matnr_makt")
    public static final class WdiMatnrMakt extends SqlTable {
        public final SqlColumn<String> fdId = column("fd_id", JDBCType.NVARCHAR);

        public final SqlColumn<String> fdMatnr = column("fd_matnr", JDBCType.NVARCHAR);

        public final SqlColumn<String> fdSpras = column("fd_spras", JDBCType.NVARCHAR);

        public final SqlColumn<String> fdMaktx = column("fd_maktx", JDBCType.NVARCHAR);

        public final SqlColumn<String> fdMaktg = column("fd_maktg", JDBCType.NVARCHAR);

        public final SqlColumn<String> fdMandt = column("fd_mandt", JDBCType.NVARCHAR);

        public WdiMatnrMakt() {
            super("wdi_matnr_makt");
        }
    }
}