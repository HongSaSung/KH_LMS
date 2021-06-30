package com.lms.kh.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lms.kh.dto.LMS_UserDto;

@Repository
public class LMS_DaoImpl implements ILMS_Dao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	private final String NS = "com.lms.kh.model.dao.LMS_DaoImpl.";
	
	@Override
	public LMS_UserDto login(LMS_UserDto userDto) {
		log.info("ILMS_DaoImpl LMS 로그인");
		return sqlSession.selectOne(NS+"login", userDto);
	}
	
	@Override
	public boolean signUp(LMS_UserDto userDto) {
		log.info("ILMS_DaoImpl LMS 회원가입 : {}", userDto);
		int n = sqlSession.insert(NS+"signUp", userDto);
		return (n>0)?true:false;
	}
	
	@Override
	public boolean duplicateCheck(String userid) {
		log.info("ILMS_DaoImpl LMS 아이디 중복체크 : {}", userid);
		int d = sqlSession.selectOne(NS+"duplicateCheck", userid);
		return (d>0)?true:false;
	}

	@Override
	public List<LMS_UserDto> memberList() {
		log.info("ILMS_DaoImpl LMS 회원 전체조회");
		return sqlSession.selectList(NS+"memberList");
	}

	@Override
	public LMS_UserDto memberDetail(String userid) {
		log.info("ILMS_DaoImpl LMS 회원 상세조회 : {}", userid);
		return sqlSession.selectOne(NS+"memberDetail",userid);
	}

	@Override
	public boolean updateMember(LMS_UserDto userDto) {
		int u = sqlSession.update(NS+"updateMember", userDto);
		return (u>0)?true:false;
	}

	@Override
	public boolean deleteMember(String userid) {
		log.info("ILMS_ServiceImpl LMS 회원탈퇴 : {}", userid);
		int d = sqlSession.update(NS+"deleteMember", userid);
		return (d>0)?true:false;
	}
	
	
}
