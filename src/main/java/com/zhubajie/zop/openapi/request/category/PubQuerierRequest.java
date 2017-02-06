package com.zhubajie.zop.openapi.request.category;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.rop.AbstractRopRequest;

public class PubQuerierRequest extends AbstractRopRequest{

	/**
     *发布类目id列表
     */
    private List<Integer> categoryIdList;
    /**
     * 类目名字
     */
    private String categoryName;
    /**
     * 父id
     */
    private Integer parentId;
    /**
     * 级数
     */
    private Integer level;
    /**
     * 是否显示
     */
    private Integer isShow;
    /**
     * 站点 1猪八戒，2天蓬网
     */
	@NotNull
    private Integer site;
	public List<Integer> getCategoryIdList() {
		return categoryIdList;
	}
	public void setCategoryIdList(List<Integer> categoryIdList) {
		this.categoryIdList = categoryIdList;
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
	public Integer getSite() {
		return site;
	}
	public void setSite(Integer site) {
		this.site = site;
	}
}
