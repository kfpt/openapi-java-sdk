package com.zhubajie.zop.openapi.response.trade;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

public class QuerySellerTradeDetailResponse extends AbstractSuccessResponse {

	//查询服务商交易列表接口
	private String nickname; //雇主昵称
	private Integer taskId; // 流水号 	
	private Integer createtime; // 任务创建时间戳	
	private String title; // 标题 	
	private Byte taskMode; // 交易模式 
	private Byte state; // 交易状态：123456789、！！！！！！
	private BigDecimal amount; //金额
	private BigDecimal hostedAmount; //已托管金额
	private Byte signIsevaluation; // 是否需要评价 
	private Byte taskSource; // 任务来源，0：网站，1：猪八戒手机客户端, 2：跑得快 , 3：蜜桃，4：猪八戒威客客户端 ，5 ： 快活 ，6：微信服务号 ，7：触屏版，8：买家客户端

	//查询星级接口获取接口
	private Integer starLevel; // 雇主星级
	
	//查询用户基本信息接口
	private String mobile;		// 雇主联系手机
	
	//查询需求接口
	private String content; // 需求内容
	private String cityName; // 发布时城市名/需求来源城市
	private String provinceName; // 发布时省份名/需求来源省份
	
	private Integer bidState; //投标状态?????
	
	//批量获取工作台流程接口
	Map<Integer, List<NodeInfo>> workNodesMap; // 稿件与工作台节点对应表
	
	//稿件列表接口
    private List<Integer> worksIds;  //稿件id列表
	//评价接口
	private String comment;  //雇主评价
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public Integer getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Integer createtime) {
		this.createtime = createtime;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Byte getTaskMode() {
		return taskMode;
	}
	public void setTaskMode(Byte taskMode) {
		this.taskMode = taskMode;
	}
	public Byte getState() {
		return state;
	}
	public void setState(Byte state) {
		this.state = state;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public BigDecimal getHostedAmount() {
		return hostedAmount;
	}
	public void setHostedAmount(BigDecimal hostedAmount) {
		this.hostedAmount = hostedAmount;
	}
	public Byte getSignIsevaluation() {
		return signIsevaluation;
	}
	public void setSignIsevaluation(Byte signIsevaluation) {
		this.signIsevaluation = signIsevaluation;
	}
	public Byte getTaskSource() {
		return taskSource;
	}
	public void setTaskSource(Byte taskSource) {
		this.taskSource = taskSource;
	}
	public Integer getStarLevel() {
		return starLevel;
	}
	public void setStarLevel(Integer starLevel) {
		this.starLevel = starLevel;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
	public Integer getBidState() {
		return bidState;
	}
	public void setBidState(Integer bidState) {
		this.bidState = bidState;
	}
	public Map<Integer, List<NodeInfo>> getWorkNodesMap() {
		return workNodesMap;
	}
	public void setWorkNodesMap(Map<Integer, List<NodeInfo>> workNodesMap) {
		this.workNodesMap = workNodesMap;
	}
	public List<Integer> getWorksIds() {
		return worksIds;
	}
	public void setWorksIds(List<Integer> worksIds) {
		this.worksIds = worksIds;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
