package com.example.springboot.service;

import com.example.springboot.entity.DemoUser;

/**
 * Created by GM on 2017/9/12.
 */
public interface DemoUserService {

    /**
     * 保存
     *
     * @param demoUser
     */
    public void save(DemoUser demoUser);

    /**
     * 根据主键查询
     *
     * @param id
     * @return
     */
    public DemoUser getById(long id);
}
