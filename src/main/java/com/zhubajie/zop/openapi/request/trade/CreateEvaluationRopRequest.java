package com.zhubajie.zop.openapi.request.trade;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Range;
import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

public class CreateEvaluationRopRequest extends UserAbstractRopRequest {
		
	/** 稿件id */
	@NotNull
	@Min(1)
	private Integer taskId;

	/** 是否自动评价 true: 自动评价 false：非自动评价 */
	/*private Boolean isAuto;*/

	
	/** 操作的IP*/
	@NotNull
	@Pattern(regexp = "\\b((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\b")
	private String sourceIp;
	
	
	/** 评分 0差评 1中评 2好评 */
	@NotNull
	@Range(min=0, max=2)
	private Integer score;

	/** 评价内容(6-140个汉字) */
	//@Length(min=6, max=140)
	@NotNull
	@Pattern(regexp = ".*[^ ].*{6,140}")
	private String comment;

	/** 评价印象(最大60个汉字) */
	//@Length(max=60)
	@NotNull
	@Pattern(regexp = ".*[^ ].*{1,60}")
	private String impression;

	/** 评价雇主 */
	/** 雇主付款及时性1-5 */
	@NotNull
	@Range(min=1, max=5)
	private Integer timeLiness;
	
	/** 客户 合作愉快度 1-5*/
	@NotNull
	@Range(min=1, max=5)
	private Integer cooperation;

	/*public Boolean getIsAuto() {
		return isAuto;
	}

	public void setIsAuto(Boolean isAuto) {
		this.isAuto = isAuto;
	}*/

	public String getSourceIp() {
		return sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
	}

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

	public String getImpression() {
		return impression;
	}

	public void setImpression(String impression) {
		this.impression = impression;
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

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
}
