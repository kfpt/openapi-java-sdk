package com.zhubajie.zop.openapi.response.trade;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;


@XmlRootElement(name = "getBuyerPayInfoResponse")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class GetBuyerPayStatusResponse extends AbstractSuccessResponse{
	/**
	 * 需求金额
	 */
	@XmlElement
	private Double amount;
	
	/**
	 * 托管金额
	 */
	@XmlElement
	private Double hostedAmount;
	
	/**
	 * 分期支付金额列表
	 */
	@XmlElementWrapper(name="installments")
	@XmlElement(name="installment")
	private List<Double> installments;


	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getHostedAmount() {
		return hostedAmount;
	}

	public void setHostedAmount(Double hostedAmount) {
		this.hostedAmount = hostedAmount;
	}

	public List<Double> getInstallments() {
		return installments;
	}

	public void setInstallments(List<Double> installments) {
		this.installments = installments;
	}
}
