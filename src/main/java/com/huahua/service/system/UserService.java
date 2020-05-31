package com.huahua.service.system;

import com.huahua.base.web.ui.GridRequest;
import com.huahua.domain.system.SmUser;

import java.util.List;

/**
 * Created by GM on 2017/9/12.
 */
public interface UserService {


    /**
     * 新增
     *
     * @param smUser
     */
    public int insertSelective(SmUser smUser);


    /**
     * @Description: 保存用户
     * @Param: smUser
     * @return:
     */
    public void insert(SmUser smUser);


    /**
     * @Description: 查询根据主键
     * @Param: Integer id
     * @return: 
     */
    public SmUser selectById(Integer id);

    /**
     * @Description: 查询所有
     * @Param: 
     * @return: 
     */
    List<SmUser> selectAll();

    /**
     * @Description: 查询分页--前台
     * @Param:
     * @return:
     */
    List<SmUser> selectByPage(GridRequest gridRequest);

    /**
     * @Description: 查询分页--后台
     * @Param:
     * @return:
     */
    List<SmUser> selectByPage();
    /**
     * @Description:
     * @Param: smUser
     * @return: 
     */
    int updateByIdWithTx(SmUser smUser);

    List<SmUser> testMultiDataSource();
}
