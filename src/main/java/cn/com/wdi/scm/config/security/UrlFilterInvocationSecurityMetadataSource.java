package cn.com.wdi.scm.config.security;

import cn.com.wdi.scm.mapper.master.ScmMenuDynamicSqlSupport;
import cn.com.wdi.scm.mapper.master.ScmMenuMapper;
import cn.com.wdi.scm.mapper.master.ScmMenuRoleDynamicSqlSupport;
import cn.com.wdi.scm.mapper.master.ScmRoleDynamicSqlSupport;
import cn.com.wdi.scm.model.master.ScmMenu;
import cn.com.wdi.scm.model.master.ScmRole;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.util.AntPathMatcher;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.equalTo;
import static org.mybatis.dynamic.sql.SqlBuilder.select;

/**
 * 获取请求地址所需要的角色
 *
 * @author liyongjian
 * @create 2020-03-26 17:09
 */

public class UrlFilterInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {

    @Autowired
    private ScmMenuMapper menuMapper;

    private AntPathMatcher antPathMatcher = new AntPathMatcher();


    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
        //获取请求URL
        String requestUrl = ((FilterInvocation) o).getRequestUrl();
        //放通自定义登录页面的路径
        if ("/login.html".equals(requestUrl) || "/login".equals(requestUrl)){
            return null;
        }
        SelectStatementProvider selectStatementProvider = select(ScmMenuMapper.selectJoinRoleList)
                .from(ScmMenuDynamicSqlSupport.scmMenu)
                .leftJoin(ScmMenuRoleDynamicSqlSupport.scmMenuRole)
                .on(ScmMenuDynamicSqlSupport.id, equalTo(ScmMenuRoleDynamicSqlSupport.mid))
                .leftJoin(ScmRoleDynamicSqlSupport.scmRole)
                .on(ScmMenuRoleDynamicSqlSupport.rid, equalTo(ScmRoleDynamicSqlSupport.id))
                .orderBy(ScmMenuDynamicSqlSupport.url.descending())
                .build()
                .render(RenderingStrategies.MYBATIS3);

        List<ScmMenu> menuList = menuMapper.selectManyJoin(selectStatementProvider);
        List<String> roleValues = new ArrayList<>();
        for (ScmMenu menu : menuList) {
            if (antPathMatcher.match(menu.getUrl(), requestUrl) && menu.getRoles().size() > 0) {
                List<ScmRole> roleList = menu.getRoles();
                int size = roleList.size();
                for (int i = 0; i < size; i++) {
                    roleValues.add(roleList.get(i).getName());
                }

            }
        }
        if (roleValues.isEmpty()) {
            //没有匹配上的资源，都是登录访问
            return SecurityConfig.createList(UrlDefautlRoleEnum.ROLE_LOGIN.getValue());
        }else {
            String[] roleValerArray = new String[roleValues.size()];
            roleValues.toArray(roleValerArray);
            return SecurityConfig.createList(roleValerArray);
        }
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return FilterInvocation.class.isAssignableFrom(aClass);
    }
}
