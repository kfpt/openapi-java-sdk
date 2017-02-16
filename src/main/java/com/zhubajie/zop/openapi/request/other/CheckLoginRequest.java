package com.zhubajie.zop.openapi.request.other;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.rop.AbstractRopRequest;

public class CheckLoginRequest extends AbstractRopRequest {

	//@NotNull
	private String authUuid; //用户登录authUuid
	
	@NotBlank
	private String token; // 单点登录下发给用户浏览器的token
	
	@NotNull
	@Min(1)
	private Integer userId; // 用户ID

	public String getAuthUuid() {
		return authUuid;
	}

	public void setAuthUuid(String authUuid) {
		this.authUuid = authUuid;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
}
