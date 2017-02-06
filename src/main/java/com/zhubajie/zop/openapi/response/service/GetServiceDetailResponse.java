package com.zhubajie.zop.openapi.response.service;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "getServiceDetail")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class GetServiceDetailResponse extends AbstractSuccessResponse{
	 /**
     * 三级基础类目(新)
     */
	@XmlElement
    private Integer categoryId;

    /**
     * 二级基础类目(新)
     */
	@XmlElement
    private Integer category2id;

    /**
     * 一级基础类目(新)
     */
	@XmlElement
    private Integer category1id;
    
	/**
	 * 扩展属性
	 */
    @XmlElementWrapper(name="serviceAttibutes")
	@XmlElement(name="serviceAttibute")
    private List<ServiceAttribute> serviceAttibutes;
    
    /**
     * 服务标题
     */
    @XmlElement
	private String subject;
	
	/**
	 * 图片url
	 */
    @XmlElement
    private String imgurl;
    
    /**
     * 网站价格
     */
    @XmlElement
    private Float amount;

    /**
     * app价格
     */
    @XmlElement
    private Float amountApp;
    
    /**
     * 案例
     */
    @XmlElementWrapper(name="serviceCases")
	@XmlElement(name="serviceCase")
    private List<ServiceCase> serviceCases;
    
    /**
     * pc-服务详情
     */
    @XmlElement
    private String content;
    
    /**
     * app-服务详情
     */
    @XmlElement
    private String appContent;

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getCategory2id() {
		return category2id;
	}

	public void setCategory2id(Integer category2id) {
		this.category2id = category2id;
	}

	public Integer getCategory1id() {
		return category1id;
	}

	public void setCategory1id(Integer category1id) {
		this.category1id = category1id;
	}

	public List<ServiceAttribute> getServiceAttibutes() {
		return serviceAttibutes;
	}

	public void setServiceAttibutes(List<ServiceAttribute> serviceAttibutes) {
		this.serviceAttibutes = serviceAttibutes;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public Float getAmountApp() {
		return amountApp;
	}

	public void setAmountApp(Float amountApp) {
		this.amountApp = amountApp;
	}

	public List<ServiceCase> getServiceCases() {
		return serviceCases;
	}

	public void setServiceCases(List<ServiceCase> serviceCases) {
		this.serviceCases = serviceCases;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAppContent() {
		return appContent;
	}

	public void setAppContent(String appContent) {
		this.appContent = appContent;
	}
}
