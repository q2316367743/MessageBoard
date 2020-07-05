package com.qsd.messageboard.enums;
/**
 * @Description 
 * @Author Esion
 * @Data 2020年6月21日
 */

public enum ResultStatus {
	
	SUCCESS("00000", "成功"),
	REGISTER_ERROR("A0100", "用户注册错误"),
	USERNAME_OR_PASSWORD_MISS("A0200", "用户名或密码缺失"),
	USERNAME_OR_PASSWORD_ERROR("A0210", "用户名或密码错误"),
	REQUEST_PARAM_MISS("A0410", "请求必填参数为空"),
	RESULT_NULL("A0412", "结果为空"),
	REQUEST_REPETITION("A0506", "重复提交"),
	SYSTEM_ERROR("B0001", "系统执行错误");

	private String code;
	private String message;
	ResultStatus(String code, String message){
		this.code = code;
		this.message = message;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
