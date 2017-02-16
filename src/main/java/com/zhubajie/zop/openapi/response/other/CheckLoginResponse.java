package com.zhubajie.zop.openapi.response.other;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "checkLogin")
@XmlAccessorType(XmlAccessType.FIELD)
public class CheckLoginResponse extends AbstractSuccessResponse {

	@XmlElement
    private Integer userId; // 用户ID
	@XmlElement
    private String otpauth; // otpauth key ,otpauth主要用于生成防csrfcode

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getOtpauth() {
		return otpauth;
	}

	public void setOtpauth(String otpauth) {
		this.otpauth = otpauth;
	}
    
}
