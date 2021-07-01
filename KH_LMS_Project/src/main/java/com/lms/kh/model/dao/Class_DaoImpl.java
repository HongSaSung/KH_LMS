package com.lms.kh.model.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lms.kh.dto.ClassDto;

@Repository
public class Class_DaoImpl implements IClass_Dao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	private final String NS = "com.lms.kh.model.dao.Class_DaoImpl.";
	
	@Override
	public boolean insertClass(Map<String, Object> classMap) {
		log.info("Class_DaoImpl 과정개설 : {}", classMap);
		int i = sqlSession.insert(NS+"insertClass", classMap);
		return (i>0)?true:false;
	}
	
	@Override
	public List<ClassDto> classList() {
		log.info("Class_DaoImpl 과정 전체조회");
		return sqlSession.selectList(NS+"classList");
	}
	
	@Override
	public ClassDto classDetail(int cl_seq) {
		log.info("Class_DaoImpl 과정 상세조회 : {}", cl_seq);
		return sqlSession.selectOne(NS+"classDetail", cl_seq);
	}

	@Override
	public boolean classModify(ClassDto modifyDto) {
		int modi = sqlSession.update(NS+"classModify", modifyDto);
		return (modi>0)?true:false;
	}
}
