package com.zhubajie.zop.openapi.client;

import java.util.Locale;

import com.rop.MessageFormat;
import com.rop.RopRequest;
import com.rop.client.ClientRequest;
import com.rop.client.CompositeResponse;
import com.rop.client.DefaultRopClient;
import com.zhubajie.zop.openapi.converter.ByteArrayConverter;
import com.zhubajie.zop.openapi.converter.DateConverter;
import com.zhubajie.zop.openapi.converter.ListConverter;


/**
 * Title: ZopClient 
 * Description: ZOP客户端 
 * Date: 2016年12月21日 下午6:14:14
 */
public class ZopClient {
	// 服务地址
	private final static String SERVER_URL = "http://openapi.zbj.com/router";

	private DefaultRopClient ropClient;
	
	public ZopClient(String serverUrl, String appKey, String appSecret, String accessToken) {
		ropClient = new DefaultRopClient(serverUrl, appKey, appSecret, accessToken);
		initOther();
	}
	
	public ZopClient(String appKey, String appSecret) {
		ropClient = new DefaultRopClient(SERVER_URL, appKey, appSecret);
		initOther();
	}
	
	public ZopClient(String appKey, String appSecret, String accessToken) {
		ropClient = new DefaultRopClient(SERVER_URL, appKey, appSecret, accessToken);
		initOther();
	}

	public ZopClient(String appKey, String appSecret, MessageFormat messageFormat) {
		ropClient = new DefaultRopClient(SERVER_URL, appKey, appSecret, messageFormat);
		initOther();
	}
	
	public ZopClient(String appKey, String appSecret, String accessToken, MessageFormat messageFormat) {
		ropClient = new DefaultRopClient(SERVER_URL, appKey, appSecret, accessToken);
		ropClient.setMessageFormat(messageFormat);
		initOther();
	}
	
	public <T> CompositeResponse execute(RopRequest ropRequest, Class<T> ropResponseClass, String methodName, String version) {
		return buildClientRequest().post(ropRequest, ropResponseClass, methodName, version);
	}
	
	/** 
	 * Title: initOther 
	 * Description:  初始化其他参数
	 */
	private void initOther() {
		ropClient.setMessageFormat(MessageFormat.json);
		ropClient.addRopConvertor(new DateConverter());
		ropClient.addRopConvertor(new ListConverter());
		ropClient.addRopConvertor(new ByteArrayConverter());
	}
	
	/** 
	 * Title: buildClientRequest 
	 * Description:  创建服务请求
	 */
	public ClientRequest buildClientRequest() {
		return ropClient.buildClientRequest();
	}
	
	
	
	public ZopClient setAccessToken(String accessToken) {
		ropClient.setAccessToken(accessToken);
		return this;
	}
	
	public ZopClient setLocal(Locale locale) {
		ropClient.setLocale(locale);
		return this;
	}
	
	public ZopClient setSessionId(String sessionId) {
		ropClient.setSessionId(sessionId);
		return this;
	}

}
