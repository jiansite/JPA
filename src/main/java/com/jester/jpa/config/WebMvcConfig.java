package com.jester.jpa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author Jester
 * @email shujian.jiansite@gmail.com
 * @date 2019-06-23 14:16
 * @version version 1.0.0
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/html/index.html");
        registry.addViewController("/index").setViewName("forward:/html/index.html");
        registry.addViewController("/index.html").setViewName("forward:/html/index.html");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        super.addViewControllers(registry);
    }

    /**
     * 配置静态资源,避免静态资源请求被拦截
     *
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/article/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/templates/**").addResourceLocations("classpath:/templates/");
        super.addResourceHandlers(registry);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {super.addInterceptors(registry); }
}
