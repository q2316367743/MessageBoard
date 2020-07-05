package com.qsd.messageboard.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qsd.messageboard.enums.ResultStatus;
import com.qsd.messageboard.po.User;
import com.qsd.messageboard.service.UserService;
import com.qsd.messageboard.vo.BaseVo;

/**
 * @Description 
 * @Author Esion
 * @Data 2020年7月5日
 */
@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@PostMapping("login")
	public BaseVo login(String id, String password, HttpServletRequest request) {
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
