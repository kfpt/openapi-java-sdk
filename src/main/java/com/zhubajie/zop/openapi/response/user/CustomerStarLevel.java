package com.zhubajie.zop.openapi.response.user;

public class CustomerStarLevel {

    private String nickname; // 昵称
    
    private Byte starLevel; // 星级

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Byte getStarLevel() {
		return starLevel;
	}

	public void setStarLevel(Byte starLevel) {
		this.starLevel = starLevel;
	}
    
}
