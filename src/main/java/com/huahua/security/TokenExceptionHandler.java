package com.huahua.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.huahua.base.web.http.Result;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description TokenExceptionHandler token认证异常
 * @Author YuMing Gao
 * @Date 2020/2/28 15:08
 * @Version 1.0.0
 */
@Component
public class TokenExceptionHandler implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException {
        httpServletResponse.setContentType("application/json");
        httpServletResponse.setCharacterEncoding("utf-8");
        Result<Object> response = new Result<>();
        response.setCode(401);
        response.setMessage("用户没有访问凭证或访问凭证已过期");
        ObjectMapper objectMapper = new ObjectMapper();
        httpServletResponse.getWriter().write(objectMapper.writeValueAsString(response));
    }
}
