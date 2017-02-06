package com.zhubajie.zop.openapi.request.user;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

/**
 * 用户请求类，传递Openid
 * @author chenjindong
 * @Date 2016年11月09日
 */
public class UserSearchRequest extends UserAbstractRopRequest{

	//网站(1猪八戒网 2天蓬网)
	@Max(2)
	@Min(1)
	private Integer site;

	public Integer getSite() {
		return site;
	}

	public void setSite(Integer site) {
		this.site = site;
	}
	
}
