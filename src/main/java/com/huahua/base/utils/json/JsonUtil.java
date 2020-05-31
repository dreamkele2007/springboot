package com.huahua.base.utils.json;

import com.alibaba.fastjson.JSON;



/**
 * @author GYM
 * @date 2020/4/7 17:21
 * @Description: fastjson 转换工具类
 */
public class JsonUtil {

	/**
	 * Object对象转换为JSON格式
	 * 
	 * 例如List对象、JavaBean对象、JavaBean对象数组、Map对象、List Map对象
	 * 
	 * @param object
	 *            传入的Object对象
	 * @return object的JSON格式字符串
	 */
	public static String toJson(Object object) {
		return JSON.toJSONString(object);

	}

	/**
	 * JSON转换为Object对象
	 * 
	 * @param jsonString
	 *            JSON字符串
	 * @param c
	 *            要转换成的类的类型
	 * @return Object对象
	 */
	public static <T> T jsonToObject(String jsonString, Class<T> clazz) {
		if (jsonString == null || "".equals(jsonString)) {
			return null;
		} else {
			return  JSON.parseObject(jsonString, clazz);
		}
	}

}
