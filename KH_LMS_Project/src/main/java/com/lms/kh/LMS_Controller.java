package com.lms.kh;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lms.kh.dto.LMS_UserDto;
import com.lms.kh.model.service.ILMS_Service;

@Controller
public class LMS_Controller {
	
	@Autowired
	private ILMS_Service lms_Service;
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	// 로그인 페이지 이동
	@RequestMapping(value = "/loginForm.do" , method = RequestMethod.GET)
	public String loginView() {
		log.info("LMS_Controller 로그인 화면 이동");
		return "LMS_Login";
	}
	
	// 로그인
	@RequestMapping(value = "/login.do" , method = RequestMethod.POST)
	public String lmsLogin(HttpSession session, LMS_UserDto userDto) {
		log.info("LMS_Controller LMS로그인 : {}", userDto);
		System.out.println(userDto);
		LMS_UserDto loginDto = (LMS_UserDto)lms_Service.login(userDto);
		session.setAttribute("lms", loginDto);
		return "LMS_Main";
	}
	
	// 로그아웃
	@RequestMapping(value = "/logout.do" , method = RequestMethod.GET)
	public String logout(HttpSession session) {
		log.info("LMS_Controller 로그아웃");
		session.removeAttribute("lms");
		return "LMS_Login";
	}
	
	// 회원가입 페이지 이동
	@RequestMapping(value = "/signupForm.do" , method = RequestMethod.GET)
	public String signUpForm() {
		log.info("LMS_Controller 회원가입 화면 이동");
		return "LMS_SignUp";
	}
	
	// 회원가입
	@RequestMapping(value = "/signUp.do" , method = RequestMethod.POST)
	public String signUp(LMS_UserDto userDto) {
		log.info("LMS_Controller LMS회원가입 : {}", userDto);
		boolean isc = lms_Service.signUp(userDto);
		return isc?"LMS_Login":"LMS_SignUp";
	}
	
	// 아이디 중복체크
	@RequestMapping(value = "/idDupleChk.do" , method = RequestMethod.GET)
	public String idDupleChk(String userid, Model model) {
		log.info("LMS_Controller LMS 아이디 중복검사 : {}", userid);
		boolean isc = lms_Service.duplicateCheck(userid);
		model.addAttribute("userid", userid);
		model.addAttribute("isc", isc);
		return isc?"LMS_IdDupleChk":"LMS_IdDupleChk";
	}
	
	// 회원 전체조회
	@RequestMapping(value = "/memberList.do" , method = RequestMethod.GET)
	public String memberList(Model model) {
		List<LMS_UserDto>memList = lms_Service.memberList();
		model.addAttribute("memList", memList);
		return "LMS_MemberList";
	}
	
	// 회원 상세조회
	@RequestMapping(value = "/memberDetail.do" , method = RequestMethod.GET)
	public String memberDetail(String userid, Model model) {
		LMS_UserDto userDto = lms_Service.memberDetail(userid);
		model.addAttribute("userOne", userDto);
		return "LMS_MemberDetail";
	}
	
}
