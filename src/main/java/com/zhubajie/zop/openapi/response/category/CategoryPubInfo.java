package com.zhubajie.zop.openapi.response.category;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class CategoryPubInfo {

	/**
     *类目id
     */
	@XmlElement
    private Integer categoryId;
    /**
     * 类目名字
     */
	@XmlElement
    private String categoryName;
    /**
     * 父id
     */
	@XmlElement
    private Integer parentId;
    /**
     * 1级类目id,类目大于1级的时候有值，其余情况为0
     */
	@XmlElement
    private  Integer level1id;
    /**
     * 2级类目id,类目大于2级的时候有值，其余情况为0
     */
	@XmlElement
    private Integer level2id;
    /**
     * 级数
     */
	@XmlElement
    private Integer level;
    /**
     * 是否显示
     */
	@XmlElement
    private Integer isShow;
    /**
     * 排序
     */
	@XmlElement
    private Integer sort;

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


    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CategoryPubNdto{");
        sb.append("categoryId=").append(categoryId);
        sb.append(", categoryName='").append(categoryName).append('\'');
        sb.append(", parentId=").append(parentId);
        sb.append(", level1id=").append(level1id);
        sb.append(", level2id=").append(level2id);
        sb.append(", level=").append(level);
        sb.append(", isShow=").append(isShow);
        sb.append(", sort=").append(sort);
        sb.append('}');
        return sb.toString();
    }
}
