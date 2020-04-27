package cn.com.wdi.scm.model.ekp;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.annotation.Generated;

@ToString
@EqualsAndHashCode
public class WdiPoIdjl {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.903+08:00", comments="Source field: wdi_po_idjl.fd_id")
    private String fdId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.906+08:00", comments="Source field: wdi_po_idjl.fd_prefix")
    private String fdPrefix;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.906+08:00", comments="Source field: wdi_po_idjl.fd_value")
    private Integer fdValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.906+08:00", comments="Source field: wdi_po_idjl.fd_id")
    public String getFdId() {
        return fdId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.906+08:00", comments="Source field: wdi_po_idjl.fd_id")
    public void setFdId(String fdId) {
        this.fdId = fdId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.906+08:00", comments="Source field: wdi_po_idjl.fd_prefix")
    public String getFdPrefix() {
        return fdPrefix;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.906+08:00", comments="Source field: wdi_po_idjl.fd_prefix")
    public void setFdPrefix(String fdPrefix) {
        this.fdPrefix = fdPrefix;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.906+08:00", comments="Source field: wdi_po_idjl.fd_value")
    public Integer getFdValue() {
        return fdValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-26T14:28:30.906+08:00", comments="Source field: wdi_po_idjl.fd_value")
    public void setFdValue(Integer fdValue) {
        this.fdValue = fdValue;
    }
}