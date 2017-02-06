package com.zhubajie.zop.openapi.request.user;

import javax.validation.constraints.NotNull;

import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

/**
 * Created by malibin on 16-6-12.
 *
 * 批量用户请求参数
 */
public class UserCertStatusRequest extends UserAbstractRopRequest {
    
	/**
	 * 类型
	 */
    @NotNull
    private Byte type;

	public Byte getType() {
		return type;
	}

	public void setType(Byte type) {
		this.type = type;
	}

}
