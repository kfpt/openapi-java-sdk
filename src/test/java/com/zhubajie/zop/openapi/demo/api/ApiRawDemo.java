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


/**
 * <p>Title: ApiRawDemo </p>
 * <p>Description: ZOP-API http调用demo </p>
 * Date: 2016年8月11日 下午6:10:57
 * @author weitan
 * @version 1.0
 */
public class ApiRawDemo {
	
	/** API统一接口地址*/
	private static String PATH = "http://localhost/router";
	/** 编码格式*/
	private static final String UTF8 = "UTF-8";
	
	private static URL url;
	
	static {
		try {
			url = new URL(PATH);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public ApiRawDemo() {
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


    
    
	public static void main(String[] args) {
		Map<String, String> params = new HashMap<String, String>();
		/*
		 * 设置公共参数 
		 * 此处以获取用户信息为例
		 */
		params.put("appKey", "201609151823390aY5E2"); 					// 由zop平台统一发放
		params.put("accessToken", "96213f1dacc33dabcaf61bee43f3185b");  // 通过授权得到 
		params.put("method", "zbj.trade.getWorkInfo");
		params.put("v", "1.0");
		params.put("format", "json"); 								  	// 缺省为xml
		params.put("timestamp", System.currentTimeMillis() + "");
		
//		/*
//		 * 设置业务参数
//		 */
//		params.put("paramJson", "{\"cat\":\"user\",\"page\":0,\"size\":5}"); 		// 用户唯一标识，授权时同步返回
		params.put("openid","7DB78F3D17312EFA6BA125B1E9EA9C68");
		params.put("worksId","77481356");
		// appSecret与appKey配对发放，签名算法详见文档
		params.put("sign", sign(params, "4CF27D11B6F557841AF3BDC360AF49B6")); 
		
		String result = sendPostMessage(params);
		System.out.println("-result->>" + result);
	}
}
