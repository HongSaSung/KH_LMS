package com.lms.kh.dto;

public class TeacherDto {
	private int te_seq;
	private String userid;
	private String regdate;
	
	private LMS_UserDto userdto;

	public TeacherDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TeacherDto(int te_seq, String userid, String regdate, LMS_UserDto userdto) {
		super();
		this.te_seq = te_seq;
		this.userid = userid;
		this.regdate = regdate;
		this.userdto = userdto;
	}

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

	public LMS_UserDto getUserdto() {
		return userdto;
	}

	public void setUserdto(LMS_UserDto userdto) {
		this.userdto = userdto;
	}

	@Override
	public String toString() {
		return "TeacherDto [te_seq=" + te_seq + ", userid=" + userid + ", regdate=" + regdate + ", userdto=" + userdto
				+ "]";
	}

	
}
