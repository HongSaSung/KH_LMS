package com.lms.kh.model.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.kh.dto.LMS_UserDto;
import com.lms.kh.model.dao.ILMS_Dao;

@Service
public class LMS_ServiceImpl implements ILMS_Service {

	@Autowired
	private ILMS_Dao lms_Dao;
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public LMS_UserDto login(LMS_UserDto userDto) {
		log.info("ILMS_ServiceImpl LMS로그인");
		return lms_Dao.login(userDto);
	}
	
	@Override
	public boolean signUp(LMS_UserDto userDto) {
		log.info("ILMS_ServiceImpl LMS회원가입");
		return lms_Dao.signUp(userDto);
	}
	
	@Override
	public boolean duplicateCheck(String userid) {
		return lms_Dao.duplicateCheck(userid);
	}
}
