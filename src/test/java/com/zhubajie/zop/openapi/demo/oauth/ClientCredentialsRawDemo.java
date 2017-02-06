package com.zhubajie.zop.openapi.demo.oauth;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
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

public class ClientCredentialsRawDemo {
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
		/** 访问令牌接口地址*/
		private final static String ACCESS_TOKEN_URL = BASE_PATH + "/oauth2/accesstoken";
		/** 客户端ID（即appKey）*/
		private String client_id;
		/** 客户端秘钥*/
		private String client_secret;
		/** 授权类型 默认为client_credentials*/
		private String grant_type = "client_credentials";
		
		
		public OAuth2() {
			
		}
		
		public OAuth2(String client_id) {
			this.client_id = client_id;
		}
		
		public OAuth2(String client_id, String client_secret) {
			this.client_id = client_id;
			this.client_secret = client_secret;
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
		

		public void setClient_id(String client_id) {
			this.client_id = client_id;
		}

		public void setClient_secret(String client_secret) {
			this.client_secret = client_secret;
		}

		public void setGrant_type(String grant_type) {
			this.grant_type = grant_type;
		}

	}
	
	
	public static void main(String[] args) {
		// 初始化授权基本参数
		OAuth2 oauth2 = new OAuth2("2016063017v1cshi0001", "F9217466B37E9A8B23FFB309EC782BBD");
		// 设置授权类型为
		oauth2.setGrant_type("client_credentials");
		
		try {
			String tokenInfo = oauth2.clientCredentials();
			System.out.println("access_token_info：" + tokenInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
