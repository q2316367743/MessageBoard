package com.qsd.messageboard.service.impl;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsd.messageboard.dao.MessageDao;
import com.qsd.messageboard.enums.ResultStatus;
import com.qsd.messageboard.po.Message;
import com.qsd.messageboard.service.MessageService;

/**
 * @Description 
 * @Author Esion
 * @Data 2020年7月5日
 */
@Service
public class MessageServiceImpl implements MessageService {
	
	@Autowired
	private MessageDao messageDao;

	@Override
	public ResultStatus add(Message message, String userId) {
		message.setUserId(userId);
		message.setCreateTime(new Timestamp(System.currentTimeMillis()));
		int result = messageDao.insert(message);
		if (result > 0) {
			return ResultStatus.SUCCESS;
		}
		return ResultStatus.SYSTEM_ERROR;
	}

}
