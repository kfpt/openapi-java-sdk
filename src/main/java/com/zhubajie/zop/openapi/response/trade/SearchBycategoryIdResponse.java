package com.zhubajie.zop.openapi.response.trade;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "listTradeInfo")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class SearchBycategoryIdResponse extends AbstractSuccessResponse{

	@XmlElement
	List<TradeExtInfo> tradeExtInfoList;

	public List<TradeExtInfo> getTradeExtInfoList() {
		return tradeExtInfoList;
	}

	public void setTradeExtInfoList(List<TradeExtInfo> tradeExtInfoList) {
		this.tradeExtInfoList = tradeExtInfoList;
	}
	
}
