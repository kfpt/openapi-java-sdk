package com.zhubajie.zop.openapi.response.category;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "listCategoryExtVal")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class ListCategoryExtValResponse extends AbstractSuccessResponse{

	@XmlElement
	List<CategoryExtValInfo> listCategoryExtValDto;

	public List<CategoryExtValInfo> getListCategoryExtValDto() {
		return listCategoryExtValDto;
	}

	public void setListCategoryExtValDto(List<CategoryExtValInfo> listCategoryExtValDto) {
		this.listCategoryExtValDto = listCategoryExtValDto;
	}
	
}
