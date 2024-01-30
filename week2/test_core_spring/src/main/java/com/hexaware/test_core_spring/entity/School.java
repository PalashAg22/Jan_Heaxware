package com.hexaware.test_core_spring.entity;

import org.springframework.stereotype.Component;

@Component
public class School {

	private String schoolName;
	private String type;
	public School() {
		super();
	}
	public School(String schoolName, String type) {
		super();
		this.schoolName = schoolName;
		this.type = type;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
//	@Override
//	public String toString() {
//		return "School [schoolName=" + schoolName + ", type=" + type + "]";
//	}
	
	
}
