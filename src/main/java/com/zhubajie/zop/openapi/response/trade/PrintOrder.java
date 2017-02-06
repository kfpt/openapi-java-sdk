package com.zhubajie.zop.openapi.response.trade;

import java.math.BigDecimal;

public class PrintOrder {

	private Integer orderId;   //订单号
	
	private String orderName;  //订单名称
	
	private String orderDate;  //订单创建时间
	
	private BigDecimal orderAmount;  //订单总金额
	
	private String backUrl;  //回调地址,比如zbj.com/yinshua?  orderid=?
	
	private int platformIdx;  //平台index，与name形成映射 -创建时填写,偌不知道，可咨询交易组
	
	private String platformName;  //平台名称，创建时不填写
	
	private String modifyDate;  //修改时间，创建时不填写
	
	private Byte state = 0;  //暂不定义其含义及用途，预留，默认为0
	
	private Integer userId;  //用户ID
	
	private String fileName;  //文件名称
	
	private String materialName;  //材料名称
	
	private String size;  //尺寸
	
	private Integer printNum;  //印刷数量

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

	public int getPlatformIdx() {
		return platformIdx;
	}

	public void setPlatformIdx(int platformIdx) {
		this.platformIdx = platformIdx;
	}

	public String getPlatformName() {
		return platformName;
	}

	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}

	public String getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}

	public Byte getState() {
		return state;
	}

	public void setState(Byte state) {
		this.state = state;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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
