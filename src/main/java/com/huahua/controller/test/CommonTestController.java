package com.huahua.controller.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.huahua.base.web.http.Result;
import com.huahua.domain.system.UserDO;
import com.huahua.service.system.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author GYM
 * @date 2020/4/14 21:51
 * @Description: 测试入口类
 */
@RestController
@RequestMapping(value = "/test")
public class CommonTestController {
    /**
     * @Description: 多数据源测试
     * @Param: 
     * @return: 
     */
    @Autowired
    private UserService userService;
    @Autowired
    DruidDataSource dataSource;
    
    @GetMapping(value = "/datasource")
    public Result testMultiDataSource(@RequestParam("name")String name){
        List<UserDO> userDOS = userService.testMultiDataSource();
        System.out.println(name);
        return new Result(userDOS);
    }
}
