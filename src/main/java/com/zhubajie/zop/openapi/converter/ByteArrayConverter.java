package com.zhubajie.zop.openapi.converter;

import org.apache.commons.codec.binary.Base64;

import com.rop.request.RopConverter;

public class ByteArrayConverter implements RopConverter<String, byte[]> {

	@Override
	public byte[] convert(String source) {
		return Base64.decodeBase64(source);
	}

	@Override
	public String unconvert(byte[] target) {
		return Base64.encodeBase64String(target);
	}

	@Override
	public Class<String> getSourceClass() {
		return String.class;
	}

	@Override
	public Class<byte[]> getTargetClass() {
		return byte[].class;
	}

}
