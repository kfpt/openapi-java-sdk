package com.zhubajie.zop.openapi.response.trade;

import java.io.Serializable;
import java.math.BigDecimal;

public class TradeInfo implements Serializable {
	/**
	 * Fields serialVersionUID: 
	 */
	private static final long serialVersionUID = 1L;
	private String nickname; //雇主昵称
	private Integer taskId; // 流水号 	
	private Integer createtime; // 任务创建时间戳	
	private String title; // 标题 	
	private Byte taskMode; // 交易模式 
	private Byte taskState; // 任务状态 0 草稿,1新任务,2正式发布,3已选稿,4结束并打款
	private BigDecimal amount;
	private BigDecimal hostedAmount;
	private Byte openState;// 打开状态:0=打开,1=关闭(禁止查看,禁止相关所有操作包括发布)
	private Byte isfrozen; // 该任务是否处于冻结状态,一般指作弊任务 
	private Integer publicityOutime;  // 公示结束时间 
	private Byte taskAllot;  // 奖金分配：0任务模式不健全，1单人中标,2多人中标,3计件方式 
	private Integer endtime; // 任务结束时间 
	private Integer worksNum; // 交稿数量 
	private Integer commentNum; // 评论次数 
	private Byte isadvc;  // 是否为高级任务(原任务属性)
	private Byte wasPack; 	// 是否购买服务套餐 
	private Byte isgpay;  // 是否保证选稿(支付)
	private Byte wasShoworks; // 是否隐藏交稿 
	private Integer categoryId; // 三级基础类目(新)
	private Integer signSuccessNum;  // 中标的稿件数 
	private Integer alternativeNum; // 备选稿件数 
	private Byte signIsevaluation; // 是否需要评价 
	private Byte signIsevaluationBuy; //  买家是否评价 
	private Byte integral;  //state=4时，标示结束状态.0:未结束 task.state!=4,1:交易成功：全额支付,2:交易失败：全部退款的，被关闭的，被雇主取消的,3:交易结束有退款：部分退款的
	private Byte isacceptSl;  // 卖家是否接受需求
	private Byte taskSource; // 任务来源，0：网站，1：猪八戒手机客户端, 2：跑得快 , 3：蜜桃，4：猪八戒威客客户端 ，5 ： 快活 ，6：微信服务号 ，7：触屏版，8：买家客户端
	private Boolean isEmbedded; // 是否嵌入式需求，true:是 

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public Integer getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Integer createtime) {
		this.createtime = createtime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Byte getTaskMode() {
		return taskMode;
	}

	public void setTaskMode(Byte taskMode) {
		this.taskMode = taskMode;
	}

	public Byte getTaskState() {
		return taskState;
	}

	public void setTaskState(Byte taskState) {
		this.taskState = taskState;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getHostedAmount() {
		return hostedAmount;
	}

	public void setHostedAmount(BigDecimal hostedAmount) {
		this.hostedAmount = hostedAmount;
	}

	public Byte getOpenState() {
		return openState;
	}

	public void setOpenState(Byte openState) {
		this.openState = openState;
	}

	public Byte getIsfrozen() {
		return isfrozen;
	}

	public void setIsfrozen(Byte isfrozen) {
		this.isfrozen = isfrozen;
	}

	public Integer getPublicityOutime() {
		return publicityOutime;
	}

	public void setPublicityOutime(Integer publicityOutime) {
		this.publicityOutime = publicityOutime;
	}

	public Byte getTaskAllot() {
		return taskAllot;
	}

	public void setTaskAllot(Byte taskAllot) {
		this.taskAllot = taskAllot;
	}

	public Integer getEndtime() {
		return endtime;
	}

	public void setEndtime(Integer endtime) {
		this.endtime = endtime;
	}

	public Integer getWorksNum() {
		return worksNum;
	}

	public void setWorksNum(Integer worksNum) {
		this.worksNum = worksNum;
	}

	public Integer getCommentNum() {
		return commentNum;
	}

	public void setCommentNum(Integer commentNum) {
		this.commentNum = commentNum;
	}

	public Byte getIsadvc() {
		return isadvc;
	}

	public void setIsadvc(Byte isadvc) {
		this.isadvc = isadvc;
	}

	public Byte getWasPack() {
		return wasPack;
	}

	public void setWasPack(Byte wasPack) {
		this.wasPack = wasPack;
	}

	public Byte getIsgpay() {
		return isgpay;
	}

	public void setIsgpay(Byte isgpay) {
		this.isgpay = isgpay;
	}

	public Byte getWasShoworks() {
		return wasShoworks;
	}

	public void setWasShoworks(Byte wasShoworks) {
		this.wasShoworks = wasShoworks;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getSignSuccessNum() {
		return signSuccessNum;
	}

	public void setSignSuccessNum(Integer signSuccessNum) {
		this.signSuccessNum = signSuccessNum;
	}

	public Integer getAlternativeNum() {
		return alternativeNum;
	}

	public void setAlternativeNum(Integer alternativeNum) {
		this.alternativeNum = alternativeNum;
	}

	public Byte getSignIsevaluation() {
		return signIsevaluation;
	}

	public void setSignIsevaluation(Byte signIsevaluation) {
		this.signIsevaluation = signIsevaluation;
	}

	public Byte getSignIsevaluationBuy() {
		return signIsevaluationBuy;
	}

	public void setSignIsevaluationBuy(Byte signIsevaluationBuy) {
		this.signIsevaluationBuy = signIsevaluationBuy;
	}

	public Byte getIntegral() {
		return integral;
	}

	public void setIntegral(Byte integral) {
		this.integral = integral;
	}

	public Byte getIsacceptSl() {
		return isacceptSl;
	}

	public void setIsacceptSl(Byte isacceptSl) {
		this.isacceptSl = isacceptSl;
	}

	public Byte getTaskSource() {
		return taskSource;
	}

	public void setTaskSource(Byte taskSource) {
		this.taskSource = taskSource;
	}

	public Boolean getIsEmbedded() {
		return isEmbedded;
	}

	public void setIsEmbedded(Boolean isEmbedded) {
		this.isEmbedded = isEmbedded;
	}

}
