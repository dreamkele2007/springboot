package com.huahua.base.web.ui.model;

/**
 * @author GYM
 * @date 2020/4/8 16:51
 * @Description: TODO
 */
public class GridFilterInfo {
    /**
     * 筛选的列名称
     */
    private String filterKey;
    /**
     * 筛选关键字
     */
    private String filterValue;

    public String getFilterKey() {

        return filterKey;
    }

    public void setFilterKey(String filterKey) {

        this.filterKey = filterKey;
    }

    public String getFilterValue() {

        return filterValue;
    }

    public void setFilterValue(String filterValue) {

        this.filterValue = filterValue;
    }
}
