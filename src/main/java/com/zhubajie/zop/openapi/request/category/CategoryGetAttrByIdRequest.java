package com.zhubajie.zop.openapi.request.category;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.rop.AbstractRopRequest;

public class CategoryGetAttrByIdRequest extends AbstractRopRequest{

	/**
     * 基础类目Id
     */
	@NotNull
	@Min(value=1)
    private Integer categoryId;

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
}
