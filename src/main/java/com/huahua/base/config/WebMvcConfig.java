//package com.huahua.base.config;
//
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
///**
// * @author GYM
// * @date 2020/4/19 10:12
// * @Description: TODO
// */
//public class WebMvcConfig implements WebMvcConfigurer {
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//		...
//    }
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        // 需要告知系统，这是要被当成静态文件的！
//        // 第一个方法设置访问路径的匹配方式（该方式有一大缺点，controller的路径不得为*.*的格式），第二个方法设置资源路径（file可以用以进行扩展，例如上传的图片等）
//        registry.addResourceHandler("**/*.*").addResourceLocations("classpath:/resources/", "classpath:/static/",
//                "classpath:/public/", "file:./static-extend/");
//    }
//}
