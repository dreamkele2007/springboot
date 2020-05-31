package com.huahua.service.system;

import com.huahua.domain.system.SmRole;

/**
 * @author GYM
 * @date 2020/4/7 17:18
 * @Description: TODO
 */
public interface RoleService {

    /**
     * 新增
     *
     * @param smRole
     */
    public int insertSelective(SmRole smRole);

    /**
     * 保存
     *
     * @param smRole
     */
    public void insert(SmRole smRole);

    /**
     * 根据主键查询
     *
     * @param id
     * @return
     */
    public SmRole selectById(Integer id);
}
