package cn.com.wdi.scm.model.master;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.List;

@ToString
@EqualsAndHashCode
public class ScmMenu {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.368+08:00", comments="Source field: scm_menu.id")
    private String id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.368+08:00", comments="Source field: scm_menu.url")
    private String url;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.368+08:00", comments="Source field: scm_menu.path")
    private String path;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.368+08:00", comments="Source field: scm_menu.component")
    private String component;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.368+08:00", comments="Source field: scm_menu.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.368+08:00", comments="Source field: scm_menu.icon_cls")
    private String iconCls;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.368+08:00", comments="Source field: scm_menu.keep_alive")
    private Byte keepAlive;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.368+08:00", comments="Source field: scm_menu.require_auth")
    private Byte requireAuth;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.369+08:00", comments="Source field: scm_menu.parent_id")
    private Integer parentId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.369+08:00", comments="Source field: scm_menu.enabled")
    private Byte enabled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.368+08:00", comments="Source field: scm_menu.id")
    public String getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.368+08:00", comments="Source field: scm_menu.id")
    public void setId(String id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.368+08:00", comments="Source field: scm_menu.url")
    public String getUrl() {
        return url;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.368+08:00", comments="Source field: scm_menu.url")
    public void setUrl(String url) {
        this.url = url;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.368+08:00", comments="Source field: scm_menu.path")
    public String getPath() {
        return path;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.368+08:00", comments="Source field: scm_menu.path")
    public void setPath(String path) {
        this.path = path;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.368+08:00", comments="Source field: scm_menu.component")
    public String getComponent() {
        return component;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.368+08:00", comments="Source field: scm_menu.component")
    public void setComponent(String component) {
        this.component = component;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.368+08:00", comments="Source field: scm_menu.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.368+08:00", comments="Source field: scm_menu.name")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.368+08:00", comments="Source field: scm_menu.icon_cls")
    public String getIconCls() {
        return iconCls;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.368+08:00", comments="Source field: scm_menu.icon_cls")
    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.368+08:00", comments="Source field: scm_menu.keep_alive")
    public Byte getKeepAlive() {
        return keepAlive;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.368+08:00", comments="Source field: scm_menu.keep_alive")
    public void setKeepAlive(Byte keepAlive) {
        this.keepAlive = keepAlive;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.368+08:00", comments="Source field: scm_menu.require_auth")
    public Byte getRequireAuth() {
        return requireAuth;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.368+08:00", comments="Source field: scm_menu.require_auth")
    public void setRequireAuth(Byte requireAuth) {
        this.requireAuth = requireAuth;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.369+08:00", comments="Source field: scm_menu.parent_id")
    public Integer getParentId() {
        return parentId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.369+08:00", comments="Source field: scm_menu.parent_id")
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.369+08:00", comments="Source field: scm_menu.enabled")
    public Byte getEnabled() {
        return enabled;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.369+08:00", comments="Source field: scm_menu.enabled")
    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
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
}