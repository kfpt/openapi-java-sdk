package com.zhubajie.zop.openapi.converter;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import com.rop.request.RopConverter;

public class ListConverter extends BaseConverter implements RopConverter<String, List> {

	@Override
	public List convert(String source) {
		if(StringUtils.isEmpty(source)){
			return null;
		}
		List<Object> list = parseJson(source, new TypeReference<List<Object>>() { });
		if(CollectionUtils.isEmpty(list)){
			list = new ArrayList<Object>();
			String[] ss = source.split(",");
    		for (String string : ss) {
				list.add(string);
			}
		}
    	return list;
	}
	
	@Override
	public String unconvert(List target) {
		String result = null;
		try {
			ObjectMapper m = new ObjectMapper(); 
			result = m.writeValueAsString(target);
		} catch (Exception e) {
			result = null;
		}
        return result;
	}

	@Override
	public Class<String> getSourceClass() {
		return String.class;
	}

	@Override
	public Class<List> getTargetClass() {
		return List.class;
	}
}