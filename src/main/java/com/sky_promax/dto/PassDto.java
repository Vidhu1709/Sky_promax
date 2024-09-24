package com.sky_promax.dto;

public class PassDto {
	
    private long id;
	private String fname;
	private String lname;
	private String email;
	private String mobile;
	private String depair;
	private String arrair;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getDepair() {
		return depair;
	}
	public void setDepair(String depair) {
		this.depair = depair;
	}
	public String getArrair() {
		return arrair;
	}
	public void setArrair(String arrair) {
		this.arrair = arrair;
	}

}
