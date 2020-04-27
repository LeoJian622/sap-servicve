package cn.com.wdi.scm.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.ObjectPostProcessor;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * webSecurityConfig
 *
 * @author liyongjian
 * @create 2020-04-01 16:25
 */

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    @Bean
    @Override
    public UserDetailsService userDetailsService() {
        return new PersonUserDetailsServiceImpl();
    }

    @Bean
    public FilterInvocationSecurityMetadataSource urlFilterInvocationSecurityMetadataSource() {
        return new UrlFilterInvocationSecurityMetadataSource();
    }

    @Bean
    public AccessDecisionManager urlAccessDecisionManager() {
        return new UrlAccessDecisionManager();
    }

    @Bean
    public AccessDeniedHandler urlAccessDeniedHandler() {
        return new UrlAccessDeniedHandler();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
        //对默认的UserDetailsService进行覆盖
        authenticationProvider.setUserDetailsService(userDetailsService());
        authenticationProvider.setPasswordEncoder(passwordEncoder());
        return authenticationProvider;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider());
    }

    @Override
    public void configure(WebSecurity web) {
        //对于在header里面增加token等类似情况，放行所有OPTIONS请求。
        web.ignoring().antMatchers(HttpMethod.OPTIONS, "/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .httpBasic(httpBasic ->
                        httpBasic.authenticationEntryPoint((req, res, ex) -> {
                            res.setContentType("application/json;charset=utf-8");
                            res.setStatus(HttpServletResponse.SC_FORBIDDEN);
                            PrintWriter out = res.getWriter();
                            StringBuffer sb = new StringBuffer();
                            sb.append("{\"status\":false,\"msg\":\"请登录!\"}");
                            out.write(sb.toString());
                            out.flush();
                            out.close();
                        })
                )
                .authorizeRequests(authorizeRequests ->
                        authorizeRequests
                                .antMatchers("/", "/static/**")
                                .permitAll()
                                .withObjectPostProcessor(new ObjectPostProcessor<FilterSecurityInterceptor>() {
                                    @Override
                                    public <O extends FilterSecurityInterceptor> O postProcess(O o) {
                                        o.setAccessDecisionManager(urlAccessDecisionManager());
                                        o.setSecurityMetadataSource(urlFilterInvocationSecurityMetadataSource());
                                        return o;
                                    }
                                })
                                .anyRequest()
                                .authenticated()
                )
                .formLogin(formLogin ->
                                formLogin
                                        .loginPage("/login.html")
                                        .loginProcessingUrl("/login")
                                        .permitAll()
                                        .failureHandler((req, res, ex) -> {
                                            res.setContentType("application/json;charset=utf-8");
                                            PrintWriter out = res.getWriter();
                                            StringBuffer sb = new StringBuffer();
                                            sb.append("{\"status\":false,\"msg\":\"");
                                            if (ex instanceof UsernameNotFoundException || ex instanceof BadCredentialsException) {
                                                sb.append("用户名或密码输入错误，登录失败!");
                                            } else if (ex instanceof DisabledException) {
                                                sb.append("账户被禁用，登录失败，请联系管理员!");
                                            } else {
                                                sb.append("登录失败!");
                                            }
                                            sb.append("\"}");
                                            out.write(sb.toString());
                                            out.flush();
                                            out.close();
                                        })
                                        .successHandler((req, res, ex) -> {
                                            res.setContentType("application/json;charset=utf-8");
                                            PrintWriter out = res.getWriter();
                                            StringBuffer sb = new StringBuffer();
                                            sb.append("{\"status\":true,\"msg\":\"登录成功!\"}");
                                            out.write(sb.toString());
                                            out.flush();
                                            out.close();
                                        })
                                        .permitAll()
                )
                .logout(LogoutConfigurer::permitAll)
                .exceptionHandling(exceptionHandling ->
                        exceptionHandling.accessDeniedHandler(urlAccessDeniedHandler()))
                .cors(AbstractHttpConfigurer::disable)
        ;
        http.csrf(AbstractHttpConfigurer::disable);
    }

}


