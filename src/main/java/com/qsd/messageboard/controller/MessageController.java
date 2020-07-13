package com.qsd.messageboard.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qsd.messageboard.dto.MessageWithUser;
import com.qsd.messageboard.enums.ResultStatus;
import com.qsd.messageboard.po.User;
import com.qsd.messageboard.service.MessageService;
import com.qsd.messageboard.vo.BaseVo;
import com.qsd.messageboard.vo.PageVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * @Description 
 * @Author Esion
 * @Data 2020年7月5日
 */
@RestController
@RequestMapping("message")
@Api(value = "留言操作类")
public class MessageController {
	
	@Autowired
	private MessageService messageService;
	
	@ApiOperation(value = "新增留言")
	@PostMapping("add")
	public BaseVo add(
			@ApiParam(value = "留言标题", required = true) String title,
			@ApiParam(value = "留言内容", required = true)String content, 
			HttpServletRequest request) {
		if (title == null || content == null) {
			return new BaseVo(ResultStatus.REQUEST_PARAM_MISS);
		}
		User user = (User) request.getSession().getAttribute("user");
		return new BaseVo(messageService.add(title, content, user.getId()));
	}
	
	@GetMapping("all")
	@ApiOperation(value = "查询全部留言")
	public PageVo<MessageWithUser> all(
			@ApiParam(value = "页码", required = false, example = "1")Integer page, 
			@ApiParam(value = "每页的数目", required = false, example = "9")Integer limit){
		return messageService.all(page, limit);
	}
	
}
