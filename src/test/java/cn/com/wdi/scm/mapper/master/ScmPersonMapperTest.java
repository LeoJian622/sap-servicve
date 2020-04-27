package cn.com.wdi.scm.mapper.master;

import cn.com.wdi.scm.model.master.ScmPerson;
import cn.com.wdi.scm.model.master.ScmRole;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static cn.com.wdi.scm.mapper.master.ScmPersonDynamicSqlSupport.scmPerson;
import static cn.com.wdi.scm.mapper.master.ScmPersonRoleDynamicSqlSupport.personId;
import static cn.com.wdi.scm.mapper.master.ScmPersonRoleDynamicSqlSupport.scmPersonRole;
import static cn.com.wdi.scm.mapper.master.ScmRoleDynamicSqlSupport.scmRole;
import static org.mybatis.dynamic.sql.SqlBuilder.*;


@ExtendWith({SpringExtension.class})
@SpringBootTest
@DisplayName("ScmPersonMapper test")
class ScmPersonMapperTest {

    @Autowired
    ScmPersonMapper scmPersonMapper;
    @Autowired
    ScmRoleMapper scmRoleMapper;
    @Autowired
    ScmPersonRoleMapper scmPersonRoleMapper;

    @BeforeAll
    static void init() {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String ps = passwordEncoder.encode("123456");
        System.out.println("密码长度：" + ps.length());
        System.out.println("密码：" + ps);
        ps = passwordEncoder.encode("123456545645646");
        System.out.println("密码长度：" + ps.length());
    }

    @Test
    void selectOneJoin() {
        SelectStatementProvider selectStatementProvider = select(ScmPersonMapper.selectJoinRoleList)
                .from(scmPerson)
                .leftJoin(scmPersonRole)
                .on(ScmPersonDynamicSqlSupport.id, equalTo(ScmPersonRoleDynamicSqlSupport.personId))
                .leftJoin(scmRole)
                .on(ScmPersonRoleDynamicSqlSupport.id, equalTo(ScmRoleDynamicSqlSupport.id)).where(ScmPersonDynamicSqlSupport.id, isEqualTo("1"))
                .build()
                .render(RenderingStrategies.MYBATIS3);
        List<ScmPerson> re = scmPersonMapper.selectManyJoin(selectStatementProvider);
        System.out.println(re);
    }

    @Test
    void selectManyJoin() {
    }
}
