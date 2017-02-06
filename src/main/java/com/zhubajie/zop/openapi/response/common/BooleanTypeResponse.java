package com.zhubajie.zop.openapi.response.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *@ClassName: BooleanResponse.java
 *@Todo:      返回Boolean型结果
 *@UserName:  malibin
 *@Time:      2016.6.8
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "result")
public class BooleanTypeResponse extends AbstractSuccessResponse {
	/**
	 * 结果：是，否
	 */
	@XmlElement
	private Boolean yes;

	public Boolean isYes() {
		return yes;
	}

	public void setYes(Boolean yes) {
		this.yes = yes;
	}


	
}
