package com.qsd.messageboard.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qsd.messageboard.dao.UserDao;
import com.qsd.messageboard.po.User;
import com.qsd.messageboard.service.UserService;

/**
 * @Description 
 * @Author Esion
 * @Data 2020年7月5日
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public User login(String id, String password) {
		User user = userDao.selectOne(new QueryWrapper<User>().eq("id", id).eq("password", password));
		return user;
	}

	@Override
	public int register(User user) {
		int insert = userDao.insert(user);
		return insert;
	}

}
