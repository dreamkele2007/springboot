package com.huahua.security;

import com.huahua.domain.system.SmRole;
import com.huahua.domain.system.SmUserRole;
import com.huahua.domain.system.SmUser;
import com.huahua.mapper.system.SmRoleMapper;
import com.huahua.mapper.system.SmUserMapper;
import com.huahua.mapper.system.SmUserRoleMapper;
import com.huahua.security.jwt.JwtUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description MyUserDetailsService 根据用户名获取数据库该用户信息，spring security在登录时自动调用
 * WebSecurityConfigurerAdapter会拿这里的User里的password与用户输入的对比验证
 * @Author YuMing Gao
 * @Date 2020/2/29 22:26
 * @Version 1.0.0
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private final Logger log = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

    @Autowired
    SmUserMapper smUserMapper;

    @Autowired
    SmUserRoleMapper userRoleMapper;


    @Autowired
    SmRoleMapper smRoleMapper;




    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("*********username->{}",username);
        // 根据用户名去查找对应的角色
        SmUser user = smUserMapper.selectByUserName(username);
        log.info("******************{}"+user);
        if (user == null) {
            throw new UsernameNotFoundException(String.format("No user found with username."));
        }
        SmUserRole roleUser = userRoleMapper.selectByUserId(user.getId());
        SmRole role = smRoleMapper.selectByPrimaryKey(roleUser.getRoleId());
        GrantedAuthority authority = new SimpleGrantedAuthority(role.getRoleName());
        List<GrantedAuthority> authorityList = new ArrayList<GrantedAuthority>();
        authorityList.add(authority);
        JwtUser jwtUser = new JwtUser(user.getUserName(),user.getPassword(),authorityList);
        return jwtUser;
    }
}
