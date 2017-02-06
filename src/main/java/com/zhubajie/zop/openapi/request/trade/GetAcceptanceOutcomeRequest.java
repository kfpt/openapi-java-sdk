package com.zhubajie.zop.openapi.request.trade;

import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

public class GetAcceptanceOutcomeRequest extends UserAbstractRopRequest {
	//任务id
	private Integer taskId;

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
}
