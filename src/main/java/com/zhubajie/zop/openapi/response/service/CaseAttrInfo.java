package com.zhubajie.zop.openapi.response.service;

import java.util.List;

public class CaseAttrInfo {

    private Integer attrId; //属性id

    private String attrName; // 属性名称

    private String attrType; // 类型 radio单选 checkbox多选

    private List<CaseAttrValueInfo> attrValueList; //属性值列表

	public Integer getAttrId() {
		return attrId;
	}

	public void setAttrId(Integer attrId) {
		this.attrId = attrId;
	}

	public String getAttrName() {
		return attrName;
	}

	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public String getAttrType() {
		return attrType;
	}

	public void setAttrType(String attrType) {
		this.attrType = attrType;
	}

	public List<CaseAttrValueInfo> getAttrValueList() {
		return attrValueList;
	}

	public void setAttrValueList(List<CaseAttrValueInfo> attrValueList) {
		this.attrValueList = attrValueList;
	}
    
}
