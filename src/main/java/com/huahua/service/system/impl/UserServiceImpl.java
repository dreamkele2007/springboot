package com.huahua.service.system.impl;

import com.github.pagehelper.PageHelper;
import com.huahua.base.web.ui.model.GridRequest;
import com.huahua.base.web.ui.model.PageInfo;
import com.huahua.domain.system.UserDO;
import com.huahua.mapper.erm.JkzbMapper;
import com.huahua.mapper.system.UserMapper;
import com.huahua.service.system.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by GM on 2017/9/12.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private JkzbMapper userMapper2;

    @Override
    public int insertSelective(UserDO userDO) {
        return userMapper.insertSelective(userDO);
    }

    @Transactional
    @Override
    public void insert(UserDO userDO) {
        userMapper.insert(userDO);
    }


    @Override
    public UserDO selectById(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<UserDO> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public List<UserDO> selectByPage(GridRequest gridRequest) {
        PageHelper.startPage(gridRequest.getPageNum(), gridRequest.getPageSize());
        List<UserDO> userList = userMapper.selectAll();
        return userList;
    }

    @Override
    public List<UserDO> selectByPage() {
        PageInfo pageInfo = new PageInfo();
        pageInfo.setPageNum(1);
        pageInfo.setPageSize(10);
        List<UserDO> userList = userMapper.selectAll(pageInfo);
        return userList;
    }

    @Transactional
    @Override
    public int updateByIdWithTx(UserDO userDO) {
        int i = userMapper.updateByPrimaryKey(userDO);
//        int s = 10/0;
        userDO.setId(1);
        userDO.setEmail("gaoymf@yonyou.com");
        int j = userMapper.updateByPrimaryKey(userDO);
        return i;
    }

    @Override
    public List<UserDO> testMultiDataSource() {
        List<UserDO> userDOS = userMapper.selectAll();
        List<UserDO> userDOS1 = userMapper2.selectAll();
        userDOS.addAll(userDOS1);
        return userDOS;
    }


}
