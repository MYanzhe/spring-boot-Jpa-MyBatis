package com.vvJee.spring_boot_MyBatis.utils;

import com.vvJee.spring_boot_MyBatis.domain.Result;

public class ResultUtil {
	public static Result success(Object object){
		Result<Object> result = new Result<Object>();
		result.setCode(0);
		result.setMsg("成功");
		result.setData(object);
		return result;
	}
	
	public static Result success(){
		return success(null);
	}
	
	public static Result error(Integer code,String msg){
		Result result = new Result();
		result.setCode(code);
		result.setMsg(msg);
		return result;
	}
	
}
