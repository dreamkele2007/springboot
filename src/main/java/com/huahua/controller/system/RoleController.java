//package com.huahua.controller.system;
//
//import com.huahua.domain.system.RoleDO;
//import com.huahua.service.system.RoleService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * @author GYM
// * @date 2020/4/7 17:21
// * @Description: TODO
// */
//@RestController
//public class RoleController {
//    @Autowired
//    private RoleService roleService;
//
//    @RequestMapping
//    public RoleDO selectOne(@PathVariable Integer id){
//        RoleDO roleDO = roleService.selectById(id);
//        return  roleDO;
//    }
//
//}
