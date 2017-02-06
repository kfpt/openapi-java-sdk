package com.zhubajie.zop.openapi.response.other;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

public class RegisterPartTimeJobResponse  extends AbstractSuccessResponse {

	private Object data; // 返回数据内容
	private String message; // 返回消息提示
	private boolean status; // 返回状态
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
