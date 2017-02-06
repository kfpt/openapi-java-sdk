package com.zhubajie.zop.openapi.response.trade;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "sellerTradeSearch")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class SellerTradeSearchResponse extends AbstractSuccessResponse {
	
	@XmlElementWrapper(name="tradeInfos")
	@XmlElement(name="tradeInfo")
	List<TradeInfo> tradeInfos;

	@XmlElement
	private Integer total; // 总条数

	@XmlElement
	private Integer totalPage; // 总页数

	@XmlElement
	private int currentPage; // 当前页数

	@XmlElement
	private int pageSize; // 当前分页大小
	/**
	 * 获取交易列表
	 */
	public List<TradeInfo> getTradeInfos() {
		return tradeInfos;
	}

	/**
	 * 设置交易列表
	 */
	public void setTradeInfos(List<TradeInfo> tradeInfos) {
		this.tradeInfos = tradeInfos;
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
