package com.qsd.messageboard.service.impl;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qsd.messageboard.dao.MessageDao;
import com.qsd.messageboard.enums.ResultStatus;
import com.qsd.messageboard.po.Message;
import com.qsd.messageboard.service.MessageService;
import com.qsd.messageboard.vo.PageVo;

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

	@Override
	public PageVo<Message> all(Integer page, Integer limit) {
		IPage<Message> messages = messageDao.queryMessages(new Page<>(page, limit));
		return new PageVo<>(ResultStatus.SUCCESS, messages.getCurrent(), messages.getTotal(), messages.getRecords());
	}

}
