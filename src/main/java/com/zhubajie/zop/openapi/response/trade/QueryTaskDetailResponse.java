package com.zhubajie.zop.openapi.response.trade;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "queryTaskDetail")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class QueryTaskDetailResponse extends AbstractSuccessResponse {

	@XmlElement
	private Long taskId; // 需求ID
	@XmlElement
	private String title; // 任务标题/需求标题 
	@XmlElement
	private String content; // 需求内容
	@XmlElement
	private String nickname; // 任务发布人昵称/雇主昵称
	@XmlElement
	private Double amount; // 需求金额/需求预算
	@XmlElement
	private Double hostedAmount; // 托管金额(纯金额)
	@XmlElement
	private String cityName; // 发布时城市名/需求来源城市
	@XmlElement
	private String provinceName; // 发布时省份名/需求来源省份
	@XmlElement
	// 发布源/需求来源，0：网站，1：猪八戒手机客户端, 2：跑得快 , 3：蜜桃，4：猪八戒威客客户端 ，5 ： 快活 ，6：微信服务号 ，7：触屏版，8：买家客户端 ，20：天蓬网
	private Integer taskSource; 
	@XmlElement
	private Integer taskType; // 需求类型，0：猪八戒网，1：天蓬网，2：产业园订单
	@XmlElement
	private Integer mode; // 交易模式：10悬赏，11购买服务，12雇佣，13招标
	@XmlElement
    private Integer createTime; // 任务创建时间/发布时间
	@XmlElement
    private Integer endTime; // 任务结束时间
	@XmlElement
	private Integer worksNum; // 交稿数量/稿件数量
	@XmlElement
	private Integer worksAvailableNum; // 订单剩余投标数
	@XmlElement
	private Integer succeedNum; // 中标稿件数量
	@XmlElement
	private List<String> securities; // 雇主保障, 返回已勾选ID号 1.保证完成 2.保证原创 3.免费修改 4.保证维护 5.保证源码 6.保证推广效果
	@XmlElement
	private Boolean realNameAuth; // 是否通过实名认证
	@XmlElement
	private Boolean cellPhoneAuth; // 是否通过手机认证
	@XmlElement
	private Integer worksLimit; // 可投标的数量

	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public Integer getMode() {
		return mode;
	}

	public void setMode(Integer mode) {
		this.mode = mode;
	}

	public Integer getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

	public Integer getEndTime() {
		return endTime;
	}

	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getHostedAmount() {
		return hostedAmount;
	}

	public void setHostedAmount(Double hostedAmount) {
		this.hostedAmount = hostedAmount;
	}

	public Integer getWorksNum() {
		return worksNum;
	}

	public void setWorksNum(Integer worksNum) {
		this.worksNum = worksNum;
	}

	public Integer getWorksAvailableNum() {
		return worksAvailableNum;
	}

	public void setWorksAvailableNum(Integer worksAvailableNum) {
		this.worksAvailableNum = worksAvailableNum;
	}

	public Integer getTaskSource() {
		return taskSource;
	}

	public void setTaskSource(Integer taskSource) {
		this.taskSource = taskSource;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public Integer getSucceedNum() {
		return succeedNum;
	}

	public void setSucceedNum(Integer succeedNum) {
		this.succeedNum = succeedNum;
	}

	public List<String> getSecurities() {
		return securities;
	}

	public void setSecurities(List<String> securities) {
		this.securities = securities;
	}

	public Boolean getRealNameAuth() {
		return realNameAuth;
	}

	public void setRealNameAuth(Boolean realNameAuth) {
		this.realNameAuth = realNameAuth;
	}

	public Boolean getCellPhoneAuth() {
		return cellPhoneAuth;
	}

	public void setCellPhoneAuth(Boolean cellPhoneAuth) {
		this.cellPhoneAuth = cellPhoneAuth;
	}

	public Integer getWorksLimit() {
		return worksLimit;
	}

	public void setWorksLimit(Integer worksLimit) {
		this.worksLimit = worksLimit;
	}

	public Integer getTaskType() {
		return taskType;
	}

	public void setTaskType(Integer taskType) {
		this.taskType = taskType;
	}
	
}
