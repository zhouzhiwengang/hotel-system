package com.zzg.global.exception.handler;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zzg.common.entity.Result;

@ControllerAdvice
public class GlobalExceptionHandler {
	// 日志记录
	public static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	/**
	 * 处理其他异常
	 * 
	 * @param req
	 * @param e
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Result exceptionHandler(HttpServletRequest request, Exception e) {
		logger.error("未知异常！原因是:", e);
		return Result.error("系统未知异常");
	}
}
