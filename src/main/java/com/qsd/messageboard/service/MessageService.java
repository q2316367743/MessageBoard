package com.qsd.messageboard.service;

import com.qsd.messageboard.dto.MessageWithUser;
import com.qsd.messageboard.enums.ResultStatus;
import com.qsd.messageboard.vo.PageVo;

/**
 * @Description 留言信息业务层
 * @Author Esion
 * @Data 2020年7月5日
 */
public interface MessageService {

	/**
	 * 增加一条留言
	 * @param message 留言信息
	 * @param user_id 用户ID
	 * */
	public ResultStatus add(String title, String content, String userId);
	/**
	 * 获取全部留言
	 * @param page 页码
	 * @param limit 每页的数目
	 * */
	public PageVo<MessageWithUser> all(Integer page, Integer limit);
	
}
