package com.zhubajie.zop.openapi.request.service;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

public class GetRecommendServiceListRequest extends UserAbstractRopRequest{

	/**
	 * 翻页页码
	 */
	@NotNull
	@Min(1)
	private Integer pageNum;

	/**
	 * 每页数量
	 */
	@NotNull
	@Min(1)
	@Max(100)
	private Integer pageSize;

	/**
	 * 状态 1全部 2已推荐 3未通过审核 4审核中 5取消推荐
	 */
	@NotNull
	@Min(1)
	@Max(5)
	private Integer state;

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}
}
