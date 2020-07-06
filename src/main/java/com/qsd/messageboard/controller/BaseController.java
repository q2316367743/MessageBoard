package com.qsd.messageboard.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qsd.messageboard.enums.ResultStatus;
import com.qsd.messageboard.po.User;
import com.qsd.messageboard.service.UserService;
import com.qsd.messageboard.vo.BaseVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * @Description 
 * @Author Esion
 * @Data 2020年7月6日
 */
@Api(value = "基础控制器")
@RestController
public class BaseController {
	
	@Autowired
	private UserService userService;

	@ApiOperation(value = "登录")
	@PostMapping("login")
	public BaseVo login(
			@ApiParam(value = "用户ID", required = true)String id, 
			@ApiParam(value = "用户密码", required = true)String password, HttpServletRequest request) {
		if (id == null || password == null) {
			return new BaseVo(ResultStatus.REQUEST_PARAM_MISS);
		}
		User user = userService.login(id, password);
		if (user != null) {
			request.getSession().setAttribute("user", user);
			return new BaseVo(ResultStatus.SUCCESS);
		}
		return new BaseVo(ResultStatus.USERNAME_OR_PASSWORD_ERROR);
	}

}
