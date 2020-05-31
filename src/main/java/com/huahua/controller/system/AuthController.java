package com.huahua.controller.system;

import com.huahua.controller.dto.LoginDTO;
import com.huahua.mapper.system.SmUserMapper;
import com.huahua.security.UserDetailsServiceImpl;
import com.huahua.security.jwt.JwtResponse;
import com.huahua.security.jwt.JwtTokenUtil;
import com.huahua.security.jwt.JwtUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author GYM
 * @date 2020/5/6 20:21
 * @Description: TODO
 */
@RestController
@RequestMapping("/api")
@Slf4j
public class AuthController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Value("${jwt.header}")
    private String tokenHeader;

    @PostMapping("/auth")
    public JwtResponse createAuthenticationToken(@RequestBody LoginDTO loginDTO) throws Exception {
        Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginDTO.getUsername(), loginDTO.getPassword()));
        String token = JwtTokenUtil.generateToken(loginDTO.getUsername());
        return new JwtResponse(token);
    }


    @GetMapping("/token")
    public JwtUser getAuthenticatedUser(HttpServletRequest request) {
        String token = request.getHeader(tokenHeader);
        String username = JwtTokenUtil.validateToken(token);
        JwtUser user = (JwtUser) userDetailsService.loadUserByUsername(username);
        return user;
    }

}
