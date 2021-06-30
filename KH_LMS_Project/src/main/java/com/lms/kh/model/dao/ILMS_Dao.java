package com.lms.kh.model.dao;

import java.util.List;

import com.lms.kh.dto.LMS_UserDto;

public interface ILMS_Dao {

	// 로그인
	public LMS_UserDto login(LMS_UserDto userDto);
	
	// 회원가입
	public boolean signUp(LMS_UserDto userDto);
	
	// 아이디 중복검사
	public boolean duplicateCheck(String userid);
	
	// 회원 전체조회
	public List<LMS_UserDto> memberList();
	
	// 회원 상세조회
	public LMS_UserDto memberDetail(String userid);
	
	// 회원정보 수정
	public boolean updateMember(LMS_UserDto userDto);
	
	// 회원탈퇴
	public boolean deleteMember(String userid);
}
