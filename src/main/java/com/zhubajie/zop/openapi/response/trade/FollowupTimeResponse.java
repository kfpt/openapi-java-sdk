package com.zhubajie.zop.openapi.response.trade;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "FollowupTimeResponse")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class FollowupTimeResponse extends AbstractSuccessResponse{

	@XmlElement
	private String nodeName;
	@XmlElement
	private Integer followupTime;

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public Integer getFollowupTime() {
		return followupTime;
	}

	public void setFollowupTime(Integer followupTime) {
		this.followupTime = followupTime;
	}
}
