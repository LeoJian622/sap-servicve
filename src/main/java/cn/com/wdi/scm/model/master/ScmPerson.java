package cn.com.wdi.scm.model.master;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.annotation.Generated;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@ToString
@EqualsAndHashCode
public class ScmPerson implements UserDetails, Serializable {

    private static final long serialVersionUID = 2975954393375298568L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.002+08:00", comments="Source field: scm_person.id")
    private String id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.006+08:00", comments="Source field: scm_person.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.006+08:00", comments="Source field: scm_person.phone")
    private String phone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.006+08:00", comments="Source field: scm_person.telephone")
    private String telephone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.007+08:00", comments="Source field: scm_person.address")
    private String address;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.007+08:00", comments="Source field: scm_person.enabled")
    private Byte enabled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.007+08:00", comments="Source field: scm_person.locked")
    private Byte locked;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.007+08:00", comments="Source field: scm_person.username")
    private String username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.007+08:00", comments="Source field: scm_person.password")
    private String password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.007+08:00", comments="Source field: scm_person.userface")
    private String userface;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.007+08:00", comments="Source field: scm_person.remark")
    private String remark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.006+08:00", comments="Source field: scm_person.id")
    public String getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.006+08:00", comments="Source field: scm_person.id")
    public void setId(String id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.006+08:00", comments="Source field: scm_person.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.006+08:00", comments="Source field: scm_person.name")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.006+08:00", comments="Source field: scm_person.phone")
    public String getPhone() {
        return phone;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.006+08:00", comments="Source field: scm_person.phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.006+08:00", comments="Source field: scm_person.telephone")
    public String getTelephone() {
        return telephone;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.007+08:00", comments="Source field: scm_person.telephone")
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.007+08:00", comments="Source field: scm_person.address")
    public String getAddress() {
        return address;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.007+08:00", comments="Source field: scm_person.address")
    public void setAddress(String address) {
        this.address = address;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.007+08:00", comments="Source field: scm_person.enabled")
    public Byte getEnabled() {
        return enabled;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.007+08:00", comments="Source field: scm_person.enabled")
    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.007+08:00", comments="Source field: scm_person.locked")
    public Byte getLocked() {
        return locked;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.007+08:00", comments="Source field: scm_person.locked")
    public void setLocked(Byte locked) {
        this.locked = locked;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.007+08:00", comments="Source field: scm_person.username")
    public String getUsername() {
        return username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.007+08:00", comments="Source field: scm_person.username")
    public void setUsername(String username) {
        this.username = username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.007+08:00", comments="Source field: scm_person.password")
    public String getPassword() {
        return password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.007+08:00", comments="Source field: scm_person.password")
    public void setPassword(String password) {
        this.password = password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.007+08:00", comments="Source field: scm_person.userface")
    public String getUserface() {
        return userface;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.007+08:00", comments="Source field: scm_person.userface")
    public void setUserface(String userface) {
        this.userface = userface;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.007+08:00", comments="Source field: scm_person.remark")
    public String getRemark() {
        return remark;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.008+08:00", comments="Source field: scm_person.remark")
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 角色权限列表
     */
    private List<ScmRole> roles;

    public List<ScmRole> getRoles() {
        return roles;
    }

    public void setRoles(List<ScmRole> roles) {
        this.roles = roles;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (ScmRole role:roles){
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        if (this.enabled == 0){
            return false;
        }else {
            return true;
        }
    }
}