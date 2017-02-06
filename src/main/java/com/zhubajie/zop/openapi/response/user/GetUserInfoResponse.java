package com.zhubajie.zop.openapi.response.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.UserAbstractSuccessResponse;

/**
 * 获取用户信息返回结果
 * @author ChengPuhui
 * @Date 2016年6月7日
 */
@XmlRootElement(name = "userInfo")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class GetUserInfoResponse extends UserAbstractSuccessResponse{
    
    /**
     * 用户名
     */
    @XmlElement
    private String userName;
    
    /**
     * 认证手机
     */
    @XmlElement
    private String userMobile;
    
    /**
     * 认证邮箱
     */
    @XmlElement
    private String userEmail;
    
    /**
     * 昵称
     */
    @XmlElement
    private String nickname;
    
    /**
     * 昵称全拼
     */
    @XmlElement
 	private String spellAll;
    
    /**
     * 昵称首字母缩写
     */
    @XmlElement
  	private String spellInit;
    
    /**
     * 用户组
     */
    @XmlElement
    private int groups;
    
    /**
     * 品牌
     */
    @XmlElement
    private String brandname;
    
    /**
     * 真实姓名
     */
    @XmlElement
    private String truename;
    
    /**
     * 自我介绍
     */
    @XmlElement
  	private String selfInfo;
  	
  	/**
  	 * 联系人姓名
  	 */
  	@XmlElement
  	private String contactName;
  	
  	/**
  	 * 联系人性别
  	 */
  	@XmlElement
  	private int contactSex;
  	
  	/**
  	 * 性别
  	 */
  	@XmlElement
  	private int sex;
  	
  	/**
  	 * 年龄
  	 */
  	@XmlElement
  	private String age;
    
    /**
     * 手机
     */
    @XmlElement
    private String mobile;
    
    /**
     * 邮箱
     */
    @XmlElement
    private String email;
    
    /**
     * 邮政编码
     */
    @XmlElement
  	private int zip;
    
  	/**
  	 * 地址
  	 */
    @XmlElement
  	private String address;
    
  	/**
  	 * qq
  	 */
    @XmlElement
  	private String qq;
    
  	/**
  	 * msn
  	 */
    @XmlElement
  	private String msn;
    
  	/**
  	 * skype
  	 */
    @XmlElement
  	private String skype;
    
  	/**
  	 * 座机
  	 */
    @XmlElement
  	private String tel;
    
    /**
     * 注册时间
     */
    @XmlElement
    private int regTime;
    
    /**
     * 注册IP
     */
    @XmlElement
    private String registerIp;
    
    /**
     * 最后登录时间
     */
    @XmlElement
    private int loginEndTime;
    
    /**
     * 最后登录IP
     */
    @XmlElement
    private String loginEndIp;
    
    /**
     * 密码强壮度
     */
    @XmlElement
    private int strong;
    
    /**
     * 15分钟内登录错误次数
     */
    @XmlElement
    private int loginErrNum;
    
    /**
     * 登录错误时的时间
     */
    @XmlElement
    private int loginErrTime;
    
 	/**
 	 * 城镇代码
 	 */
    @XmlElement
 	private int town;
 	
 	/**
 	 * 城镇名称
 	 */
    @XmlElement
 	private String townName;
 	
 	/**
 	 * 城市代码
 	 */
    @XmlElement
 	private int city;
 	
 	/**
 	 * 城市名称
 	 */
    @XmlElement
 	private String cityName;
 	
 	/**
 	 * 省份代码
 	 */
    @XmlElement
 	private int province;
 	
 	/**
 	 * 省份名称
 	 */
    @XmlElement
 	private String provinceName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getSpellAll() {
		return spellAll;
	}

	public void setSpellAll(String spellAll) {
		this.spellAll = spellAll;
	}

	public String getSpellInit() {
		return spellInit;
	}

	public void setSpellInit(String spellInit) {
		this.spellInit = spellInit;
	}

	public int getGroups() {
		return groups;
	}

	public void setGroups(int groups) {
		this.groups = groups;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public String getTruename() {
		return truename;
	}

	public void setTruename(String truename) {
		this.truename = truename;
	}

	public String getSelfInfo() {
		return selfInfo;
	}

	public void setSelfInfo(String selfInfo) {
		this.selfInfo = selfInfo;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public int getContactSex() {
		return contactSex;
	}

	public void setContactSex(int contactSex) {
		this.contactSex = contactSex;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getMsn() {
		return msn;
	}

	public void setMsn(String msn) {
		this.msn = msn;
	}

	public String getSkype() {
		return skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getRegTime() {
		return regTime;
	}

	public void setRegTime(int regTime) {
		this.regTime = regTime;
	}

	public String getRegisterIp() {
		return registerIp;
	}

	public void setRegisterIp(String registerIp) {
		this.registerIp = registerIp;
	}

	public int getLoginEndTime() {
		return loginEndTime;
	}

	public void setLoginEndTime(int loginEndTime) {
		this.loginEndTime = loginEndTime;
	}

	public String getLoginEndIp() {
		return loginEndIp;
	}

	public void setLoginEndIp(String loginEndIp) {
		this.loginEndIp = loginEndIp;
	}

	public int getStrong() {
		return strong;
	}

	public void setStrong(int strong) {
		this.strong = strong;
	}

	public int getLoginErrNum() {
		return loginErrNum;
	}

	public void setLoginErrNum(int loginErrNum) {
		this.loginErrNum = loginErrNum;
	}

	public int getLoginErrTime() {
		return loginErrTime;
	}

	public void setLoginErrTime(int loginErrTime) {
		this.loginErrTime = loginErrTime;
	}

	public int getTown() {
		return town;
	}

	public void setTown(int town) {
		this.town = town;
	}

	public String getTownName() {
		return townName;
	}

	public void setTownName(String townName) {
		this.townName = townName;
	}

	public int getCity() {
		return city;
	}

	public void setCity(int city) {
		this.city = city;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getProvince() {
		return province;
	}

	public void setProvince(int province) {
		this.province = province;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
}
