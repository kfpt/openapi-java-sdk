package com.zhubajie.zop.openapi.request.other;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.zhubajie.zop.openapi.request.common.UserAbstractRopRequest;

public class RegisterPartTimeJobRequest extends UserAbstractRopRequest {
	@NotNull
    private Boolean sex; // 性别
	@NotNull
	@Min(1)
    private Integer age; // 年龄
    @NotEmpty
    private String photoUrl; // 头像url
    @NotEmpty
    private String name; // 姓名
    @NotEmpty
    private String mobile; // 手机
    @NotEmpty
    private String introduce; // 自我介绍

    private String educations; // 教育信息,非必填
    @NotNull
    private String score; // 评分

    private Integer registrationStatus;//报名状态1：待录用 2：拒绝 3：录用 4:已完成。非必填
    private Date registrationTime; // 报名时间
    @NotNull
    private Integer payType; // 支付方式
    @NotNull
    private Date parttimeTime; // 兼职时间

    private String school; // 学校，非必填
    @NotNull
    private Long treatment; // 待遇

    @NotEmpty
    private String message; // 留言

    @NotEmpty
    private String remark; // 备注
    
    @NotEmpty
	private String token; // 认证信息

	public Boolean getSex() {
		return sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getEducations() {
		return educations;
	}

	public void setEducations(String educations) {
		this.educations = educations;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public Integer getRegistrationStatus() {
		return registrationStatus;
	}

	public void setRegistrationStatus(Integer registrationStatus) {
		this.registrationStatus = registrationStatus;
	}

	public Date getRegistrationTime() {
		return registrationTime;
	}

	public void setRegistrationTime(Date registrationTime) {
		this.registrationTime = registrationTime;
	}

	public Integer getPayType() {
		return payType;
	}

	public void setPayType(Integer payType) {
		this.payType = payType;
	}

	public Date getParttimeTime() {
		return parttimeTime;
	}

	public void setParttimeTime(Date parttimeTime) {
		this.parttimeTime = parttimeTime;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public Long getTreatment() {
		return treatment;
	}

	public void setTreatment(Long treatment) {
		this.treatment = treatment;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
