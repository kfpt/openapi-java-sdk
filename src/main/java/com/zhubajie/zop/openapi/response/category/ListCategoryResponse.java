package com.zhubajie.zop.openapi.response.category;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

/**
 * @Title 批量获取类目返回结果
 * @author chenjindong
 *@Date 2016.06.14
 * 
 */
@XmlRootElement(name = "listCategory")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class ListCategoryResponse extends AbstractSuccessResponse{

	@XmlElement
	List<CategoryInfo> categoryInfoList;

	public List<CategoryInfo> getCategoryInfoList() {
		return categoryInfoList;
	}

	public void setCategoryInfoList(List<CategoryInfo> categoryInfoList) {
		this.categoryInfoList = categoryInfoList;
	}
}
