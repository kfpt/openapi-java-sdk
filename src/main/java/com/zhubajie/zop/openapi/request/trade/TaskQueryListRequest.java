package com.zhubajie.zop.openapi.request.trade;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

public class TaskQueryListRequest extends UserAbstractRopRequest{
	/**
	 * 单页大小
	 */
	@Max(value=40)
	@Min(value=1)
	@NotNull
	private Integer pageSize;
	/**
	 * 当前页码
	 */
	@Max(value=100)
	@Min(value=0)
	@NotNull
	private Integer currentPage;
	/**
	 * 导购类目ID
	 * 		支持一/二/三级类目
	 */
	@Min(value=2000001)
	private Integer categoryId;
	/**
	 * 交易模式
	 * 1:比稿
	 * 2：计件
	 * 3：招标
	 * 4：众包 
	 */
	@Max(value=4)
	@Min(value=1)
	private Integer mode;
	/**
	 * 赏金托管
	 * 0：未托管
	 * 1：已托管
	 * 2：可议价
	 */
	@Max(value=2)
	@Min(value=0)
	private Integer bountyHost;
	/**
	 * 是否加急
	 */
	private Boolean urgent;
	/**
	 * 需求发布起始时间
	 */
	private Long pubStartTime;
	/**
	 * 需求发布截止时间
	 */
	private Long pubEndTime;
	/**
	 * 需求结束起始时间
	 */
	private Long finishStartTime;
	/**
	 * 需求结束截止时间
	 */
	private Long finishEndTime;
	/**
	 * 投标情况
	 * 2：投标未满
	 * 3：我要参与
	 */
	@Max(value=3)
	@Min(value=2)
	private Integer workSituation;
	/**
	 * 排序规则
	 *  1：按发布时间升序
	 * -1：按发布时间降序
	 *  2：按剩余时间升序
	 * -2：按剩余时间降序
	 *  3：按参与数升序
	 * -3：按参与数降序
	 *  4：按价格升序
	 * -4：按价格降序
	 * 缺省则按综合排序
	 */
	@Max(value=4)
	@Min(value=-1)
	private Integer sortType;

	
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public Integer getMode() {
		return mode;
	}
	public void setMode(Integer mode) {
		this.mode = mode;
	}
	public Integer getBountyHost() {
		return bountyHost;
	}
	public void setBountyHost(Integer bountyHost) {
		this.bountyHost = bountyHost;
	}
	public Long getPubStartTime() {
		return pubStartTime;
	}
	public void setPubStartTime(Long pubStartTime) {
		this.pubStartTime = pubStartTime;
	}
	public Long getPubEndTime() {
		return pubEndTime;
	}
	public void setPubEndTime(Long pubEndTime) {
		this.pubEndTime = pubEndTime;
	}
	public Long getFinishStartTime() {
		return finishStartTime;
	}
	public void setFinishStartTime(Long finishStartTime) {
		this.finishStartTime = finishStartTime;
	}
	public Long getFinishEndTime() {
		return finishEndTime;
	}
	public void setFinishEndTime(Long finishEndTime) {
		this.finishEndTime = finishEndTime;
	}
	public Integer getWorkSituation() {
		return workSituation;
	}
	public void setWorkSituation(Integer workSituation) {
		this.workSituation = workSituation;
	}
	public Boolean getUrgent() {
		return urgent;
	}
	public void setUrgent(Boolean urgent) {
		this.urgent = urgent;
	}
	public Integer getSortType() {
		return sortType;
	}
	public void setSortType(Integer sortType) {
		this.sortType = sortType;
	}
}
