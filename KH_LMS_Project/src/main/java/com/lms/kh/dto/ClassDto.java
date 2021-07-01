package com.lms.kh.dto;

public class ClassDto {
	private int cl_seq;
	private String cl_title;
	private String cl_desc;
	
	public ClassDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClassDto(int cl_seq, String cl_title, String cl_desc) {
		super();
		this.cl_seq = cl_seq;
		this.cl_title = cl_title;
		this.cl_desc = cl_desc;
	}
	public int getCl_seq() {
		return cl_seq;
	}
	public void setCl_seq(int cl_seq) {
		this.cl_seq = cl_seq;
	}
	public String getCl_title() {
		return cl_title;
	}
	public void setCl_title(String cl_title) {
		this.cl_title = cl_title;
	}
	public String getCl_desc() {
		return cl_desc;
	}
	public void setCl_desc(String cl_desc) {
		this.cl_desc = cl_desc;
	}
	@Override
	public String toString() {
		return "ClassDto [cl_seq=" + cl_seq + ", cl_title=" + cl_title + ", cl_desc=" + cl_desc + "]";
	}
	
	
}
