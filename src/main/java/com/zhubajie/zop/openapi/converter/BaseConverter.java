package com.zhubajie.zop.openapi.converter;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;


public class BaseConverter {
	
	@SuppressWarnings("unchecked")
	public static <T> T parseJson(String jsonString, TypeReference<T> typeOfT) {
		ObjectMapper m = new ObjectMapper(); 
		T t = null;
		try {
			t = (T) m.readValue(jsonString, typeOfT);
		} catch (Exception e) {
			return null;
		}
		return t;
	}
	
	/** 
	 * Title: isBaseType 
	 * Description: 判断是否基本类型 
	 * @param object
	 * @return
	 */
	public boolean isBaseType(Object object) {
		boolean flag = false;
		if (object instanceof Integer) {
			flag = true;
		} else if (object instanceof String) {
			flag = true;
		} else if (object instanceof Double) {
			flag = true;
		} else if (object instanceof Float) {
			flag = true;
		} else if (object instanceof Long) {
			flag = true;
		} else if (object instanceof Boolean) {
			flag = true;
		} else if (object instanceof Byte) {
			flag = true;
		}
		return flag;
	}
}
