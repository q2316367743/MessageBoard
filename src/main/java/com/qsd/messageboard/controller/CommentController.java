package com.qsd.messageboard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qsd.messageboard.po.Message;
import com.qsd.messageboard.vo.DataVo;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * @Description 
 * @Author Esion
 * @Data 2020年7月13日
 */
@RestController
@RequestMapping("comment")
public class CommentController {

	@GetMapping("info")
	@ApiOperation(value = "查看留言详情")
	public DataVo<Message> info(
			@ApiParam(value = "留言的ID", required = true, example = "1")Integer id){
		return null;
	}
	
}
