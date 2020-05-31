package com.huahua.base.web.ui;

import com.huahua.base.utils.string.CamelCaseUtils;

import java.util.List;

/**
 * @author GYM
 * @date 2020/4/8 16:50
 * @Description: TODO
 */
public class GridRequest {
    /**
     *
     */
    private static final long serialVersionUID = 6082624858102176557L;
    private int pageNum;//  当前页
    private int pageSize;// 每页条数
    private String searchKey;// 关键字搜索
    /**
     * 筛选条件列表
     */
    private List<GridFilterInfo> filterList;
    /**
     * 排序条件列表
     */
    private List<GridSortInfo> sortList;

    public int getPageNum() {

        return pageNum;
    }

    public void setPageNum(int pageNum) {

        this.pageNum = pageNum;
    }

    public int getPageSize() {

        return pageSize;
    }

    public void setPageSize(int pageSize) {

        this.pageSize = pageSize;
    }

    public String getSearchKey() {

        return searchKey;
    }

    public void setSearchKey(String searchKey) {

        this.searchKey = searchKey;
    }


    public List<GridFilterInfo> getFilterList() {

        return filterList;
    }

    public void setFilterList(List<GridFilterInfo> filterList) {

        this.filterList = filterList;
    }


    public List<GridSortInfo> getSortList() {

        return sortList;
    }

    public void setSortList(List<GridSortInfo> sortList) {

        this.sortList = sortList;
    }

    public String getSortMybatisString(){
        String mybatis = "";
        final StringBuffer mybatisStr = new StringBuffer();
        if(this.sortList != null){
            sortList.stream().forEach(s->{
                mybatisStr.append(CamelCaseUtils.toUnderlineName(s.getMybatisStr())).append(",");
            });
            if(mybatisStr.length()>0){
                mybatis = mybatisStr.substring(0, mybatisStr.length()-1);
            }
        }
        return mybatis;
    }

}
