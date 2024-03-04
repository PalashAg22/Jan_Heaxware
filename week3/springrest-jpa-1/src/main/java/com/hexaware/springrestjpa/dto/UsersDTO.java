package com.hexaware.springrestjpa.dto;

import java.time.LocalDate;

public class UsersDTO {

	private int uid;
	private String name;
	private String uname;
	private String password;
	private String email;
	private String address;
	private String city;
	private String state;
	private LocalDate dob;
	private String role;
	private int creditScore;
	
	public UsersDTO() {
		super();
	}
	
	public UsersDTO(int uid, String name, String uname, String password, String email, String address, String city,
			String state, LocalDate dob, String role, int creditScore) {
		super();
		this.uid = uid;
		this.name = name;
		this.uname = uname;
		this.password = password;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.dob = dob;
		this.role = role;
		this.creditScore = creditScore;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
	
}
