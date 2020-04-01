package com.huahua.dao.system;

import com.huahua.entity.UserDO;

/**
 * Created by GM on 2017/9/12.
 */
public interface UserDao {
    /**
     * 根据主键获得DemoUser对象
     *
     * @param id
     * @return
     */
    public UserDO getById(long id);
}
