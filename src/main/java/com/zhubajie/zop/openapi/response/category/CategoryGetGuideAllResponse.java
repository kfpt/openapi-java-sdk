package com.zhubajie.zop.openapi.response.category;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "categoryGuideGetAll")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class CategoryGetGuideAllResponse extends AbstractSuccessResponse{

	@XmlElementWrapper(name="categoryGuideList")
	@XmlElement(name="categoryGuide")
	private List<CategoryGuide> categoryGuideList;

	public List<CategoryGuide> getCategoryGuideList() {
		return categoryGuideList;
	}

	public void setCategoryGuideList(List<CategoryGuide> categoryGuideList) {
		this.categoryGuideList = categoryGuideList;
	}
}
