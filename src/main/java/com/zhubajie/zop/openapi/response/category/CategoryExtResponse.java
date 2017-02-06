package com.zhubajie.zop.openapi.response.category;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "categoryExt")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class CategoryExtResponse extends AbstractSuccessResponse{
	/**
     * 扩展属性id
     */
	@XmlElement 
    private Integer extId;
    /**
     * 基本类目ID(三级）
     */
	@XmlElement 
    private Integer categoryId;
    /**
     * 扩展属性名称
     */
	@XmlElement 
    private String extName;
    /**
     * 0服务商扩展(入驻使用)，1需求扩展，2服务扩展
     */
	@XmlElement 
    private Byte type;
    /**
     * 是否显示
     */
	@XmlElement 
    private Byte isShow;
    /**
     * 表单类型:
     * text(文本框),
     * select(选择框),
     * checkbox(多选框),
     * radio(单选框),
     * textarea(富文本框),
     * password(密码框),
     * hidden(隐藏)
     */
	@XmlElement 
    private String extType;
    /**
     * 扩展属性排序
     */
	@XmlElement 
    private Integer extSort;

    /**
     * 状态，1前台展示,2后台展示,3前后台展示
     */
	@XmlElement 
    private Byte showType;
    //option 字段
	@XmlElement 
    private String listName;
	@XmlElement 
    private String subName;
	@XmlElement 
    private String joinName;
	@XmlElement 
    private String pageName;
	@XmlElement 
    private Integer isMust;
	@XmlElement 
    private Integer maxSelect;
    /**
     * 扩展属性值
     */
	@XmlElement
	private List<CategoryExtValInfo> categoryExtValInfoList;
	
	public Integer getExtId() {
		return extId;
	}
	public void setExtId(Integer extId) {
		this.extId = extId;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getExtName() {
		return extName;
	}
	public void setExtName(String extName) {
		this.extName = extName;
	}
	public Byte getType() {
		return type;
	}
	public void setType(Byte type) {
		this.type = type;
	}
	public Byte getIsShow() {
		return isShow;
	}
	public void setIsShow(Byte isShow) {
		this.isShow = isShow;
	}
	public String getExtType() {
		return extType;
	}
	public void setExtType(String extType) {
		this.extType = extType;
	}
	public Integer getExtSort() {
		return extSort;
	}
	public void setExtSort(Integer extSort) {
		this.extSort = extSort;
	}
	public Byte getShowType() {
		return showType;
	}
	public void setShowType(Byte showType) {
		this.showType = showType;
	}
	public String getListName() {
		return listName;
	}
	public void setListName(String listName) {
		this.listName = listName;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public String getJoinName() {
		return joinName;
	}
	public void setJoinName(String joinName) {
		this.joinName = joinName;
	}
	public String getPageName() {
		return pageName;
	}
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}
	public Integer getIsMust() {
		return isMust;
	}
	public void setIsMust(Integer isMust) {
		this.isMust = isMust;
	}
	public Integer getMaxSelect() {
		return maxSelect;
	}
	public void setMaxSelect(Integer maxSelect) {
		this.maxSelect = maxSelect;
	}
	
	public List<CategoryExtValInfo> getCategoryExtValInfoList() {
		return categoryExtValInfoList;
	}
	public void setCategoryExtValInfoList(List<CategoryExtValInfo> categoryExtValInfoList) {
		this.categoryExtValInfoList = categoryExtValInfoList;
	}

}
