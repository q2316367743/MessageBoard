package com.qsd.messageboard.vo;

import com.qsd.messageboard.enums.ResultStatus;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Description 
 * @Author Esion
 * @Data 2020年7月6日
 */
@ApiModel(description = "带数据的返回对象", parent = BaseVo.class)
public class DataVo<T> extends BaseVo {

	@ApiModelProperty(value = "数据")
	private T data;

	public DataVo() {
		super();
	}

	public DataVo(ResultStatus resultStatus) {
		super(resultStatus);
	}

	public DataVo(ResultStatus resultStatus, T data) {
		super(resultStatus);
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}
