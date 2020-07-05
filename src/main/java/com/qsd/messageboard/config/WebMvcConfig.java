package com.qsd.messageboard.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

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

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		List<String> patterns = new ArrayList<>();
		patterns.add("/bg.jpg");
		patterns.add("/user/login");
		patterns.add("/login.html");
		registry.addInterceptor(loginInterceptor)
				.addPathPatterns("/**")
				.excludePathPatterns(patterns);
	}

	
	
}
