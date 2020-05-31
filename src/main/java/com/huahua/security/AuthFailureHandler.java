package com.huahua.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.huahua.base.web.http.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description AuthFailHandler 登录失败处理类
 * @Author YuMing Gao
 * @Date 2020/3/1 13:18
 * @Version 1.0.0
 */
@Component
public class AuthFailureHandler implements AuthenticationFailureHandler {
    private final Logger log = LoggerFactory.getLogger(AuthFailureHandler.class);
    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse httpServletResponse, AuthenticationException exception) throws IOException, ServletException {
        log.info("登录失败！");
        httpServletResponse.setContentType("application/json");
        httpServletResponse.setCharacterEncoding("utf-8");
        Result<Object> response = new Result<>();
        response.setCode(-1);
        response.setMessage("用户名或密码错误");
        ObjectMapper objectMapper = new ObjectMapper();
        httpServletResponse.getWriter().write(objectMapper.writeValueAsString(response));
    }
}
