package cn.com.wdi.scm.mapper.master;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ScmPersonDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.011+08:00", comments="Source Table: scm_person")
    public static final ScmPerson scmPerson = new ScmPerson();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.011+08:00", comments="Source field: scm_person.id")
    public static final SqlColumn<String> id = scmPerson.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.012+08:00", comments="Source field: scm_person.name")
    public static final SqlColumn<String> name = scmPerson.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.012+08:00", comments="Source field: scm_person.phone")
    public static final SqlColumn<String> phone = scmPerson.phone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.012+08:00", comments="Source field: scm_person.telephone")
    public static final SqlColumn<String> telephone = scmPerson.telephone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.012+08:00", comments="Source field: scm_person.address")
    public static final SqlColumn<String> address = scmPerson.address;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.012+08:00", comments="Source field: scm_person.enabled")
    public static final SqlColumn<Byte> enabled = scmPerson.enabled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.012+08:00", comments="Source field: scm_person.locked")
    public static final SqlColumn<Byte> locked = scmPerson.locked;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.012+08:00", comments="Source field: scm_person.username")
    public static final SqlColumn<String> username = scmPerson.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.012+08:00", comments="Source field: scm_person.password")
    public static final SqlColumn<String> password = scmPerson.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.012+08:00", comments="Source field: scm_person.userface")
    public static final SqlColumn<String> userface = scmPerson.userface;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.012+08:00", comments="Source field: scm_person.remark")
    public static final SqlColumn<String> remark = scmPerson.remark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-03-19T14:44:43.011+08:00", comments="Source Table: scm_person")
    public static final class ScmPerson extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> phone = column("phone", JDBCType.CHAR);

        public final SqlColumn<String> telephone = column("telephone", JDBCType.VARCHAR);

        public final SqlColumn<String> address = column("address", JDBCType.VARCHAR);

        public final SqlColumn<Byte> enabled = column("enabled", JDBCType.TINYINT);

        public final SqlColumn<Byte> locked = column("locked", JDBCType.TINYINT);

        public final SqlColumn<String> username = column("username", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<String> userface = column("userface", JDBCType.VARCHAR);

        public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);

        public ScmPerson() {
            super("scm_person");
        }
    }
}