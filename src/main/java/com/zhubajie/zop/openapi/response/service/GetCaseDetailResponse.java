package com.zhubajie.zop.openapi.response.service;

import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "getCaseDetail")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class GetCaseDetailResponse extends AbstractSuccessResponse {
	@XmlElement
    private Integer caseId; // 案例ID
	@XmlElement
    private String nickname; // 昵称
	@XmlElement
    private Integer taskId; // 任务ID
	@XmlElement
    private String title; // 案例标题
	@XmlElement
    private BigDecimal amount; // 设计费用
	@XmlElement
    private Integer coverFileinfoId; // 案例封面 cm_fileinfo_id
	@XmlElement
    private String customer; // 客户名称
	@XmlElement
    private String comment; // 雇主评价
	@XmlElement
    private String content; // 设计方案
	@XmlElement
    private String coverImg; // 封面图片路径
	@XmlElement
    private Integer views; // 浏览数
	@XmlElementWrapper(name="medias")
    private List<CaseMediaInfo> medias; // 多媒体列表
	@XmlElementWrapper(name="attrs")
    private List<CaseAttrInfo> attrs; // 属性列表

	public Integer getCaseId() {
		return caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

//	public Integer getFilesystemId() {
//		return filesystemId;
//	}
//
//	public void setFilesystemId(Integer filesystemId) {
//		this.filesystemId = filesystemId;
//	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Integer getCoverFileinfoId() {
		return coverFileinfoId;
	}

	public void setCoverFileinfoId(Integer coverFileinfoId) {
		this.coverFileinfoId = coverFileinfoId;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCoverImg() {
		return coverImg;
	}

	public void setCoverImg(String coverImg) {
		this.coverImg = coverImg;
	}

	public Integer getViews() {
		return views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}

	public List<CaseMediaInfo> getMedias() {
		return medias;
	}

	public void setMedias(List<CaseMediaInfo> medias) {
		this.medias = medias;
	}

	public List<CaseAttrInfo> getAttrs() {
		return attrs;
	}

	public void setAttrs(List<CaseAttrInfo> attrs) {
		this.attrs = attrs;
	}
    
}
