package com.qsd.messageboard.vo;

import java.util.List;

import com.qsd.messageboard.enums.ResultStatus;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Description 
 * @Author Esion
 * @Data 2020年7月6日
 */
@ApiModel(description = "分页返回对象", parent = BaseVo.class)
public class PageVo<T> extends BaseVo {

	@ApiModelProperty(value = "当前页码", dataType = "Long", example = "1")
	private Long current;
	@ApiModelProperty(value = "数据总数", dataType = "Long", example = "1")
	private Long count;
	@ApiModelProperty(value = "数据集合")
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