package com.zhubajie.zop.openapi.request.service;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

/**
 * Title: GetOnSaleServiceListRequest 
 * Description:  服务商服务列表查询请求
 * Date: 2016年9月21日 下午1:41:58
 * @author weitan 
 */
public class GetCasesRequest extends UserAbstractRopRequest{
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
}
