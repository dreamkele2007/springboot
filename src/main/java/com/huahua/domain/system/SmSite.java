package com.huahua.domain.system;

import java.io.Serializable;

public class SmSite implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sm_site.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sm_site.site_name
     *
     * @mbggenerated
     */
    private String siteName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sm_site.site_code
     *
     * @mbggenerated
     */
    private String siteCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sm_site.site_ip
     *
     * @mbggenerated
     */
    private String siteIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sm_site.creator
     *
     * @mbggenerated
     */
    private String creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sm_site.create_time
     *
     * @mbggenerated
     */
    private String createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sm_site.modifier
     *
     * @mbggenerated
     */
    private String modifier;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sm_site.modify_time
     *
     * @mbggenerated
     */
    private String modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sm_site
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sm_site.id
     *
     * @return the value of sm_site.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sm_site.id
     *
     * @param id the value for sm_site.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sm_site.site_name
     *
     * @return the value of sm_site.site_name
     *
     * @mbggenerated
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sm_site.site_name
     *
     * @param siteName the value for sm_site.site_name
     *
     * @mbggenerated
     */
    public void setSiteName(String siteName) {
        this.siteName = siteName == null ? null : siteName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sm_site.site_code
     *
     * @return the value of sm_site.site_code
     *
     * @mbggenerated
     */
    public String getSiteCode() {
        return siteCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sm_site.site_code
     *
     * @param siteCode the value for sm_site.site_code
     *
     * @mbggenerated
     */
    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode == null ? null : siteCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sm_site.site_ip
     *
     * @return the value of sm_site.site_ip
     *
     * @mbggenerated
     */
    public String getSiteIp() {
        return siteIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sm_site.site_ip
     *
     * @param siteIp the value for sm_site.site_ip
     *
     * @mbggenerated
     */
    public void setSiteIp(String siteIp) {
        this.siteIp = siteIp == null ? null : siteIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sm_site.creator
     *
     * @return the value of sm_site.creator
     *
     * @mbggenerated
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sm_site.creator
     *
     * @param creator the value for sm_site.creator
     *
     * @mbggenerated
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sm_site.create_time
     *
     * @return the value of sm_site.create_time
     *
     * @mbggenerated
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sm_site.create_time
     *
     * @param createTime the value for sm_site.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sm_site.modifier
     *
     * @return the value of sm_site.modifier
     *
     * @mbggenerated
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sm_site.modifier
     *
     * @param modifier the value for sm_site.modifier
     *
     * @mbggenerated
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sm_site.modify_time
     *
     * @return the value of sm_site.modify_time
     *
     * @mbggenerated
     */
    public String getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sm_site.modify_time
     *
     * @param modifyTime the value for sm_site.modify_time
     *
     * @mbggenerated
     */
    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime == null ? null : modifyTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sm_site
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", siteName=").append(siteName);
        sb.append(", siteCode=").append(siteCode);
        sb.append(", siteIp=").append(siteIp);
        sb.append(", creator=").append(creator);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifier=").append(modifier);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}