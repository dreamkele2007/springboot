package com.huahua.service.system.impl;

import com.github.pagehelper.PageHelper;
import com.huahua.base.web.ui.GridRequest;
import com.huahua.base.web.ui.PageInfo;
import com.huahua.domain.system.SmUser;
import com.huahua.mapper.erm.JkzbMapper;
import com.huahua.mapper.system.SmUserMapper;
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
    private SmUserMapper smUserMapper;
    @Autowired
    private JkzbMapper userMapper2;

    @Override
    public int insertSelective(SmUser smUser) {
        return smUserMapper.insertSelective(smUser);
    }

    @Transactional
    @Override
    public void insert(SmUser smUser) {
        smUserMapper.insert(smUser);
    }


    @Override
    public SmUser selectById(Integer id) {
        return smUserMapper.selectById(id);
    }

    @Override
    public List<SmUser> selectAll() {
        return smUserMapper.selectAll();
    }

    @Override
    public List<SmUser> selectByPage(GridRequest gridRequest) {
        PageHelper.startPage(gridRequest.getPageNum(), gridRequest.getPageSize());
        List<SmUser> userList = smUserMapper.selectAll();
        return userList;
    }

    @Override
    public List<SmUser> selectByPage() {
        PageInfo pageInfo = new PageInfo();
        pageInfo.setPageNum(1);
        pageInfo.setPageSize(10);
        List<SmUser> userList = smUserMapper.selectAll(pageInfo);
        return userList;
    }

    @Transactional
    @Override
    public int updateByIdWithTx(SmUser smUser) {
        int i = smUserMapper.updateByPrimaryKey(smUser);
//        int s = 10/0;
        smUser.setId(1);
        smUser.setEmail("gaoymf@yonyou.com");
        int j = smUserMapper.updateByPrimaryKey(smUser);
        return i;
    }

    @Override
    public List<SmUser> testMultiDataSource() {
        List<SmUser> smUsers = smUserMapper.selectAll();
        List<SmUser> smUserDOS1 = userMapper2.selectAll();
        smUsers.addAll(smUserDOS1);
        return smUsers;
    }


}
