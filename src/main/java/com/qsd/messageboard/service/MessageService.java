package com.qsd.messageboard.service;

import com.qsd.messageboard.enums.ResultStatus;
import com.qsd.messageboard.po.Message;
import com.qsd.messageboard.vo.PageVo;

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
	/**
	 * 获取全部留言
	 * */
	public PageVo<Message> all(Integer page, Integer limit);
	
}
