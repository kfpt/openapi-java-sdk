package com.zhubajie.zop.openapi.request.trade;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

public class QuerySellerTradeDetailRequest extends UserAbstractRopRequest {

	@Min(1)
	@NotNull
	private Integer taskId;

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	
}
