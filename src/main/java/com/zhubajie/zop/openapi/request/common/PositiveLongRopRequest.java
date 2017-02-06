package com.zhubajie.zop.openapi.request.common;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.rop.AbstractRopRequest;

public class PositiveLongRopRequest extends AbstractRopRequest {
	@NotNull
	@Min(1)
	private Long data;

	public Long getData() {
		return data;
	}

	public void setData(Long data) {
		this.data = data;
	}
}
