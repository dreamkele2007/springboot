package com.huahua.domain.system;

import java.io.Serializable;

public class SmSite implements Serializable {

    private Integer id;

    private String siteName;

    private String siteCode;

    private String siteIp;

    private String creator;

    private String createTime;

    private String modifier;

    private String modifyTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName == null ? null : siteName.trim();
    }

    public String getSiteCode() {
        return siteCode;
    }

    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode == null ? null : siteCode.trim();
    }

    public String getSiteIp() {
        return siteIp;
    }

    public void setSiteIp(String siteIp) {
        this.siteIp = siteIp == null ? null : siteIp.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
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
        .append(", siteName=").append(siteName)
        .append(", siteCode=").append(siteCode)
        .append(", siteIp=").append(siteIp)
        .append(", creator=").append(creator)
        .append(", createTime=").append(createTime)
        .append(", modifier=").append(modifier)
        .append(", modifyTime=").append(modifyTime)
        .append(", serialVersionUID=").append(serialVersionUID)
        .append("]");
        return sb.toString();
    }
}