package com.huahua.domain.system;


/**
 * Created by GM on 2017/9/11.
 */
public class UserDO {
    private Integer id;

    private String userName;

    private String password;

    private String email;

    private String mobile;

    private String creator;

    private String createTime;

    private String modifier;

    private String modifyTime;

    private String ts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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


    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getcreateTime() {
        return createTime;
    }

    public void setcreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getmodifyTime() {
        return modifyTime;
    }

    public void setmodifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }
}
