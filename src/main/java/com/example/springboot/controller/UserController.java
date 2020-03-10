package com.example.springboot.controller;

import com.example.springboot.entity.DemoUser;
import com.example.springboot.service.DemoUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by GM on 2017/9/12.
 */
@RestController
@RequestMapping("/demo2")
public class DemoUserController {
    @Autowired
    private DemoUserService demoUserService;

    /**
     * jpa测试新增用户的方法
     */
    @RequestMapping("/save")
    public String save() {
        DemoUser demoUser = new DemoUser();
        demoUser.setName("张三");
        demoUser.setAddress("北京");
        demoUser.setAge("18");
        demoUserService.save(demoUser);
        return "保存成功";
    }

    /**
     * 使用jdbcTemplate完成查询
     * @return
     */
    //地址：http://127.0.0.1:8080/demo2/getById?id=1
    @RequestMapping("/getById")
    public DemoUser getById(long id){
        return demoUserService.getById(id);
    }
}
