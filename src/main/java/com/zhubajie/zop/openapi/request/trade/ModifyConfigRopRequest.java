package com.zhubajie.zop.openapi.request.trade;

import java.math.BigDecimal;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

public class ModifyConfigRopRequest extends UserAbstractRopRequest {

	@NotNull
	@Min(1)
	private Integer categoryId; //类目ID
	
    private BigDecimal closeAgreementAmount; //默认关闭交易协议金额

    private BigDecimal mustAgreementAmount; //必须签订交易协议金额

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public BigDecimal getCloseAgreementAmount() {
		return closeAgreementAmount;
	}

	public void setCloseAgreementAmount(BigDecimal closeAgreementAmount) {
		this.closeAgreementAmount = closeAgreementAmount;
	}

	public BigDecimal getMustAgreementAmount() {
		return mustAgreementAmount;
	}

	public void setMustAgreementAmount(BigDecimal mustAgreementAmount) {
		this.mustAgreementAmount = mustAgreementAmount;
	}
    
}
