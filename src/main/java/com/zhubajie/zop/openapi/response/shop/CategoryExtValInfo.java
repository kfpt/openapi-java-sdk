package com.zhubajie.zop.openapi.response.shop;

public class CategoryExtValInfo {
	
	private Integer extId; // 扩展属性类目ID
	
	private Integer valId; // 扩展属性值ID
	
	private String valName; // 扩展属性值名称

	private Short valSort; // 扩展属性值排序

	public Integer getExtId() {
		return extId;
	}

	public void setExtId(Integer extId) {
		this.extId = extId;
	}

	public Integer getValId() {
		return valId;
	}

	public void setValId(Integer valId) {
		this.valId = valId;
	}

	public String getValName() {
		return valName;
	}

	public void setValName(String valName) {
		this.valName = valName;
	}

	public Short getValSort() {
		return valSort;
	}

	public void setValSort(Short valSort) {
		this.valSort = valSort;
	}
	
}
