package com.huahua.controller.system;

import com.huahua.base.dto.Result;
import com.huahua.entity.UserDO;
import com.huahua.service.redis.RedisService;
import com.huahua.service.system.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author GYM
 * @date 2020/4/1
 * @Description: 用户操作类
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RedisService redisService;



    /**
     * @Description:
     * @Param: []
     */
    @PostMapping("/add")
    public String save() {
        UserDO user = new UserDO();
        user.setUsername("张三");
        user.setMobile("110");
        userService.save(user);
        String name = redisService.getString("name");
        return name+"3";
    }


    /**
     * @Description: 根据id查询一条
     */
    @GetMapping(value = "/one/{id}")
    public Result getById(@PathVariable Integer id){
        UserDO byId = userService.getById(id);
        UserDO demoUser = new UserDO();
        demoUser.setUsername("哈哈");
        return new Result(demoUser);
    }


}
