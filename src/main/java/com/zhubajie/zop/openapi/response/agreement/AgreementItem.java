package com.zhubajie.zop.openapi.response.agreement;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @title 交易合同工期信息
 * @author chenjindong
 * @date 2016-11-09 上午10:19:40
 * 
 */
public class AgreementItem{
	
    /**
     * 项目阶段名称
     */
    private String stageName;

    /**
     * 项目阶段总天数
     */
    private Integer stageDays;

    /**
     * 开始时间年月日
     */
    private Date startdate;

    /**
     * 开始时间精确到秒
     */
    private Integer starttime;

    /**
     * 结束时间年月日
     */
    private Date enddate;

    /**
     * 结束时间精确到时分秒
     */
    private Integer endtime;
    
    /**
     * 项目阶段赏金
     */
    private BigDecimal amount;

    /**
     * 项目阶段内容
     */
    private String stageContent;
    
    /**
     * 源文件数量
     */
    private Integer fileNum;

	public String getStageName() {
		return stageName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
	}

	public Integer getStageDays() {
		return stageDays;
	}

	public void setStageDays(Integer stageDays) {
		this.stageDays = stageDays;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Integer getStarttime() {
		return starttime;
	}

	public void setStarttime(Integer starttime) {
		this.starttime = starttime;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public Integer getEndtime() {
		return endtime;
	}

	public void setEndtime(Integer endtime) {
		this.endtime = endtime;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getStageContent() {
		return stageContent;
	}

	public void setStageContent(String stageContent) {
		this.stageContent = stageContent;
	}

	public Integer getFileNum() {
		return fileNum;
	}

	public void setFileNum(Integer fileNum) {
		this.fileNum = fileNum;
	}

}
