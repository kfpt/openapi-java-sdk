package com.zhubajie.zop.openapi.response.category;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "listCategoryExtByCase")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class ListCategoryExtByCaseResponse extends AbstractSuccessResponse{

	@XmlElementWrapper(name="categoryExtByCaseList")
	@XmlElement(name="categoryExtByCase")
    private List<CategoryExtByCase> categoryExtByCaseList;

	public List<CategoryExtByCase> getCategoryExtByCaseList() {
		return categoryExtByCaseList;
	}

	public void setCategoryExtByCaseList(List<CategoryExtByCase> categoryExtByCaseList) {
		this.categoryExtByCaseList = categoryExtByCaseList;
	}
    
}
