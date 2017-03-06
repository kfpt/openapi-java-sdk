package com.zhubajie.zop.openapi.request.service;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

public class ServiceAddCaseRequest extends UserAbstractRopRequest{

    /**
     * 任务ID
     */
    @Min(1)
    private Integer taskId;

    /**
     * 案例标题
     */
    @NotBlank
    @Length(min=1,max=50)
    private String title;

    /**
     * 设计费用
     */
    @NotNull
    @Min(0)
    private Float amount;

    /**
     * 三级类目ID
     */
    @NotNull
    @Min(1)
    private Integer categoryId;

    /**
     * 客户名称
     */
    @NotBlank
    @Length(min=1,max=20)
    private String customer;

    /**
     * 设计方案
     */
    @NotBlank
    @Length(min=1,max=2000)
    private String content;
    
    /**
     * 封面文件URL
     */
    @NotBlank
    @Length(max=400)
    private String coverFile;
    
    /**
     * 音频文件URL
     */
    @Length(max=400)
    private String audioFile;
    
    /**
     * 标签信息
     */
    @Length(max=400)
    private String lablesInfos;
    
    /**
     * 扩展属性
     */
    private List<AttrValueIdInfo> attrvalueIds;
    /**
     * 案例内容列表
     */
    @NotEmpty
    private List<CaseFileInfo> caseFiles;

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCoverFile() {
		return coverFile;
	}

	public void setCoverFile(String coverFile) {
		this.coverFile = coverFile;
	}

	public String getAudioFile() {
		return audioFile;
	}

	public void setAudioFile(String audioFile) {
		this.audioFile = audioFile;
	}

	public String getLablesInfos() {
		return lablesInfos;
	}

	public void setLablesInfos(String lablesInfos) {
		this.lablesInfos = lablesInfos;
	}

	public List<CaseFileInfo> getCaseFiles() {
		return caseFiles;
	}

	public void setCaseFiles(List<CaseFileInfo> caseFiles) {
		this.caseFiles = caseFiles;
	}

	public List<AttrValueIdInfo> getAttrvalueIds() {
		return attrvalueIds;
	}

	public void setAttrvalueIds(List<AttrValueIdInfo> attrvalueIds) {
		this.attrvalueIds = attrvalueIds;
	}

}
