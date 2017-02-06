package com.zhubajie.zop.openapi.request.search;

import org.hibernate.validator.constraints.NotBlank;

import com.rop.AbstractRopRequest;

public class SearchRequest extends AbstractRopRequest{
	
	@NotBlank
	/** 请求参数json串*/
	private String paramJson;

	public String getParamJson() {
		return paramJson;
	}

	public void setParamJson(String paramJson) {
		this.paramJson = paramJson;
	}
	
}
