package com.zhubajie.zop.openapi.request.service;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.rop.AbstractRopRequest;
import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

/**
 * Title: GetServiceDetailRequest 
 * Description:  获取服务详细信息请求
 * Date: 2016年10月18日 下午5:47:59
 * @author weitan 
 */
public class GetServiceDetailRequest extends UserAbstractRopRequest{
	/**
	 * 服务ID
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
