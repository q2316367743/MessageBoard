package com.qsd.messageboard.service;

import com.qsd.messageboard.enums.ResultStatus;
import com.qsd.messageboard.po.Message;

/**
 * @Description 
 * @Author Esion
 * @Data 2020年7月5日
 */

public interface MessageService {

	/**
	 * 增加一条留言
	 * @param message 留言信息
	 * @param user_id 用户ID
	 * */
	public ResultStatus add(Message message, String userId);
	
}
