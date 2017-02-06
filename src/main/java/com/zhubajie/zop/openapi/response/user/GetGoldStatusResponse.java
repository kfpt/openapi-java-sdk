package com.zhubajie.zop.openapi.response.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

/**
 * 获取会员付费等级返回信息
 * @author ChengPuhui
 * @Date 2016年6月12日
 */
@XmlRootElement(name = "goldStatus")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class GetGoldStatusResponse extends AbstractSuccessResponse {

	/**
	 * 用户等级
	 * 0普通会员，1银牌，2金牌，3钻石，4皇冠,6第二版付费用户,7新钻石,8新皇冠
	 */
	@XmlElement
	private Integer status;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}
