package com.vvJee.spring_boot_MyBatis.enums;

public enum ResultEnum {
	UNKNOW_ERROR(-1,"未知错误"),
	SUCCESS(0,"成功"),
	;
	
	private Integer code;
	private String msg;
	private ResultEnum(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	public Integer getCode() {
		return code;
	}
	public String getMsg() {
		return msg;
	}
	
	
	
}
