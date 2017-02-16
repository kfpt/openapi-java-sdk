package com.zhubajie.zop.openapi.request.trade;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

public class RefundOperationRequest extends UserAbstractRopRequest {

	@NotNull
	@Min(1)
	private Integer refundId;
	
	@NotBlank
	private String refuseContent;

	public Integer getRefundId() {
		return refundId;
	}

	public void setRefundId(Integer refundId) {
		this.refundId = refundId;
	}

	public String getRefuseContent() {
		return refuseContent;
	}

	public void setRefuseContent(String refuseContent) {
		this.refuseContent = refuseContent;
	}
	
}
