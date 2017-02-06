package com.zhubajie.zop.openapi.response.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.UserAbstractSuccessResponse;

/**
 * Created by malibin on 16-8-17.
 * 获取用户基本信息返回对象
 */
@XmlRootElement(name = "userBaseInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetUserBaseInfoResponse extends UserAbstractSuccessResponse {

    @XmlElement
    private String nickname;	// 昵称
    
    @XmlElement
    private String avatarPath;	// 头像路径
    
    @XmlElement
    private String userName;	// 用户名
    
    @XmlElement
    private String mobile;		// 用户手机号
    
    @XmlElement
    private String userEmail;	// 用户邮箱
    
  	@XmlElement
  	private int sex;	// 用户性别：0.女；1.男；2.未知（待验证）

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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}
    
}
