package com.zhubajie.zop.openapi.request.trade;

import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

public class GetRefundListRequest extends UserAbstractRopRequest {
	
	private Integer taskId; //任务号
	
	private Integer state; //退款状态， 1：待确认退款 2：退款成功 3：退款关闭 4：已拒绝 5:已撤销 6:退款处理中
	
	private Integer page;

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}
	
}
