package com.zhubajie.zop.openapi.request.servicer;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

public class EditSettledCategoryRequest extends UserAbstractRopRequest{
	/**
	 * 旧一级类目ID
	 */
	@NotNull
	@Min(value=1)
	private Integer oldCategory1Id;
	/**
	 * 一级类目ID
	 */
	@NotNull
	@Min(value=1)
	private Integer category1Id;
	/**
	 * 二级类目ID列表
	 */
	@NotEmpty
	private List<Integer> category2Ids;
	/**
	 * 三级类目ID列表
	 */
	private List<Integer> categoryIds;
	/**
	 * 扩展属性值ID列表
	 */
	private List<Integer> valIds;
	
	public Integer getOldCategory1Id() {
		return oldCategory1Id;
	}
	public void setOldCategory1Id(Integer oldCategory1Id) {
		this.oldCategory1Id = oldCategory1Id;
	}
	public Integer getCategory1Id() {
		return category1Id;
	}
	public void setCategory1Id(Integer category1Id) {
		this.category1Id = category1Id;
	}
	public List<Integer> getCategory2Ids() {
		return category2Ids;
	}
	public void setCategory2Ids(List<Integer> category2Ids) {
		this.category2Ids = category2Ids;
	}
	public List<Integer> getCategoryIds() {
		return categoryIds;
	}
	public void setCategoryIds(List<Integer> categoryIds) {
		this.categoryIds = categoryIds;
	}
	public List<Integer> getValIds() {
		return valIds;
	}
	public void setValIds(List<Integer> valIds) {
		this.valIds = valIds;
	}
}
