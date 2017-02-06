package com.zhubajie.zop.openapi.request.service;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

public class AddRelationServiceRequest extends UserAbstractRopRequest{

	//服务id
	@Min(value=0)
	@NotNull
	private Integer serviceId;
    //服务关联的 服务id
	@NotBlank
    private String serviceIds;
    //展示方式:1.上方;2.下方 
    @Max(value=2)
    @Min(value=1)
    @NotNull
    private Integer position;
    
	public Integer getServiceId() {
		return serviceId;
	}
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}
	public Integer getPosition() {
		return position;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}
	public String getServiceIds() {
		return serviceIds;
	}
	public void setServiceIds(String serviceIds) {
		this.serviceIds = serviceIds;
	}
    
}
