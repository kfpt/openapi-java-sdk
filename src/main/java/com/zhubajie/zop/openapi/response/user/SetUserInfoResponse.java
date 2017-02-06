package com.zhubajie.zop.openapi.response.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

/**
 *@ClassName: SetUserInfoResponse.java
 *@Todo:      返回结果-设置用户个性资料
 *@UserName:  tanwei
 *@Time:      2016年4月13日 下午1:26:04
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "result")
public class SetUserInfoResponse extends AbstractSuccessResponse{
	/**
	 * 是否设置成功
	 */
	@XmlElement
	private boolean successful;

	public boolean isSuccessful() {
		return successful;
	}

	public void setSuccessful(boolean successful) {
		this.successful = successful;
	}
	
}
