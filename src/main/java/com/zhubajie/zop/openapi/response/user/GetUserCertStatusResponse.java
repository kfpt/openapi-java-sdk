package com.zhubajie.zop.openapi.response.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

/**
 * 获取用户审核状态返回信息
 * @author ChengPuhui
 * @Date 2016年6月12日
 */
@XmlRootElement(name = "userCertStatus")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class GetUserCertStatusResponse extends AbstractSuccessResponse {

	/**
	 * 用户审核状态
	 */
	@XmlElement
	private Byte status;

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}
}
