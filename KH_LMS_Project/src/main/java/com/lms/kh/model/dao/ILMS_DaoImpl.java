package com.lms.kh.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lms.kh.dto.LMS_UserDto;

@Repository
public class ILMS_DaoImpl implements ILMS_Dao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	private final String NS = "com.lms.kh.model.dao.ILMS_DaoImpl.";
	
	@Override
	public LMS_UserDto lmsLogin(LMS_UserDto lms_Dto) {
		log.info("ILMS_DaoImpl LMS 로그인");
		return sqlSession.selectOne(NS+"lmsLogin", lms_Dto);
	}
}
