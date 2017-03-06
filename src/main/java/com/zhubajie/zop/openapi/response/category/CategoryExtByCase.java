package com.zhubajie.zop.openapi.response.category;

import java.util.List;

public class CategoryExtByCase {

		/**
	    * 属性id
	    */
	    private Integer attrId;
	    /**
	     * 属性名称
	     */
	    private String fileattrName;
	    /**
	     * 是否必选
	     */
	    private Byte isMust;
	    /**
	     * 类型 radio单选 checkbox多选
	     */
	    private String attrType;
	    /**
	     * 最多选择个数
	     */
	    private Integer maxSelect;
	    
	      /**
	       * 属性值信息
	       */
	    private List<AttrValue> attrValueList;
	    
		public Integer getAttrId() {
			return attrId;
		}
		public void setAttrId(Integer attrId) {
			this.attrId = attrId;
		}
		public String getFileattrName() {
			return fileattrName;
		}
		public void setFileattrName(String fileattrName) {
			this.fileattrName = fileattrName;
		}
		public Byte getIsMust() {
			return isMust;
		}
		public void setIsMust(Byte isMust) {
			this.isMust = isMust;
		}
		public String getAttrType() {
			return attrType;
		}
		public void setAttrType(String attrType) {
			this.attrType = attrType;
		}
		public Integer getMaxSelect() {
			return maxSelect;
		}
		public void setMaxSelect(Integer maxSelect) {
			this.maxSelect = maxSelect;
		}
		public List<AttrValue> getAttrValueList() {
			return attrValueList;
		}
		public void setAttrValueList(List<AttrValue> attrValueList) {
			this.attrValueList = attrValueList;
		}

}
