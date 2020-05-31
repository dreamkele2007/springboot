package com.huahua.security.jwt;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

/**
 * @Description JwtUser：该类封装登录用户相关信息，例如用户名，密码，权限集合等，需要实现UserDetails 接口
 * @Author GYM
 * @Date 2020/2/29 22:32
 * @Version 1.0.0
 */
public class JwtUser implements UserDetails {
    private String username;
    private String password;
    //权限
    private Collection<? extends GrantedAuthority> authorities;

    public  JwtUser(String username, String password, List<GrantedAuthority> authorities){
        this.username = username;
        this.password = password;
        this.authorities = authorities ;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    // 账户是否未过期
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    // 账户是否未锁定
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    // 密码是否未过期
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    // 账户是否激活
    @Override
    public boolean isEnabled() {
        return true;
    }

    //获得当前登陆用户对应的对象。
    public static JwtUser getCurUser(){
        JwtUser userDetails = (JwtUser) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        System.out.println("当前用户:"+userDetails);
        return userDetails;
    }
}
