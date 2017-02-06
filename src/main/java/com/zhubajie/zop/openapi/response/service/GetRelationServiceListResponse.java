package com.zhubajie.zop.openapi.response.service;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "getRelationServiceList")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class GetRelationServiceListResponse extends AbstractSuccessResponse {

    @XmlElementWrapper(name="relationServiceInfos")
	@XmlElement(name="relationServiceInfo")
	private List<RelationServiceInfo> relationServiceInfos;

	public List<RelationServiceInfo> getRelationServiceInfos() {
		return relationServiceInfos;
	}

	public void setRelationServiceInfos(List<RelationServiceInfo> relationServiceInfos) {
		this.relationServiceInfos = relationServiceInfos;
	}
    
    
}
