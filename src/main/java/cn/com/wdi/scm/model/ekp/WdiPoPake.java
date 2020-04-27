package cn.com.wdi.scm.model.ekp;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;
import javax.annotation.Generated;

@ToString
@EqualsAndHashCode
public class WdiPoPake {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.934+08:00", comments="Source field: wdi_po_pake.fd_id")
    private String fdId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.935+08:00", comments="Source field: wdi_po_pake.fd_supplier")
    private String fdSupplier;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.935+08:00", comments="Source field: wdi_po_pake.fd_material")
    private String fdMaterial;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.935+08:00", comments="Source field: wdi_po_pake.fd_qty")
    private Integer fdQty;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.935+08:00", comments="Source field: wdi_po_pake.fd_pack_type")
    private String fdPackType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.935+08:00", comments="Source field: wdi_po_pake.doc_create_time")
    private Date docCreateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.935+08:00", comments="Source field: wdi_po_pake.doc_creator_id")
    private String docCreatorId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.935+08:00", comments="Source field: wdi_po_pake.doc_alter_time")
    private Date docAlterTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.935+08:00", comments="Source field: wdi_po_pake.doc_alteror_id")
    private String docAlterorId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.935+08:00", comments="Source field: wdi_po_pake.fd_packing_description")
    private String fdPackingDescription;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.935+08:00", comments="Source field: wdi_po_pake.fd_id")
    public String getFdId() {
        return fdId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.935+08:00", comments="Source field: wdi_po_pake.fd_id")
    public void setFdId(String fdId) {
        this.fdId = fdId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.935+08:00", comments="Source field: wdi_po_pake.fd_supplier")
    public String getFdSupplier() {
        return fdSupplier;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.935+08:00", comments="Source field: wdi_po_pake.fd_supplier")
    public void setFdSupplier(String fdSupplier) {
        this.fdSupplier = fdSupplier;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.935+08:00", comments="Source field: wdi_po_pake.fd_material")
    public String getFdMaterial() {
        return fdMaterial;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.935+08:00", comments="Source field: wdi_po_pake.fd_material")
    public void setFdMaterial(String fdMaterial) {
        this.fdMaterial = fdMaterial;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.935+08:00", comments="Source field: wdi_po_pake.fd_qty")
    public Integer getFdQty() {
        return fdQty;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.935+08:00", comments="Source field: wdi_po_pake.fd_qty")
    public void setFdQty(Integer fdQty) {
        this.fdQty = fdQty;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.935+08:00", comments="Source field: wdi_po_pake.fd_pack_type")
    public String getFdPackType() {
        return fdPackType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.935+08:00", comments="Source field: wdi_po_pake.fd_pack_type")
    public void setFdPackType(String fdPackType) {
        this.fdPackType = fdPackType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.935+08:00", comments="Source field: wdi_po_pake.doc_create_time")
    public Date getDocCreateTime() {
        return docCreateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.935+08:00", comments="Source field: wdi_po_pake.doc_create_time")
    public void setDocCreateTime(Date docCreateTime) {
        this.docCreateTime = docCreateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.935+08:00", comments="Source field: wdi_po_pake.doc_creator_id")
    public String getDocCreatorId() {
        return docCreatorId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.935+08:00", comments="Source field: wdi_po_pake.doc_creator_id")
    public void setDocCreatorId(String docCreatorId) {
        this.docCreatorId = docCreatorId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.935+08:00", comments="Source field: wdi_po_pake.doc_alter_time")
    public Date getDocAlterTime() {
        return docAlterTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.935+08:00", comments="Source field: wdi_po_pake.doc_alter_time")
    public void setDocAlterTime(Date docAlterTime) {
        this.docAlterTime = docAlterTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.935+08:00", comments="Source field: wdi_po_pake.doc_alteror_id")
    public String getDocAlterorId() {
        return docAlterorId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.935+08:00", comments="Source field: wdi_po_pake.doc_alteror_id")
    public void setDocAlterorId(String docAlterorId) {
        this.docAlterorId = docAlterorId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.935+08:00", comments="Source field: wdi_po_pake.fd_packing_description")
    public String getFdPackingDescription() {
        return fdPackingDescription;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.935+08:00", comments="Source field: wdi_po_pake.fd_packing_description")
    public void setFdPackingDescription(String fdPackingDescription) {
        this.fdPackingDescription = fdPackingDescription;
    }
}