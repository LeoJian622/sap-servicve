package cn.com.wdi.scm.mapper.master;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ScmMenuRoleDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.371+08:00", comments="Source Table: scm_menu_role")
    public static final ScmMenuRole scmMenuRole = new ScmMenuRole();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.371+08:00", comments="Source field: scm_menu_role.id")
    public static final SqlColumn<String> id = scmMenuRole.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.371+08:00", comments="Source field: scm_menu_role.mid")
    public static final SqlColumn<String> mid = scmMenuRole.mid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.372+08:00", comments="Source field: scm_menu_role.rid")
    public static final SqlColumn<String> rid = scmMenuRole.rid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-27T16:13:29.371+08:00", comments="Source Table: scm_menu_role")
    public static final class ScmMenuRole extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> mid = column("mid", JDBCType.INTEGER);

        public final SqlColumn<String> rid = column("rid", JDBCType.INTEGER);

        public ScmMenuRole() {
            super("scm_menu_role");
        }
    }
}