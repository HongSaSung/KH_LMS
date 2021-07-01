package com.lms.kh.model.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.kh.dto.LectureDto;
import com.lms.kh.model.dao.ILecture_Dao;

@Service
public class Lecture_ServiceImpl implements ILecture_Service{

	@Autowired
	ILecture_Dao dao;
	
	// 강의 전체 조회 lectureList
	public List<LectureDto> lectureList(){
		return dao.lectureList();
	}
	
	// 강의별 상세 조회 lectureDetail
	public LectureDto lectureDetail(int le_seq) {
		return dao.lectureDetail(le_seq);
	}
	
	// 강의 등록 insertLecture
	public boolean insertLecture(LectureDto dto) {
		return dao.insertLecture(dto);
	}
	
	// 강의 상세내용 수정 updateLecture
	public boolean updateLecture(Map<String, Object> map) {
		return dao.updateLecture(map);
	}
	
	// 강의 지도 강사 등록 attachTeacher
	public boolean attachTeacher(Map<String, Object> map) {
		return attachTeacher(map);
	}
	
	// 과정에 연관된 강의 리스트 출력 lectureGroupList
	public List<LectureDto> lectureGroupList(int cl_seq){
		return lectureGroupList(cl_seq);
	}
}

