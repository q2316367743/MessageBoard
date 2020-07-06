package com.qsd.messageboard.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qsd.messageboard.po.Message;
import com.qsd.messageboard.po.User;
import com.qsd.messageboard.service.MessageService;
import com.qsd.messageboard.vo.BaseVo;
import com.qsd.messageboard.vo.PageVo;

/**
 * @Description 
 * @Author Esion
 * @Data 2020年7月5日
 */
@RestController
@RequestMapping("message")
public class MessageController {
	
	@Autowired
	private MessageService messageService;
	
	@PostMapping("add")
	public BaseVo add(Message message, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		return new BaseVo(messageService.add(message, user.getId()));
	}
	
	@GetMapping("all")
	public PageVo<Message> all(Integer page, Integer limit){
		return messageService.all(page, limit);
	}

}
