package com.qsd.messageboard.po;

import java.sql.Timestamp;

import com.baomidou.mybatisplus.annotation.TableName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Description 
 * @Author Esion
 * @Data 2020年7月13日
 */
@TableName(value = "comment")
@ApiModel(description = "留言评论表")
public class Comment {

	@ApiModelProperty(value = "评论的ID")
	private Integer id;
	@ApiModelProperty(value = "留言的ID")
	private Integer messageId;
	@ApiModelProperty(value = "评论用户的ID")
	private Integer userId;
	@ApiModelProperty(value = "评论的时间")
	private Timestamp createTime;
	@ApiModelProperty(value = "评论的内容")
	private String content;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMessageId() {
		return messageId;
	}
	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
