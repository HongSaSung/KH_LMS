package com.lms.kh.dto;

public class TeacherDto {
	private int te_seq;
	private String userid;
	private String regdate;

	public int getTe_seq() {
		return te_seq;
	}

	public void setTe_seq(int te_seq) {
		this.te_seq = te_seq;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public TeacherDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TeacherDto(int te_seq, String userid, String regdate) {
		super();
		this.te_seq = te_seq;
		this.userid = userid;
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "TeacherDto [te_seq=" + te_seq + ", userid=" + userid + ", regdate=" + regdate + "]";
	}

}
