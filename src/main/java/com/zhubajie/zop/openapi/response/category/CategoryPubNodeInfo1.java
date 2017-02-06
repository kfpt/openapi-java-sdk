package com.zhubajie.zop.openapi.response.category;

import java.util.List;


public class CategoryPubNodeInfo1{

	/**
     *类目id
     */
    private Integer categoryId;
    /**
     * 类目名字
     */
    private String categoryName;
    /**
     * 父id
     */
    private Integer parentId;
    /**
     * 1级类目id,类目大于1级的时候有值，其余情况为0
     */
    private  Integer level1id;
    /**
     * 2级类目id,类目大于2级的时候有值，其余情况为0
     */
    private Integer level2id;
    /**
     * 级数
     */
    private Integer level;
    /**
     * 是否显示
     */
    private Integer isShow;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * ico图标地址
     */
    private String ico;
    /**
     * 跳转url
     */
    private String redirectUrl;
    /**
     * 是否重点推荐
     */
    private Byte isRed;
    /**
     * 发布标题
     */
    private String pubTitle;
    /**
     * 建议发布价格
     */
    private String pubAmount;
    /**
     * 允许发布模式 0 空 1  比稿 2 计件 3 招标
     */
    private String allowPubMode;
    /**
     * 推荐发布模式 0 空 1 比稿 2 计件 3 招标
     */
    private Byte rcmdPubMode;
    
	private List<CategoryPubNodeInfo2> children2;

	public List<CategoryPubNodeInfo2> getChildren2() {
		return children2;
	}

	public void setChildren2(List<CategoryPubNodeInfo2> children2) {
		this.children2 = children2;
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

	public String getIco() {
		return ico;
	}

	public void setIco(String ico) {
		this.ico = ico;
	}

	public String getRedirectUrl() {
		return redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public Byte getIsRed() {
		return isRed;
	}

	public void setIsRed(Byte isRed) {
		this.isRed = isRed;
	}

	public String getPubTitle() {
		return pubTitle;
	}

	public void setPubTitle(String pubTitle) {
		this.pubTitle = pubTitle;
	}

	public String getPubAmount() {
		return pubAmount;
	}

	public void setPubAmount(String pubAmount) {
		this.pubAmount = pubAmount;
	}

	public String getAllowPubMode() {
		return allowPubMode;
	}

	public void setAllowPubMode(String allowPubMode) {
		this.allowPubMode = allowPubMode;
	}

	public Byte getRcmdPubMode() {
		return rcmdPubMode;
	}

	public void setRcmdPubMode(Byte rcmdPubMode) {
		this.rcmdPubMode = rcmdPubMode;
	}
}
