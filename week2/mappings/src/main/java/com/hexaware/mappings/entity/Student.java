package com.hexaware.mappings.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	private int studentId;
	private String studentName;

	@OneToOne(cascade = CascadeType.ALL) 
	@JoinColumn(name="aid")
	// mappedBy -> here means address table will have sid as a FK and in student table no need to create FK of address
	// cascade.all -> if i save student then in address table address should be saved
	private Address address;

	public Student() {

	}

	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		
	}
	
	
	
	public Student(int studentId, String studentName, Address address) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
	
	

}
