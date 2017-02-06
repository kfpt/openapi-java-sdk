package com.zhubajie.zop.openapi.response.agreement;

import java.util.Date;
import java.util.List;

/**
 * @Description:交易协议附加合同信息
 * @author chenjindong
 * @date 2016-11-09 上午10:19:40
 * 
 */
public class AgreementAddons{
	
    /**
     * 年月日
     */
    private Date createymd;

    /**
     * 时间
     */
    private Integer createtime;

    /**
     * 卖家是否同意协议，0：否，1：是
     */
    private Byte slIsAgree;

    /**
     * 同意时间
     */
    private Integer slAgreetime;

    /**
     * 买家是否同意协议，0：否，1：是
     */
    private Byte byIsAgree;

    /**
     * 同意时间
     */
    private Integer byAgreetime;

    /**
     * 协议内容，JSON串
     */
    private String content;

    /**
     * 附件，JSON串
     */
    private String files;

    /**
     * 是否是工期附加合同:0不是，1是
     */
    private Byte isItem;
    
    /**
     * 附加合同工期数据
     */
    private List<AgreementItem> agreementItemDOList;

	public Date getCreateymd() {
		return createymd;
	}

	public void setCreateymd(Date createymd) {
		this.createymd = createymd;
	}

	public Integer getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Integer createtime) {
		this.createtime = createtime;
	}

	public Byte getSlIsAgree() {
		return slIsAgree;
	}

	public void setSlIsAgree(Byte slIsAgree) {
		this.slIsAgree = slIsAgree;
	}

	public Integer getSlAgreetime() {
		return slAgreetime;
	}

	public void setSlAgreetime(Integer slAgreetime) {
		this.slAgreetime = slAgreetime;
	}

	public Byte getByIsAgree() {
		return byIsAgree;
	}

	public void setByIsAgree(Byte byIsAgree) {
		this.byIsAgree = byIsAgree;
	}

	public Integer getByAgreetime() {
		return byAgreetime;
	}

	public void setByAgreetime(Integer byAgreetime) {
		this.byAgreetime = byAgreetime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFiles() {
		return files;
	}

	public void setFiles(String files) {
		this.files = files;
	}

	public Byte getIsItem() {
		return isItem;
	}

	public void setIsItem(Byte isItem) {
		this.isItem = isItem;
	}

	public List<AgreementItem> getAgreementItemDOList() {
		return agreementItemDOList;
	}

	public void setAgreementItemDOList(List<AgreementItem> agreementItemDOList) {
		this.agreementItemDOList = agreementItemDOList;
	}
    
}
