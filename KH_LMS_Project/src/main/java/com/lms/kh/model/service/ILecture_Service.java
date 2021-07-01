package com.lms.kh.model.service;

import java.util.List;
import java.util.Map;

import com.lms.kh.dto.LectureDto;

public interface ILecture_Service {

	// 강의 전체 조회 lectureList
	public List<LectureDto> lectureList();
	
	// 강의별 상세 조회 lectureDetail
	public LectureDto lectureDetail(int le_seq);
	
	// 강의 등록 insertLecture
	public boolean insertLecture(LectureDto dto);
	
	// 강의 상세내용 수정 updateLecture
	public boolean updateLecture(Map<String, Object> map);
	
	// 강의 지도 강사 등록 attachTeacher
	public boolean attachTeacher(Map<String, Object> map);
	
	// 과정에 연관된 강의 리스트 출력 lectureGroupList
	public List<LectureDto> lectureGroupList(int cl_seq);
}

