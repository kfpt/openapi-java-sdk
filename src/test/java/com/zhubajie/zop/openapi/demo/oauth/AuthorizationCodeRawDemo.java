package com.zhubajie.zop.openapi.demo.oauth;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;


/**
 * <p>Title: AuthorizationCodeRawDemo </p>
 * <p>Description: ZOP-OAuth2.0授权demo </p>
 * Date: 2016年8月16日 下午9:57:06
 * @author weitan
 * @version 1.0
 */
public class AuthorizationCodeRawDemo {
	/** 授权请求域名*/
	private final static String BASE_PATH = "http://openapi.dev.zbjdev.com";
	/** 编码格式*/
	private static final String UTF8 = "UTF-8";
	
	/** 
	 * <p>Title: sendPostMessage </p>
	 * <p>Description: 发送POST请求 </p>
	 * @param params post请求参数
	 * @param urlStr 请求地址
	 * @return String 请求结果
	 */
	public static String sendPostMessage(Map<String, String> params, String urlStr) {
		URL url = null;
		try {
			url = new URL(urlStr);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		StringBuffer stringBuffer = new StringBuffer();
		if (params != null && !params.isEmpty()) {
			for (Map.Entry<String, String> entry : params.entrySet()) {
				try {
					stringBuffer.append(entry.getKey()).append("=").append(URLEncoder.encode(entry.getValue(), UTF8))
							.append("&");
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
			}
			stringBuffer.deleteCharAt(stringBuffer.length() - 1);	// 删掉最后一个 & 字符
			try {
				HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
				httpURLConnection.setConnectTimeout(3000);
				httpURLConnection.setDoInput(true);					// 从服务器获取数据
				httpURLConnection.setDoOutput(true);				// 向服务器写入数据
				byte[] mydata = stringBuffer.toString().getBytes();	// 获得上传信息的字节大小及长度
				// 设置请求体的类型
				httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
				httpURLConnection.setRequestProperty("Content-Lenth", String.valueOf(mydata.length));

				// 获得输出流，向服务器输出数据
				OutputStream outputStream = (OutputStream) httpURLConnection.getOutputStream();
				outputStream.write(mydata);

				// 获得服务器响应的结果和状态码
				int responseCode = httpURLConnection.getResponseCode();
				if (responseCode == 200) {
					// 获得输入流，从服务器端获得数据
					InputStream inputStream = (InputStream) httpURLConnection.getInputStream();
					return (changeInputStream(inputStream, UTF8));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return "";
	}

	/** 
	 * <p>Title: changeInputStream </p>
	 * <p>Description: 把从输入流InputStream按指定编码格式encode变成字符串String </p>
	 * @param inputStream 输入流
	 * @param encode 编码格式
	 * @return String 转换结果
	 */
	private static String changeInputStream(InputStream inputStream, String encode) {
		// ByteArrayOutputStream 一般叫做内存流
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		byte[] data = new byte[1024];
		int len = 0;
		String result = "";
		if (inputStream != null) {
			try {
				while ((len = inputStream.read(data)) != -1) {
					byteArrayOutputStream.write(data, 0, len);
				}
				result = new String(byteArrayOutputStream.toByteArray(), encode);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	
	 /** 
     * <p>Title: sign </p>
     * <p>Description: 使用<code>secret</code>对paramValues按以下算法进行签名： <br/>
     * uppercase(hex(sha1(secretkey1value1key2value2...secret)) </p>
     * @param paramValues 请求参数
     * @param secret 签名秘钥
     * @return String 签名串
     */
    public static String sign(Map<String, String> paramValues, String secret) {
        return sign(paramValues,null,secret);
    }

   
    /** 
     * <p>Title: sign </p>
     * <p>Description: 对paramValues进行签名，其中ignoreParamNames这些参数不参与签名 </p>
     * @param paramValues 请求参数
     * @param ignoreParamNames 不参与签名的参数
     * @param secret 签名秘钥
     * @return String 签名串
     */
    public static String sign(Map<String, String> paramValues, List<String> ignoreParamNames,String secret) {
        try {
            StringBuilder sb = new StringBuilder();
            List<String> paramNames = new ArrayList<String>(paramValues.size());
            paramNames.addAll(paramValues.keySet());
            if(ignoreParamNames != null && ignoreParamNames.size() > 0){
                for (String ignoreParamName : ignoreParamNames) {
                    paramNames.remove(ignoreParamName);
                }
            }
            Collections.sort(paramNames);
 
            sb.append(secret);
            for (String paramName : paramNames) {
                sb.append(paramName).append(paramValues.get(paramName));
            }
            sb.append(secret);
            byte[] sha1Digest = getSHA1Digest(sb.toString());
            return byte2hex(sha1Digest);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }    

    /** 
     * <p>Title: getSHA1Digest </p>
     * <p>Description: SHA1加密 </p>
     * @param data 原串
     * @return byte[] SHA1加密结果
     * @throws IOException
     */
    private static byte[] getSHA1Digest(String data) throws IOException {
        byte[] bytes = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            bytes = md.digest(data.getBytes(UTF8));
        } catch (GeneralSecurityException gse) {
            throw new IOException(gse.getMessage());
        }
        return bytes;
    }

   
    /** 
     * <p>Title: byte2hex </p>
     * <p>Description: 二进制转十六进制字符串 </p>
     * @param bytes 二进制字节数组
     * @return String 转换结果
     */
    private static String byte2hex(byte[] bytes) {
        StringBuilder sign = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            String hex = Integer.toHexString(bytes[i] & 0xFF);
            if (hex.length() == 1) {
                sign.append("0");
            }
            sign.append(hex.toUpperCase());
        }
        return sign.toString();
    }
	
	
	public static class OAuth2 {
		/** 授权码接口地址*/
		private final static String AUTHORIZE_URL = BASE_PATH + "/oauth2/authorize";
		/** 访问令牌接口地址*/
		private final static String ACCESS_TOKEN_URL = BASE_PATH + "/oauth2/accesstoken";
		/** 令牌刷新接口地址*/
		private final static String REFRESH_TOKEN_URL = BASE_PATH + "/oauth2/refreshtoken";
		/** 客户端ID（即appKey）*/
		private String client_id;
		/** 客户端秘钥*/
		private String client_secret;
		/** 开发者应用重定向uri*/
		private String redirect_uri;
		/** 授权许可类型 默认为code*/
		private String response_type = "code";
		/** 授权类型 默认为authorization_code*/
		private String grant_type = "authorization_code";
		/** 授权范围（可选）*/
		private String scope;
		/** 开发者自定义*/
		private String state;
		
		
		public OAuth2() {
			
		}
		
		public OAuth2(String client_id) {
			this.client_id = client_id;
		}
		
		public OAuth2(String client_id, String client_secret) {
			this.client_id = client_id;
			this.client_secret = client_secret;
		}
		
		public OAuth2(String client_id, String client_secret, String redirect_uri) {
			this.client_id = client_id;
			this.client_secret = client_secret;
			this.redirect_uri = redirect_uri;
		}
		
		public String authorizeUrl() {
			StringBuilder sb = new StringBuilder();
			sb.append(AUTHORIZE_URL).append("?").append("client_id=").append(client_id).append("&")
			.append("response_type=").append(response_type).append("&").append("redirect_uri=")
			.append(redirect_uri);
			if(scope!=null && !"".equals(scope)){
				sb.append("&").append("scope=").append(scope);
			}
			if(state!=null && !"".equals(state)){
				sb.append("&").append("state=").append(state);
			}
			return sb.toString();
		}
		
		
		/** 
		 * <p>Title: authorizationCode </p>
		 * <p>Description: 授权码模式  </p>
		 * @param code 授权码
		 * @return String 访问令牌
		 */
		public String authorizationCode(String code) {
			Map<String, String> params = new HashMap<String, String>();
			params.put("client_id", client_id);
			params.put("code", code);
			params.put("redirect_uri", redirect_uri);
			params.put("grant_type", grant_type);
			params.put("client_secret", sign(params, client_secret));
			String accessToken = sendPostMessage(params, ACCESS_TOKEN_URL);
			return accessToken;
		}
		
		
		/** 
		 * <p>Title: clientCredentials </p>
		 * <p>Description: 客户端模式 </p>
		 * @return String 访问令牌
		 */
		public String clientCredentials() {
			Map<String, String> params = new HashMap<String, String>();
			params.put("client_id", client_id);
			params.put("grant_type", grant_type);
			
			params.put("client_secret", sign(params, client_secret));
			String accessToken = sendPostMessage(params, ACCESS_TOKEN_URL);
			return accessToken;
		}
		
		/** 
		 * <p>Title: refreshToken </p>
		 * <p>Description: 刷新令牌获取新的访问令牌  </p>
		 * @param refreshToken 刷新令牌
		 * @return String 访问令牌
		 */
		public String refreshToken(String refreshToken) {
			Map<String, String> params = new HashMap<String, String>();
			params.put("client_id", client_id);
			params.put("refresh_token", refreshToken);
			params.put("grant_type", grant_type);
			params.put("client_secret", sign(params, client_secret));
			String accessToken = sendPostMessage(params, REFRESH_TOKEN_URL);
			return accessToken;
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
	
	public static class BrowserLaunch {

		public static void openURL(String url) {
	        try {
	            browse(url);
	        } catch (Exception e) {
	            JOptionPane.showMessageDialog(null, "Error attempting to launch web browser:\n" + e.getLocalizedMessage());
	        }
	    }
		
		@SuppressWarnings({ "rawtypes", "unchecked" })
		private static void browse(String url) throws ClassNotFoundException, IllegalAccessException,
				IllegalArgumentException, InterruptedException, InvocationTargetException, IOException,
				NoSuchMethodException {
			String osName = System.getProperty("os.name", "");
			if (osName.startsWith("Mac OS")) {
				Class fileMgr = Class.forName("com.apple.eio.FileManager");
				Method openURL = fileMgr.getDeclaredMethod("openURL", new Class[] { String.class });
				openURL.invoke(null, new Object[] { url });
			} else if (osName.startsWith("Windows")) {
				Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
			} else { // assume Unix or Linux
				String[] browsers = { "firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape" };
				String browser = null;
				for (int count = 0; count < browsers.length && browser == null; count++)
					if (Runtime.getRuntime().exec(new String[] { "which", browsers[count] }).waitFor() == 0)
						browser = browsers[count];
				if (browser == null)
					throw new NoSuchMethodException("Could not find web browser");
				else
					Runtime.getRuntime().exec(new String[] { browser, url });
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		// 初始化授权基本参数
		OAuth2 oauth2 = new OAuth2("2016062316ceshhi0001", "68F768F2A0A0A3D006CBE9DAD5C2A477",
				"http://openapi.dev.zbjdev.com/oauth2/success");

		/*
		 * 根据所需设置相应参数
		 */
		//oauth2.setScope("user.getinfo-1.0 user.isOpenShop-1.0"); 	// 权限之间以空格隔开
		oauth2.setState("123456"); 

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
