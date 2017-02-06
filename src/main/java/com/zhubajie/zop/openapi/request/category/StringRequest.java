package com.zhubajie.zop.openapi.request.category;

import javax.validation.constraints.NotNull;
import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

public class StringRequest extends UserAbstractRopRequest{
	/**
	 * 字符串验证
	 */
    @NotNull
    private String data ;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
