package com.zhubajie.zop.openapi.request.trade;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

public class SellerGiveUpRopRequest extends UserAbstractRopRequest {

    @NotNull
    @Min(1)
    private Integer taskId;	// 需求Id 必填

    @NotNull
    @Min(1)
    private Integer workId;	// 稿件 必填

    @NotEmpty
    private List<ReasonRecord> reasonRecordList;	// 理由 必填

    @NotNull
    private Byte terminal;	// 终端类型：11pc主站12	boss系统21安卓手机22苹果手机31微信41触屏版      必填

    @Pattern(regexp = "\\b((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\b")
    private String sourceIp;  // 操作的IP 选填
    
	/**
     * 获取需求Id
     */
	public Integer getTaskId() {
		return taskId;
	}
	
	/**
     * 设置需求Id 必填
     */
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

    /**
     * 获取稿件ID
     */
	public Integer getWorkId() {
		return workId;
	}
	
    /**
     * 设置稿件ID 
     */
	public void setWorkId(Integer workId) {
		this.workId = workId;
	}

    /**
     * 获取终端类型：11pc主站12boss系统21安卓手机22苹果手机31微信41触屏版
     */
	public Byte getTerminal() {
		return terminal;
	}
	
    /**
     * 设置终端类型：11pc主站12boss系统21安卓手机22苹果手机31微信41触屏版
     */
	public void setTerminal(Byte terminal) {
		this.terminal = terminal;
	}
		
	/**
	 * 获取操作的IP
	 */
	public String getSourceIp() {
		return sourceIp;
	}
	
	/**
	 * 设置操作的IP
	 */
	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
	}

	public List<ReasonRecord> getReasonRecordList() {
		return reasonRecordList;
	}

	public void setReasonRecordList(List<ReasonRecord> reasonRecordList) {
		this.reasonRecordList = reasonRecordList;
	}
    
}
