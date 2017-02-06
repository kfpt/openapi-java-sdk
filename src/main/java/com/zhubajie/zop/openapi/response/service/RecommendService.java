package com.zhubajie.zop.openapi.response.service;

public class RecommendService {
	
	/**
     * 服务ID
     */
    private Integer serviceId;

    /**
     * 状态 0-新申请；1-通过；2-拒绝；3-取消
     */
    private Byte state;

    /**
     * 推荐时间
     */
    private Integer addTime;

	public Integer getServiceId() {
		return serviceId;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	public Byte getState() {
		return state;
	}

	public void setState(Byte state) {
		this.state = state;
	}

	public Integer getAddTime() {
		return addTime;
	}

	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}

}
