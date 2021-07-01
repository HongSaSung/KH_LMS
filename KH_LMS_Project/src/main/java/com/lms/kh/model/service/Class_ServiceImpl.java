package com.lms.kh.model.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.kh.dto.ClassDto;
import com.lms.kh.model.dao.IClass_Dao;

@Service
public class Class_ServiceImpl implements IClass_Service {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private IClass_Dao class_Dao;
	
	@Override
	public boolean insertClass(Map<String, Object> classMap) {
		log.info("Class_ServiceImpl 과정개설 : {}", classMap);
		return class_Dao.insertClass(classMap);
	}
	
	@Override
	public List<ClassDto> classList() {
		log.info("Class_ServiceImpl 과정 전체조회");
		return class_Dao.classList();
	}
	
	@Override
	public ClassDto classDetail(int cl_seq) {
		return class_Dao.classDetail(cl_seq);
	}
	
	@Override
	public boolean classModify(ClassDto modifyDto) {
		return class_Dao.classModify(modifyDto);
	}
}
