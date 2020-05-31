package com.huahua.security;

import com.huahua.security.jwt.JwtAuthenticationFilter;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.core.GrantedAuthorityDefaults;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * @Description SecurityConfig 安全配置
 * @Author YuMing Gao
 * @Date 2020/2/28 14:51
 * @Version 1.0.0
 */
@EnableWebSecurity  // EnableWebSecurity整合了@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)// 开启方法权限控制
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private final Logger log = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

    @Autowired
    private JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;

    @Resource(name = "jwtAuthenticationFilter")
    private JwtAuthenticationFilter jwtAuthenticationFilter;

    @Resource(name = "userDetailsServiceImpl")
    private UserDetailsServiceImpl userDetailsServiceImpl;

    @Resource(name = "accessDeniedException")
    private AccessDeniedException accessDeniedException;

    @Resource(name = "authSuccessHandler")
    private AuthSuccessHandler authSuccessHandler;

    @Resource(name = "authFailureHandler")
    private AuthFailureHandler authFailureHandler;

    @Resource(name = "tokenExceptionHandler")
    private TokenExceptionHandler tokenExceptionHandler;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    @Bean
    GrantedAuthorityDefaults grantedAuthorityDefaults() {
        return new GrantedAuthorityDefaults(""); // 移除ROLE_后缀
    }


    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsServiceImpl).passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 关闭跨域
        http.csrf().disable()
                .exceptionHandling().authenticationEntryPoint(jwtAuthenticationEntryPoint).and().sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                // dont authenticate this particular request
                .and()
                .authorizeRequests()
                .antMatchers("/api/auth").permitAll()
                .anyRequest().authenticated()

                .and()
                .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
        http
                .headers()
                .frameOptions().sameOrigin()  // required to set for H2 else H2 Console will be blank.
                .cacheControl();
//        http.formLogin()
//            .successHandler(authSuccessHandler)
//            .failureHandler(authFailureHandler)
//            .and()
//                // 添加异常处理
//                .exceptionHandling()
//                .authenticationEntryPoint(tokenExceptionHandler)
//                .accessDeniedHandler(accessDeniedException)
//            .and()
//                 // 让跨域配置被使用
//                 .cors()
//            .and()
//                 // 关闭CSRF跨域
//                 .csrf().disable()
//                 //关闭session
//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//            .and()
//                // 登录请求放行
//                .authorizeRequests().antMatchers(HttpMethod.POST,"/api/auth").permitAll()
//            .and()
////        // 拦截所有请求
//                .authorizeRequests().anyRequest().authenticated();
//        // 替换过滤器
//        http.addFilterAt(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
//        // 禁用缓存
//        http.headers().cacheControl();
//        http.headers().frameOptions().disable();
    }
    /**
     * 忽略拦截
     * @param web
     * @throws Exception
     */
    @Override
    public void configure(WebSecurity web) throws Exception {
        // 设置拦截忽略url - 会直接过滤该url - 将不会经过Spring Security过滤器链
        web.ignoring().antMatchers("/api/user/all");
        // 设置拦截忽略文件夹，可以对静态资源放行
        web.ignoring().antMatchers("/css/**", "/js/**");
    }

}
