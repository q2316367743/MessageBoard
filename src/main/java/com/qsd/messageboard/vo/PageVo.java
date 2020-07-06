package com.qsd.messageboard.vo;

import java.util.List;

import com.qsd.messageboard.enums.ResultStatus;

/**
 * @Description 
 * @Author Esion
 * @Data 2020年7月6日
 */

public class PageVo<T> extends BaseVo {

	private Long current;
	private Long count;
	private List<T> data;
	public PageVo() {
		super();
	}
	public PageVo(ResultStatus resultStatus) {
		super(resultStatus);
	}
	public PageVo(ResultStatus resultStatus, Long current, Long count, List<T> data) {
		super(resultStatus);
		this.current = current;
		this.count = count;
		this.data = data;
	}
	public Long getCurrent() {
		return current;
	}
	public void setCurrent(Long current) {
		this.current = current;
	}
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	
}