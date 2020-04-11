package com.huahua.controller.system;

import com.github.pagehelper.PageInfo;
import com.huahua.base.web.Result;
import com.huahua.base.web.ui.model.GridRequest;
import com.huahua.domain.system.UserDO;
import com.huahua.service.redis.RedisService;
import com.huahua.service.system.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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
    public String add(@RequestBody UserDO userVO) {
        userService.insert(userVO);
        String name = redisService.getString("name");
        return name+"3";
    }



    /**
     * @Description:
     * @Param: []
     */
    @PostMapping("/save")
    public Result insertSelective(@RequestBody UserDO userVO) {
        int rowNum = userService.insertSelective(userVO);
        return new Result(rowNum);
    }


    /**
     * @Description: 根据id查询一条
     */
    @GetMapping(value = "/one/{id}")
    public Result selectById(@PathVariable Integer id){
        UserDO result= userService.selectById(id);
        return new Result(result);
    }


    /**
     * @Description: 根据id查询一条
     */
    @GetMapping(value = "/all/")
    public Result selectAll(){
        List<UserDO> result= userService.selectAll();
        return new Result(result);
    }

    /**
     * @Description: 分页查询
     */
    @GetMapping(value = "/page/")
    public Result selectByPage(@RequestBody GridRequest gridRequest){
        List<UserDO> result= userService.selectByPage(gridRequest);
        PageInfo<UserDO> pageInfo = new PageInfo<UserDO>(result);
        return new Result(pageInfo);
    }

    /**
     * @Description: 分页查询--测试
     */
    @GetMapping(value = "/page2/")
    public Result selectByPage2(){
        List<UserDO> result= userService.selectByPage();
        PageInfo<UserDO> pageInfo = new PageInfo<UserDO>(result);
        return new Result(pageInfo);
    }
    @PostMapping
    public Result update(@RequestBody UserDO userDo){
        userService.updateByIdWithTx(userDo);
        return new Result();
    }


}
