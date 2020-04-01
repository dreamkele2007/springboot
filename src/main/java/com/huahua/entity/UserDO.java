package com.huahua.entity;

import javax.persistence.*;

/**
 * Created by GM on 2017/9/11.
 */
public class UserDO {
    private Integer id;

    private String username;

    private String password;

    private String email;

    private String mobile;

    private String enablestate;

    private Integer creator;

    private Long creationtime;

    private Integer modifier;

    private Long modifiedtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEnablestate() {
        return enablestate;
    }

    public void setEnablestate(String enablestate) {
        this.enablestate = enablestate;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Long getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Long creationtime) {
        this.creationtime = creationtime;
    }

    public Integer getModifier() {
        return modifier;
    }

    public void setModifier(Integer modifier) {
        this.modifier = modifier;
    }

    public Long getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(Long modifiedtime) {
        this.modifiedtime = modifiedtime;
    }
}
