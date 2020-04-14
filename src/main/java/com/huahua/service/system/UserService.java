package com.huahua.service.system;

import com.huahua.base.web.ui.model.GridRequest;
import com.huahua.domain.system.UserDO;

import java.util.List;

/**
 * Created by GM on 2017/9/12.
 */
public interface UserService {


    /**
     * 新增
     *
     * @param userDO
     */
    public int insertSelective(UserDO userDO);


    /**
     * @Description: 保存用户
     * @Param: userDO
     * @return:
     */
    public void insert(UserDO userDO);


    /**
     * @Description: 查询根据主键
     * @Param: Integer id
     * @return: 
     */
    public UserDO selectById(Integer id);

    /**
     * @Description: 查询所有
     * @Param: 
     * @return: 
     */
    List<UserDO> selectAll();

    /**
     * @Description: 查询分页--前台
     * @Param:
     * @return:
     */
    List<UserDO> selectByPage(GridRequest gridRequest);

    /**
     * @Description: 查询分页--后台
     * @Param:
     * @return:
     */
    List<UserDO> selectByPage();
    /**
     * @Description:
     * @Param: userDO
     * @return: 
     */
    int updateByIdWithTx(UserDO userDO);

    List<UserDO> testMultiDataSource();
}
