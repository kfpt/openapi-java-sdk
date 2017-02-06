package com.zhubajie.zop.openapi.response.trade;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "getRefundList")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetRefundListResponse extends AbstractSuccessResponse {

	@XmlElementWrapper(name="refundInfoList")
	@XmlElement(name="refundInfo")
	private List<RefundInfo> refundInfoList;

	public List<RefundInfo> getRefundInfoList() {
		return refundInfoList;
	}

	public void setRefundInfoList(List<RefundInfo> refundInfoList) {
		this.refundInfoList = refundInfoList;
	}
	
}
