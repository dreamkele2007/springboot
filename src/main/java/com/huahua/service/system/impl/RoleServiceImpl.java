package com.huahua.service.system.impl;

import com.huahua.domain.system.SmRole;
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
    public int insertSelective(SmRole smRole) {
        return 0;
    }

    @Override
    public void insert(SmRole smRole) {

    }

    @Override
    public SmRole selectById(Integer id) {
        return null;
    }
}
