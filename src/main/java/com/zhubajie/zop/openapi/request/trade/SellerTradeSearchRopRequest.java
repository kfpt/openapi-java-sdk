package com.zhubajie.zop.openapi.request.trade;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.rop.AbstractRopRequest;
import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

public class SellerTradeSearchRopRequest extends UserAbstractRopRequest {

	/** 开始时间 */
    private Date startTime;
    
    /** 结束时间 */
    private Date endTime;
    
    /** 投标状态(3-中标  2-备选  6-淘汰  7-无效)*/
    private Integer bidState;
    
    /** 需求状态(12-暂未定价 9-待雇主托管 1-待雇主选标 10-待雇主付款 11-待雇主评价 13-交易成功 14-交易失败) */
    private Integer signState;
    
    /** 页码 */
    @NotNull
    @Min(0)
    private Integer currentPage;
    
    /** 页大小*/
    @NotNull
    @Min(1)
    @Max(200)
    private Integer pageSize;
    
    
    /** 交易ID */
//    private Integer gttid;

    
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

//	public Integer getTaskType() {
//		return taskType;
//	}
//
//	public void setTaskType(Integer taskType) {
//		this.taskType = taskType;
//	}
//
//	public Integer getMode() {
//		return mode;
//	}
//
//	public void setMode(Integer mode) {
//		this.mode = mode;
//	}

	public Integer getBidState() {
		return bidState;
	}

	public void setBidState(Integer bidState) {
		this.bidState = bidState;
	}

	public Integer getSignState() {
		return signState;
	}

	public void setSignState(Integer signState) {
		this.signState = signState;
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

//	public Integer getGttid() {
//		return gttid;
//	}
//
//	public void setGttid(Integer gttid) {
//		this.gttid = gttid;
//	}
//    
}
