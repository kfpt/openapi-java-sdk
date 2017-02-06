package com.zhubajie.zop.openapi.response.user;

import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

/**
 * Created by malibin on 16-6-7.
 *
 * 获取服务商等级信息
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class QueryMembershipResponse extends AbstractSuccessResponse {
  
    /**
     * 等级
     */
	@XmlElement
	private Integer level;
	
    /**
     * 比例
     */
	@XmlElement
	private BigDecimal proportion;
	
    /**
     * 支付类型
     */
	@XmlElement
	private Integer paytype;
	
    /**
     * 等级名称
     */
	@XmlElement
	private String name;

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public BigDecimal getProportion() {
		return proportion;
	}

	public void setProportion(BigDecimal proportion) {
		this.proportion = proportion;
	}

	public Integer getPaytype() {
		return paytype;
	}

	public void setPaytype(Integer paytype) {
		this.paytype = paytype;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
