package com.zhubajie.zop.openapi.request.other;

import java.math.BigDecimal;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.rop.AbstractRopRequest;

public class Print2PlatformOrderRopRequest extends AbstractRopRequest {
	
	private Integer userId;  // 暂无用,预留
   
	@NotNull@Min(value=0)
	private Integer orderId;  // 订单号
	
	@NotNull
	private String orderName;  // 订单名称
	
	@NotNull
	private String orderDate;  // 订单创建时间
	
	@NotNull
	private BigDecimal orderAmount;  // 订单总金额
	
	@NotNull
	private String backUrl;  // 回调地址,比如zbj.com/yinshua?  orderid=?
    
	private String fileName;//文件名称
	
	private String materialName;//材料名称
	
	private String size;//尺寸

	private Integer printNum;//印刷数量
    
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
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
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getMaterialName() {
		return materialName;
	}
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Integer getPrintNum() {
		return printNum;
	}
	public void setPrintNum(Integer printNum) {
		this.printNum = printNum;
	}
    
}
