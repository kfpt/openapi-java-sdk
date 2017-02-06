package com.zhubajie.zop.openapi.response.shop;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "getUserCategories")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetUserCategoriesResponse extends AbstractSuccessResponse {

	@XmlElementWrapper(name="userCategorieInfos")
	@XmlElement(name="userCategorieInfo")
	private List<UserCategorieInfo> userCategorieInfos;

	public List<UserCategorieInfo> getUserCategorieInfos() {
		return userCategorieInfos;
	}

	public void setUserCategorieInfos(List<UserCategorieInfo> userCategorieInfos) {
		this.userCategorieInfos = userCategorieInfos;
	}
	
	
}
