package com.zhubajie.zop.openapi.response.trade;

import com.zhubajie.zop.openapi.response.common.AbstractSuccessResponse;

public class GiveupReasonInfo {

    private Integer id; // 关联id
    
   // private Integer itemId; // 原因id
    
    private Byte seq; // 顺序

    private String displayTxt; // 每个选项的显示文本

    private Byte allowInput; // 文本后面是否有输入框，1:允许有输入，0:不允许

    private String allowInputNote; // 文本输入框的提示，在allow_input有效的时候该值有效

    private Byte enable; // 1:启动，0：禁用

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

//	public Integer getItemId() {
//		return itemId;
//	}
//
//	public void setItemId(Integer itemId) {
//		this.itemId = itemId;
//	}
//
//	public String getInputTxt() {
//		return inputTxt;
//	}
//
//	public void setInputTxt(String inputTxt) {
//		this.inputTxt = inputTxt;
//	}

	public Byte getSeq() {
		return seq;
	}

	public void setSeq(Byte seq) {
		this.seq = seq;
	}

	public String getDisplayTxt() {
		return displayTxt;
	}

	public void setDisplayTxt(String displayTxt) {
		this.displayTxt = displayTxt;
	}

	public Byte getAllowInput() {
		return allowInput;
	}

	public void setAllowInput(Byte allowInput) {
		this.allowInput = allowInput;
	}

	public String getAllowInputNote() {
		return allowInputNote;
	}

	public void setAllowInputNote(String allowInputNote) {
		this.allowInputNote = allowInputNote;
	}

	public Byte getEnable() {
		return enable;
	}

	public void setEnable(Byte enable) {
		this.enable = enable;
	}

}
