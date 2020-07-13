package com.qsd.messageboard.dto;

import com.qsd.messageboard.po.Message;
import com.qsd.messageboard.po.User;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Description 
 * @Author Esion
 * @Data 2020年7月13日
 */
@ApiModel(description = "留言和用户信息", parent = Message.class)
public class MessageWithUser extends Message {

	private static final long serialVersionUID = 4115754826968631262L;
	@ApiModelProperty(value = "用户信息")
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
