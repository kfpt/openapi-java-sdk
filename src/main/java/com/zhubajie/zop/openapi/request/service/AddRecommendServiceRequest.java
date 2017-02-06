package com.zhubajie.zop.openapi.request.service;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

public class AddRecommendServiceRequest extends UserAbstractRopRequest{
	/**
	 * 服务编号
	 */
	@NotNull
	@Min(value=1)
	private Integer serviceId;
    
    /**
     * 类目ID
     */
   /* @NotNull
	@Min(value=1)
    private Integer categoryId;*/
    
    /**
     * 金额，用于检查是否能够开启橱窗服务
     */
    @NotNull
    private Float amount;

	public Integer getServiceId() {
		return serviceId;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	/*public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}*/

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}
}
