package com.zhubajie.zop.openapi.request.trade;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

public class QueryBuyerEvaluationRequest extends UserAbstractRopRequest{
	/**
	 * 需求ID
	 */
	@NotNull
	@Min(1)
	private Integer taskId;

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	
}