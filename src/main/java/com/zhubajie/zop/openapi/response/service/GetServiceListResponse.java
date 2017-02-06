package com.zhubajie.zop.openapi.response.service;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "serviceList")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class GetServiceListResponse extends AbstractSuccessResponse{
	
	 /**
     * 总页数
     */
	@XmlElement
    private Integer pages;
	
    /**
     * 数据总数，满足条件的数量，非本次查询结果条数，
     * 本次查询的具体结果由list字段确定
     */
	@XmlElement
    private Integer total;
	
    /**
     * 服务列表
     */
	@XmlElement
    private List<ServiceInfo> serviceList;
    
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public List<ServiceInfo> getServiceList() {
		return serviceList;
	}
	public void setServiceList(List<ServiceInfo> serviceList) {
		this.serviceList = serviceList;
	}
	
}
