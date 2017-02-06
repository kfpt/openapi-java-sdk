package com.zhubajie.zop.openapi.response.shop; // 

import java.util.List;

public class UserCategorieInfo {

	private String nickname; // 用户昵称 

	private Integer category1id; // 基础顶级类目ID

	private String category1Name; // 基础顶级类目名称

	private Integer category2id; // 基础类目二级ID

	private String category2Name; // 基础类目二级名称

	private Integer categoryId; // 基本类目三级ID

	private String categoryName; // 基础类目三级名称

	private List<CategoryExtInfo> categoryExtInfos; // 三级类目扩展属性信息

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Integer getCategory1id() {
		return category1id;
	}

	public void setCategory1id(Integer category1id) {
		this.category1id = category1id;
	}

	public String getCategory1Name() {
		return category1Name;
	}

	public void setCategory1Name(String category1Name) {
		this.category1Name = category1Name;
	}

	public Integer getCategory2id() {
		return category2id;
	}

	public void setCategory2id(Integer category2id) {
		this.category2id = category2id;
	}

	public String getCategory2Name() {
		return category2Name;
	}

	public void setCategory2Name(String category2Name) {
		this.category2Name = category2Name;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<CategoryExtInfo> getCategoryExtInfos() {
		return categoryExtInfos;
	}

	public void setCategoryExtInfos(List<CategoryExtInfo> categoryExtInfos) {
		this.categoryExtInfos = categoryExtInfos;
	}

}
