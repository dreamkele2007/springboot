package com.huahua.domain.system;

import java.io.Serializable;

public class SmRoleMenu implements Serializable {

    private Integer id;

    private Integer menuId;

    private Integer roleId;

    private Integer creator;

    private String createTime;

    private Integer modify;

    private String modifyTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public Integer getModify() {
        return modify;
    }

    public void setModify(Integer modify) {
        this.modify = modify;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime == null ? null : modifyTime.trim();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName())
        .append(" [")
        .append("Hash = ").append(hashCode())
        .append(", id=").append(id)
        .append(", menuId=").append(menuId)
        .append(", roleId=").append(roleId)
        .append(", creator=").append(creator)
        .append(", createTime=").append(createTime)
        .append(", modify=").append(modify)
        .append(", modifyTime=").append(modifyTime)
        .append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}