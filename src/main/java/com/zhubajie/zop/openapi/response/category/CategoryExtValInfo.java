package com.zhubajie.zop.openapi.response.category;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class CategoryExtValInfo {
	/**
     * 属性值主键
     */
	@XmlElement
    private Integer valId;

    /**
     * 所属扩展属性
     */
	@XmlElement
    private Integer extId;

    /**
     * 属性值
     */
	@XmlElement
    private String valName;

    /**
     * 排序
     */
	@XmlElement
    private Short valSort;

    public Integer getValId() {
        return valId;
    }

    public void setValId(Integer valId) {
        this.valId = valId;
    }

    public Integer getExtId() {
        return extId;
    }

    public void setExtId(Integer extId) {
        this.extId = extId;
    }

    public String getValName() {
        return valName;
    }

    public void setValName(String valName) {
        this.valName = valName;
    }

    public Short getValSort() {
        return valSort;
    }

    public void setValSort(Short valSort) {
        this.valSort = valSort;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CategoryExtValDto{");
        sb.append("valId=").append(valId);
        sb.append(", extId=").append(extId);
        sb.append(", valName='").append(valName).append('\'');
        sb.append(", valSort=").append(valSort);
        sb.append('}');
        return sb.toString();
    }
}
