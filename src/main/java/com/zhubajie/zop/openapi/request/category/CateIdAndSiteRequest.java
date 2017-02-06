package com.zhubajie.zop.openapi.request.category;

import javax.validation.constraints.NotNull;
import com.rop.AbstractRopRequest;

public class CateIdAndSiteRequest extends AbstractRopRequest{

	/**
     * 基础类目Id
     */
	@NotNull
    private Integer categoryId;
    /**
     * 来源站点，1猪八戒，2天蓬网
     */
	@NotNull
    private Integer site;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CateIdAndSiteQuerier{");
        sb.append("categoryId=").append(categoryId);
        sb.append(", site=").append(site);
        sb.append('}');
        return sb.toString();
    }

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getSite() {
		return site;
	}

	public void setSite(Integer site) {
		this.site = site;
	}
	
}
