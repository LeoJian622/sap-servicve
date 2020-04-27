package cn.com.wdi.scm.mapper.ekp;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class WdiPoPakeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.936+08:00", comments="Source Table: wdi_po_pake")
    public static final WdiPoPake wdiPoPake = new WdiPoPake();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.936+08:00", comments="Source field: wdi_po_pake.fd_id")
    public static final SqlColumn<String> fdId = wdiPoPake.fdId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.936+08:00", comments="Source field: wdi_po_pake.fd_supplier")
    public static final SqlColumn<String> fdSupplier = wdiPoPake.fdSupplier;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.936+08:00", comments="Source field: wdi_po_pake.fd_material")
    public static final SqlColumn<String> fdMaterial = wdiPoPake.fdMaterial;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.936+08:00", comments="Source field: wdi_po_pake.fd_qty")
    public static final SqlColumn<Integer> fdQty = wdiPoPake.fdQty;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.936+08:00", comments="Source field: wdi_po_pake.fd_pack_type")
    public static final SqlColumn<String> fdPackType = wdiPoPake.fdPackType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.936+08:00", comments="Source field: wdi_po_pake.doc_create_time")
    public static final SqlColumn<Date> docCreateTime = wdiPoPake.docCreateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.936+08:00", comments="Source field: wdi_po_pake.doc_creator_id")
    public static final SqlColumn<String> docCreatorId = wdiPoPake.docCreatorId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.936+08:00", comments="Source field: wdi_po_pake.doc_alter_time")
    public static final SqlColumn<Date> docAlterTime = wdiPoPake.docAlterTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.936+08:00", comments="Source field: wdi_po_pake.doc_alteror_id")
    public static final SqlColumn<String> docAlterorId = wdiPoPake.docAlterorId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.936+08:00", comments="Source field: wdi_po_pake.fd_packing_description")
    public static final SqlColumn<String> fdPackingDescription = wdiPoPake.fdPackingDescription;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.936+08:00", comments="Source Table: wdi_po_pake")
    public static final class WdiPoPake extends SqlTable {
        public final SqlColumn<String> fdId = column("fd_id", JDBCType.NVARCHAR);

        public final SqlColumn<String> fdSupplier = column("fd_supplier", JDBCType.NVARCHAR);

        public final SqlColumn<String> fdMaterial = column("fd_material", JDBCType.NVARCHAR);

        public final SqlColumn<Integer> fdQty = column("fd_qty", JDBCType.INTEGER);

        public final SqlColumn<String> fdPackType = column("fd_pack_type", JDBCType.NVARCHAR);

        public final SqlColumn<Date> docCreateTime = column("doc_create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> docCreatorId = column("doc_creator_id", JDBCType.NVARCHAR);

        public final SqlColumn<Date> docAlterTime = column("doc_alter_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> docAlterorId = column("doc_alteror_id", JDBCType.NVARCHAR);

        public final SqlColumn<String> fdPackingDescription = column("fd_packing_description", JDBCType.NVARCHAR);

        public WdiPoPake() {
            super("wdi_po_pake");
        }
    }
}