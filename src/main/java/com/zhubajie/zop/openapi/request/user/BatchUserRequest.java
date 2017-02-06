package com.zhubajie.zop.openapi.request.user;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.rop.AbstractRopRequest;

/**
 * Created by malibin on 16-6-7.
 *
 * 批量用户请求参数
 */
public class BatchUserRequest extends AbstractRopRequest {

	/**
	 * 请求的用户集合
	 */
    @NotNull
    @Min(value = 0, message = "用户ID必须大于0")
    private List<Long> userIdList;

	public List<Long> getUserIdList() {
		return userIdList;
	}

	public void setUserIdList(List<Long> userIdList) {
		this.userIdList = userIdList;
	}

}
