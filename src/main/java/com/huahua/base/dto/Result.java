package com.huahua.base.dto;

import java.util.HashMap;

import org.springframework.http.HttpStatus;

/**
 * @author GYM
 * @date 2020/4/1
 * @Description: 请求返回结果
 */
public class Result {
    /**
     * 返回值
     */
    private int  code = 200;
    /**
     * 提示信息
     */
    private String message = "操作成功";
    /**
     * 返回数据
     */
    private Object data = new HashMap<String,Object>();

    /**
     * 构造方法
     */
    public Result(Object data) {
        this.code = HttpStatus.OK.value();
        this.message = "操作成功";
        this.data = data;
    }

    public Result(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

	public Result() {
		super();
	}

	public int getcode() {
        return code;
    }

    public void setcode(int code) {
        this.code = code;
    }

    public String getmessage() {
        return message;
    }

    public void setmessage(String message) {
        this.message = message;
    }

    public Object getdata() {
        return data;
    }

    public void setdata(Object data) {
        this.data = data;
    }
}
