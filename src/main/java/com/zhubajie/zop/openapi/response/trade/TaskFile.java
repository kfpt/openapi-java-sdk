package com.zhubajie.zop.openapi.response.trade;

public class TaskFile {

    /**
     * 文件名
     */
    private String ofileName;

    /**
     * 文件大小 单位byte
     */
    private Long fileSize;

    /**
     * 文件扩展名
     */
    private String fileExt;
    /**
     * 下载路径
     */
    private String downURL;


	public String getOfileName() {
		return ofileName;
	}

	public void setOfileName(String ofileName) {
		this.ofileName = ofileName;
	}

	public Long getFileSize() {
		return fileSize;
	}

	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	public String getFileExt() {
		return fileExt;
	}

	public void setFileExt(String fileExt) {
		this.fileExt = fileExt;
	}

	public String getDownURL() {
		return downURL;
	}

	public void setDownURL(String downURL) {
		this.downURL = downURL;
	}

}
