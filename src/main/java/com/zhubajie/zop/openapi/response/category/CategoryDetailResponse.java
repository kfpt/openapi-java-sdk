package com.zhubajie.zop.openapi.response.category;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "categoryDetail")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class CategoryDetailResponse extends AbstractSuccessResponse{

	/**
     * 类目id
     */
    @XmlElement 
    private Integer categoryId;
    /**
     * 类目名字
     */
    @XmlElement 
    private String categoryName;
    /**
     * 父类id
     */
    @XmlElement 
    private Integer parentId;
    /**
     * 顶级分类ID
     */
    @XmlElement 
    private Integer level1id;
    /**
     * 二级分类ID
     */
    @XmlElement 
    private Integer level2id;
    /**
     * 1=一级，2=二级，3=三级（最多支持三级）
     */
    @XmlElement 
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
