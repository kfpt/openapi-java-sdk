package com.zhubajie.zop.openapi.response.trade;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "getAcceptanceOutcome")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class GetAcceptanceOutcomeResponse extends AbstractSuccessResponse {

	@XmlElement
    private Integer state;//工作验收结果
	@XmlElement
    private String reason;//验收成功与否理由/原因

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
    
}
