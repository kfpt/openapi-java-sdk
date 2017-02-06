package com.zhubajie.zop.openapi.request.common;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.rop.AbstractRopRequest;

public class PositiveIntegerRopRequest extends AbstractRopRequest {
	@NotNull
	@Min(1)
	private Integer data;

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}
}
