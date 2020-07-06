package com.qsd.messageboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qsd.messageboard.service.MessageService;

/**
 * @Description 
 * @Author Esion
 * @Data 2020年7月5日
 */
@Controller
public class IndexController {
	
	@Autowired
	private MessageService messageService;
	
	@RequestMapping("")
	public String welcome(Model model) {
		model.addAttribute("messages", messageService.all());
		return "index";
	}

	@RequestMapping("index")
	public String index(Model model) {
		model.addAttribute("messages", messageService.all());
		return "index";
	}
	
}
