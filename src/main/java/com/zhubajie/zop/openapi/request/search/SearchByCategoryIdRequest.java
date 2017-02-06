package com.zhubajie.zop.openapi.request.search;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rop.AbstractRopRequest;

public class SearchByCategoryIdRequest extends AbstractRopRequest{

	//第几页
	@NotNull
	@Min(1)
	@Max(100)
	private Integer page;
	//每页数量
	@NotNull
	@Min(1)
	@Max(200)
	private Integer size;
	//类目id
	@Pattern(regexp="([,0-9]*)",message="数据异常")
	private String catalogidtreefilter;
	
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public String getCatalogidtreefilter() {
		return catalogidtreefilter;
	}
	public void setCatalogidtreefilter(String catalogidtreefilter) {
		this.catalogidtreefilter = catalogidtreefilter;
	}
	
}
