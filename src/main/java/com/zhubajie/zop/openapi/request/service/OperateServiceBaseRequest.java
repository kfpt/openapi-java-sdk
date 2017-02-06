package com.zhubajie.zop.openapi.request.service;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

/**
 * Title: DeleteServiceRequest 
 * Description: 删除服务请求
 * Date: 2016年10月25日 上午9:57:04
 * @author malibin 
 */
public class OperateServiceBaseRequest extends UserAbstractRopRequest {
	
	@NotNull
	@Min(1)
	private Integer serviceId; // 服务号

	public Integer getServiceId() {
		return serviceId;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}
	
}
