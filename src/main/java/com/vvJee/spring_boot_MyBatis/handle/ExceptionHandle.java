package com.vvJee.spring_boot_MyBatis.handle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vvJee.spring_boot_MyBatis.domain.Result;
import com.vvJee.spring_boot_MyBatis.exception.TestException;
import com.vvJee.spring_boot_MyBatis.utils.ResultUtil;

@ControllerAdvice
public class ExceptionHandle {

	private final static Logger logger = LoggerFactory.getLogger(ExceptionHandler.class);
	
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public Result handle(Exception e){
		if (e instanceof TestException) {
			TestException testException = (TestException) e;
			return ResultUtil.error(testException.getCode(), testException.getMessage());
		} else {
			logger.error("[系统异常]:{}",e);
			return ResultUtil.error(-1, "未知错误");
		}
	}
}
