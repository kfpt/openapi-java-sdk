package com.zhubajie.zop.openapi.client;

import java.util.Locale;

import com.rop.MessageFormat;
import com.rop.client.CompositeResponse;
import com.zhubajie.zop.openapi.client.ZopClient;
import com.zhubajie.zop.openapi.request.user.UserBaseInfoRequest;
import com.zhubajie.zop.openapi.response.user.GetUserInfoResponse;


/**
 * Title: ApiSdkDemo 
 * Description: openapi-sdk-api调用demo
 * Date: 2016年12月21日 下午6:17:50
 */
public class ApiSdkDemo {
	
	
	public static void main(String[] args) {
		/*
		 * 初始化client，设置公共参数 serverUrl、appkey、appSecret、accessToken为必须参数
		 * serverUrl请根据具体请求环境填写，默认为http://openapi.zbj.com/router
		 * appkey、appSecret请开发者替换为自己创建应用所得
		 * accessToken通过Oauth2.0授权获得
		 * 此处有多种初始化方式，开发者可自行选择，并可根据所需设置其他相关参数
		 */
		ZopClient zopClient = new ZopClient("serverUrl", "appKey", "appSecret", "accessToken");
		zopClient.setLocal(Locale.SIMPLIFIED_CHINESE);  // 缺省为SIMPLIFIED_CHINESE
		
		/*
		 * 初始化request,设置业务参数
		 */
		UserBaseInfoRequest request = new UserBaseInfoRequest();
    	request.setOpenid("openid"); // 用户唯一标识,获取accesToken时同步获得
    	request.setType((byte)1);
    	
    	/*
		 * 调用接口获取资源 
		 * 统一调用方式 
		 */
		CompositeResponse<GetUserInfoResponse> response = zopClient.execute(request,
				GetUserInfoResponse.class,
				"zbj.user.getUserBriefInfo",
				"1.0");
		
    	if(response.isSuccessful()){
    		GetUserInfoResponse res = response.getSuccessResponse();
    		System.out.println("用户昵称：" + res.getNickname());
    	}
    	else{
    		System.out.println("错误描述：" + response.getErrorResponse().getMessage());
    	}
    	
	}
}
