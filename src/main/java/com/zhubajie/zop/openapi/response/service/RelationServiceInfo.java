package com.zhubajie.zop.openapi.response.service;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

public class RelationServiceInfo {

	private Integer serviceId; // 服务ID
	
	private String subject; // 服务标题
	
    private String imgurl; // 图片地址

    private Float amount; // 出售金额
    
    private Integer sales; // 成功交易量

	public Integer getServiceId() {
		return serviceId;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public Integer getSales() {
		return sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}
    
    
}
