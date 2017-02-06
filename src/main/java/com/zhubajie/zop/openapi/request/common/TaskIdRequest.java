package com.zhubajie.zop.openapi.request.common;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.rop.AbstractRopRequest;

/**
 * Title: TaskIdRequest 
 * Description: 请求参数只有任务号时可以使用此类
 * Date: 2016年11月28日 下午3:11:37
 * @author malibin 
 */
public class TaskIdRequest extends AbstractRopRequest {
	@NotNull
	@Min(1)
	private Long taskId;

	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

}
