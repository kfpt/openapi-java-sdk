package com.zhubajie.zop.openapi.request.trade;

import java.math.BigDecimal;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.rop.AbstractRopRequest;

public class QueryPrintOrderRopRequest extends AbstractRopRequest {

//	private int platformIdx;  // 平台index，与name形成映射 -创建时填写,偌不知道，可咨询交易组
	
	@NotNull@Min(value=0)
	private Integer orderId;  // 订单号
	
	private Integer userId;  // 暂无用,预留
	
	@NotNull
    private Integer currentPage;  // 页码 
    
	@NotNull
    private Integer pageSize;  // 页大小
	
	private String orderName;  // 订单名称
	
	private String orderDate;  // 订单创建时间
	
	private BigDecimal orderAmount;  // 订单总金额
	
	private String backUrl;  // 回调地址,比如zbj.com/yinshua?  orderid=?
	
//	@NotNull
//	private int platformIdx;  // 平台index，与name形成映射 -创建时填写,偌不知道，可咨询交易组

//	public int getPlatformIdx() {
//		return platformIdx;
//	}
//
//	public void setPlatformIdx(int platformIdx) {
//		this.platformIdx = platformIdx;
//	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public BigDecimal getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getBackUrl() {
		return backUrl;
	}

	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
	}
    
}
