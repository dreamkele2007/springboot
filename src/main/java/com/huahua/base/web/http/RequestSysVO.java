package com.huahua.base.web.http;

/**
 * 平台参数交互json包装VO
 *
 * @author GYM
 * @date 2020/4/1
 * @Description: redis配置
 */
public class RequestSysVO {

	/**
	 * 应用编码
	 */
	private String appcode;

	/**
	 * 业务动作
	 */
	private String busiaction;

	/**
	 * 验证双提交cookies
	 */
	private String pagecs;

	/**
	 * 时间戳
	 */
	private long ts;

	/**
	 * 获取应用编码
	 * 
	 * @return 应用编码
	 */
	public String getAppcode() {
		return this.appcode;
	}

	/**
	 * 获取业务动作
	 * 
	 * @return 业务动作
	 */
	public String getBusiaction() {
		return this.busiaction;
	}


	public String getPagecs() {
		return this.pagecs;
	}


  /**
	 * 获取时间戳
	 * 
	 * @return 时间戳
	 */
	public long getTs() {
		return this.ts;
	}

	/**
	 * 设置应用编码
	 * 
	 * @param appcode
	 */
	public void setAppcode(String appcode) {
		this.appcode = appcode;
	}

	/**
	 * 设置业务动作
	 * 
	 * @param busiaction
	 */
	public void setBusiaction(String busiaction) {
		this.busiaction = busiaction;
	}

	public void setPagecs(String pagecs) {
		this.pagecs = pagecs;
	}

	/**
	 * 设置时间戳
	 * 
	 * @param ts
	 */
	public void setTs(long ts) {
		this.ts = ts;
	}

}
