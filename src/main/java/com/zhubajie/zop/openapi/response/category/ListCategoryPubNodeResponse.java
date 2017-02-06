package com.zhubajie.zop.openapi.response.category;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "ListCategoryPubNode")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class ListCategoryPubNodeResponse extends AbstractSuccessResponse{
	
	@XmlElement
	List<CategoryPubNodeInfo1> categoryPubNodeInfoList;

	public List<CategoryPubNodeInfo1> getCategoryPubNodeInfoList() {
		return categoryPubNodeInfoList;
	}

	public void setCategoryPubNodeInfoList(List<CategoryPubNodeInfo1> categoryPubNodeInfoList) {
		this.categoryPubNodeInfoList = categoryPubNodeInfoList;
	}


}
