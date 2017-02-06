package com.zhubajie.zop.openapi.response.trade;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "queryOrderInfoByOrderId")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class QueryOrderInfoByOrderIdResponse extends AbstractSuccessResponse {
	@XmlElement
	private Long orderId;  // 订单号
	@XmlElement
	private String title;  // 订单名称/需求名称
	@XmlElement
	private Integer createtime;	// 雇主下单时间
	@XmlElement
	private Date createymd; // 雇主下单时间
	@XmlElement
	private BigDecimal atPrice;  // 雇主付款金额
	@XmlElement
	private Byte state;  // 交易状态
	@XmlElement
	private Integer source; // 订单来源
	@XmlElement
	private Integer categoryIdL1; // 一级类目
	@XmlElement
	private Integer categoryIdL2; // 二级类目
	@XmlElement
	private Integer categoryIdL3; // 三级类目
	@XmlElement
	private String customerName; // 雇主姓名
	
	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Integer createtime) {
		this.createtime = createtime;
	}

	public Date getCreateymd() {
		return createymd;
	}

	public void setCreateymd(Date createymd) {
		this.createymd = createymd;
	}

	public BigDecimal getAtPrice() {
		return atPrice;
	}

	public void setAtPrice(BigDecimal atPrice) {
		this.atPrice = atPrice;
	}

	public Byte getState() {
		return state;
	}

	public void setState(Byte state) {
		this.state = state;
	}

	public Integer getSource() {
		return source;
	}

	public void setSource(Integer source) {
		this.source = source;
	}

	public Integer getCategoryIdL1() {
		return categoryIdL1;
	}

	public void setCategoryIdL1(Integer categoryIdL1) {
		this.categoryIdL1 = categoryIdL1;
	}

	public Integer getCategoryIdL2() {
		return categoryIdL2;
	}

	public void setCategoryIdL2(Integer categoryIdL2) {
		this.categoryIdL2 = categoryIdL2;
	}

	public Integer getCategoryIdL3() {
		return categoryIdL3;
	}

	public void setCategoryIdL3(Integer categoryIdL3) {
		this.categoryIdL3 = categoryIdL3;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
}
