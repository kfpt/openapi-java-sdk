package com.zhubajie.zop.openapi.request.common;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.rop.AbstractRopRequest;

public class NotBlankStringRequest extends AbstractRopRequest{
	/**
	 * 字符串验证
	 */
    @NotNull
    @NotBlank
    private String data ;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
