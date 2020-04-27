package cn.com.wdi.scm.mapper.master;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ScmMenuDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.369+08:00", comments="Source Table: scm_menu")
    public static final ScmMenu scmMenu = new ScmMenu();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.369+08:00", comments="Source field: scm_menu.id")
    public static final SqlColumn<String> id = scmMenu.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.369+08:00", comments="Source field: scm_menu.url")
    public static final SqlColumn<String> url = scmMenu.url;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.369+08:00", comments="Source field: scm_menu.path")
    public static final SqlColumn<String> path = scmMenu.path;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.369+08:00", comments="Source field: scm_menu.component")
    public static final SqlColumn<String> component = scmMenu.component;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.369+08:00", comments="Source field: scm_menu.name")
    public static final SqlColumn<String> name = scmMenu.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.369+08:00", comments="Source field: scm_menu.icon_cls")
    public static final SqlColumn<String> iconCls = scmMenu.iconCls;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.369+08:00", comments="Source field: scm_menu.keep_alive")
    public static final SqlColumn<Byte> keepAlive = scmMenu.keepAlive;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.369+08:00", comments="Source field: scm_menu.require_auth")
    public static final SqlColumn<Byte> requireAuth = scmMenu.requireAuth;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.369+08:00", comments="Source field: scm_menu.parent_id")
    public static final SqlColumn<Integer> parentId = scmMenu.parentId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.369+08:00", comments="Source field: scm_menu.enabled")
    public static final SqlColumn<Byte> enabled = scmMenu.enabled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.369+08:00", comments="Source Table: scm_menu")
    public static final class ScmMenu extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> url = column("url", JDBCType.VARCHAR);

        public final SqlColumn<String> path = column("path", JDBCType.VARCHAR);

        public final SqlColumn<String> component = column("component", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> iconCls = column("icon_cls", JDBCType.VARCHAR);

        public final SqlColumn<Byte> keepAlive = column("keep_alive", JDBCType.TINYINT);

        public final SqlColumn<Byte> requireAuth = column("require_auth", JDBCType.TINYINT);

        public final SqlColumn<Integer> parentId = column("parent_id", JDBCType.INTEGER);

        public final SqlColumn<Byte> enabled = column("enabled", JDBCType.TINYINT);

        public ScmMenu() {
            super("scm_menu");
        }
    }
}