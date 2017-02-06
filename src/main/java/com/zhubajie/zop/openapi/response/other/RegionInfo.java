package com.zhubajie.zop.openapi.response.other;

public class RegionInfo {
	
		private Short regionId; // 地域ID
		
		private Short parentId; // 父地域ID
		
		private String regionName; // 地域名称
		
		private String regionEname; // 地域英文名
		
		private Short sort; //排序
		
		private String currency; // 默认种币
		
		private Integer timediff; // 认默时差（秒）
		
		private Double longitude; // 经度
		
		private Double latitude; // 纬度
		
		private String admincode; // 行政区划编码
		
		private Byte level; // 级别
		
		private String zipcode; // 邮政编码
		
		public Short getRegionId() {
			return regionId;
		}
		public void setRegionId(Short regionId) {
			this.regionId = regionId;
		}
		public Short getParentId() {
			return parentId;
		}
		public void setParentId(Short parentId) {
			this.parentId = parentId;
		}
		public String getRegionName() {
			return regionName;
		}
		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}
		public String getRegionEname() {
			return regionEname;
		}
		public void setRegionEname(String regionEname) {
			this.regionEname = regionEname;
		}
		public Short getSort() {
			return sort;
		}
		public void setSort(Short sort) {
			this.sort = sort;
		}
		public String getCurrency() {
			return currency;
		}
		public void setCurrency(String currency) {
			this.currency = currency;
		}
		public Integer getTimediff() {
			return timediff;
		}
		public void setTimediff(Integer timediff) {
			this.timediff = timediff;
		}
		public Double getLongitude() {
			return longitude;
		}
		public void setLongitude(Double longitude) {
			this.longitude = longitude;
		}
		public Double getLatitude() {
			return latitude;
		}
		public void setLatitude(Double latitude) {
			this.latitude = latitude;
		}
		public String getAdmincode() {
			return admincode;
		}
		public void setAdmincode(String admincode) {
			this.admincode = admincode;
		}
		public Byte getLevel() {
			return level;
		}
		public void setLevel(Byte level) {
			this.level = level;
		}
		public String getZipcode() {
			return zipcode;
		}
		public void setZipcode(String zipcode) {
			this.zipcode = zipcode;
		}
		
}
