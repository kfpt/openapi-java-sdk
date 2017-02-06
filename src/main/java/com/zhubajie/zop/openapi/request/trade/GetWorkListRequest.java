package com.zhubajie.zop.openapi.request.trade;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

public class GetWorkListRequest extends UserAbstractRopRequest {

	@NotNull
	@Min(1)
	private Integer pageNo; // 页码

	@NotNull
	@Min(1)
	@Max(100)
	private Integer pageSize; // 每页大小
	
	@NotNull
	@Min(1)
	private Integer taskId; // 需求id

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	
}
