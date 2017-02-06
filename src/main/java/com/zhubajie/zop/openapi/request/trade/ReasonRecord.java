package com.zhubajie.zop.openapi.request.trade;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class ReasonRecord implements Serializable {
   
	@NotNull
    private Integer relationId;

    @NotNull
    private String inputTxt;

	public Integer getRelationId() {
		return relationId;
	}

	public void setRelationId(Integer relationId) {
		this.relationId = relationId;
	}

	public String getInputTxt() {
		return inputTxt;
	}

	public void setInputTxt(String inputTxt) {
		this.inputTxt = inputTxt;
	}
    
}
