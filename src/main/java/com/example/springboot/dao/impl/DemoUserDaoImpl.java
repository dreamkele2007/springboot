package com.example.springboot.dao.impl;

import com.example.springboot.dao.DemoUserDao;
import com.example.springboot.entity.DemoUser;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by GM on 2017/9/12.
 */
@Repository
public class DemoUserDaoImpl implements DemoUserDao{
    @Resource
    private JdbcTemplate jdbcTemplate;
    @Override
    public DemoUser getById(long id) {
        String sql = "select * from user where id=?";
        RowMapper<DemoUser> rowMapper = new BeanPropertyRowMapper<DemoUser>(DemoUser.class);
        return jdbcTemplate.queryForObject(sql, rowMapper,id);
    }
}
