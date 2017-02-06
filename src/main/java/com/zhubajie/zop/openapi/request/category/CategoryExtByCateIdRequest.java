package com.zhubajie.zop.openapi.request.category;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import com.rop.AbstractRopRequest;

public class CategoryExtByCateIdRequest extends AbstractRopRequest{

	@NotNull
	@Min(0)
	private Integer categoryId;
	@NotNull
	@Min(0)
	@Max(2)
	private Integer type;
	
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
}
