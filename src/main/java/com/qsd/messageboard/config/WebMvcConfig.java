package com.qsd.messageboard.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.qsd.messageboard.interceptor.AdminInterceptor;
import com.qsd.messageboard.interceptor.LoginInterceptor;

/**
 * @Description 
 * @Author Esion
 * @Data 2020年7月5日
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
	
	@Autowired
	private LoginInterceptor loginInterceptor;
	@Autowired
	private AdminInterceptor adminInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		List<String> addPathPatterns = new ArrayList<>();
		addPathPatterns.add("/message/add");
		addPathPatterns.add("/user/**");
		List<String> excludePathPatterns = new ArrayList<>();
		registry.addInterceptor(loginInterceptor)
				.addPathPatterns(addPathPatterns)
				.excludePathPatterns(excludePathPatterns);
		registry.addInterceptor(adminInterceptor)
				.addPathPatterns("/admin/**")
				.excludePathPatterns("/admin/login", "/admin/login.html");
	}

	
	
}
