package com.zhubajie.zop.openapi.request.trade;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

public class QueryAgreeRequest extends UserAbstractRopRequest {

	//任务ID
	@NotNull
	@Min(value=0)
	private Integer taskId;
	//稿件ID
	@NotNull
	@Min(value=0)
	private Integer worksId;
	
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public Integer getWorksId() {
		return worksId;
	}
	public void setWorksId(Integer worksId) {
		this.worksId = worksId;
	}
	
}
