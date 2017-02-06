package com.zhubajie.zop.openapi.response.service;

public class ServiceCase {
	
    /**
     * 视频播放链接
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
     * 附件类型 1图片2音频3视频
     */
    private Byte mode;


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
