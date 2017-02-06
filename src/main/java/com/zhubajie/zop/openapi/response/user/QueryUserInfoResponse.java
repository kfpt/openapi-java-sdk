package com.zhubajie.zop.openapi.response.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.UserAbstractSuccessResponse;

/**
 * Created by zhouyinyan on 16-4-8.
 *  查询用户信息返回结果
 *
 */
@XmlRootElement(name = "userInfo")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class QueryUserInfoResponse extends UserAbstractSuccessResponse{

    /**
     * 用户名
     */
    @XmlElement
    private String userName;

    /**
     * 用户昵称
     */
    @XmlElement
    private String nickName;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
