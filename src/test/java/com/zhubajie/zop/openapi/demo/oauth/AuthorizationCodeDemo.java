package com.zhubajie.zop.openapi.demo.oauth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLEncoder;

import com.zhubajie.zop.openapi.oauth.BrowserLaunch;
import com.zhubajie.zop.openapi.oauth.OAuth2;


/**
 * <p>Title: AuthorizationCodeDemo </p>
 * <p>Description: ZOP授权码模式demo </p>
 * Date: 2016年8月11日 下午6:12:05
 * @author weitan
 * @version 1.0            
 */
public class AuthorizationCodeDemo {

	public static void main(String[] args) throws IOException {
		// 初始化授权基本参数
		OAuth2 oauth2 = new OAuth2("2016091921162624iN30", "ADE898CE6277A64B6A875C17A4CDE996",
				"http://openapi.zbj.com/oauth2/success");

		/*
		 * 根据所需设置相应参数
		 */
		oauth2.setScope("all"); 	// 权限之间以空格隔开
		oauth2.setState(URLEncoder.encode("{\"successToken\":\"@@$-SUCCESS_TOKEN$-@@\"}")); 

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
			// 返回结果除access_token本身，还包括openid,scope等相关参数
			System.out.println("access_token_info：" + tokenInfo); 

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
