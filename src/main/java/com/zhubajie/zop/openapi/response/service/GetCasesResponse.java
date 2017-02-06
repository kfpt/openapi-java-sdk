/**
 * Package: com.zhubajie.zop.openapi.response.service
 * Description: 
 * Date: 2016年9月22日 下午3:56:24
 */

package com.zhubajie.zop.openapi.response.service;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

/**
 * Title: GetCasesResponse 
 * Description:  
 * Date: 2016年9月22日 下午3:56:24
 * @author wufenyun 
 */
@XmlRootElement(name = "casesList")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class GetCasesResponse extends AbstractSuccessResponse {
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
     * 案例列表
     */
	@XmlElement
	private List<CaseInfo> caseInfoList;
	
	/**
	 * @return the caseInfoList
	 */
	public List<CaseInfo> getCaseInfoList() {
		return caseInfoList;
	}
	/**
	 * @return the pages
	 */
	public Integer getPages() {
		return pages;
	}
	/**
	 * @return the total
	 */
	public Integer getTotal() {
		return total;
	}
	/**
	 * @param caseInfoList the caseInfoList to set
	 */
	public void setCaseInfoList(List<CaseInfo> caseInfoList) {
		this.caseInfoList = caseInfoList;
	}
	/**
	 * @param pages the pages to set
	 */
	public void setPages(Integer pages) {
		this.pages = pages;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(Integer total) {
		this.total = total;
	}
}
