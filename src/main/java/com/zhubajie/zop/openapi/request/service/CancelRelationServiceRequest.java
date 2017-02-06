package com.zhubajie.zop.openapi.request.service;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

public class CancelRelationServiceRequest extends UserAbstractRopRequest{
	/**
	 * 服务编号
	 */
	@NotNull
	@Min(value=1)
	private Integer serviceId;

	public Integer getServiceId() {
		return serviceId;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}
}
