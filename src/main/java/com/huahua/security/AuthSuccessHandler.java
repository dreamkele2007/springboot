package com.huahua.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.huahua.base.web.http.Result;
import com.huahua.security.jwt.JwtUser;
import com.huahua.security.jwt.JwtTokenUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description AuthSuccessHandler 登录成功处理类
 * @Author YuMing Gao
 * @Date 2020/3/1 13:00
 * @Version 1.0.0
 */
@Component
public class AuthSuccessHandler implements AuthenticationSuccessHandler {

    private final Logger log = LoggerFactory.getLogger(AuthSuccessHandler.class);


    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        log.info("****************登录成功************");
        httpServletResponse.setContentType("application/json");
        httpServletResponse.setCharacterEncoding("utf-8");
        //从authentication中获取用户信息
        JwtUser userDetail= (JwtUser)authentication.getPrincipal();
        // 生成token
        String token = JwtTokenUtil.generateToken(userDetail.getUsername());
        Result<Object> response = new Result<>();
        response.setCode(200);
        response.setMessage("登录成功");
        response.setData(token);
        ObjectMapper objectMapper = new ObjectMapper();
        httpServletResponse.getWriter().write(objectMapper.writeValueAsString(response));
    }
}
