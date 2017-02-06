package com.zhubajie.zop.openapi.request.trade;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

public class CancelEditAmountRopRequest extends UserAbstractRopRequest {

    @NotNull
    private Integer taskId;	// 需求Id 必填

    @NotBlank
    private String reason;	// 理由 拒绝时必填

    @Pattern(regexp = "\\b((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\b")
    private String sourceIp;	// 操作的IP 选填 
    
    @NotNull
    @Min(11)
    @Max(12)
    private Integer taskMode;  // 任务模式

	/**
     * 获取需求Id
     */
	public Integer getTaskId() {
		return taskId;
	}
	/**
     * 设置需求Id
     */
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}


	/**
     * 获取理由
     */
	public String getReason() {
		return reason;
	}

	/**
     * 设置理由
     */
	public void setReason(String reason) {
		this.reason = reason;
	}

	/**
     * 获取操作的IP
     */
	public String getSourceIp() {
		return sourceIp;
	}

	/**
     * 设置操作的IP
     */
	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
	}
	public Integer getTaskMode() {
		return taskMode;
	}
	public void setTaskMode(Integer taskMode) {
		this.taskMode = taskMode;
	}
    
}
