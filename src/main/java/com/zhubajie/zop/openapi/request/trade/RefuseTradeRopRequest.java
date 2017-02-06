package com.zhubajie.zop.openapi.request.trade;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

public class RefuseTradeRopRequest extends UserAbstractRopRequest {

    @NotNull
    private Integer taskId; // 需求Id 必填
    
    @NotBlank
    private String reason;  // 拒绝理由 必填

    @Pattern(regexp = "\\b((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\b")
    private String sourceIp; // 操作的IP 选填 
    
	//private Integer refundOption; // 退的退回途径 2表示退回易极付余额 ,其他表示原路退回
	
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getSourceIp() {
		return sourceIp;
	}
	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
	}
//	public Integer getRefundOption() {
//		return refundOption;
//	}
//	public void setRefundOption(Integer refundOption) {
//		this.refundOption = refundOption;
//	}
}
