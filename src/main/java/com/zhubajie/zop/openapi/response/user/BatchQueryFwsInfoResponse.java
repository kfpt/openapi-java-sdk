package com.zhubajie.zop.openapi.response.user;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by malibin on 16-6-7.
 *
 * 批量获取服务商信息返回结果
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class BatchQueryFwsInfoResponse {

	@XmlElementWrapper(name="fwsInfoList")
	@XmlElement(name="fwsinfo")
	List<FwsInfo> fwsInfoList;

	public List<FwsInfo> getFwsInfoList() {
		return fwsInfoList;
	}

	public void setFwsInfoList(List<FwsInfo> fwsInfoList) {
		this.fwsInfoList = fwsInfoList;
	}
	
}
