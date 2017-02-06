package com.zhubajie.zop.openapi.request.shop;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

public class GetUserCategoriesRequest extends UserAbstractRopRequest {

	@Min(1)
	@Max(2)
	private Integer site; // 网站(1猪八戒网 2天蓬网)

	@Min(1)
	private Integer category1Id;  // 一级类目ID,大于0会根据一级类目ID进行筛选

	@Min(1)
	private Integer category2Id; // 二级类目ID,大于0会根据二级类目ID进行筛选

	@Min(1)
	private Integer categoryId; // 三级类目ID,大于0会根据三级类目ID进行筛选

//	private Boolean isNeedExt; // 是否需要获取扩展属性
//
//	private Boolean isNeedCategoryName; // 是否查询类目名称
//
//	private Boolean isMain; // 是否只查询主营类目
//
//	private Integer isPersonal; // 0只查询企业类目 1只查询个人类目，不传都查

	public Integer getSite() {
		return site;
	}

	public void setSite(Integer site) {
		this.site = site;
	}

	public Integer getCategory1Id() {
		return category1Id;
	}

	public void setCategory1Id(Integer category1Id) {
		this.category1Id = category1Id;
	}

	public Integer getCategory2Id() {
		return category2Id;
	}

	public void setCategory2Id(Integer category2Id) {
		this.category2Id = category2Id;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

}
