package com.zhubajie.zop.openapi.response.trade;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

@XmlRootElement(name = "taskQueryList")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class TaskQueryListResponse extends AbstractSuccessResponse{
	/**
	 * 总条数
	 */
	private Integer total;
	/**
	 * 当前返回条数
	 */
	private Integer currentNum;
	/**
	 * 需求列表
	 */
	@XmlElementWrapper(name="taskList")
	@XmlElement(name="taskInfo")
	private List<TaskInfo> taskList;
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Integer getCurrentNum() {
		return currentNum;
	}
	public void setCurrentNum(Integer currentNum) {
		this.currentNum = currentNum;
	}
	public List<TaskInfo> getTaskList() {
		return taskList;
	}
	public void setTaskList(List<TaskInfo> taskList) {
		this.taskList = taskList;
	}
	
}
