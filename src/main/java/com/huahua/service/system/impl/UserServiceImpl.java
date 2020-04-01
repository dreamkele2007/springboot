package com.huahua.service.system.impl;

import com.huahua.dao.system.UserDao;
import com.huahua.entity.UserDO;
import com.huahua.service.system.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by GM on 2017/9/12.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public void save(UserDO userDO) {
//        jpaDemoUserDao.save(userDO);
    }

    @Override
    public UserDO getById(Integer id) {
        return userDao.getById(id);
    }


}
