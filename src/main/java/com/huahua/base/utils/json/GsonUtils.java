package com.huahua.base.utils.json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.*;

/**
 * @author GYM
 * @date 2020/4/11 10:39
 * @Description: Gson转换工具类
 */
public class GsonUtils {
    private final static Gson gson = new Gson();
    public static <T> T getJSON(String jsonString, Type type) {
        T t = null;
        try {
            t = gson.fromJson(jsonString, type);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

    public static <T> List<T> getJsonList(String jsonString, Type type) {
        List<T> list = new ArrayList<T>();
        try {
            list = gson.fromJson(jsonString, type);
        } catch (Exception e) {
        }
        return list;
    }

    public static List<Map<String, Object>> listKeyMaps(String jsonString) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        try {
            list = gson.fromJson(jsonString, new TypeToken<List<Map<String, Object>>>() {
            }.getType());
        } catch (Exception e) {
        }
        return list;
    }

    public static <T> String toJSON(T t) {
//		Gson gson = new Gson();
        return gson.toJson(t);
    }

    public static String getWeekOfDate(Date dt) {
//		 Date date=new Date();
//		 SimpleDateFormat dateFm = new SimpleDateFormat("EEEE");
//		 dateFm.format(date);

//        string[] weekDays = {"周日", "周一", "周二", "周三", "周四", "周五", "周六"};
        String[] weekDays = {"7", "1", "2", "3", "4", "5", "6"};
        Calendar cal = Calendar.getInstance();
        cal.setTime(dt);
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0)
            w = 0;
        return weekDays[w];
    }
}
