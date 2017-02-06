package com.zhubajie.zop.openapi.request.service;

import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

public class CancelRecommendServiceRequest extends UserAbstractRopRequest{
	/**
	 * 服务编号列表
	 */
	@NotEmpty
	private List<Integer> serviceIds;

	public List<Integer> getServiceIds() {
		return serviceIds;
	}

	public void setServiceIds(List<Integer> serviceIds) {
		this.serviceIds = serviceIds;
	}
}
