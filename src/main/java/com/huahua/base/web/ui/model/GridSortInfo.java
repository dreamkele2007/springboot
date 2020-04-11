package com.huahua.base.web.ui.model;

/**
 * @author GYM
 * @date 2020/4/8 16:51
 * @Description: TODO
 */
public class GridSortInfo {
    /**
     * 排序列
     */
    private String sortKey;
    /**
     * 排序方式，desc/asc
     */
    private String sortValue;

    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {

        this.sortKey = sortKey;
    }

    public String getSortValue() {

        return sortValue;
    }

    public void setSortValue(String sortValue) {

        this.sortValue = sortValue;
    }


    public String getMybatisStr(){
        return this.sortKey+" "+this.sortValue;
    }
}
