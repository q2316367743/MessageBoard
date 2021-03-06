package com.qsd.messageboard.service;

import com.qsd.messageboard.po.User;

/**
 * @Description 
 * @Author Esion
 * @Data 2020年7月5日
 */

public interface UserService {

	/**
	 * 登录
	 * @param id 用户ID
	 * @param password 用户密码
	 * @return 用户全部信息
	 * */
	User login(String id, String password);
	/**
	 * 注册
	 * @param user 用户信息
	 * @return 注册结果
	 * */
	int register(User user);
	
}
