package com.zhubajie.zop.openapi.request.common;

import com.rop.AbstractRopRequest;

/**
 * Created by malibin on 16-8-12.
 * LONG类型请求参数
 */
public final class LongRopRequest extends AbstractRopRequest {

	private Long data;

	public Long getData() {
		return data;
	}

	public void setData(Long data) {
		this.data = data;
	}
}
