package com.zhubajie.zop.openapi.response.trade;

import java.math.BigDecimal;

public class BuyerEvaluation {
	/**
	 * 评价编号
	 */
	private Integer evaluationId;
	
	/**
	 * 雇主昵称
	 */
	private String pnickname;
	
	/**
	 * 评价时间戳
	 */
	private Integer dateline;
	
	/**
	 * 评价的订单名称
	 */
	private String title;
	
	/**
	 * 订单金额
	 */
	private BigDecimal amount;
	
	/**
	 * 2:好评 1：中评 0：差评
	 */
	private Byte score;
	
	/**
	 * 评价内容
	 */
	private String comment;
	
	/**
	 * 印象标签
	 */
	private String impress;
	
	/**
	 * 稿件编号
	 */
	private Integer worksId; 

	public String getPnickname() {
		return pnickname;
	}

	public void setPnickname(String pnickname) {
		this.pnickname = pnickname;
	}

	public Integer getDateline() {
		return dateline;
	}

	public void setDateline(Integer dateline) {
		this.dateline = dateline;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Byte getScore() {
		return score;
	}

	public void setScore(Byte score) {
		this.score = score;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getImpress() {
		return impress;
	}

	public void setImpress(String impress) {
		this.impress = impress;
	}

	public Integer getEvaluationId() {
		return evaluationId;
	}

	public void setEvaluationId(Integer evaluationId) {
		this.evaluationId = evaluationId;
	}

	public Integer getWorksId() {
		return worksId;
	}

	public void setWorksId(Integer worksId) {
		this.worksId = worksId;
	}
}
