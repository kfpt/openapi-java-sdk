package com.zhubajie.zop.openapi.response.other;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "regionList")
@XmlAccessorType(XmlAccessType.FIELD)
public class RegionListResponse extends AbstractSuccessResponse {

	@XmlElementWrapper(name="regionInfoList")
	@XmlElement(name="regionInfo")
	private List<RegionInfo> regionInfoList;

	public List<RegionInfo> getRegionInfoList() {
		return regionInfoList;
	}

	public void setRegionInfoList(List<RegionInfo> regionInfoList) {
		this.regionInfoList = regionInfoList;
	}
	
	
}
