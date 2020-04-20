package com.huahua.service.system;

import com.huahua.domain.system.SmSite;

import java.util.List;

/**
 * @author GYM
 * @date 2020/4/17 14:24
 * @Description: TODO
 */
public interface SiteService {

    /**
     * 新增
     *
     * @param smSite
     */
    public int insertSelective(SmSite smSite);


    /**
     * @Description: 保存用户
     * @Param: userDO
     * @return:
     */
    public void insert(SmSite smSite);


    /**
     * @Description: 查询根据主键
     * @Param: Integer id
     * @return:
     */
    public SmSite selectById(Integer id);

    /**
     * @Description: 查询所有
     * @Param:
     * @return:
     */
    List<SmSite> selectAll();
    
    /**
     * @Description:
     * @Param: 
     * @return: 
     */
    int updateByIdWithTx(SmSite smSite);

}
