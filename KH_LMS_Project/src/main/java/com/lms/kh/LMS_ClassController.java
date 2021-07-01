package com.lms.kh;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lms.kh.model.service.IClass_Service;

@Controller
public class LMS_ClassController {

	@Autowired
	private IClass_Service class_Service;
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	// 과정리스트 이동
	@RequestMapping(value = "/classMove.do" , method = RequestMethod.GET)
	public String classListMove() {
		log.info("LMS_ClassController 과정리스트로 이동");
		return "LMS_ClassList";
	}
	
	// 과정개설 페이지 이동
	@RequestMapping(value = "/classInsert.do" , method = RequestMethod.GET)
	public String insertClassMove() {
		log.info("LMS_ClassController 과정개설 페이지로 이동");
		return "LMS_ClassCreate";
	}
	
	// 과정개설
	@RequestMapping(value = "/insertClass.do" , method = RequestMethod.POST)
	public String insertClass(@RequestParam Map<String, Object> classMap) {
		log.info("LMS_ClassController 과정개설 : {}", classMap);
		boolean isc = class_Service.insertClass(classMap);
		return isc?"LMS_ClassList":"LMS_ClassCreate";
	}
}
