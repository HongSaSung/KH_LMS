package com.lms.kh.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lms.kh.dto.TeacherDto;

@Repository
public class Teacher_DaoImpl implements ITeacher_Dao{

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	private final String NS = "com.lms.kh.model.dao.Teacher_DaoImpl.";
	
	@Override
	public boolean registTeacher(String userid) {
		log.info("[Teacher_DaoImpl] registTeacher {}", userid);
		int n = sqlSession.insert(NS + "registTeacher", userid);
		return (n>0)?true:false;
	}
	
	@Override
	public List<TeacherDto> teacherList() {
		log.info("[Teacher_DaoImpl] teacherList");
		List<TeacherDto> lists = null;
		lists = sqlSession.selectList(NS+"teacherList");
		return lists;
	}
}
