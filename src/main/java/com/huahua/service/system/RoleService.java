package com.huahua.service.system;

import com.huahua.domain.system.RoleDO;
import org.springframework.stereotype.Service;

/**
 * @author GYM
 * @date 2020/4/7 17:18
 * @Description: TODO
 */
public interface RoleService {

    /**
     * 新增
     *
     * @param roleDO
     */
    public int insertSelective(RoleDO roleDO);

    /**
     * 保存
     *
     * @param roleDO
     */
    public void insert(RoleDO roleDO);

    /**
     * 根据主键查询
     *
     * @param id
     * @return
     */
    public RoleDO selectById(Integer id);
}
