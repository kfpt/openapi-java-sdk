package com.zhubajie.zop.openapi.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.zhubajie.zop.openapi.oauth.BrowserLaunch;
import com.zhubajie.zop.openapi.oauth.OAuth2;


/**
 * Title: OAuth2Demo 
 * Description: OAuth2.0授权demo 
 * Date: 2017年1月10日 下午5:16:37
 */
public class OAuth2Demo {

	public static void main(String[] args) throws IOException {
		/*
		 * 初始化授权基本参数
		 * client_id等同appKey
		 * client_secret等同appSecret
		 */
		OAuth2 oauth2 = new OAuth2("client_id", "client_secret", "redirect_uri");

		/*
		 * 根据所需设置相应参数
		 */
		oauth2.setScope("zbj.user.getUserBriefInfo-1.0 zbj.category.getCategoryDetail-1.0"); // 权限之间以空格隔开
		oauth2.setState("state"); // 开发者自定义 

		/*
		 * 获取授权码 
		 * 请注意，此处实现方式仅仅为了方便测试
		 */
		BrowserLaunch.openURL(oauth2.authorizeUrl());
		System.out.print("Hit enter when input code:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String code = br.readLine();

		try {
			String tokenInfo = oauth2.authorizationCode(code);
			System.out.println("access_token_info：" + tokenInfo); // 返回结果除access_token本身，还包括openid,scope等相关参数

			/*
			 * 刷新令牌 请注意，生产环境应是access_token过期才需要执行刷新逻辑 
			 */
			oauth2.setGrant_type("refresh_token");
			System.out.println("Hit enter when input refresh_token:");
			String refresh_token = br.readLine(); 
			String refreshTokenInfo = oauth2.refreshToken(refresh_token);
			System.out.println("after refresh token：" + refreshTokenInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
