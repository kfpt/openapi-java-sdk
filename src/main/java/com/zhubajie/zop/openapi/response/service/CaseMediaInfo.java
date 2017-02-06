package com.zhubajie.zop.openapi.response.service;

public class CaseMediaInfo {

    private String imgUrl; // 路径

    private String ext; // 文件扩展名

    private Byte mode; // 类型：0图片（默认），1视频，2音频

    private String imgDesc; // 描述

    private String fileExtKey; // 扩展属性KEY，is_audio:语音解读，pic_desc:案例内容，封面图片为空

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	public Byte getMode() {
		return mode;
	}

	public void setMode(Byte mode) {
		this.mode = mode;
	}

	public String getImgDesc() {
		return imgDesc;
	}

	public void setImgDesc(String imgDesc) {
		this.imgDesc = imgDesc;
	}

	public String getFileExtKey() {
		return fileExtKey;
	}

	public void setFileExtKey(String fileExtKey) {
		this.fileExtKey = fileExtKey;
	}
    
}
