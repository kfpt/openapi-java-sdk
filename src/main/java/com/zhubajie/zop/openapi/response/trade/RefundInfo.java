package com.zhubajie.zop.openapi.response.trade;

import java.util.Date;

public class RefundInfo {

    private Integer refundState; //退款状态， 1：待确认退款 2：退款成功 3：退款关闭 4：已拒绝 5:已撤销 6:退款处理中
	private Integer taskId; // 任务ID
	private Integer operateState; // 当前操作状态 1：待服务商确认 2：服务商同意退款 3 ：服务商拒绝退款 4：雇主撤销申请 5：雇主申请官方介入 6：服务商超期自动退款 7：雇主超期自动关闭
	private Double refundAmount; // 雇主要求退还的金额
	private Double paidAmount; // 已支付金额
	private Integer refundId; // 退款ID
	private Integer createTime; // 退款申请时间
	private Integer cause; // 退款原因
	private String description; // 说明
	private String customerNickname; // 雇主昵称
	
	private String taskTitle; // 需求标题
	private Double amount; // 需求赏金
	public Integer getRefundState() {
		return refundState;
	}
	public void setRefundState(Integer refundState) {
		this.refundState = refundState;
	}
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public Integer getOperateState() {
		return operateState;
	}
	public void setOperateState(Integer operateState) {
		this.operateState = operateState;
	}
	public Double getRefundAmount() {
		return refundAmount;
	}
	public void setRefundAmount(Double refundAmount) {
		this.refundAmount = refundAmount;
	}
	public Double getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(Double paidAmount) {
		this.paidAmount = paidAmount;
	}
	public Integer getRefundId() {
		return refundId;
	}
	public void setRefundId(Integer refundId) {
		this.refundId = refundId;
	}
	public Integer getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}
	public Integer getCause() {
		return cause;
	}
	public void setCause(Integer cause) {
		this.cause = cause;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCustomerNickname() {
		return customerNickname;
	}
	public void setCustomerNickname(String customerNickname) {
		this.customerNickname = customerNickname;
	}
	public String getTaskTitle() {
		return taskTitle;
	}
	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
}
