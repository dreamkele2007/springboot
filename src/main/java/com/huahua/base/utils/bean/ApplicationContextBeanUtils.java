package com.huahua.base.utils.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author GYM
 * @date 2020/4/11 10:39
 * @Description: TODO
 */
@Component
public class ApplicationContextBeanUtils implements ApplicationContextAware{
    private static ApplicationContext applicationContext = null;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if(ApplicationContextBeanUtils.applicationContext == null){
            ApplicationContextBeanUtils.applicationContext  = applicationContext;
        }
//        System.err.println("========ApplicationContext配置成功,在普通类可以通过调用ApplicationContextBeanUtils.getAppContext()获取applicationContext对象,applicationContext="+ApplicationContextBeanUtils.applicationContext+"========");
    }
    //获取applicationContext
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
    //通过name获取 Bean.
    public static Object getBean(String name){
        return getApplicationContext().getBean(name);
    }
    //通过class获取Bean.
    public static <T> T getBean(Class<T> clazz){
        return getApplicationContext().getBean(clazz);
    }

    //通过name,以及Clazz返回指定的Bean
    public static <T> T getBean(String name,Class<T> clazz){
        return getApplicationContext().getBean(name, clazz);
    }
}
