package com.huahua.service.system;

import com.huahua.entity.UserDO;

/**
 * Created by GM on 2017/9/12.
 */
public interface UserService {

    /**
     * 保存
     *
     * @param userDO
     */
    public void save(UserDO userDO);

    /**
     * 根据主键查询
     *
     * @param id
     * @return
     */
    public UserDO getById(Integer id);
}
