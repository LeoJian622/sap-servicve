package cn.com.wdi.scm.mapper.ekp;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class WdiPoLabelDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.931+08:00", comments="Source Table: wdi_po_label")
    public static final WdiPoLabel wdiPoLabel = new WdiPoLabel();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.931+08:00", comments="Source field: wdi_po_label.fd_id")
    public static final SqlColumn<String> fdId = wdiPoLabel.fdId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.931+08:00", comments="Source field: wdi_po_label.fd_com_id")
    public static final SqlColumn<String> fdComId = wdiPoLabel.fdComId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.931+08:00", comments="Source field: wdi_po_label.fd_sale_order")
    public static final SqlColumn<String> fdSaleOrder = wdiPoLabel.fdSaleOrder;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.931+08:00", comments="Source field: wdi_po_label.fd_material")
    public static final SqlColumn<String> fdMaterial = wdiPoLabel.fdMaterial;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.931+08:00", comments="Source field: wdi_po_label.fd_name")
    public static final SqlColumn<String> fdName = wdiPoLabel.fdName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.931+08:00", comments="Source field: wdi_po_label.fd_quantity")
    public static final SqlColumn<String> fdQuantity = wdiPoLabel.fdQuantity;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.931+08:00", comments="Source field: wdi_po_label.fd_stock")
    public static final SqlColumn<String> fdStock = wdiPoLabel.fdStock;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.932+08:00", comments="Source field: wdi_po_label.fd_produce_class")
    public static final SqlColumn<String> fdProduceClass = wdiPoLabel.fdProduceClass;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.932+08:00", comments="Source field: wdi_po_label.fd_user_id")
    public static final SqlColumn<String> fdUserId = wdiPoLabel.fdUserId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.932+08:00", comments="Source field: wdi_po_label.doc_create_time")
    public static final SqlColumn<Date> docCreateTime = wdiPoLabel.docCreateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.932+08:00", comments="Source field: wdi_po_label.fd_stock_id")
    public static final SqlColumn<String> fdStockId = wdiPoLabel.fdStockId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.932+08:00", comments="Source field: wdi_po_label.doc_create_name")
    public static final SqlColumn<String> docCreateName = wdiPoLabel.docCreateName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.932+08:00", comments="Source field: wdi_po_label.fd_pack_type")
    public static final SqlColumn<String> fdPackType = wdiPoLabel.fdPackType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.932+08:00", comments="Source field: wdi_po_label.fd_product_time")
    public static final SqlColumn<Date> fdProductTime = wdiPoLabel.fdProductTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.932+08:00", comments="Source field: wdi_po_label.fd_mark")
    public static final SqlColumn<String> fdMark = wdiPoLabel.fdMark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.932+08:00", comments="Source field: wdi_po_label.fd_flag")
    public static final SqlColumn<String> fdFlag = wdiPoLabel.fdFlag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.932+08:00", comments="Source field: wdi_po_label.fd_inspection_status")
    public static final SqlColumn<String> fdInspectionStatus = wdiPoLabel.fdInspectionStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.932+08:00", comments="Source field: wdi_po_label.fd_label_status")
    public static final SqlColumn<String> fdLabelStatus = wdiPoLabel.fdLabelStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.932+08:00", comments="Source field: wdi_po_label.fd_total_quantity")
    public static final SqlColumn<String> fdTotalQuantity = wdiPoLabel.fdTotalQuantity;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.931+08:00", comments="Source Table: wdi_po_label")
    public static final class WdiPoLabel extends SqlTable {
        public final SqlColumn<String> fdId = column("fd_id", JDBCType.NVARCHAR);

        public final SqlColumn<String> fdComId = column("fd_com_id", JDBCType.NVARCHAR);

        public final SqlColumn<String> fdSaleOrder = column("fd_sale_order", JDBCType.NVARCHAR);

        public final SqlColumn<String> fdMaterial = column("fd_material", JDBCType.NVARCHAR);

        public final SqlColumn<String> fdName = column("fd_name", JDBCType.VARCHAR);

        public final SqlColumn<String> fdQuantity = column("fd_quantity", JDBCType.NVARCHAR);

        public final SqlColumn<String> fdStock = column("fd_stock", JDBCType.NVARCHAR);

        public final SqlColumn<String> fdProduceClass = column("fd_produce_class", JDBCType.NVARCHAR);

        public final SqlColumn<String> fdUserId = column("fd_user_id", JDBCType.NVARCHAR);

        public final SqlColumn<Date> docCreateTime = column("doc_create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> fdStockId = column("fd_stock_id", JDBCType.NVARCHAR);

        public final SqlColumn<String> docCreateName = column("doc_create_name", JDBCType.NVARCHAR);

        public final SqlColumn<String> fdPackType = column("fd_pack_type", JDBCType.NVARCHAR);

        public final SqlColumn<Date> fdProductTime = column("fd_product_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> fdMark = column("fd_mark", JDBCType.NVARCHAR);

        public final SqlColumn<String> fdFlag = column("fd_flag", JDBCType.NVARCHAR);

        public final SqlColumn<String> fdInspectionStatus = column("fd_inspection_status", JDBCType.NVARCHAR);

        public final SqlColumn<String> fdLabelStatus = column("fd_label_status", JDBCType.NVARCHAR);

        public final SqlColumn<String> fdTotalQuantity = column("fd_total_quantity", JDBCType.NVARCHAR);

        public WdiPoLabel() {
            super("wdi_po_label");
        }
    }
}