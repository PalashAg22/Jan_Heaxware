package com.hexaware.test_core_spring.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Student {

	private int role;
	private String sname;
	
	@Autowired
	private School school;

	public Student() {
		super();
		System.out.println("student default constructor");
	}

	public Student(int role, String sname, School school) {
		super();
		this.role = role;
		this.sname = sname;
		this.school = school;
		System.out.println("student parameterise constructor");
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [role=" + role + ", sname=" + sname + ", school=" + school + "]";
	}
	
}
