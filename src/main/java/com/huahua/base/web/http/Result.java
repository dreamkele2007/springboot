package com.huahua.base.web.http;

import java.io.Serializable;
import java.util.HashMap;

import org.springframework.http.HttpStatus;

/**
 * @author GYM
 * @date 2020/4/1
 * @Description: 请求返回结果
 */
public class Result<T> implements Serializable {
    /**
     * 返回是否成功标识
     */
    private Boolean success;
    /**
     * 返回编码
     */
    private int  code = 200;
    /**
     * 提示信息
     */
    private String message = "操作成功";
    /**
     * 返回数据
     */
    private T data;


    public Result(boolean success) {
        this.success = success;
    }

    /**
     * 构造方法
     */
    public Result(T data) {
        this.code = HttpStatus.OK.value();
        this.message = "操作成功";
        this.data = data;
    }

    public Result(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

	public Result() {
		super();
	}

	public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
