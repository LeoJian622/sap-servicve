package cn.com.wdi.scm.config.security;

import cn.com.wdi.scm.mapper.master.ScmPersonDynamicSqlSupport;

import static cn.com.wdi.scm.mapper.master.ScmPersonDynamicSqlSupport.*;

import cn.com.wdi.scm.mapper.master.ScmPersonMapper;
import cn.com.wdi.scm.mapper.master.ScmPersonRoleDynamicSqlSupport;
import cn.com.wdi.scm.mapper.master.ScmRoleDynamicSqlSupport;
import cn.com.wdi.scm.model.master.ScmPerson;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static cn.com.wdi.scm.mapper.master.ScmPersonRoleDynamicSqlSupport.scmPersonRole;
import static cn.com.wdi.scm.mapper.master.ScmRoleDynamicSqlSupport.scmRole;
import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static org.mybatis.dynamic.sql.SqlBuilder.equalTo;

/**
 * 用户账户登录权限加载服务
 *
 * @author liyongjian
 * @create 2020-03-25 15:15
 */

public class PersonUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private ScmPersonMapper personMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        SelectStatementProvider selectStatementProvider = select(ScmPersonMapper.selectJoinRoleList)
                .from(scmPerson)
                .leftJoin(scmPersonRole)
                .on(ScmPersonDynamicSqlSupport.id, equalTo(ScmPersonRoleDynamicSqlSupport.personId))
                .leftJoin(scmRole)
                .on(ScmPersonRoleDynamicSqlSupport.id, equalTo(ScmRoleDynamicSqlSupport.id))
                .where(scmPerson.username, isEqualTo(s))
                .build()
                .render(RenderingStrategies.MYBATIS3);
        Optional<ScmPerson> optional = personMapper.selectOneJoin(selectStatementProvider);
        if (!optional.isPresent()) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        return optional.get();
    }
}
