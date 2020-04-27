package cn.com.wdi.scm.model.master;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.annotation.Generated;

@ToString
@EqualsAndHashCode
public class ScmRole {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.032+08:00", comments="Source field: scm_role.id")
    private String id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.032+08:00", comments="Source field: scm_role.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.032+08:00", comments="Source field: scm_role.name_zh")
    private String nameZh;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.032+08:00", comments="Source field: scm_role.id")
    public String getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.032+08:00", comments="Source field: scm_role.id")
    public void setId(String id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.032+08:00", comments="Source field: scm_role.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.032+08:00", comments="Source field: scm_role.name")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.032+08:00", comments="Source field: scm_role.name_zh")
    public String getNameZh() {
        return nameZh;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.032+08:00", comments="Source field: scm_role.name_zh")
    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }
}