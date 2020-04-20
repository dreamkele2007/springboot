package com.huahua.mapper.erm;

import com.huahua.base.web.ui.model.PageInfo;
import com.huahua.domain.system.UserDO;

import java.util.List;

/**
 * @author GYM
 * @date 2020/4/2 21:24
 * @Description: TODO
 */
public interface JkzbMapper {
    UserDO selectById(Integer id);

    UserDO selectByName(String name);

    List<UserDO> selectAll();

    List<UserDO> selectAll(PageInfo pageInfo);

}
