package com.zhubajie.zop.openapi.response.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.rop.CommonConstant;


/**
 *@Todo:      成功响应抽象类
 *@UserName:  tanwei
 *@Time:      2016年6月12日 上午10:00:50
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "success")
public abstract class AbstractSuccessResponse {
	/**
	 * 成功标识
	 */
	@XmlAttribute
	private String successToken = CommonConstant.SUCCESS_TOKEN;
	
	/**
	 * 是否处理中，默认为false
	 * 		备用字段，用于支持三态类业务
	 */
	@XmlAttribute
	private boolean processing = false;

	public String getSuccessToken() {
		return successToken;
	}

	public void setSuccessToken(String successToken) {
		this.successToken = successToken;
	}

	public boolean isProcessing() {
		return processing;
	}

	public void setProcessing(boolean processing) {
		this.processing = processing;
	}
	
}
