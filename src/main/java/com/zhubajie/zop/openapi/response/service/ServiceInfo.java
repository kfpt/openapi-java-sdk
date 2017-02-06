package com.zhubajie.zop.openapi.response.service;

public class ServiceInfo {
	/**
	 * 服务ID
	 */
	private Integer serviceId;
	
    /**
     * 服务标题
     */
	private String subject;
	
	/**
	 * 图片url
	 */
    private String imgurl;
    
    /**
     * 服务链接
     */
    private String serviceurl;
    
    /**
     * 网站价格
     */
    private Float amount;

    /**
     * app价格
     */
    private Float amountApp;

    /**
     * 成功交易量
     */
    private Integer sales;
    
    /**
     * 服务状态
     * 1全部 2出售中 3已下架 4未通过审核
     */
    private Byte state;
    
    /**
     * 服务最后编辑时间
     */
    private Integer lasttime;
    
    /**
     * 首次发布时间
     */
    private Integer addtime;
    

	public Integer getServiceId() {
		return serviceId;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
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

	public String getServiceurl() {
		return serviceurl;
	}

	public void setServiceurl(String serviceurl) {
		this.serviceurl = serviceurl;
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

	public Integer getSales() {
		return sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}

	public Byte getState() {
		return state;
	}

	public void setState(Byte state) {
		this.state = state;
	}

	public Integer getLasttime() {
		return lasttime;
	}

	public void setLasttime(Integer lasttime) {
		this.lasttime = lasttime;
	}

	public Integer getAddtime() {
		return addtime;
	}

	public void setAddtime(Integer addtime) {
		this.addtime = addtime;
	}
}
