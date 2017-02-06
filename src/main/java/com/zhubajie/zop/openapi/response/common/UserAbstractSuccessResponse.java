package com.zhubajie.zop.openapi.response.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 *@Todo:      涉及用户标识的成功响应抽象类
 *@UserName:  tanwei
 *@Time:      2016年6月16日 下午11:13:37
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "userSuccess")
public abstract class UserAbstractSuccessResponse extends AbstractSuccessResponse {
	/**
	 * 用户唯一标识
	 */
	@XmlElement
	private String openid;

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}
}
