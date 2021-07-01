package com.lms.kh;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lms.kh.dto.ClassDto;
import com.lms.kh.model.service.IClass_Service;

@Controller
public class LMS_ClassController {

	@Autowired
	private IClass_Service class_Service;
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
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
	
	// 과정리스트
		@RequestMapping(value = "/classMove.do" , method = RequestMethod.GET)
		public String classListMove(Model model) {
			log.info("LMS_ClassController 과정 전체조회");
			List<ClassDto> clList = class_Service.classList();
			model.addAttribute("clList", clList);
			return "LMS_ClassList";
		}
		
		// 과정 상세조회
		@RequestMapping(value = "/classDetail.do" , method = RequestMethod.GET)
		public String classDetail(int cl_seq, Model model) {
			log.info("LMS_ClassController 과정 상세조회 : {}", cl_seq);
			ClassDto clDetail =  class_Service.classDetail(cl_seq);
			model.addAttribute("cl_Detail", clDetail);
			return "LMS_ClassDetail";
		}
		
		// 과정 상세내용 수정페이지 이동
		@RequestMapping(value = "/classModify.do" , method = RequestMethod.GET)
		public String classModifyMove(int cl_seq, Model model) {
			log.info("LMS_ClassController 과정 상세내용 수정페이지 이동");
			ClassDto clDetail =  class_Service.classDetail(cl_seq);
			model.addAttribute("cl_Detail", clDetail);
			return "LMS_ClassModify";
		}
		
		// 과정 상세내용 수정
		@RequestMapping(value = "/classModifyChk.do" , method = RequestMethod.POST)
		public String classModify(ClassDto modifyDto, Model model) {
			log.info("LMS_ClassController 과정 상세내용 수정 : {}", modifyDto);
			boolean isc = class_Service.classModify(modifyDto);
			log.info("수정 결과 : {}", isc);
			return isc?"redirect:/classDetail.do?cl_seq="+modifyDto.getCl_seq():"redirect:/classModify.do?cl_seq="+modifyDto.getCl_seq();
		}
	

}
