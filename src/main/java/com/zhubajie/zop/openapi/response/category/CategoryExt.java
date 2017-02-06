package com.zhubajie.zop.openapi.response.category;

import java.util.List;

public class CategoryExt {

		//基础类目ID(三级）
		private Integer categoryId;
		//扩展属性id
		private Integer extId;
		//扩展属性名称
		private String extName;
		//扩展属性值
		private List<CategoryExtE2v> categoryExtE2v;
		
		
		public Integer getCategoryId() {
			return categoryId;
		}
		public void setCategoryId(Integer categoryId) {
			this.categoryId = categoryId;
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
			this.extName = extName;
		}
		
		public List<CategoryExtE2v> getCategoryExtE2v() {
			return categoryExtE2v;
		}
		public void setCategoryExtE2v(List<CategoryExtE2v> categoryExtE2v) {
			this.categoryExtE2v = categoryExtE2v;
		}
}
