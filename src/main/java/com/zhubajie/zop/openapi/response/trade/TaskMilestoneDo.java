package com.zhubajie.zop.openapi.response.trade;

public class TaskMilestoneDo {

	/**
     * 节点顺序,值小的排在前面,从1开始
     */
    private int order;
    /**
     * 节点名称
     */
    private String name;

    /**
     * 节点开始时间,当节点处于进行中时，该字段表示节点的开始时间
     */
    private int startTime;

    /**
     * 节点结束时间，当节点处于进行中时，该字段若不为0，则表示截止时间，不是所有节点都截止时间；
     * 若没有截止时间，该字段为0.当节点处于完结状态，表示实际完成时间
     *
     */
    private int endTime;

    /**
     * 节点进行中,值为true，节点完成，值为false
     */
    private boolean current;

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}

	public boolean isCurrent() {
		return current;
	}

	public void setCurrent(boolean current) {
		this.current = current;
	}
}
