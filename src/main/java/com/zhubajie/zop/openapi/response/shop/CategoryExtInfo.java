package com.zhubajie.zop.openapi.response.shop;

import java.util.List;

public class CategoryExtInfo {

		private Integer extId; // 扩展属性类目ID

		private Integer categoryId; // 基本类目ID(三级）
		
		private String extName; // 扩展属性名称

//		private Byte type; //  0服务商扩展(入驻使用)，1需求扩展，2服务扩展

		private Byte isShow; // 是否显示

		private String extType; // 表单类型:text(文本框)select(选择框),checkbox(多选框),radio(单选框),textarea(富文本框),password(密码框),hidden(隐藏)

		private Byte extSort; // 扩展属性排序
		
		private Integer maxSelect; // 扩展属性最多可选几项，冗余字段序列化出来的属性

		private List<CategoryExtValInfo> selectableVals; // 可选扩展属性列表

		private List<CategoryExtValInfo> selectedVals; // 用户已选的扩展属性列表

		public Integer getExtId() {
			return extId;
		}

		public void setExtId(Integer extId) {
			this.extId = extId;
		}

		public Integer getCategoryId() {
			return categoryId;
		}

		public void setCategoryId(Integer categoryId) {
			this.categoryId = categoryId;
		}

		public String getExtName() {
			return extName;
		}

		public void setExtName(String extName) {
			this.extName = extName;
		}

		public Byte getIsShow() {
			return isShow;
		}

		public void setIsShow(Byte isShow) {
			this.isShow = isShow;
		}

		public String getExtType() {
			return extType;
		}

		public void setExtType(String extType) {
			this.extType = extType;
		}

		public Byte getExtSort() {
			return extSort;
		}

		public void setExtSort(Byte extSort) {
			this.extSort = extSort;
		}

		public Integer getMaxSelect() {
			return maxSelect;
		}

		public void setMaxSelect(Integer maxSelect) {
			this.maxSelect = maxSelect;
		}

		public List<CategoryExtValInfo> getSelectableVals() {
			return selectableVals;
		}

		public void setSelectableVals(List<CategoryExtValInfo> selectableVals) {
			this.selectableVals = selectableVals;
		}

		public List<CategoryExtValInfo> getSelectedVals() {
			return selectedVals;
		}

		public void setSelectedVals(List<CategoryExtValInfo> selectedVals) {
			this.selectedVals = selectedVals;
		}
		
}
