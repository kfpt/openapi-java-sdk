package com.zhubajie.zop.openapi.response.trade;

import java.io.Serializable;

public class TradeExtInfo implements Serializable{

		/**
	 * Fields serialVersionUID: 
	 */
	private static final long serialVersionUID = 1L;
		//需求名称
		private String title;
		//需求id
		private String taskId;
		//需求类型(招标,比稿)
		private String mode;
		//发布时间
		private String startTime;
		//需求时间
		private String endTime;
		//剩余时间
		private String remainTime;
		//需求内容简介
		private String content;
		//需求预算
		private Long price;
		//需求托管情况(已托管,未托管,可议价)
		private byte bountyHost;
		//需求参与数
		private Long workCount;
		//投标剩余名额
		private Long leftworkCount;
		
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getTaskId() {
			return taskId;
		}
		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}
		public String getMode() {
			return mode;
		}
		public void setMode(String mode) {
			this.mode = mode;
		}
		public String getRemainTime() {
			return remainTime;
		}
		public void setRemainTime(String remainTime) {
			this.remainTime = remainTime;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public Long getPrice() {
			return price;
		}
		public void setPrice(Long price) {
			this.price = price;
		}
		public byte getBountyHost() {
			return bountyHost;
		}
		public void setBountyHost(byte bountyHost) {
			this.bountyHost = bountyHost;
		}
		public Long getWorkCount() {
			return workCount;
		}
		public void setWorkCount(Long workCount) {
			this.workCount = workCount;
		}
		public Long getLeftworkCount() {
			return leftworkCount;
		}
		public void setLeftworkCount(Long leftworkCount) {
			this.leftworkCount = leftworkCount;
		}
		public String getStartTime() {
			return startTime;
		}
		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}
		public String getEndTime() {
			return endTime;
		}
		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}
}
