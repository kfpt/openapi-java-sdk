package com.zhubajie.zop.openapi.response.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.UserAbstractSuccessResponse;

/**
 * Created by malibin on 16-9-23.
 * 获取用户的头像和昵称
 */
@XmlRootElement(name = "userBriefInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetUserBriefInfoResponse extends UserAbstractSuccessResponse {

    @XmlElement
    private String nickname;	// 昵称
    
    @XmlElement
    private String avatarPath;	// 头像路径

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getAvatarPath() {
		return avatarPath;
	}

	public void setAvatarPath(String avatarPath) {
		this.avatarPath = avatarPath;
	}
}
