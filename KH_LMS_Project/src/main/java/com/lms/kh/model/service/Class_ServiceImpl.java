package com.lms.kh.model.service;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
}
