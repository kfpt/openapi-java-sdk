package com.zhubajie.zop.openapi.request.trade;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

public class AgreementRequest extends UserAbstractRopRequest{

	//合同ID
	@NotNull
	@Min(value=0)
	private Integer agreeId;
	//任务ID
	@NotNull
	@Min(value=0)
	private Integer taskId;
	//稿件ID
	@NotNull
	@Min(value=0)
	private Integer worksId;
	//ip
	@Pattern(regexp = "\\b((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\b")
	private String ip;
	
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
	public Integer getAgreeId() {
		return agreeId;
	}
	public void setAgreeId(Integer agreeId) {
		this.agreeId = agreeId;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	
}
