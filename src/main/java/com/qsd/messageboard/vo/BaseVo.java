package com.qsd.messageboard.vo;

import com.qsd.messageboard.enums.ResultStatus;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Description 
 * @Author Esion
 * @Data 2020年7月5日
 */
@ApiModel(description = "基础返回对象")
public class BaseVo {
	
	@ApiModelProperty(value = "结果码", dataType = "String")
	private String code;
	@ApiModelProperty(value = "结果信息", dataType = "String")
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
