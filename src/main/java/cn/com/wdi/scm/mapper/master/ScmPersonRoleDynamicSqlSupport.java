package cn.com.wdi.scm.mapper.master;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ScmPersonRoleDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.038+08:00", comments="Source Table: scm_person_role")
    public static final ScmPersonRole scmPersonRole = new ScmPersonRole();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.038+08:00", comments="Source field: scm_person_role.id")
    public static final SqlColumn<String> id = scmPersonRole.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.038+08:00", comments="Source field: scm_person_role.person_id")
    public static final SqlColumn<String> personId = scmPersonRole.personId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.038+08:00", comments="Source field: scm_person_role.role_id")
    public static final SqlColumn<String> roleId = scmPersonRole.roleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.038+08:00", comments="Source Table: scm_person_role")
    public static final class ScmPersonRole extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> personId = column("person_id", JDBCType.INTEGER);

        public final SqlColumn<String> roleId = column("role_id", JDBCType.INTEGER);

        public ScmPersonRole() {
            super("scm_person_role");
        }
    }
}