package com.zhubajie.zop.openapi.response.trade;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "getCrowdsourcingTask")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class GetCrowdsourcingTaskResponse extends AbstractSuccessResponse {

	@XmlElement
	private Long taskId; // 需求ID
	@XmlElement
	private String title; // 任务标题/需求标题 
	@XmlElement
	private String content; // 需求内容
	@XmlElement
	private String nickname; // 任务发布人昵称/雇主昵称
	@XmlElement
	private Double amount; // 需求金额/需求预算
	@XmlElement
	private Double hostedAmount; // 托管金额(纯金额)
	@XmlElement
	private Double atAmount; // 实际交易金额
	@XmlElement
	private Integer allot; // 赏金分配 奖金分配：0任务模式不健全，1单人中标,2多人中标,3计件方式
	@XmlElement
	private Integer taskType; // 需求类型，0：猪八戒网，1：天蓬网，2：产业园订单
	@XmlElement
    private Integer createTime; // 任务创建时间/发布时间
	@XmlElement
    private Integer endTime; // 任务结束时间
	public Long getTaskId() {
		return taskId;
	}
	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
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
	public Double getAtAmount() {
		return atAmount;
	}
	public void setAtAmount(Double atAmount) {
		this.atAmount = atAmount;
	}
	public Integer getAllot() {
		return allot;
	}
	public void setAllot(Integer allot) {
		this.allot = allot;
	}
	public Integer getTaskType() {
		return taskType;
	}
	public void setTaskType(Integer taskType) {
		this.taskType = taskType;
	}
	public Integer getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}
	public Integer getEndTime() {
		return endTime;
	}
	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
	}

}
