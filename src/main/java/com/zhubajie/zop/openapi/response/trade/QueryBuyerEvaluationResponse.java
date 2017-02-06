package com.zhubajie.zop.openapi.response.trade;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "queryBuyerEvaluation")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class QueryBuyerEvaluationResponse extends AbstractSuccessResponse{
	
	@XmlElementWrapper(name="buyerEvaluations")
	@XmlElement(name="buyerEvaluation")
	List<BuyerEvaluation> buyerEvaluations;

	public List<BuyerEvaluation> getBuyerEvaluations() {
		return buyerEvaluations;
	}

	public void setBuyerEvaluations(List<BuyerEvaluation> buyerEvaluations) {
		this.buyerEvaluations = buyerEvaluations;
	}
	
}
