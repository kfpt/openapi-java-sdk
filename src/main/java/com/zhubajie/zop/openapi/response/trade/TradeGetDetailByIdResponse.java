package com.zhubajie.zop.openapi.response.trade;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "tradeGetDetailById")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class TradeGetDetailByIdResponse extends AbstractSuccessResponse{

	/**
     * 需求ID
     */
    private Long taskId;
	/**
     * 需求标题
     */
    private String title;
    /**
     * 需求内容
     */
    private String content;
    /**
     * 交易模式
     * @remark 需求模式 10:比稿 11：买服务 12:雇佣 13:招标 16:众包
     */
    private Integer mode;
    /**
     * 雇主昵称
     */
    private String nickname;
    /**
     * 需求预算
     *@remark 需求金额
     */
    private Double amount;
    /**
     * 需求已托管金额
     * @remark 托管金额(纯金额)
     */
    private Double hostedAmount;
    /**
     * 发布时省份名
     */
    private String provinceName;
    
    /**
     * 需求来源
     * @remark 发布源，0：网站，1：猪八戒手机客户端, 2：跑得快 , 3：蜜桃，4：猪八戒威客客户端 ，
     *  5 ： 快活 ，6：微信服务号 ，7：触屏版， 8：买家客户端 ，20：天蓬网
     */
    private Integer taskSource;
    /**
     * 发布时间
     * @remark 创建日期时间戳 秒
     */
    private Integer createTime;
    /**
     * 剩余时间
     * @remark 结束时间戳秒 减 当前时间戳秒
     */
    private Integer remainTime;
    /**
     * 雇主要求
     *@remark 雇主保障, 返回已勾选ID号 1.保证完成 2.保证原创 3.免费修改 4.保证维护 5.保证源码 6.保证推广效果
     */
    private List<String> securities;
    /**
     * 投标剩余名额
     * @remark 订单剩余投标数 
     */
    private Integer worksAvailableNum;
    /**
     * 三级基础类目
     */
    private Integer basicCategory3Id;
    /**
     * 二级基础类目
     */
    private Integer basicCategory2Id;
    /**
     * 一级基础类目
     */
    private Integer basicCategory1Id;
    /**
     * 任务时间流程
     */
    @XmlElementWrapper(name="taskMilestoneDoList")
	@XmlElement(name="taskMilestoneDo")
    private List<TaskMilestoneDo> taskMilestoneDoList;
    
    /**
     * 附件信息
     */
    @XmlElementWrapper(name="taskFileList")
	@XmlElement(name="taskFile")
    private List<TaskFile> taskFileList;
    
	public Long getTaskId() {
		return taskId;
	}
	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getHostedAmount() {
		return hostedAmount;
	}
	public void setHostedAmount(Double hostedAmount) {
		this.hostedAmount = hostedAmount;
	}

	public Integer getTaskSource() {
		return taskSource;
	}
	public void setTaskSource(Integer taskSource) {
		this.taskSource = taskSource;
	}

	public Integer getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

	public List<String> getSecurities() {
		return securities;
	}
	public void setSecurities(List<String> securities) {
		this.securities = securities;
	}
	public Integer getWorksAvailableNum() {
		return worksAvailableNum;
	}
	public void setWorksAvailableNum(Integer worksAvailableNum) {
		this.worksAvailableNum = worksAvailableNum;
	}
	public Integer getBasicCategory3Id() {
		return basicCategory3Id;
	}
	public void setBasicCategory3Id(Integer basicCategory3Id) {
		this.basicCategory3Id = basicCategory3Id;
	}
	public Integer getBasicCategory2Id() {
		return basicCategory2Id;
	}
	public void setBasicCategory2Id(Integer basicCategory2Id) {
		this.basicCategory2Id = basicCategory2Id;
	}
	public Integer getBasicCategory1Id() {
		return basicCategory1Id;
	}
	public void setBasicCategory1Id(Integer basicCategory1Id) {
		this.basicCategory1Id = basicCategory1Id;
	}
	public Integer getMode() {
		return mode;
	}
	public void setMode(Integer mode) {
		this.mode = mode;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public List<TaskMilestoneDo> getTaskMilestoneDoList() {
		return taskMilestoneDoList;
	}
	public void setTaskMilestoneDoList(List<TaskMilestoneDo> taskMilestoneDoList) {
		this.taskMilestoneDoList = taskMilestoneDoList;
	}
	public List<TaskFile> getTaskFileList() {
		return taskFileList;
	}
	public void setTaskFileList(List<TaskFile> taskFileList) {
		this.taskFileList = taskFileList;
	}
	public Integer getRemainTime() {
		return remainTime;
	}
	public void setRemainTime(Integer remainTime) {
		this.remainTime = remainTime;
	}
}
