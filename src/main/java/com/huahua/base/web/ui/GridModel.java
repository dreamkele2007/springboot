package com.huahua.base.web.ui;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author GYM
 * @date 2020/4/8 11:06
 * @Description: TODO
 */
public class GridModel implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * 所有主键数组，不仅是本页的数据主键
     */
    private String[] allpks;



    /**
     * 分页信息
     */
    private PageInfo pageInfo;

    /**
     * 行列表
     */
    private final List<Row> rows = new ArrayList<Row>();

    /**
     * 增加行
     *
     * @param row 行
     */
    public void add(Row row) {
        this.rows.add(row);
    }

    public void add(List<Row> addRows){
        this.rows.addAll(addRows);
    }

    /**
     * @return the allpks
     */
    public String[] getAllpks() {
        return this.allpks;
    }




    /**
     * 获取所有行
     *
     * @return 所有行
     */
    public List<Row> getListRows() {
        return this.rows;
    }

    /**
     * 获取分页信息
     *
     * @return 分页信息
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * 获取所有的行
     *
     * @return 所有的行
     */
    public Row[] getRows() {
        int size = this.rows.size();
        Row[] values = new Row[size];
        values = this.rows.toArray(values);
        return values;
    }

    /**
     * 删除行
     *
     * @param index
     */
    public void remove(int index) {
        this.rows.remove(index);
    }

    /**
     * @param allpks the allpks to set
     */
    public void setAllpks(String[] allpks) {
        this.allpks = allpks;
    }





    /**
     * 设置分页信息
     *
     * @param pageInfo 分页信息
     */
    public void setPageinfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public String toString() {
        StringBuffer sb =
                new StringBuffer().append("GridModel [areacode=")
                        .append(", areaType=").append(", pageInfo=").append(this.pageInfo).append(", allpks=")
                        .append(Arrays.toString(this.allpks)).append(", rows=");

            for (Row row : this.rows) {
                sb.append(row.toString());
            }
        sb.append("]");
        return sb.toString();
    }
}
