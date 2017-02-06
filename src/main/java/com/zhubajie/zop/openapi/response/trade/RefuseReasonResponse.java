package com.zhubajie.zop.openapi.response.trade;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "refuseReason")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class RefuseReasonResponse extends AbstractSuccessResponse{
	@XmlElement
	private String refuse;
	@XmlElement
	private String refuseReason;
	
	public String getRefuseReason() {
		return refuseReason;
	}
	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}
	public String getRefuse() {
		return refuse;
	}
	public void setRefuse(String refuse) {
		this.refuse = refuse;
	}
	
}
