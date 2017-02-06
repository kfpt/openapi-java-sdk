package com.zhubajie.zop.openapi.oauth;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.zhubajie.zop.openapi.utils.SignUtil;

public class OAuth2 {
	private final static String CHAR_SET = "UTF-8";
	
	private static String BASE_PATH = "http://openapi.zbj.com";
	private static String AUTHORIZE_URL = BASE_PATH + "/oauth2/authorize";
	private static String ACCESS_TOKEN_URL = BASE_PATH + "/oauth2/accesstoken";
	private static String REFRESH_TOKEN_URL = BASE_PATH + "/oauth2/refreshtoken";
	
	
	private String client_id;
	private String redirect_uri;
	private String client_secret;
	private String response_type = "code";
	private String grant_type = "authorization_code";
	private String scope;
	private String state;
	
	
	public OAuth2() {
		
	}
	
	public OAuth2(String serverUrl, String client_id, String client_secret, String redirect_uri) {
		setUrl(serverUrl);
		this.client_id = client_id;
		this.client_secret = client_secret;
		this.redirect_uri = redirect_uri;
	}
	
	public OAuth2(String client_id, String client_secret, String redirect_uri) {
		this.client_id = client_id;
		this.client_secret = client_secret;
		this.redirect_uri = redirect_uri;
	}
	
	public OAuth2(String client_id) {
		this.client_id = client_id;
	}
	
	public OAuth2(String client_id, String client_secret) {
		this.client_id = client_id;
		this.client_secret = client_secret;
	}
	
	public String authorizeUrl() throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		sb.append(AUTHORIZE_URL).append("?").append("client_id=").append(client_id).append("&")
		.append("response_type=").append(response_type).append("&").append("redirect_uri=")
		.append(URLEncoder.encode(redirect_uri, CHAR_SET));
		if(!StringUtils.isEmpty(scope)){
			sb.append("&").append("scope=").append(URLEncoder.encode(scope, CHAR_SET));
		}
		if(!StringUtils.isEmpty(state)){
			sb.append("&").append("state=").append(state);
		}
		return sb.toString();
	}
	
	/**
	 * 获取access_token
	 * 				授权码模式
	 * @Title: authorizationCode
	 * @param code
	 * @return
	 * @throws RestClientException
	 * @throws URISyntaxException
	 */
	public String authorizationCode(String code) throws RestClientException, URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		MultiValueMap<String, String> form = new LinkedMultiValueMap<String, String>();
		form.add("client_id", client_id);
		form.add("code", code);
		form.add("redirect_uri", redirect_uri);
		form.add("grant_type", grant_type);
		form.add("client_secret", getSign(form));
		String accessToken = restTemplate.postForObject(new URI(ACCESS_TOKEN_URL), form, String.class);
		return accessToken;
	}
	
	public void setUrl(String serverUrl) {
		BASE_PATH = serverUrl;
		AUTHORIZE_URL = serverUrl + "/oauth2/authorize";
		ACCESS_TOKEN_URL = serverUrl + "/oauth2/accesstoken";
		REFRESH_TOKEN_URL = serverUrl + "/oauth2/refreshtoken";
	}
	
	/**
	 * 刷新令牌
	 * @Title: refreshToken
	 * @param refreshToken
	 * @return
	 * @throws RestClientException
	 * @throws URISyntaxException
	 */
	public String refreshToken(String refreshToken) throws RestClientException, URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		MultiValueMap<String, String> form = new LinkedMultiValueMap<String, String>();
		form.add("client_id", client_id);
		form.add("refresh_token", refreshToken);
		form.add("grant_type", grant_type);
		form.add("client_secret", getSign(form));
		String accessToken = restTemplate.postForObject(new URI(REFRESH_TOKEN_URL), form, String.class);
		return accessToken;
	}
	
	private String getSign(MultiValueMap<String, String> form) {
		Map<String, String> map = new HashMap<String, String>();
		for (Entry<String, List<String>> entry : form.entrySet()){
			map.put(entry.getKey(), entry.getValue().get(0));
        }
		return SignUtil.sign(map, client_secret);
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public void setRedirect_uri(String redirect_uri) {
		this.redirect_uri = redirect_uri;
	}

	public void setClient_secret(String client_secret) {
		this.client_secret = client_secret;
	}

	public void setResponse_type(String response_type) {
		this.response_type = response_type;
	}

	public void setGrant_type(String grant_type) {
		this.grant_type = grant_type;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public void setState(String state) {
		this.state = state;
	}
}
