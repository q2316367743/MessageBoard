package com.qsd.messageboard.vo;

import com.qsd.messageboard.enums.ResultStatus;

/**
 * @Description 
 * @Author Esion
 * @Data 2020年7月6日
 */

public class DataVo<T> extends BaseVo {

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
