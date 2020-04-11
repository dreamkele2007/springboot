package com.huahua.base.web.ui.model;

/**
 * @author GYM
 * @date 2020/4/8 11:12
 * @Description: TODO
 */
public class RowStatus {

    /**
     * 名字
     */
    private String name;


    /**
     * 枚举的值（将要存放到数据库中）
     */
    private int value;
    /**
     * 删除
     */
    public static final RowStatus Deleted = new RowStatus(3, "删除");

    /**
     * 新增
     */
    public static final RowStatus New = new RowStatus(2,"新增");

    /**
     * 原始
     */
    public static final RowStatus Origin = new RowStatus(0, "原始");

    /**
     * 修改
     */
    public static final RowStatus Updated = new RowStatus(1, "修改");

    private static final long serialVersionUID = -4989393954791076564L;

    private RowStatus(int value, String name) {
        this.value= value;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
