package com.zhubajie.zop.openapi.request.other;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.rop.AbstractRopRequest;

public class BatchIdRequest extends AbstractRopRequest {

	@NotNull
	@Min(1)
	private Integer batchId;

	public Integer getBatchId() {
		return batchId;
	}

	public void setBatchId(Integer batchId) {
		this.batchId = batchId;
	}
	
}
