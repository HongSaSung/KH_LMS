package com.lms.kh.dto;

import java.util.Date;

public class LMS_UserDto {

	private String name;
	private String userid;
	private String password;
	private String email;
	private String address;
	private String phone;
	private String delflag;
	private String auth;
	private Date regdate;
	
	public LMS_UserDto() {
		// TODO Auto-generated constructor stub
	}

	public LMS_UserDto(String name, String userid, String password, String email, String address, String phone,
			String delflag, String auth, Date regdate) {
		super();
		this.name = name;
		this.userid = userid;
		this.password = password;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.delflag = delflag;
		this.auth = auth;
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "LMS_UserDto [name=" + name + ", userid=" + userid + ", password=" + password + ", email=" + email
				+ ", address=" + address + ", phone=" + phone + ", delflag=" + delflag + ", auth=" + auth + ", regdate="
				+ regdate + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDelflag() {
		return delflag;
	}

	public void setDelflag(String delflag) {
		this.delflag = delflag;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
}
