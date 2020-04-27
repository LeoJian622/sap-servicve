package cn.com.wdi.scm.model.master;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.annotation.Generated;

@ToString
@EqualsAndHashCode
public class ScmMenuRole {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.371+08:00", comments="Source field: scm_menu_role.id")
    private String id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.371+08:00", comments="Source field: scm_menu_role.mid")
    private String mid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.371+08:00", comments="Source field: scm_menu_role.rid")
    private String rid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.371+08:00", comments="Source field: scm_menu_role.id")
    public String getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.371+08:00", comments="Source field: scm_menu_role.id")
    public void setId(String id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.371+08:00", comments="Source field: scm_menu_role.mid")
    public String getMid() {
        return mid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.371+08:00", comments="Source field: scm_menu_role.mid")
    public void setMid(String mid) {
        this.mid = mid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.371+08:00", comments="Source field: scm_menu_role.rid")
    public String getRid() {
        return rid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.371+08:00", comments="Source field: scm_menu_role.rid")
    public void setRid(String rid) {
        this.rid = rid;
    }
}