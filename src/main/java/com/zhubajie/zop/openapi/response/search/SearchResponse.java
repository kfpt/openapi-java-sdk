package com.zhubajie.zop.openapi.response.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "result")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class SearchResponse extends AbstractSuccessResponse{
	
	@XmlElement 
	/** 搜索结果*/
	private Object rspJson;

	public Object getRspJson() {
		return rspJson;
	}

	public void setRspJson(Object rspJson) {
		this.rspJson = rspJson;
	}
}
