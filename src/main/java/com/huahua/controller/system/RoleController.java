package com.huahua.controller.system;

import com.huahua.domain.system.SmRole;
import com.huahua.service.system.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GYM
 * @date 2020/4/7 17:21
 * @Description: TODO
 */
@RestController
@RequestMapping(value="/api/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping(value="/one/{id}")
    public SmRole selectOne(@PathVariable Integer id){
        SmRole smRole = roleService.selectById(id);
        return smRole;
    }

}
