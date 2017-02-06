package com.zhubajie.zop.openapi.response.trade;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "queryOrderNum")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class QueryOrderNumResponse extends AbstractSuccessResponse {
	@XmlElement
	private Integer count; // 总数
	@XmlElement
	private Integer orderNum; // 交易数

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}
	
}
