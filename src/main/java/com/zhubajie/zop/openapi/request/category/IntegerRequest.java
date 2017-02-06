package com.zhubajie.zop.openapi.request.category;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.rop.AbstractRopRequest;

public class IntegerRequest extends AbstractRopRequest{
	/**
	 * 所传入ID
	 */
    @NotNull
    @Min(0)
    private Integer data ;

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	

}
