package com.lms.kh.model.dao;

import java.util.List;

import com.lms.kh.dto.TeacherDto;

public interface ITeacher_Dao {

	// 강사 전체 조회
	List<TeacherDto> teacherList();
	
	// 강사 상세 조회 (회원 조회와 동일하므로 스킵)
	// 강사 등록(회원을 강사 리스트에 올림)
	boolean registTeacher(String userid);
}
