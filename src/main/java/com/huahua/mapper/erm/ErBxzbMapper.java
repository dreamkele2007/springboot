package com.huahua.mapper.erm;

import com.huahua.domain.erm.ErBxzb;
import java.util.List;

public interface ErBxzbMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table er_bxzb
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table er_bxzb
     *
     * @mbggenerated
     */
    int insert(ErBxzb record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table er_bxzb
     *
     * @mbggenerated
     */
    ErBxzb selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table er_bxzb
     *
     * @mbggenerated
     */
    List<ErBxzb> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table er_bxzb
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ErBxzb record);
}