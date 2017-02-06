package com.zhubajie.zop.openapi.response.trade;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "getTimeliness")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetTimelinessResponse extends AbstractSuccessResponse {

	@XmlElement
	private Integer timeliness;

	public Integer getTimeliness() {
		return timeliness;
	}

	public void setTimeliness(Integer timeliness) {
		this.timeliness = timeliness;
	}
	
}
