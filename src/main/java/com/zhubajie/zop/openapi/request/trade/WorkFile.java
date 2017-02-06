package com.zhubajie.zop.openapi.request.trade;

import org.hibernate.validator.constraints.NotBlank;

public class WorkFile {

	@NotBlank
	private String filename;
	
	@NotBlank
	private String ofilename;
	
	@NotBlank
	private String filext;
	
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getOfilename() {
		return ofilename;
	}
	public void setOfilename(String ofilename) {
		this.ofilename = ofilename;
	}
	public String getFilext() {
		return filext;
	}
	public void setFilext(String filext) {
		this.filext = filext;
	}
}
