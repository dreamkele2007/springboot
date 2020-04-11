package com.huahua.service.system.impl;

import com.huahua.domain.system.RoleDO;
import com.huahua.mapper.system.RoleMapper;
import com.huahua.service.system.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author GYM
 * @date 2020/4/7 17:19
 * @Description: TODO
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleMapper roleMapper;
    @Override
    public int insertSelective(RoleDO roleDO) {
        return 0;
    }

    @Override
    public void insert(RoleDO roleDO) {
//        roleMapper.insert(roleDO);

    }

    @Override
    public RoleDO selectById(Integer id) {
//        List<RoleDO> roleDOList = roleMapper.selectAll();
//        return roleDOList.get(0);
        return null;
    }
}
