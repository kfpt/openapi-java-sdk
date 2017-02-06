package com.zhubajie.zop.openapi.request.user;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

/**
 * Created by malibin on 16-8-17.
 * 请求用户基本信息参数对象
 */
public class UserBaseInfoRequest extends UserAbstractRopRequest {

	private byte type;	// 头像的类型：1.small;2.middle;3.big;4.large

	public byte getType() {
		return type;
	}

	public void setType(byte type) {
		this.type = type;
	}

}
