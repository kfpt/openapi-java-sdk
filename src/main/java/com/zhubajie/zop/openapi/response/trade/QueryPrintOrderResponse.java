package com.zhubajie.zop.openapi.response.trade;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "queryPrintOrder")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class QueryPrintOrderResponse extends AbstractSuccessResponse {

	@XmlElementWrapper(name="platformPrintOrders")
	@XmlElement(name="platformPrintOrder")
	List<PrintOrder> platformPrintOrders;

	public List<PrintOrder> getPlatformPrintOrders() {
		return platformPrintOrders;
	}

	public void setPlatformPrintOrders(List<PrintOrder> platformPrintOrders) {
		this.platformPrintOrders = platformPrintOrders;
	}
	
}
