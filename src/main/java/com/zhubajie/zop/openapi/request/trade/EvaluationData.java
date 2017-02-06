package com.zhubajie.zop.openapi.request.trade;

import java.io.Serializable;
import java.util.List;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

public class EvaluationData implements Serializable {

	/** 评分 0差评 1中评 2好评 */
	//@Range(min=0, max=2)
	private Integer score;

	/** 评价内容(6-140个汉字) */
	//@Length(min=6, max=140)
	private String comment;

	/** 评价印象(最大60个汉字) */
	private List<String> impressions;

	/** 评价雇主 */
	/** 雇主付款及时性1-5 */
	//@Range(min=1, max=5)
	private Integer timeLiness;
	
	/** 客户 合作愉快度 1-5*/
	//@Range(min=1, max=5)
	private Integer cooperation;

    public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public List<String> getImpressions() {
		return impressions;
	}

	public void setImpressions(List<String> impressions) {
		this.impressions = impressions;
	}

	public Integer getTimeLiness() {
		return timeLiness;
	}

	public void setTimeLiness(Integer timeLiness) {
		this.timeLiness = timeLiness;
	}

	public Integer getCooperation() {
		return cooperation;
	}

	public void setCooperation(Integer cooperation) {
		this.cooperation = cooperation;
	}
}
