package com.huahua.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.huahua.base.web.http.Result;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description AccessDeniedException
 * @Author YuMing Gao
 * @Date 2020/2/28 15:22
 * @Version 1.0.0
 */
@Component
public class AccessDeniedException implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResult, org.springframework.security.access.AccessDeniedException e) throws IOException {
        httpServletResult.setContentType("application/json");
        httpServletResult.setCharacterEncoding("utf-8");
        Result<Object> response = new Result<>();
        response.setCode(403);
        response.setMessage("用户得到授权，但是访问是被禁止的");
        ObjectMapper objectMapper = new ObjectMapper();
        httpServletResult.getWriter().write(objectMapper.writeValueAsString(response));
    }
}
