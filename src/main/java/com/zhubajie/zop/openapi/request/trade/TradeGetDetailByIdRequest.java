package com.zhubajie.zop.openapi.request.trade;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.rop.AbstractRopRequest;

public class TradeGetDetailByIdRequest extends AbstractRopRequest{

	//需求id
	@NotNull
	@Min(value=0)
	private Long taskId;

	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}
	
}
