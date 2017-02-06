package com.zhubajie.zop.openapi.request.service;

public class ShortSpServiceFileInfo {

	private Integer fileId;

    /**
     * 服务ID
     */
    private Integer serviceId;

    /**
     * 地址
     */
    private String url;

    /**
     * 视频播放链接，上传视频有播放链接的则保存
     */
    private String link;

    /**
     * 封面图片
     */
    private String pic;

    /**
     * 简介
     */
    private String intro;

    /**
     * 附件类型1图片2音频3视频
     */
    private Byte mode;

	public Integer getFileId() {
		return fileId;
	}

	public void setFileId(Integer fileId) {
		this.fileId = fileId;
	}

	public Integer getServiceId() {
		return serviceId;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public Byte getMode() {
		return mode;
	}

	public void setMode(Byte mode) {
		this.mode = mode;
	}
}
