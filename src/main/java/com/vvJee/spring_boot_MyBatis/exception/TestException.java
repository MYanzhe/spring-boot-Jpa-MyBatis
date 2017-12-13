package com.vvJee.spring_boot_MyBatis.exception;

public class TestException extends RuntimeException{
	private Integer code;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public TestException(Integer code,String message) {
		super(message);
		this.code = code;
	}
	
}
