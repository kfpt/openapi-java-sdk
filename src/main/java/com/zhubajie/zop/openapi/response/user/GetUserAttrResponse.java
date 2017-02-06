package com.zhubajie.zop.openapi.response.user;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.UserAbstractSuccessResponse;

/**
 * 获取用户业务属性返回结果
 * @author ChengPuhui
 * @Date 2016年6月14日
 */
@XmlRootElement(name = "userAttr")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class GetUserAttrResponse extends UserAbstractSuccessResponse {
	
	/**
	 * 意板创开通状态 0未开通 1开通
	 */
	@XmlElement
	private Integer ideastatus;
	
	/**
	 * 0未激活 1激活
	 */
	@XmlElement
	private Integer enactive;
	
	/**
	 * 人才铺类型 0未开通人才铺 1个人 2工作室 3公司
	 */
	@XmlElement
	private Integer shoptype;
	
	/**
	 * 联合运营站点ID
	 */
	@XmlElement
	private Integer domainId;
	
	/**
	 * 是否推广员
	 */
	@XmlElement
	private Integer unstatus;
	
	/**
	 * 推广员推UID
	 */
	@XmlElement
	private Integer uncode;
	
	/**
	 * 推广员扩展ID
	 */
	@XmlElement
	private Integer uncodeExtid;
	
	/**
	 * 采纳数
	 */
	@XmlElement
	private Integer adoptionnum;
	
	/**
	 * 问题数
	 */
	@XmlElement
	private Integer asknum;
	
	/**
	 * 回答数
	 */
	@XmlElement
	private Integer answernum;
	
	/**
	 * 实名认证 0未通过 1申请中 2已通过
	 */
	@XmlElement
	private Integer realstatus;
	
	/**
	 * 是否是优选商城服务商
	 */
	@XmlElement
	private Integer isMall;
	
	/**
	 * 否是金牌会员 0不是金牌会员 2是金牌会员
	 */
	@XmlElement
	private Integer goldstatus;
	
	/**
	 * 积分
	 */
	@XmlElement
	private Integer integral;
	
	/**
	 * 能力值
	 */
	@XmlElement
	private BigDecimal ability;
	
	/**
	 * 冗余的技能字段
	 */
	@XmlElement
	private String skill;
	
	/**
	 * 1买家 2卖家
	 */
	@XmlElement
	private Integer homepage;
	
	/**
	 * 用户自定义任务关键词
	 */
	@XmlElement
	private String taskkey;
	
	/**
	 * 0网站 1android 2ios 3winpphone 4winpad
	 */
	@XmlElement
	private Integer appType;
	
	/**
	 * 币种
	 */
	@XmlElement
	private String currency;
	
	/**
	 * 时差
	 */
	@XmlElement
	private Integer timediff;
	
	/**
	 * 爱好
	 */
	@XmlElement
	private String aihao;
	
	/**
	 * 国籍
	 */
	@XmlElement
	private Integer nationality;
	
	/**
	 * 微企
	 */
	@XmlElement
	private Integer iswq;
	
	/**
	 * 是否入驻服务商
	 */
	@XmlElement
	private Integer isfws;
	
	/**
	 * 别名，认证服务商使用
	 */
	@XmlElement
	private String alias;
	
	/**
	 * 付费会员开始时间
	 */
	@XmlElement
	private Integer goldstarttime;
	
	/**
	 * 金牌会员到期时间
	 */
	@XmlElement
	private Integer goldtime;
	
	/**
	 * 付费会员到期日期
	 */
	@XmlElement
	private Date goldymd;
	
	/**
	 * 服务保障 原创作品 0否 1是
	 */
	@XmlElement
	private Integer original;
	
	/**
	 * 服务保障 保证完成 0否 1是
	 */
	@XmlElement
	private Integer ensure;
	
	/**
	 * 服务保障 免费修改 0否 1是
	 */
	@XmlElement
	private Integer approve;
	
	/**
	 * 信用度(freezingcredit+creditpoints=100)
	 */
	@XmlElement
	private Integer creditpoints;
	
	/**
	 * 冻结的信用度值(freezingcredit+creditpoints=100)
	 */
	@XmlElement
	private Integer freezingcredit;
	
	/**
	 * 信用度等级 5 100分 4 80-100分 3 60-80分 2 40-60分 1 0-40分 0 0分
	 */
	@XmlElement
	private Integer creditlevel;
	
	/**
	 * 买家好评率
	 */
	@XmlElement
	private Float evaluationBuy;
	
	/**
	 * 冗余的好评 1表示100% 其他表现方式为0.85 表示85%
	 */
	@XmlElement
	private Float evaluation;
	
	/**
	 * 工作速度
	 */
	@XmlElement
	private Float speed;
	
	/**
	 * 服务态度
	 */
	@XmlElement
	private Float attitude;
	
	/**
	 * 完成质量
	 */
	@XmlElement
	private Float quality;
	
	/**
	 * 付款及时性
	 */
	@XmlElement
	private Float timeliness;
	
	/**
	 * 合作愉快度
	 */
	@XmlElement
	private Float cooperation;
	
	/**
	 * 投诉纠纷
	 */
	@XmlElement
	private Integer disputecount;
	
	/**
	 * 维权纠纷
	 */
	@XmlElement
	private Integer rightcount;
	
	/**
	 * 举报记录
	 */
	@XmlElement
	private Integer reportcount;
	
	/**
	 * 抄袭次数
	 */
	@XmlElement
	private Integer copycount;
	
	/**
	 * 退款记录
	 */
	@XmlElement
	private Integer refundcount;

	public Integer getIdeastatus() {
		return ideastatus;
	}

	public void setIdeastatus(Integer ideastatus) {
		this.ideastatus = ideastatus;
	}

	public Integer getEnactive() {
		return enactive;
	}

	public void setEnactive(Integer enactive) {
		this.enactive = enactive;
	}

	public Integer getShoptype() {
		return shoptype;
	}

	public void setShoptype(Integer shoptype) {
		this.shoptype = shoptype;
	}

	public Integer getDomainId() {
		return domainId;
	}

	public void setDomainId(Integer domainId) {
		this.domainId = domainId;
	}

	public Integer getUnstatus() {
		return unstatus;
	}

	public void setUnstatus(Integer unstatus) {
		this.unstatus = unstatus;
	}

	public Integer getUncode() {
		return uncode;
	}

	public void setUncode(Integer uncode) {
		this.uncode = uncode;
	}

	public Integer getUncodeExtid() {
		return uncodeExtid;
	}

	public void setUncodeExtid(Integer uncodeExtid) {
		this.uncodeExtid = uncodeExtid;
	}

	public Integer getAdoptionnum() {
		return adoptionnum;
	}

	public void setAdoptionnum(Integer adoptionnum) {
		this.adoptionnum = adoptionnum;
	}

	public Integer getAsknum() {
		return asknum;
	}

	public void setAsknum(Integer asknum) {
		this.asknum = asknum;
	}

	public Integer getAnswernum() {
		return answernum;
	}

	public void setAnswernum(Integer answernum) {
		this.answernum = answernum;
	}

	public Integer getRealstatus() {
		return realstatus;
	}

	public void setRealstatus(Integer realstatus) {
		this.realstatus = realstatus;
	}

	public Integer getIsMall() {
		return isMall;
	}

	public void setIsMall(Integer isMall) {
		this.isMall = isMall;
	}

	public Integer getGoldstatus() {
		return goldstatus;
	}

	public void setGoldstatus(Integer goldstatus) {
		this.goldstatus = goldstatus;
	}

	public Integer getIntegral() {
		return integral;
	}

	public void setIntegral(Integer integral) {
		this.integral = integral;
	}

	public BigDecimal getAbility() {
		return ability;
	}

	public void setAbility(BigDecimal ability) {
		this.ability = ability;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public Integer getHomepage() {
		return homepage;
	}

	public void setHomepage(Integer homepage) {
		this.homepage = homepage;
	}

	public String getTaskkey() {
		return taskkey;
	}

	public void setTaskkey(String taskkey) {
		this.taskkey = taskkey;
	}

	public Integer getAppType() {
		return appType;
	}

	public void setAppType(Integer appType) {
		this.appType = appType;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Integer getTimediff() {
		return timediff;
	}

	public void setTimediff(Integer timediff) {
		this.timediff = timediff;
	}

	public String getAihao() {
		return aihao;
	}

	public void setAihao(String aihao) {
		this.aihao = aihao;
	}

	public Integer getNationality() {
		return nationality;
	}

	public void setNationality(Integer nationality) {
		this.nationality = nationality;
	}

	public Integer getIswq() {
		return iswq;
	}

	public void setIswq(Integer iswq) {
		this.iswq = iswq;
	}

	public Integer getIsfws() {
		return isfws;
	}

	public void setIsfws(Integer isfws) {
		this.isfws = isfws;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Integer getGoldstarttime() {
		return goldstarttime;
	}

	public void setGoldstarttime(Integer goldstarttime) {
		this.goldstarttime = goldstarttime;
	}

	public Integer getGoldtime() {
		return goldtime;
	}

	public void setGoldtime(Integer goldtime) {
		this.goldtime = goldtime;
	}

	public Date getGoldymd() {
		return goldymd;
	}

	public void setGoldymd(Date goldymd) {
		this.goldymd = goldymd;
	}

	public Integer getOriginal() {
		return original;
	}

	public void setOriginal(Integer original) {
		this.original = original;
	}

	public Integer getEnsure() {
		return ensure;
	}

	public void setEnsure(Integer ensure) {
		this.ensure = ensure;
	}

	public Integer getApprove() {
		return approve;
	}

	public void setApprove(Integer approve) {
		this.approve = approve;
	}

	public Integer getCreditpoints() {
		return creditpoints;
	}

	public void setCreditpoints(Integer creditpoints) {
		this.creditpoints = creditpoints;
	}

	public Integer getFreezingcredit() {
		return freezingcredit;
	}

	public void setFreezingcredit(Integer freezingcredit) {
		this.freezingcredit = freezingcredit;
	}

	public Integer getCreditlevel() {
		return creditlevel;
	}

	public void setCreditlevel(Integer creditlevel) {
		this.creditlevel = creditlevel;
	}

	public Float getEvaluationBuy() {
		return evaluationBuy;
	}

	public void setEvaluationBuy(Float evaluationBuy) {
		this.evaluationBuy = evaluationBuy;
	}

	public Float getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(Float evaluation) {
		this.evaluation = evaluation;
	}

	public Float getSpeed() {
		return speed;
	}

	public void setSpeed(Float speed) {
		this.speed = speed;
	}

	public Float getAttitude() {
		return attitude;
	}

	public void setAttitude(Float attitude) {
		this.attitude = attitude;
	}

	public Float getQuality() {
		return quality;
	}

	public void setQuality(Float quality) {
		this.quality = quality;
	}

	public Float getTimeliness() {
		return timeliness;
	}

	public void setTimeliness(Float timeliness) {
		this.timeliness = timeliness;
	}

	public Float getCooperation() {
		return cooperation;
	}

	public void setCooperation(Float cooperation) {
		this.cooperation = cooperation;
	}

	public Integer getDisputecount() {
		return disputecount;
	}

	public void setDisputecount(Integer disputecount) {
		this.disputecount = disputecount;
	}

	public Integer getRightcount() {
		return rightcount;
	}

	public void setRightcount(Integer rightcount) {
		this.rightcount = rightcount;
	}

	public Integer getReportcount() {
		return reportcount;
	}

	public void setReportcount(Integer reportcount) {
		this.reportcount = reportcount;
	}

	public Integer getCopycount() {
		return copycount;
	}

	public void setCopycount(Integer copycount) {
		this.copycount = copycount;
	}

	public Integer getRefundcount() {
		return refundcount;
	}

	public void setRefundcount(Integer refundcount) {
		this.refundcount = refundcount;
	}
}
