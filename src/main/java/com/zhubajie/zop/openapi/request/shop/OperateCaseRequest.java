package com.zhubajie.zop.openapi.request.shop;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

public class OperateCaseRequest extends UserAbstractRopRequest {
	
	@NotNull
	@Min(1)
    private Integer caseId; // 案例id

	public Integer getCaseId() {
		return caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}
    
}
