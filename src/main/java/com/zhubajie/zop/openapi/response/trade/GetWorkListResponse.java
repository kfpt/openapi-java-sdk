package com.zhubajie.zop.openapi.response.trade;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "getWorkListResponse")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class GetWorkListResponse extends AbstractSuccessResponse {

	@XmlElementWrapper(name="worksIds")
	private List<Integer> worksIds;
	@XmlElement
	private Integer totalPage; //总页数
	@XmlElement
	private Integer totalCount; // 总记录数

	public List<Integer> getWorksIds() {
		return worksIds;
	}

	public void setWorksIds(List<Integer> worksIds) {
		this.worksIds = worksIds;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	
}
