package com.huahua.base.web.ui;

import java.io.Serializable;

/**
 * @author GYM
 * @date 2020/4/8 11:07
 * @Description: TODO
 */
public class Cell implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * 显示名称
     */
    private String display;

    /**
     * 精度
     */
    private int scale = -1;

    /*
     * 单元格值
     */
    private Object value;

    public void clear() {
        this.display = null;
        this.value = null;
    }

    /**
     * 获取显示名称
     *
     * @return 显示名称
     */
    public String getDisplay() {
        return this.display;
    }

    /**
     * 获取精度
     *
     * @return 精度
     */
    public int getScale() {
        return this.scale;
    }

    /**
     * 获取单元格值
     *
     * @return 单元格值
     */
    public Object getValue() {
        return this.value;
    }

    /**
     * 设置显示名称
     *
     * @param display 显示名称
     */
    public void setDisplay(String display) {
        this.display = display;
    }

    /**
     * 设置精度
     *
     * @param scale 精度
     */
    public void setScale(int scale) {
        this.scale = scale;
    }

    /**
     * 设置单元格值
     *
     * @param value 单元格值
     */
    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{display=" + this.display + ", scale=" + this.scale + ", value="
                + this.value + "}";
    }
}
