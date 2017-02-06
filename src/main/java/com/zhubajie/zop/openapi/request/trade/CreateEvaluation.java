package com.zhubajie.zop.openapi.request.trade;

public class CreateEvaluation {
	/**来源 */
	private String sourceSite;
	
	/** 稿件id */
	private Integer worksId;

	/** 是否自动评价 true: 自动评价 false：非自动评价 */
	private Boolean isAuto;

	/** 评价数据 */
	private EvaluationData evaluationData;
	
	/** 操作的IP*/
	private String sourceIp;
	

	public Integer getWorksId() {
		return worksId;
	}

	public void setWorksId(Integer worksId) {
		this.worksId = worksId;
	}

	public Boolean getIsAuto() {
		return isAuto;
	}

	public void setIsAuto(Boolean isAuto) {
		this.isAuto = isAuto;
	}

	public EvaluationData getEvaluationData() {
		return evaluationData;
	}

	public void setEvaluationData(EvaluationData evaluationData) {
		this.evaluationData = evaluationData;
	}

	public String getSourceSite() {
		return sourceSite;
	}

	public void setSourceSite(String sourceSite) {
		this.sourceSite = sourceSite;
	}

	public String getSourceIp() {
		return sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
	}
}
