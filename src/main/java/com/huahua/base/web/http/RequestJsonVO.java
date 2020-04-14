package com.huahua.base.web.http;


/**
 * 请求参数包装VO
 *
 * busiParamJson是正常业务交互数据，action中通过read方法只能读取到此数据
 * sysParamJson是平台参数交互数据，为SPR等功能提供参数
 * @author GYM
 * @date 2020/4/1
 * @Description: redis配置
 */
public class RequestJsonVO {

  /**
   * 业务组参数
   */
  private String busiParamJson;

  /**
   * 系统参数
   */
  private RequestSysJsonVO sysParamJson;

  /**
   * 获取业务参数
   * 
   * @return 业务参数
   */
  public String getBusiParamJson() {
    return this.busiParamJson;
  }

  /**
   * 获取系统参数
   * 
   * @return 系统参数
   */
  public RequestSysJsonVO getSysParamJson() {
    return this.sysParamJson;
  }

  /**
   * 设置业务参数
   * 
   * @param busiParamJson
   */
  public void setBusiParamJson(String busiParamJson) {
    this.busiParamJson = busiParamJson;
  }

  /**
   * 设置系统参数
   * 
   * @param sysParamJson
   */
  public void setSysParamJson(RequestSysJsonVO sysParamJson) {
    this.sysParamJson = sysParamJson;
  }

}
