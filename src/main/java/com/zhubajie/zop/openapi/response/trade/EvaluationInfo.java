package com.zhubajie.zop.openapi.response.trade;

import java.math.BigDecimal;
import java.util.Date;

public class EvaluationInfo {
	
	private Byte score; // 2:好评 1：中评 0：差评
	
	private String title; // 订单名称
	
	private BigDecimal amount; // 交易金额/订单价格
	
	private String impress; // 印象标签
	
	private String comment; // 评价内容
    
    private Integer dateline; // 评价时间

    private Integer evaluationId; // 评价编号 
    
	public Byte getScore() {
		return score;
	}

	public void setScore(Byte score) {
		this.score = score;
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

	public String getImpress() {
		return impress;
	}

	public void setImpress(String impress) {
		this.impress = impress;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getDateline() {
		return dateline;
	}

	public void setDateline(Integer dateline) {
		this.dateline = dateline;
	}

	public Integer getEvaluationId() {
		return evaluationId;
	}

	public void setEvaluationId(Integer evaluationId) {
		this.evaluationId = evaluationId;
	}

}
