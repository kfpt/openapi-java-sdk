package com.zhubajie.zop.openapi.response.service;

public class ServiceAttribute {
	 /**
     * 分类扩展ID
     */
    private Integer extId;
	
    /**
     * 分类扩展名称
     */
    private String extName;
    
    /**
     * 分类扩展属性ID
     */
    private Integer valId;

    /**
     * 分类扩展属性名称
     */
    private String valName;
    

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

	public String getExtName() {
		return extName;
	}

	public void setExtName(String extName) {
		this.extName = extName;
	}

	public String getValName() {
		return valName;
	}

	public void setValName(String valName) {
		this.valName = valName;
	}
    
}
