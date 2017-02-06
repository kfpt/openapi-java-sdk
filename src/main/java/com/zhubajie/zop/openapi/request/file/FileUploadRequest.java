/**
 * Package: com.zhubajie.zop.openapi.request.components
 * Description: 
 * Date: 2016年12月1日 下午2:50:52
 */

package com.zhubajie.zop.openapi.request.file;

import com.rop.AbstractRopRequest;
import com.rop.annotation.IgnoreSign;

/**
 * Description: 文件上传请求
 * Date: 2016年12月1日 下午2:50:52
 * @author wufenyun
 */
public class FileUploadRequest extends AbstractRopRequest {
	/**
     * Fields name: 文件名
     */
    private String name;
    /**
     * Fields content: 文件内容
     */
    @IgnoreSign
    private byte[] content;
    
	/**
	 * @return the content
	 */
	public byte[] getContent() {
		return content;
	}
	
	/**
	 * @param content the content to set
	 */
	public void setContent(byte[] content) {
		this.content = content;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
