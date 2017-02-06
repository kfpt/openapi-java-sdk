package com.zhubajie.zop.openapi.response.trade;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "sellerAddEvaluation")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class SellerAddEvaluationResponse extends AbstractSuccessResponse{
	/**
	 * 追加评价编号
	 */
	@XmlElement
	private Integer evaluationAddId;

	public Integer getEvaluationAddId() {
		return evaluationAddId;
	}

	public void setEvaluationAddId(Integer evaluationAddId) {
		this.evaluationAddId = evaluationAddId;
	}
}
