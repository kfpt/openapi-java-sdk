package com.zhubajie.zop.openapi.demo.api;

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


public class ApiHttpDemo {
	
	/** API统一接口地址*/
	private static String PATH = "http://localhost/router";
	
	private static final String UTF8 = "UTF-8";
	
	private static URL url;
	
	static {
		try {
			url = new URL(PATH);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public ApiHttpDemo() {
	}

	/** 
	 * <p>Title: sendPostMessage </p>
	 * <p>Description: 发送POST请求 </p>
	 * @param params post请求参数
	 * @return String 请求结果
	 */
	public static String sendPostMessage(Map<String, String> params) {
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
        try {
            StringBuilder sb = new StringBuilder();
            List<String> paramNames = new ArrayList<String>(paramValues.size());
            paramNames.addAll(paramValues.keySet());
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
    
	public static void main(String[] args) {
		Map<String, String> params = new HashMap<String, String>();
		
		 /** 设置公共参数 
		 * 此处以获取用户信息为例*/
		 
		params.put("appKey", "201610091108437GQ8i6"); 					// 由zop平台统一发放
		params.put("accessToken", "be7b4fb91129be98343b5c4bd2d045a5");  // 通过授权得到 
		params.put("method", "zbj.service.editService");
		params.put("v", "1.0");
		params.put("format", "json"); 								  	// 缺省为xml
		params.put("timestamp", System.currentTimeMillis() + "");
		params.put("locale", "zh_CN");
	
		
		/* * 设置业务参数*/
		 
		params.put("openid", "93DFB9974986E80B180723C746EBC44B"); 		// 用户唯一标识，授权时同步返回
		params.put("serviceId", "1001969875");
		params.put("subject", "标题666");
		params.put("categoryId", "1269");
		params.put("amount", "137");
		params.put("amountApp", "137");
		params.put("imgurl", "http://occbybv3j.bkt.clouddn.com/zop/openapi/1001-pic.png/origine/c64ff85b-3360-401b-8133-926f0158341f");
		params.put("cont", "137");
		params.put("contApp", "137");
		params.put("unit", "RMB");
		params.put("list", "[{\"url\":\"123123\",\"intro\":\"简介\",\"mode\":1},{\"url\":\"123213\",\"intro\":\"简介3\",\"mode\":3}]");
		params.put("extList", "[{\"extName\":\"123\"}]");
		
		// appSecret与appKey配对发放，签名算法详见文档
		params.put("sign", sign(params, "495D376CC9CE69CDDB4209401A641399"));
		
		String result = sendPostMessage(params);
		System.out.println("-result->>" + result);
	}
}
