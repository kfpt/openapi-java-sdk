package com.zhubajie.zop.openapi.response.trade;

public class WorksSourceLog {
	private Integer sourcelogId;

    private Integer orderId;

    private Integer taskId;

    private Integer worksId;

    private Integer dateline;

    private Byte type;

    private String nickname;

    private Byte state;

    private Byte isread;

    private String content;
    
    private String userName;

	 /**
     * 获取WorksSourceLog表主键ID
     */
	public Integer getSourcelogId() {
		return sourcelogId;
	}

	 /**
     * 设置WorksSourceLog表主键ID
     */
	public void setSourcelogId(Integer sourcelogId) {
		this.sourcelogId = sourcelogId;
	}
	
    /**
     * 获取订单ID
     */
	public Integer getOrderId() {
		return orderId;
	}

    /**
     * 设置订单ID
     */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

    /**
     * 获取需求ID
     */
	public Integer getTaskId() {
		return taskId;
	}

    /**
     * 设置需求ID
     */
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

    /**
     * 获取稿件ID
     */
	public Integer getWorksId() {
		return worksId;
	}

    /**
     * 设置稿件ID
     */
	public void setWorksId(Integer worksId) {
		this.worksId = worksId;
	}

    /**
     * 获取创建时间
     */
	public Integer getDateline() {
		return dateline;
	}

    /**
     * 设置创建时间
     */
	public void setDateline(Integer dateline) {
		this.dateline = dateline;
	}

    /**
     * 获取类别：0留言1操作日志2拒绝理由3里程碑日志4买家打款(含公示)5威客申请打款6修改价格7补齐担保金10需要上传源文件的申请付款20合同流程 
     */
	public Byte getType() {
		return type;
	}

    /**
     * 设置类别：0留言1操作日志2拒绝理由3里程碑日志4买家打款(含公示)5威客申请打款6修改价格7补齐担保金10需要上传源文件的申请付款20合同流程 
     */
	public void setType(Byte type) {
		this.type = type;
	}

    /**
     * 获取服务商昵称
     */
	public String getNickname() {
		return nickname;
	}

    /**
     * 设置服务商昵称
     */
	public void setNickname(String nickname) {
		this.nickname = nickname;
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
     * 获取阅读状态：0未读1已读
     */
	public Byte getIsread() {
		return isread;
	}

    /**
     * 设置阅读状态：0未读1已读
     */
	public void setIsread(Byte isread) {
		this.isread = isread;
	}

    /**
     * 获取冗余数据(包含很多业务数据)
     */
	public String getContent() {
		return content;
	}

    /**
     * 设置冗余数据(包含很多业务数据)
     */
	public void setContent(String content) {
		this.content = content;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
