package com.zhubajie.zop.openapi.request.trade;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

/**
 * Title: QuerySellerTradeRequest 
 * Description: 查询服务商参与的交易请求 
 * Date: 2017年2月22日 下午4:25:13
 * @author malibin 
 */
public class QuerySellerTradeRequest extends UserAbstractRopRequest {

	@Min(1)
	@Max(6)
	private Integer taskMode; // 交易模式：1比稿，2计件，3招标，4众包，5服务，6雇佣
	@Min(1)
	@Max(10)
	private Integer state; // 交易状态：1暂未定价 2待确认工作3待雇主托管 4待雇主选标 5待雇主付款6待雇主评价 7已托管   8交易成功9交易失败 10交易结束有退款
	@Min(1)
	@Max(8)
	private Integer bidState; // 投标状态：1中标 2备选 3交稿成功4版权已售5获赏  6淘汰 7合格 8不合格 
	@DateTimeFormat
	private Date startTime; // 开始时间
	@DateTimeFormat
	private Date endTime; // 结束时间 

	private String buyerNickname; // 雇主昵称

	private String title; // 订单名称
	
	@NotNull
	private Integer currentPage; // 页码

	@NotNull
	@Max(200)
	private Integer pageSize; // 页大小 

	public Integer getTaskMode() {
		return taskMode;
	}

	public void setTaskMode(Integer taskMode) {
		this.taskMode = taskMode;
	}

	public Integer getBidState() {
		return bidState;
	}

	public void setBidState(Integer bidState) {
		this.bidState = bidState;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getBuyerNickname() {
		return buyerNickname;
	}

	public void setBuyerNickname(String buyerNickname) {
		this.buyerNickname = buyerNickname;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
	
}
