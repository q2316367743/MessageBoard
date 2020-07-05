package com.qsd.messageboard.vo;

import com.qsd.messageboard.enums.ResultStatus;

/**
 * @Description 
 * @Author Esion
 * @Data 2020年7月5日
 */

public class BaseVo {
	
	private String code;
	private String message;
	public BaseVo() {
	}
	public BaseVo(ResultStatus resultStatus) {
		this.code = resultStatus.getCode();
		this.message = resultStatus.getMessage();
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
