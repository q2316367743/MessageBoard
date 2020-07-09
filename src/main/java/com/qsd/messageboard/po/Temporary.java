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
 * @Description 临时存储留言
 * @Author Esion
 * @Data 2020年7月8日
 */
@TableName("temporary")
@ApiModel(value = "temporary", description = "临时存储留言")
public class Temporary implements Serializable {

	private static final long serialVersionUID = 6053527941052603932L;
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
	public Temporary() {
	}
	public Temporary(String userId, String title, Timestamp createTime, String content) {
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
	public Message toMessage() {
		return new Message(this.userId, this.title, this.createTime, this.content);
	}

}
