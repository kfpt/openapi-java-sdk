package com.zhubajie.zop.openapi.request.other;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.rop.AbstractRopRequest;

public class RegionInfoRequest extends AbstractRopRequest {

	@NotNull
	@Min(1)
	private Integer regionId;

	public Integer getRegionId() {
		return regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}
	
}
