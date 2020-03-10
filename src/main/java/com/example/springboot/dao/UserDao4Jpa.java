package com.example.springboot.dao;


import com.example.springboot.entity.DemoUser;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by GM on 2017/9/11.
 */
/*
 * Jpa实现持久层开发
 * 在CrudRepository自带常用的crud方法.
 * 这样一个基本dao就写完了.
 */
public interface JpaDemoUserDao extends CrudRepository<DemoUser, Long> {
}
