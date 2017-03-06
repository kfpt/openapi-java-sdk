package com.zhubajie.zop.openapi.request.category;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.rop.AbstractRopRequest;

public class CategoryGetGuideAllRequest extends AbstractRopRequest{

	/**
     * 1猪八戒，2天蓬网
     */
	@NotNull
	@Min(value=1)
	@Max(value=2)
    private Integer site;
	/**
	 * 0为所有,1为一级类目,2为二级类目,3为三级类目
	 */
	@NotNull
	@Min(value=0)
	@Max(value=3)
	private Integer level;

	public Integer getSite() {
		return site;
	}

	public void setSite(Integer site) {
		this.site = site;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}
}
