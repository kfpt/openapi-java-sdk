package com.zhubajie.zop.openapi.request.category;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.rop.AbstractRopRequest;

public class CategoryExtValRequest extends AbstractRopRequest{

	/**
     * 属性值id 列表
     */
	@NotNull
    private List<Integer> valIdList;

    /**
     * 所属扩展属性
     */
	@NotNull
    private List<Integer> extIdList;

    public List<Integer> getValIdList() {
        return valIdList;
    }

    public void setValIdList(List<Integer> valIdList) {
        this.valIdList = valIdList;
    }

    public List<Integer> getExtIdList() {
        return extIdList;
    }

    public void setExtIdList(List<Integer> extIdList) {
        this.extIdList = extIdList;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CategoryExtValQuerier{");
        sb.append("valIdList=").append(valIdList);
        sb.append(", extIdList=").append(extIdList);
        sb.append('}');
        return sb.toString();
    }
}
