package com.huahua.mapper.system;

import com.huahua.base.web.ui.model.PageInfo;
import com.huahua.domain.system.UserDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author GYM
 * @date 2020/4/2 21:24
 * @Description: TODO
 */
public interface UserMapper {
    void insert(UserDO userDO);

    int insertSelective(UserDO userDO);

    UserDO selectById(Integer id);

    UserDO selectByName(String name);


    List<UserDO> selectAll();

    List<UserDO> selectAll(PageInfo pageInfo);

    int updateByPrimaryKey(UserDO userDO);
}
