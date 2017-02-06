package com.zhubajie.zop.openapi.response.agreement;

/**
 * @Description:线下合同文件内容
 * @author chenjindong
 * @date 2016-11-09 上午10:19:40
 * 
 */
public class AgreementFile{
	
	/**
	 * 文件ID
	 */
	private Integer fileId;
	
	/**
	 * 主合同ID
	 */
	private Integer agreeid;
	
	/**
	 * 创建时间
	 */
	private Integer createtime;

	/**
	 * 文件七牛云使用的key
	 */
	private String fileKey;

	/**
	 * 源文件名
	 */
	private String ofilename;

	/**
	 * 文件大小
	 */
	private Integer filesize;

	/**
	 * 文件后缀
	 */
	private String filext;
	
	/**
     * 雇主下载次数
     */
    private Integer byDownloadTime;

    /**
     * 服务商下载次数
     */
    private Integer slDownloadTime;

	public Integer getFileId() {
		return fileId;
	}

	public void setFileId(Integer fileId) {
		this.fileId = fileId;
	}

	public Integer getAgreeid() {
		return agreeid;
	}

	public void setAgreeid(Integer agreeid) {
		this.agreeid = agreeid;
	}

	public Integer getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Integer createtime) {
		this.createtime = createtime;
	}

	public String getFileKey() {
		return fileKey;
	}

	public void setFileKey(String fileKey) {
		this.fileKey = fileKey;
	}

	public String getOfilename() {
		return ofilename;
	}

	public void setOfilename(String ofilename) {
		this.ofilename = ofilename;
	}

	public Integer getFilesize() {
		return filesize;
	}

	public void setFilesize(Integer filesize) {
		this.filesize = filesize;
	}

	public String getFilext() {
		return filext;
	}

	public void setFilext(String filext) {
		this.filext = filext;
	}

	public Integer getByDownloadTime() {
		return byDownloadTime;
	}

	public void setByDownloadTime(Integer byDownloadTime) {
		this.byDownloadTime = byDownloadTime;
	}

	public Integer getSlDownloadTime() {
		return slDownloadTime;
	}

	public void setSlDownloadTime(Integer slDownloadTime) {
		this.slDownloadTime = slDownloadTime;
	}

	@Override
	public String toString() {
		return "AgreementFileDO [fileId=" + fileId + ", agreeid=" + agreeid
				+ ", createtime=" + createtime + ", fileKey=" + fileKey
				+ ", ofilename=" + ofilename + ", filesize=" + filesize
				+ ", filext=" + filext + ", byDownloadTime=" + byDownloadTime
				+ ", slDownloadTime=" + slDownloadTime + "]";
	}
}
