package com.lms.kh.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.kh.dto.TeacherDto;
import com.lms.kh.model.dao.ITeacher_Dao;

@Service
public class Teacher_ServiceImpl implements ITeacher_Service{
	
	@Autowired
	ITeacher_Dao dao;
	
	// 강사 전체 조회
	public List<TeacherDto> teacherList() {
		List<TeacherDto> lists;
		lists = dao.teacherList();
		return lists;
	}
	
	// 강사 상세 조회 (회원 조회와 동일하므로 스킵)
	// 강사 등록(회원을 강사 리스트에 올림)
	public boolean registTeacher(String userid) {
		return dao.registTeacher(userid);
	}
}
