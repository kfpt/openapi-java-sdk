package com.zhubajie.zop.openapi.response.trade;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "getRefuseReasons")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class GetInitGiveupReasonsResponse extends AbstractSuccessResponse {

	@XmlElementWrapper(name="reasons")
	@XmlElement(name="reason")
	private List<GiveupReasonInfo> reasons;
	
	@XmlElement
	private Integer id; // 表单ID
	
	@XmlElement
	private String title; // 表单标题

	public List<GiveupReasonInfo> getReasons() {
		return reasons;
	}

	public void setReasons(List<GiveupReasonInfo> reasons) {
		this.reasons = reasons;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
