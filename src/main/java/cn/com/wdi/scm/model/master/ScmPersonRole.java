package cn.com.wdi.scm.model.master;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.annotation.Generated;

@ToString
@EqualsAndHashCode
public class ScmPersonRole {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.035+08:00", comments="Source field: scm_person_role.id")
    private String id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.036+08:00", comments="Source field: scm_person_role.person_id")
    private String personId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.036+08:00", comments="Source field: scm_person_role.role_id")
    private String roleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.035+08:00", comments="Source field: scm_person_role.id")
    public String getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.035+08:00", comments="Source field: scm_person_role.id")
    public void setId(String id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.036+08:00", comments="Source field: scm_person_role.person_id")
    public String getPersonId() {
        return personId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.036+08:00", comments="Source field: scm_person_role.person_id")
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.036+08:00", comments="Source field: scm_person_role.role_id")
    public String getRoleId() {
        return roleId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.036+08:00", comments="Source field: scm_person_role.role_id")
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
}