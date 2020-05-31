package com.huahua.base.web.http;

import javax.servlet.http.Cookie;
import java.util.Map;

/**
 *
 *
 * @author GYM
 * @date 2020/4/1
 * @Description: 请求定义
 */
public interface IRequest {

  /**
   * 获取活动路径
   *
   * @return 活动路径
   */
  String getAction();

  /**
   * 获取客户端ip
   *
   * @return 用户ip
   */
  String getClientIp();

  /**
   * 获取cookie
   *
   * @return cookie数组
   */
  Cookie[] getCookies();

  /**
   * 获取功能节点号
   *
   * @return 功能节点号
   */
  String getFunCode();

  /**
   * 获取头信息
   *
   * @param paramString
   * @return
   */
  String getHead(String paramString);

  /**
   * 获取json
   *
   * @return json字符串
   *
   */
  String getJson();



  /**
   * 获取会话id
   *
   * @return 会话id
   */
  String getSessionId();

  /**
   * 读取json文本内容
   *
   * @return json文本内容
   */
  String read();

  /**
   * 读取上传web文件
   *
   * @return 上传web文件
   */
//  WebFile[] readFiles();

  /**
   * 读取表单参数
   *
   * @return 表单参数
   */
  Map<String, String[]> readParameters();

  /**
   * 读取平台参数
   *
   * @return 平台参数实体
   */
  RequestSysVO readSysParam();

  /**
   * 设置json实体
   *
   * @return
   */
  void setJson(String json);



}