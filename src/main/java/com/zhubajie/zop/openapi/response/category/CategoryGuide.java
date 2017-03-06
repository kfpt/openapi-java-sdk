package com.zhubajie.zop.openapi.response.category;

public class CategoryGuide {

	/**
     * 导购类目id
     */
    private Integer categoryId;
    /**
     * 导购类目名字
     */
    private String categoryName;
    /**
     * 父类目id
     */
    private Integer parentId;
    /**
     *一级类目id
     */
    private Integer level1id;
    /**
     * 二级类目id
     */
    private Integer level2id;
    /**
     * 类目等级
     */
    private Integer level;

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

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getLevel1id() {
		return level1id;
	}

	public void setLevel1id(Integer level1id) {
		this.level1id = level1id;
	}

	public Integer getLevel2id() {
		return level2id;
	}

	public void setLevel2id(Integer level2id) {
		this.level2id = level2id;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}
    
}
