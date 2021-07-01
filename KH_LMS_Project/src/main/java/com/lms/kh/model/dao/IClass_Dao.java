package com.lms.kh.model.dao;

import java.util.List;
import java.util.Map;

import com.lms.kh.dto.ClassDto;

public interface IClass_Dao {
	
	// 과정개설
	public boolean insertClass(Map<String, Object> classMap);
	
	// 과정 전체조회
	public List<ClassDto> classList();
	
	// 과정 상세조회
	public ClassDto classDetail(int cl_seq);
	
	// 과정 상세내용 수정
	public boolean classModify(ClassDto modifyDto);

}
