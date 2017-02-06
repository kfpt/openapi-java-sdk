package com.zhubajie.zop.openapi.response.trade;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "queryOrderInfo")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class QueryOrderInfoResponse extends AbstractSuccessResponse {

	@XmlElement
	private Integer mode; // 需求模式
	@XmlElement
	private Double amount; 	// 需求金额
	@XmlElement
	private Double hostedAmount;  // 托管金额
	@XmlElement
	private String content;	// 内容/需求详情
	@XmlElement
	private String title;  // 订单名称/需求名称
	@XmlElement
	private String nickname;	// 雇主名称
	@XmlElement
	private Integer createtime;	// 雇主下单时间
	@XmlElement
	private Date createymd; // 雇主下单时间
	@XmlElement
    private Integer paytime;  // 雇主付款时间
	@XmlElement
    private Date payymd;  // 雇主付款时间
	@XmlElement
    private BigDecimal atPrice;  // 雇主付款金额
	@XmlElement
    private Byte state;  // 交易状态
	@XmlElement
    private Integer bidTime;  // 投标时间
	@XmlElement
    private Date bidYmd;  // 投标时间
	@XmlElement
    private Integer selectTime;  // 中标时间
	@XmlElement
	private String customerName; // 雇主姓名
    
	public Integer getMode() {
		return mode;
	}

	public void setMode(Integer mode) {
		this.mode = mode;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getHostedAmount() {
		return hostedAmount;
	}

	public void setHostedAmount(Double hostedAmount) {
		this.hostedAmount = hostedAmount;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
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

	public Integer getPaytime() {
		return paytime;
	}

	public void setPaytime(Integer paytime) {
		this.paytime = paytime;
	}

	public Date getPayymd() {
		return payymd;
	}

	public void setPayymd(Date payymd) {
		this.payymd = payymd;
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

	public Integer getBidTime() {
		return bidTime;
	}

	public void setBidTime(Integer bidTime) {
		this.bidTime = bidTime;
	}

	public Date getBidYmd() {
		return bidYmd;
	}

	public void setBidYmd(Date bidYmd) {
		this.bidYmd = bidYmd;
	}

	public Integer getSelectTime() {
		return selectTime;
	}

	public void setSelectTime(Integer selectTime) {
		this.selectTime = selectTime;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}
