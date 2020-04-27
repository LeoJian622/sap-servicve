package cn.com.wdi.scm.mapper.ekp;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class WdiPoIdjlDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.91+08:00", comments="Source Table: wdi_po_idjl")
    public static final WdiPoIdjl wdiPoIdjl = new WdiPoIdjl();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.91+08:00", comments="Source field: wdi_po_idjl.fd_id")
    public static final SqlColumn<String> fdId = wdiPoIdjl.fdId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.911+08:00", comments="Source field: wdi_po_idjl.fd_prefix")
    public static final SqlColumn<String> fdPrefix = wdiPoIdjl.fdPrefix;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.911+08:00", comments="Source field: wdi_po_idjl.fd_value")
    public static final SqlColumn<Integer> fdValue = wdiPoIdjl.fdValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.91+08:00", comments="Source Table: wdi_po_idjl")
    public static final class WdiPoIdjl extends SqlTable {
        public final SqlColumn<String> fdId = column("fd_id", JDBCType.NVARCHAR);

        public final SqlColumn<String> fdPrefix = column("fd_prefix", JDBCType.NVARCHAR);

        public final SqlColumn<Integer> fdValue = column("fd_value", JDBCType.INTEGER);

        public WdiPoIdjl() {
            super("wdi_po_idjl");
        }
    }
}