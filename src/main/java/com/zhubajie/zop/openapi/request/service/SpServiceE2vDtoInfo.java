package com.zhubajie.zop.openapi.request.service;

public class SpServiceE2vDtoInfo {
	private Integer e2vId;

    /**
     * 服务ID
     */
    private Integer serviceId;

    /**
     * 扩展分类ID
     */
    private Integer extId;

    /**
     * 扩展分类名称
     */
    private String extName;

    /**
     * 分类扩展属性ID
     */
    private Integer valId;

    /**
     * 分类扩展属性名称
     */
    private String valName;

    /**
     * 三级基础类目(新)
     */
    private Integer categoryId;

    private static final long serialVersionUID = 1L;

    public Integer getE2vId() {
        return e2vId;
    }

    public void setE2vId(Integer e2vId) {
        this.e2vId = e2vId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getExtId() {
        return extId;
    }

    public void setExtId(Integer extId) {
        this.extId = extId;
    }

    public String getExtName() {
        return extName;
    }

    public void setExtName(String extName) {
        this.extName = extName == null ? null : extName.trim();
    }

    public Integer getValId() {
        return valId;
    }

    public void setValId(Integer valId) {
        this.valId = valId;
    }

    public String getValName() {
        return valName;
    }

    public void setValName(String valName) {
        this.valName = valName == null ? null : valName.trim();
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", e2vId=").append(e2vId);
        sb.append(", serviceId=").append(serviceId);
        sb.append(", extId=").append(extId);
        sb.append(", extName=").append(extName);
        sb.append(", valId=").append(valId);
        sb.append(", valName=").append(valName);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
	
}
