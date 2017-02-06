package com.zhubajie.zop.openapi.response.shop;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "shopDetail")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class ShopDetailResponse {

	//店铺等级
	@XmlElement 
	private String levelName;
	
	//店铺名称
	@XmlElement
	private String brandname;

	//类目(三级入驻类目)
	@XmlElement 
	private List<String> categoryList;
	
	//店铺链接
	@XmlElement 
	private String shopLink;
	
	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public List<String> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<String> categoryList) {
		this.categoryList = categoryList;
	}

	public String getShopLink() {
		return shopLink;
	}

	public void setShopLink(String shopLink) {
		this.shopLink = shopLink;
	}
	
	
}
