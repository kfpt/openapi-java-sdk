package com.zhubajie.zop.openapi.response.agreement;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;


@XmlRootElement(name = "agreementDail")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class AgreementResponse extends AbstractSuccessResponse{

	/**
	 * 交易协议基础信息
	 */
	@XmlElement(name="agreementBase")
	private AgreementBase agreementBase;
	
	
	/**
	 * 交易协议附加合同信息列表
	 */
	@XmlElementWrapper(name="agreementAddonsList")
	private List<AgreementAddons> agreementAddonsList;


	public AgreementBase getAgreementBase() {
		return agreementBase;
	}


	public void setAgreementBase(AgreementBase agreementBase) {
		this.agreementBase = agreementBase;
	}


	public List<AgreementAddons> getAgreementAddonsList() {
		return agreementAddonsList;
	}


	public void setAgreementAddonsList(List<AgreementAddons> agreementAddonsList) {
		this.agreementAddonsList = agreementAddonsList;
	}

}
