package com.zhubajie.zop.openapi.request.category;

import java.util.List;

import javax.validation.constraints.NotNull;
import com.rop.AbstractRopRequest;

public class IntegerListRequest extends AbstractRopRequest {

	/**
	 * list集合
	 */
	@NotNull
    private List<Integer> idList;

	public List<Integer> getIdList() {
		return idList;
	}

	public void setIdList(List<Integer> idList) {
		this.idList = idList;
	}


}
