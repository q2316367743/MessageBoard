package com.qsd.messageboard.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qsd.messageboard.enums.ResultStatus;
import com.qsd.messageboard.service.MessageService;
import com.qsd.messageboard.vo.BaseVo;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * @Description 
 * @Author Esion
 * @Data 2020年7月8日
 */
@RestController
@RequestMapping("admin/message")
public class AdminMessageController {
	
	@Autowired
	private MessageService messageService;

	@PostMapping("allow")
	@ApiOperation(value = "批准留言")
	public BaseVo allow(
			@ApiParam(value = "留言ID", required = true) Integer id
			) {
		if(id == null) {
			return new BaseVo(ResultStatus.REQUEST_PARAM_MISS);
		}
		return new BaseVo(messageService.allow(id));
	}
	
}
