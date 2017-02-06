package com.zhubajie.zop.openapi.demo.api;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Locale;

import org.springframework.util.StringUtils;

import com.rop.MessageFormat;
import com.rop.client.CompositeResponse;
import com.zhubajie.zop.openapi.client.ZopClient;
import com.zhubajie.zop.openapi.request.file.FileUploadRequest;
import com.zhubajie.zop.openapi.request.other.RegionInfoRequest;
import com.zhubajie.zop.openapi.response.file.FileUploadResponse;
import com.zhubajie.zop.openapi.response.other.RegionListResponse;


/**
 * Title: ApiSdkDemo 
 * Description: ZOP-SDK-API调用demo
 * Date: 2016年12月21日 下午6:17:50
 */
public class ApiSdkDemo {
	
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		/*
		 * 初始化client，设置公共参数 appkey、appSecret、accessToken为必须参数
		 * appkey、appSecret请开发者替换为自己创建应用所得
		 * accessToken通过Oauth2.0授权获得
		 * 此处有多种初始化方式，开发者可自行选择，并可根据所需设置其他相关参数
		 */
		ZopClient zopClient = new ZopClient("http://localhost/router", "201610091108437GQ8i6", "495D376CC9CE69CDDB4209401A641399",
				"997cc05c9e8bd4cad8bfce2451c093f3");
		zopClient.setLocal(Locale.SIMPLIFIED_CHINESE);  // 缺省为SIMPLIFIED_CHINESE
		
		/*
		 * 初始化request,设置业务参数
		 */
		RegionInfoRequest request = new RegionInfoRequest();
    	// 用户唯一标识,获取accesToken时同步获得
		request.setRegionId(3374);
    	/*request.setContent(getFile("F:/3.01.mp3"));
    	request.setName("3.01.mp3");*/
    	
    	/*
		 * 调用接口获取资源 
		 * 统一调用方式 
		 * 根据接口文档要求，选择POST/GET
		 */
		CompositeResponse<RegionListResponse> response = zopClient.execute(request,
				RegionListResponse.class,
				"zbj.tool.queryRegionByParentId",
				"1.0");
    	if(response.isSuccessful()){
    		RegionListResponse res = response.getSuccessResponse();
    		System.out.println("用户昵称：" + res.getRegionInfoList().get(0).getAdmincode());
    	}
    	else{
    		System.out.println("错误描述：" + response.getErrorResponse().getErrorToken());
    	}
    	
	}
	
	public static byte[] getFile(String fileName) {
		if (!StringUtils.isEmpty(fileName)) {
			fileName = fileName.replace("/", File.separator);
			FileInputStream is = null;
			try {
				is = new FileInputStream(fileName);
				int size = is.available(); // 文件大小
				byte[] data = new byte[size];
				is.read(data);
				is.close();
				return data;
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
}
