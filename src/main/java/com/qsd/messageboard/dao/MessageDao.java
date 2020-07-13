package com.qsd.messageboard.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qsd.messageboard.dto.MessageWithUser;
import com.qsd.messageboard.po.Message;

/**
 * @Description 
 * @Author Esion
 * @Data 2020年7月5日
 */

public interface MessageDao extends BaseMapper<Message> {
	
	public IPage<MessageWithUser> queryMessages(Page<MessageWithUser> page);

}
