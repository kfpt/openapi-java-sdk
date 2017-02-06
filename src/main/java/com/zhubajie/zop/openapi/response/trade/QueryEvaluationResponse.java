package com.zhubajie.zop.openapi.response.trade;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "queryEvaluation")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class QueryEvaluationResponse extends AbstractSuccessResponse {

	@XmlElementWrapper(name="evaluationInfos")
	@XmlElement(name="EvaluationInfo")
	List<EvaluationInfo> evaluationInfos;

	/**
	 * 获取评价列表 
	 */
	public List<EvaluationInfo> getEvaluationInfos() {
		return evaluationInfos;
	}

	/**
	 * 设置评价列表 
	 */
	public void setEvaluationInfos(List<EvaluationInfo> evaluationInfos) {
		this.evaluationInfos = evaluationInfos;
	}
}
