package com.lms.kh;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lms.kh.dto.LMS_UserDto;
import com.lms.kh.model.service.ILMS_Service;

@Controller
public class TestController {
	
	@Autowired
	private ILMS_Service lms_Service;
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value = "/loginForm.do" , method = RequestMethod.GET)
	public String loginView() {
		log.info("TestController 로그인 화면 이동");
		return "Login";
	}
	
	@RequestMapping(value = "/login.do" , method = RequestMethod.POST)
	public String lmsLogin(HttpSession session, LMS_UserDto lms_Dto) {
		log.info("TestController LMS로그인 : {}", lms_Dto);
		System.out.println(lms_Dto);
		LMS_UserDto userDto = (LMS_UserDto)lms_Service.lmsLogin(lms_Dto);
		session.setAttribute("lms", userDto);
		return "main";
	}
}
