package com.zhubajie.zop.openapi.request.category;

import javax.validation.constraints.NotNull;

import com.rop.AbstractRopRequest;

public class PubParentAndSiteRequest extends AbstractRopRequest{

	/**
     * 发布类目父id，要获取第一级传0
     */
	@NotNull
    private Integer parentId;
    /**
     * 站点：1猪八戒，2天蓬网
     */
	@NotNull
    private Integer site;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PubParentAndSiteQuerier{");
        sb.append("parentId=").append(parentId);
        sb.append(", site=").append(site);
        sb.append('}');
        return sb.toString();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getSite() {
        return site;
    }

    public void setSite(Integer site) {
        this.site = site;
    }
}
