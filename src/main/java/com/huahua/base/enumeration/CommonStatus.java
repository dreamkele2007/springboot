package com.huahua.base.enumeration;

/**
 * @author GYM
 * @date 2020/5/6 13:39
 * @Description: 通用状态枚举
 */
public enum CommonStatus {
    disable("0","停用"),
    enable("1","启用");

    private String name;
    private String value;
    private CommonStatus(String value,String name){
        this.value = value;
        this.name = name;
    }
    public String getValue(){
        return this.value;
    }
    public String getName(){
        return this.name;
    }
}
