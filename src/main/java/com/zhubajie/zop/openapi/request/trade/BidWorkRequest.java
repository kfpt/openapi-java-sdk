package com.zhubajie.zop.openapi.request.trade;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

public class BidWorkRequest extends UserAbstractRopRequest {

	@NotNull
	@Min(1)
    Integer taskId; // 需求id

	@NotBlank
    String content; // 交稿内容

	@NotEmpty
    List<WorkFile> files; // 附件地址，用“，”隔开
    
    @Pattern(regexp = "\\b((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\b")
    String ip; // 用户ip地址

    @NotNull
    @Min(0)
    Double copyrightPrice; // 版权价格

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

//	public Boolean getIsUseHideBidWork() {
//		return isUseHideBidWork;
//	}
//
//	public void setIsUseHideBidWork(Boolean isUseHideBidWork) {
//		this.isUseHideBidWork = isUseHideBidWork;
//	}

	public Double getCopyrightPrice() {
		return copyrightPrice;
	}

	public void setCopyrightPrice(Double copyrightPrice) {
		this.copyrightPrice = copyrightPrice;
	}

	public List<WorkFile> getFiles() {
		return files;
	}

	public void setFiles(List<WorkFile> files) {
		this.files = files;
	}
    
}
