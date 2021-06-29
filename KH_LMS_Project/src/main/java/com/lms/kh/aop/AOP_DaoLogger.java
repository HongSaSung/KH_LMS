package com.lms.kh.aop;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AOP_DaoLogger {
	
	public void before(JoinPoint jp) {
		Logger log = LoggerFactory.getLogger(jp.getTarget()+"-");
		log.info(jp.getSignature().getName()+"이 실행됨");
	}
	
	public void afterReturning(JoinPoint jp) {
		Logger log = LoggerFactory.getLogger(jp.getTarget()+"-");
		log.info(jp.getSignature().getName()+"이 실행 후 반환됨");
	}
	
	public void afterThrowing(JoinPoint jp, Exception exception) {
		Logger log = LoggerFactory.getLogger(jp.getTarget()+"-");
		log.info(jp.getSignature().getName()+"에서 오류가 발생함");
	}
}
