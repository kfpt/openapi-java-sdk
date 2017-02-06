package com.zhubajie.zop.openapi.response.agreement;

import java.util.Date;
import java.util.List;
/**
 * @Description:合同基本信息  
 * @author chenjindong
 * @date 2016-11-09 上午10:19:40
 */
public class AgreementBase {

	/**
	 * 合同书id
	 */
	private Integer agreeid;

	/**
	 * 任务id号
	 */
	private Integer taskId;

	/**
	 * 稿件ID
	 */
	private Integer worksId;

	/**
	 * 卖家昵称
	 */
	private String slNickname;

	/**
	 * 买家昵称
	 */
	private String byNickname;

	/**
	 * 发起时间
	 */
	private Integer createtime;

	/**
	 * 卖家是否同意协议,0:否，1：是
	 */
	private Byte slIsAgree;

	/**
	 * 卖家同意时间
	 */
	private Integer slAgreetime;

	/**
	 * 买家是否同意协议,0:否，1：是
	 */
	private Byte byIsAgree;

	/**
	 * 买家同意时间
	 */
	private Integer byAgreetime;

	/**
	 * 协议发起者类型，1雇主，2服务商
	 */
	private Byte pubUserType;

	/**
	 * 协议是否生效，1生效，0未生效
	 */
	private Byte isActive;

	/**
	 * 生效时间
	 */
	private Integer isActivetime;

	/**
	 * 协议是否作废，1是，0否
	 */
	private Byte isInvalid;

	/**
	 * 作废时间
	 */
	private Integer isInvalidtime;

	/**
	 * 协议内容，JSON串
	 */
	private String content;

	/**
	 * 附件
	 */
	private String files;
	
	/** 
	 * 雇主上次提醒服务商同意协议的时间
	 *  
	 */
	private Integer buyerRemindTime;
	
	/**
	 * 交易合同协议步骤
	 * 0不需协议 1需要协议 2 雇主通知服务商发起交易协议 3 已发起交易协议 4 同意交易协议 5 发起附加协议 6 同意附加协议
	 */
	private Integer agreeStep;
	
	/**
	 * 合同编号
	 */
	private String	contractNo;

	/**
     * 是否邀请签署方实名认证：0不邀请，1邀请
     */
    private Byte isReal;

    /**
     * 是否需要包含工期:0不需要，1需要
     */
    private Byte isItem;

    /**
     * 协议版本号:1初始版本，2二次改版，3三次改版
     */
    private Byte version;

	public Integer getAgreeid() {
		return agreeid;
	}

	public void setAgreeid(Integer agreeid) {
		this.agreeid = agreeid;
	}

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public Integer getWorksId() {
		return worksId;
	}

	public void setWorksId(Integer worksId) {
		this.worksId = worksId;
	}

	public String getSlNickname() {
		return slNickname;
	}

	public void setSlNickname(String slNickname) {
		this.slNickname = slNickname;
	}

	public String getByNickname() {
		return byNickname;
	}

	public void setByNickname(String byNickname) {
		this.byNickname = byNickname;
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

	public Byte getPubUserType() {
		return pubUserType;
	}

	public void setPubUserType(Byte pubUserType) {
		this.pubUserType = pubUserType;
	}

	public Byte getIsActive() {
		return isActive;
	}

	public void setIsActive(Byte isActive) {
		this.isActive = isActive;
	}

	public Integer getIsActivetime() {
		return isActivetime;
	}

	public void setIsActivetime(Integer isActivetime) {
		this.isActivetime = isActivetime;
	}

	public Byte getIsInvalid() {
		return isInvalid;
	}

	public void setIsInvalid(Byte isInvalid) {
		this.isInvalid = isInvalid;
	}

	public Integer getIsInvalidtime() {
		return isInvalidtime;
	}

	public void setIsInvalidtime(Integer isInvalidtime) {
		this.isInvalidtime = isInvalidtime;
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

	public Integer getBuyerRemindTime() {
		return buyerRemindTime;
	}

	public void setBuyerRemindTime(Integer buyerRemindTime) {
		this.buyerRemindTime = buyerRemindTime;
	}

	public Integer getAgreeStep() {
		return agreeStep;
	}

	public void setAgreeStep(Integer agreeStep) {
		this.agreeStep = agreeStep;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public Byte getIsReal() {
		return isReal;
	}

	public void setIsReal(Byte isReal) {
		this.isReal = isReal;
	}

	public Byte getIsItem() {
		return isItem;
	}

	public void setIsItem(Byte isItem) {
		this.isItem = isItem;
	}

	public Byte getVersion() {
		return version;
	}

	public void setVersion(Byte version) {
		this.version = version;
	}

    
}
