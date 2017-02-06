package com.zhubajie.zop.openapi.response.user;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "getCustomerInfos")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetCustomerInfosResponse extends AbstractSuccessResponse {
	
	@XmlElementWrapper(name="customerInfos")
	@XmlElement(name="customerInfo")
	private List<CustomerInfo> customerInfos;
	
	@XmlElement
	private Integer total; // 总条数

	@XmlElement
	private Integer totalPage; // 总页数

	@XmlElement
	private int currentPage; // 当前页数

	@XmlElement
	private int pageSize; // 当前分页大小

	public List<CustomerInfo> getCustomerInfos() {
		return customerInfos;
	}

	public void setCustomerInfos(List<CustomerInfo> customerInfos) {
		this.customerInfos = customerInfos;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
}
