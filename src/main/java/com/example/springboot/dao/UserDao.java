package com.example.springboot.dao;

import com.example.springboot.entity.DemoUser;

/**
 * Created by GM on 2017/9/12.
 */
public interface DemoUserDao {
    /**
     * 根据主键获得DemoUser对象
     *
     * @param id
     * @return
     */
    public DemoUser getById(long id);
}
