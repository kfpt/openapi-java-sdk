package com.zhubajie.zop.openapi.response.trade;

import java.math.BigDecimal;

public class TaskInfo {
	/**
	 * 需求ID
	 */
	private Integer taskId;
	/**
	 * 需求标题
	 */
	private String title;
	/**
	 * 需求内容
	 */
	private String content;
	/**
	 * 交易模式
	 * 1:比稿
	 * 2：计件
	 * 3：招标
	 * 4：众包 
	 */
	private Integer mode;
	/**
	 * 需求发布时间
	 */
	private Long pubTime;
	/**
	 * 需求开始时间
	 */
	private Long startTime;
	/**
	 * 需求结束时间
	 */
	private Long finishTime;
	/**
	 * 需求剩余时间
	 */
	private Long remainTime;
	/**
	 * 需求金额
	 */
	private BigDecimal price;
	/**
	 * 赏金托管
	 * 0：未托管
	 * 1：已托管
	 * 2：可议价
	 */
	private Integer bountyHost;
	/**
	 * 参与数
	 */
	private Integer workCount;
	/**
	 * 剩余名额
	 */
	private Integer remainWorkCount;
	
	
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
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
	public Integer getMode() {
		return mode;
	}
	public void setMode(Integer mode) {
		this.mode = mode;
	}
	public Long getPubTime() {
		return pubTime;
	}
	public void setPubTime(Long pubTime) {
		this.pubTime = pubTime;
	}
	public Long getStartTime() {
		return startTime;
	}
	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}
	public Long getFinishTime() {
		return finishTime;
	}
	public void setFinishTime(Long finishTime) {
		this.finishTime = finishTime;
	}
	public Long getRemainTime() {
		return remainTime;
	}
	public void setRemainTime(Long remainTime) {
		this.remainTime = remainTime;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Integer getBountyHost() {
		return bountyHost;
	}
	public void setBountyHost(Integer bountyHost) {
		this.bountyHost = bountyHost;
	}
	public Integer getWorkCount() {
		return workCount;
	}
	public void setWorkCount(Integer workCount) {
		this.workCount = workCount;
	}
	public Integer getRemainWorkCount() {
		return remainWorkCount;
	}
	public void setRemainWorkCount(Integer remainWorkCount) {
		this.remainWorkCount = remainWorkCount;
	}
	
}
