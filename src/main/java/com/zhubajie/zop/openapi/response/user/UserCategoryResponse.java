package com.zhubajie.zop.openapi.response.user;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "userCategoryList")
public class UserCategoryResponse extends AbstractSuccessResponse{

	@XmlElement
	private List<UserCategory> userCategoryList;
	

	public List<UserCategory> getUserCategoryList() {
		return userCategoryList;
	}

	public void setUserCategoryList(List<UserCategory> userCategoryList) {
		this.userCategoryList = userCategoryList;
	}
}
