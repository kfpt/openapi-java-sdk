package com.zhubajie.zop.openapi.request.service;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.zhubajie.zop.openapi.common.Rtf;
import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

public class ServicesRequest extends UserAbstractRopRequest{

	//服务id
	private Integer serviceId;
	//服务标题
	@NotBlank
	@Length(min=1,max=50)
	private String subject;
	//PC价格
	@Min(value=0)
	@NotNull
	private Float amount;
	//app价格
	@Min(value=0)
	@NotNull
	private Float amountApp;
	//单位
	@NotBlank
	@Length(min=1,max=32)
	private String unit;
	//封面图片
	@NotBlank
	@Length(min=1,max=200)
	private String imgurl;
	//服务内容
	@NotBlank
	@Rtf
	@Length(min=1,max=4000)
	private String cont;
	//app服务内容
	@NotBlank
	@Rtf
	@Length(min=1,max=4000)
	private String contApp;
	//三级基础类目(新)
	@Min(value=0)
	@NotNull
    private Integer categoryId;
	//成功案例
	private List<ShortSpServiceFileInfo> fileList;
	//服务属性
	private List<SpServiceE2vDtoInfo> extList;
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
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
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public String getCont() {
		return cont;
	}
	public void setCont(String cont) {
		this.cont = cont;
	}
	public String getContApp() {
		return contApp;
	}
	public void setContApp(String contApp) {
		this.contApp = contApp;
	}
	public Integer getServiceId() {
		return serviceId;
	}
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	
	public List<SpServiceE2vDtoInfo> getExtList() {
		return extList;
	}
	public void setExtList(List<SpServiceE2vDtoInfo> extList) {
		this.extList = extList;
	}
	public List<ShortSpServiceFileInfo> getFileList() {
		return fileList;
	}
	public void setFileList(List<ShortSpServiceFileInfo> fileList) {
		this.fileList = fileList;
	}
	
}
