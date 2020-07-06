package com.qsd.messageboard.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Description 
 * @Author Esion
 * @Data 2020年7月5日
 */
@TableName("user")
@ApiModel(description = "用户信息")
public class User {

	@TableId(type = IdType.NONE)
	@ApiModelProperty(value = "用户ID")
	private String id;
	@ApiModelProperty(hidden = true)
	private String password;
	@ApiModelProperty(value = "用户昵称")
	private String nickname;
	@ApiModelProperty(value = "用户性别")
	private Integer gender;
	@ApiModelProperty(value = "用户年龄")
	private Integer age;
	@ApiModelProperty(value = "用户QQ")
	private String qq;
	@ApiModelProperty(value = "用户电子邮箱")
	private String email;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
