package cn.com.wdi.scm.mapper.master;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ScmRoleDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.033+08:00", comments="Source Table: scm_role")
    public static final ScmRole scmRole = new ScmRole();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.033+08:00", comments="Source field: scm_role.id")
    public static final SqlColumn<String> id = scmRole.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.033+08:00", comments="Source field: scm_role.name")
    public static final SqlColumn<String> name = scmRole.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.033+08:00", comments="Source field: scm_role.name_zh")
    public static final SqlColumn<String> nameZh = scmRole.nameZh;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.033+08:00", comments="Source Table: scm_role")
    public static final class ScmRole extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> nameZh = column("name_zh", JDBCType.VARCHAR);

        public ScmRole() {
            super("scm_role");
        }
    }
}