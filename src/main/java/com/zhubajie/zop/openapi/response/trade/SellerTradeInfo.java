package com.zhubajie.zop.openapi.response.trade;

import java.math.BigDecimal;

public class SellerTradeInfo {

private Integer taskId; // 需求ID
	
	private Integer createtime; // 任务创建时间
	
	private String title; // 需求标题
	
	private Integer taskMode; // 交易模式 
	
	private String state; // 交易状态
	
	private String buyerNickname; //雇主昵称
	
	private BigDecimal amount; // 金额
	
	private BigDecimal hostedAmount; // 托管金额

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public Integer getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Integer createtime) {
		this.createtime = createtime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getTaskMode() {
		return taskMode;
	}

	public void setTaskMode(Integer taskMode) {
		this.taskMode = taskMode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getBuyerNickname() {
		return buyerNickname;
	}

	public void setBuyerNickname(String buyerNickname) {
		this.buyerNickname = buyerNickname;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getHostedAmount() {
		return hostedAmount;
	}

	public void setHostedAmount(BigDecimal hostedAmount) {
		this.hostedAmount = hostedAmount;
	}
}
