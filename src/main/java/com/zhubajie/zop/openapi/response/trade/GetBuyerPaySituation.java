package com.zhubajie.zop.openapi.response.trade;

import java.util.List;

public class GetBuyerPaySituation {
	/**
	 * 需求金额
	 */
	private Double amout;
	
	/**
	 * 托管金额
	 */
	private Double hostedAmout;
	
	/**
	 * 分期支付金额列表
	 */
	private List<Double> installments;

	public Double getAmout() {
		return amout;
	}

	public void setAmout(Double amout) {
		this.amout = amout;
	}

	public Double getHostedAmout() {
		return hostedAmout;
	}

	public void setHostedAmout(Double hostedAmout) {
		this.hostedAmout = hostedAmout;
	}

	public List<Double> getInstallments() {
		return installments;
	}

	public void setInstallments(List<Double> installments) {
		this.installments = installments;
	}
}
