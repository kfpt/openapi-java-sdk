package com.zhubajie.zop.openapi.response.category;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "ListCategoryPub")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class ListCategoryPubResponse extends AbstractSuccessResponse{

	@XmlElement
	List<CategoryPubInfo> categoryPubInfoList;

	public List<CategoryPubInfo> getCategoryPubInfoList() {
		return categoryPubInfoList;
	}

	public void setCategoryPubInfoList(List<CategoryPubInfo> categoryPubInfoList) {
		this.categoryPubInfoList = categoryPubInfoList;
	}
}
