package com.qsd.messageboard.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qsd.messageboard.enums.ResultStatus;
import com.qsd.messageboard.po.User;
import com.qsd.messageboard.service.UserService;
import com.qsd.messageboard.vo.BaseVo;
import com.qsd.messageboard.vo.DataVo;

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

	@ApiOperation(value = "用户登录")
	@PostMapping("login")
	public DataVo<String> login(
			@ApiParam(value = "用户ID", required = true) String id, 
			@ApiParam(value = "用户密码", required = true) String password, HttpServletRequest request) {
		if (id == null || password == null) {
			return new DataVo<>(ResultStatus.REQUEST_PARAM_MISS, null);
		}
		User user = userService.login(id, password);
		if (user != null) {
			request.getSession().setAttribute("user", user);
			return new DataVo<>(ResultStatus.SUCCESS, user.getNickname());
		}
		return new DataVo<>(ResultStatus.USERNAME_OR_PASSWORD_ERROR, null);
	}
	
	@GetMapping("exit")
	@ApiOperation(value = "用户退出")
	public BaseVo exit(HttpServletRequest request) {
		request.getSession().removeAttribute("user");
		return new BaseVo(ResultStatus.SUCCESS);
	}

}
