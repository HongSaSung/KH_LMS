package com.lms.kh.model.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Class_DaoImpl implements IClass_Dao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	private final String NS = "com.lms.kh.model.dao.IClass_DaoImpl.";
	
	@Override
	public boolean insertClass(Map<String, Object> classMap) {
		int i = sqlSession.insert(NS+"insertClass", classMap);
		return (i>0)?true:false;
	}

}
