package com.zhubajie.zop.openapi.request.user;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

public class CustomerInfosReqest extends UserAbstractRopRequest {

    /** 页码 */
    @NotNull
    @Min(value=1)
    private Integer currentPage;
    
    /** 页大小*/
    @NotNull
    @Min(value=1)
    private Integer pageSize;
    
    @NotNull
    @Max(value=4)
    @Min(value=1)
    private Integer taskType; // 需求类型:1招标,2买服务，3雇佣，4比稿

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTaskType() {
		return taskType;
	}

	public void setTaskType(Integer taskType) {
		this.taskType = taskType;
	}
    
}
