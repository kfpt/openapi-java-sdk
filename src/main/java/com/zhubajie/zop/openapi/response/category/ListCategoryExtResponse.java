package com.zhubajie.zop.openapi.response.category;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "listCategoryExt")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class ListCategoryExtResponse extends AbstractSuccessResponse{

	@XmlElement
    private List<CategoryExt> categoryExtList;

	public List<CategoryExt> getCategoryExtList() {
		return categoryExtList;
	}

	public void setCategoryExtList(List<CategoryExt> categoryExtList) {
		this.categoryExtList = categoryExtList;
	}
    
}
