package com.lms.kh.model.dao;

import com.lms.kh.dto.LMS_UserDto;

public interface ILMS_Dao {

	// 로그인
	public LMS_UserDto login(LMS_UserDto userDto);
	
	// 회원가입
	public boolean signUp(LMS_UserDto userDto);
	
	// 아이디 중복검사
	public boolean duplicateCheck(String userid);
}