package com.huahua.mapper.system;

import com.huahua.base.web.ui.PageInfo;
import com.huahua.domain.system.SmUser;

import java.util.List;

/**
 * @author GYM
 * @date 2020/4/2 21:24
 * @Description: TODO
 */
public interface SmUserMapper {
    void insert(SmUser smUser);

    int insertSelective(SmUser smUser);

    SmUser selectById(Integer id);

    SmUser selectByUserName(String name);


    List<SmUser> selectAll();

    List<SmUser> selectAll(PageInfo pageInfo);

    int updateByPrimaryKey(SmUser smUser);
}
