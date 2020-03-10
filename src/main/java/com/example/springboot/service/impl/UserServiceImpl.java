package com.example.springboot.service.impl;

import com.example.springboot.dao.DemoUserDao;
import com.example.springboot.dao.JpaDemoUserDao;
import com.example.springboot.entity.DemoUser;
import com.example.springboot.service.DemoUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by GM on 2017/9/12.
 */
@Service
public class DemoUserServiceImpl implements DemoUserService {
    @Autowired
    private JpaDemoUserDao jpaDemoUserDao;

    @Autowired
    private DemoUserDao demoUserDao;

    @Transactional
    @Override
    public void save(DemoUser demoUser) {
        jpaDemoUserDao.save(demoUser);
    }

    @Override
    public DemoUser getById(long id) {
        //jpaDemoUserDao.findOne(id);//在demoRepository可以直接使用findOne进行获取.
        return demoUserDao.getById(id);
    }
}
