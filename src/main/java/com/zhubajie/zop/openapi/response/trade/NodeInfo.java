package com.zhubajie.zop.openapi.response.trade;

public class NodeInfo {

    private Integer nodeState; // 工作台节点状态

    private String doneTime; // 节点完成时间

    private String nodeName; // 节点名称

	private String followingTime; //跟进时间

	public Integer getNodeState() {
		return nodeState;
	}

	public void setNodeState(Integer nodeState) {
		this.nodeState = nodeState;
	}

	public String getDoneTime() {
		return doneTime;
	}

	public void setDoneTime(String doneTime) {
		this.doneTime = doneTime;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public String getFollowingTime() {
		return followingTime;
	}

	public void setFollowingTime(String followingTime) {
		this.followingTime = followingTime;
	}
    
}
