package com.zhubajie.zop.openapi.response.other;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "regionInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class RegionInfoResponse extends AbstractSuccessResponse {

	@XmlElement
	private RegionInfo regionInfo;

	public RegionInfo getRegionInfo() {
		return regionInfo;
	}

	public void setRegionInfo(RegionInfo regionInfo) {
		this.regionInfo = regionInfo;
	}
	
	
}
