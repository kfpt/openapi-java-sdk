/**
 * Package: com.zhubajie.zop.openapi.response.service
 * Description: 
 * Date: 2016年9月22日 下午3:56:40
 */

package com.zhubajie.zop.openapi.response.service;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Title: CaseInfo 
 * Description:  
 * Date: 2016年9月22日 下午3:56:40
 * @author wufenyun 
 */
public class CaseInfo implements Serializable {

	/**
	 * Fields serialVersionUID: 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * ID
     */
    private Integer directoryId;
    /**
     * 三级类目
     */
    private Integer categoryId;
    /**
     * 三级类目名
     */
    private String categoryDesc;
	/**
     * 案例标题
     */
    private String title;
    /**
     * 详情连接
     */
    private String caseDetailUrl;
	/**
     * 设计费用
     */
    private BigDecimal amount;
	/**
     * 图片数量
     */
    private Short picNum;
	/**
     * 状态:0隐藏1显示2拒绝
     */
    private Byte status;
	/**
     * 封面图片
     */
    private String coverImgUrl;
	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}
	/**
	 * @return the categoryId
	 */
	public Integer getCategoryId() {
		return categoryId;
	}
	/**
	 * @return the coverImgUrl
	 */
	public String getCoverImgUrl() {
		return coverImgUrl;
	}
	/**
	 * @return the directoryId
	 */
	public Integer getDirectoryId() {
		return directoryId;
	}
	/**
	 * @return the picNum
	 */
	public Short getPicNum() {
		return picNum;
	}
	/**
	 * @return the status
	 */
	public Byte getStatus() {
		return status;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
    /**
	 * @param coverImgUrl the coverImgUrl to set
	 */
	public void setCoverImgUrl(String coverImgUrl) {
		this.coverImgUrl = coverImgUrl;
	}
    /**
	 * @param directoryId the directoryId to set
	 */
	public void setDirectoryId(Integer directoryId) {
		this.directoryId = directoryId;
	}
    /**
	 * @param picNum the picNum to set
	 */
	public void setPicNum(Short picNum) {
		this.picNum = picNum;
	}
    /**
	 * @param status the status to set
	 */
	public void setStatus(Byte status) {
		this.status = status;
	}
    /**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the caseDetailUrl
	 */
	public String getCaseDetailUrl() {
		return caseDetailUrl;
	}
	/**
	 * @param caseDetailUrl the caseDetailUrl to set
	 */
	public void setCaseDetailUrl(String caseDetailUrl) {
		this.caseDetailUrl = caseDetailUrl;
	}
	/**
	 * @return the categoryDesc
	 */
	public String getCategoryDesc() {
		return categoryDesc;
	}
	/**
	 * @param categoryDesc the categoryDesc to set
	 */
	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}

    
    
}
