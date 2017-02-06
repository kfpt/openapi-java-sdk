package com.zhubajie.zop.openapi.response.user;

public class FwsInfo {

    /**
     * 用户user_id
     */
    private Long userId;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String email;

    /**
     * qq
     */
    private String qq;

    /**
     * msn
     */
    private String msn;

    /**
     * 昵称
     */
    private String nkname;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getMsn() {
		return msn;
	}

	public void setMsn(String msn) {
		this.msn = msn;
	}

	public String getNkname() {
		return nkname;
	}

	public void setNkname(String nkname) {
		this.nkname = nkname;
	}

	@Override
	public String toString() {
		return "FwsInfo [user_id=" + userId + ", mobile=" + mobile + ", email=" + email + ", qq=" + qq + ", msn=" + msn
				+ ", nkname=" + nkname + "]";
	}
    
}
