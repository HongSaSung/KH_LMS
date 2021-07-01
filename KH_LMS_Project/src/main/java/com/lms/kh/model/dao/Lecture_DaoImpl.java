package com.lms.kh.model.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lms.kh.dto.LectureDto;

@Repository
public class Lecture_DaoImpl implements ILecture_Dao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	private final String NS = "com.lms.kh.model.dao.Lecture_DaoImpl.";
	
	
	// 강의 전체 조회 lectureList
	@Override
	public List<LectureDto> lectureList() {
		log.info("[Lecture_DaoImpl] lectureList");
		return sqlSession.selectList(NS+"lectureList");
	}

	// 강의별 상세 조회 lectureDetail
	@Override
	public LectureDto lectureDetail(int le_seq) {
		log.info("[Lecture_DaoImpl] lectureDetail {}", le_seq);
		return sqlSession.selectOne(NS+"lectureDetail", le_seq);
	}

	// 강의 등록 insertLecture
	@Override
	public boolean insertLecture(LectureDto dto) {
		log.info("[Lecture_DaoImpl] insertLecture {}", dto);
		int n = sqlSession.insert(NS+"insertLecture", dto);
		return (n>0)?true:false;
	}

	// 강의 상세내용 수정 updateLecture
	@Override
	public boolean updateLecture(Map<String, Object> map) {
		log.info("[Lecture_DaoImpl] updateLecture {}", map);
		int n = sqlSession.update(NS+"updateLecture", map);
		return (n>0)?true:false;
	}

	// 강의 지도 강사 등록 attachTeacher
	@Override
	public boolean attachTeacher(Map<String, Object> map) {
		log.info("[Lecture_DaoImpl] attachTeacher {}", map);
		int n = sqlSession.insert(NS+"attachTeacher", map);
		return (n>0)?true:false;
	}

	// 과정에 연관된 강의 리스트 출력 lectureGroupList
	@Override
	public List<LectureDto> lectureGroupList(int cl_seq) {
		log.info("[Lecture_DaoImpl] lectureGroupList {}", cl_seq);
		return sqlSession.selectList(NS+"lectureGroupList", cl_seq);
	}
}
