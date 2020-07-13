package com.qsd.messageboard.po;

import java.io.Serializable;
import java.sql.Timestamp;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Description 
 * @Author Esion
 * @Data 2020年7月5日
 */
@TableName("message")
@ApiModel(description = "留言信息")
public class Message implements Serializable {
	
	private static final long serialVersionUID = -37495510309824867L;
	@TableId(type = IdType.AUTO)
	@ApiModelProperty(value = "留言ID", required = false, example = "1")
	private Integer id;
	@TableField("user_id")
	@ApiModelProperty(value = "留言的用户ID")
	private String userId;
	@ApiModelProperty(value = "留言的标题")
	private String title;
	@TableField("create_time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
	@ApiModelProperty(value = "留言的创建时间")
	private Timestamp createTime;
	@ApiModelProperty(value = "留言的内容")
	private String content;
	public Message() {
	}
	public Message(String userId, String title, Timestamp createTime, String content) {
		this.userId = userId;
		this.title = title;
		this.createTime = createTime;
		this.content = content;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
