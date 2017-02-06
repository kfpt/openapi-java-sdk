package com.zhubajie.zop.openapi.request.trade;

import com.rop.AbstractRopRequest;

public class WorksSourceLogRopRequest extends AbstractRopRequest {

    private Integer taskId;

    private Integer workId;

    private Integer orderId;

    private Byte type;
    
    private Byte state;

    private Byte isread;
    
	/**
     * 获取任务ID
     */
	public Integer getTaskId() {
		return taskId;
	}
	/**
     * 设置任务ID
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
     * 获取订单id
     */
	public Integer getOrderId() {
		return orderId;
	}
    /**
     * 设置订单id
     */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
    /**
     * 获取类型： 0留言1操作日志2拒绝理由3里程碑日志4买家打款(含公示)5威客申请打款6修改价格7补齐担保金 8申请托管 10需要上传源文件的申请付款20:合同流程 
     */
	public Byte getType() {
		return type;
	}
    /**
     * 设置类型： 0留言1操作日志2拒绝理由3里程碑日志4买家打款(含公示)5威客申请打款6修改价格7补齐担保金 8申请托管 10需要上传源文件的申请付款20:合同流程 
     */
	public void setType(Byte type) {
		this.type = type;
	}
	/**
	 * 获取状态：0新申请 1成功 2失败 
	 */
	public Byte getState() {
		return state;
	}
	/**
	 * 设置状态：0新申请 1成功 2失败 
	 */
	public void setState(Byte state) {
		this.state = state;
	}
    /**
     * 是否已读：0未读1已读
     */
	public Byte getIsread() {
		return isread;
	}
    /**
     * 设置是否已读：0未读1已读
     */
	public void setIsread(Byte isread) {
		this.isread = isread;
	}
}
