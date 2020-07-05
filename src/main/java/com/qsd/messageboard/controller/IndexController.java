package com.qsd.messageboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description 
 * @Author Esion
 * @Data 2020年7月5日
 */
@Controller
public class IndexController {
	
	@RequestMapping("")
	public String welcome() {
		return "index";
	}

	@RequestMapping("index")
	public String index() {
		return "index";
	}
	
}
