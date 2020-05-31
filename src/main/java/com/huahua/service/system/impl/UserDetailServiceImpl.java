package com.huahua.service.system.impl;

import com.huahua.domain.system.SmRole;
import com.huahua.domain.system.SmUser;
import com.huahua.mapper.system.SmUserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 * @author GYM
 * @date 2020/4/17 14:24
 * @Description: 根据用户名校验用户是否存在，如果存在返回用户信息和权限信息
 */
@Service
public class UserDetailServiceImpl implements UserDetailsService {
    private final Logger log = LoggerFactory.getLogger(UserDetailServiceImpl.class);
    @Autowired
    private SmUserMapper smUserMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        log.error("登陆用户输入的用户名：{}", name);
        SmUser smUser = smUserMapper.selectByUserName(name);
        String cryptPwd = passwordEncoder.encode(smUser.getPassword());
        log.error("加密后的密码为: {}",cryptPwd);
        List<SmRole> list = new ArrayList<>();
        SmRole role = new SmRole();
        role.setId(1);
        role.setRoleName("admin");
        list.add(role);
        return new User(name,cryptPwd,getRoles(list));

    }
    private Collection<GrantedAuthority> getRoles(List<SmRole> roles){
        List<GrantedAuthority> list = new ArrayList<>();
        for (SmRole role : roles){
            SimpleGrantedAuthority grantedAuthority = new SimpleGrantedAuthority(role.getRoleName());
            list.add(grantedAuthority);
        }
        return list;
    }
}
