package com.zhubajie.zop.openapi.response.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.UserAbstractSuccessResponse;

@XmlRootElement(name = "userBaseInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserInfoResponse extends UserAbstractSuccessResponse{

	@XmlElement
    private String nickname;	// 昵称
    
    @XmlElement
    private String username;	// 用户名
    
    @XmlElement
    private String mobile;		// 用户手机号
    
    @XmlElement
    private String userEmail;	// 用户邮箱
    
    @XmlElement
  	private String brandname;  //店铺名称

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
}
