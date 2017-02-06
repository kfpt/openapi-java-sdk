package com.zhubajie.zop.openapi.request.common;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rop.AbstractRopRequest;



/**
 *@Todo:      涉及用户标识的请求抽象类
 *@UserName:  tanwei
 *@Time:      2016年6月16日 下午11:15:26
 */
public abstract class UserAbstractRopRequest extends AbstractRopRequest{
	/**
	 * 用户唯一标识
	 */
	@NotNull
	@Pattern(regexp = "^[0-9]{1,20}$|^[a-zA-Z0-9]{32}$", message="openid格式有误")
	private String openid;

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}
}
