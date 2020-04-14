package com.huahua.service.system.impl;

import com.huahua.domain.system.RoleDO;
import com.huahua.service.system.RoleService;
import org.springframework.stereotype.Service;

/**
 * @author GYM
 * @date 2020/4/7 17:19
 * @Description: TODO
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Override
    public int insertSelective(RoleDO roleDO) {
        return 0;
    }

    @Override
    public void insert(RoleDO roleDO) {

    }

    @Override
    public RoleDO selectById(Integer id) {
        return null;
    }
}
