package com.zhubajie.zop.openapi.response.service;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "getRecommendServiceList")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class GetRecommendServiceListResponse extends AbstractSuccessResponse{
	 /**
     * 总页数
     */
	@XmlElement
    private Integer pages;
    
    /**
     * 数据总数，满足条件的数量
     */
	@XmlElement
    private Integer total;
	
	/**
	 * 橱窗推荐服务列表 
	 */
	@XmlElementWrapper(name="recommendServices")
	@XmlElement(name="recommendService")
	private List<RecommendService> recommendServices;

	public List<RecommendService> getRecommendServices() {
		return recommendServices;
	}

	public void setRecommendServices(List<RecommendService> recommendServices) {
		this.recommendServices = recommendServices;
	}

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
}
