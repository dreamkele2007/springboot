package com.huahua.base.web.ui;

/**
 * @author GYM
 * @date 2020/4/8 11:06
 * @Description: TODO
 */
public class PageInfo {
    /**
     * 所有pks
     */
    private String[] allpks;

    /**
     * 当前页码
     */
    private int pageNum;

    /**
     * 每页显示记录条数
     */
    private int pageSize;

    /**
     * 总记录条数
     */
    private int total;

    /**
     * 总页数
     */
    private int totalPage;

    /**
     * 获取所有pks
     *
     * @return
     */
    public String[] getAllpks() {
        return this.allpks;
    }

    /**
     * 获取 当前页码
     *
     * @return 当前页码
     */
    public int getPageNum() {
        return this.pageNum;
    }

    /**
     * 获取 每页显示记录条数
     *
     * @return 每页显示记录条数
     */
    public int getPageSize() {
        return this.pageSize;
    }

    public int getTotal() {
        return this.total;
    }

    /**
     * 获取 总页数
     *
     * @return 总页数
     */
    public int getTotalPage() {
        return this.totalPage;
    }

    /**
     * 设置所有pks
     *
     * @param allpks
     */
    public void setAllpks(String[] allpks) {
        this.allpks = allpks;
    }

    /**
     * 设置 当前页码
     *
     * @param pageNum 当前页码
     */
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    /**
     * 设置 每页显示记录条数
     *
     * @param pageSize 每页显示记录条数
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * 设置 总页数
     *
     * @param totalPage 总页数
     */
    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

}
