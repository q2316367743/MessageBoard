package com.qsd.messageboard.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description Swagger配置
 * @Author Esion
 * @Data 2020年7月6日
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket docket() {
		Docket docket = new Docket(DocumentationType.SWAGGER_2);
		ApiInfo apiInfo = new ApiInfo(
				"留言板", 
				"java程序员进阶之路", 
				"1.5", 
				"https://github.com", 
				new Contact("乔盛达", "https://github.com/q2316367743", "m17762618644@163.com"), 
				"Apache License, Version 2.0", 
				"https://www.apache.org/licenses/LICENSE-2.0.html", 
				new ArrayList<>()
		);
		docket.apiInfo(apiInfo);
		docket.select()
			  .apis(RequestHandlerSelectors.basePackage("com.qsd.messageboard"))
			  .build();
		docket.groupName("Esion");
		return docket;
	}

}
