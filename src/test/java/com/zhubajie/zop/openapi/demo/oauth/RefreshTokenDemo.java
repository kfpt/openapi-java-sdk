package com.zhubajie.zop.openapi.demo.oauth;

import com.zhubajie.zop.openapi.oauth.OAuth2;


/**
 * <p>Title: RefreshTokenDemo </p>
 * <p>Description: ZOP刷新令牌demo </p>
 * Date: 2016年8月11日 下午6:12:37
 * @author weitan
 * @version 1.0     
 */
public class RefreshTokenDemo {
	
	public static void main(String[] args) {
		// 初始化授权基本参数
		OAuth2 oauth2 = new OAuth2("2016063017v1cshi0001", "F9217466B37E9A8B23FFB309EC782BBD");
		// 设置授权类型为
		oauth2.setGrant_type("refresh_token");
		
		try {
			String tokenInfo = oauth2.refreshToken("b62988e2a656480d0bdb72086cb473a6");
			System.out.println("access_token_info：" + tokenInfo); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
