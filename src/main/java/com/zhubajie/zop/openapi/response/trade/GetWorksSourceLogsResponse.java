package com.zhubajie.zop.openapi.response.trade;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "getWorksSourceLogs")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class GetWorksSourceLogsResponse extends AbstractSuccessResponse {

	@XmlElementWrapper(name="worksSourceLogs")
	@XmlElement(name="WorksSourceLog")
    List<WorksSourceLog> worksSourceLogs;

	/**
	 * 获取工作日志列表 
	 */
	public List<WorksSourceLog> getWorksSourceLogs() {
		return worksSourceLogs;
	}

	/**
	 * 设置工作日志列表 
	 */
	public void setWorksSourceLogs(List<WorksSourceLog> worksSourceLogs) {
		this.worksSourceLogs = worksSourceLogs;
	}
	
	
    
}
