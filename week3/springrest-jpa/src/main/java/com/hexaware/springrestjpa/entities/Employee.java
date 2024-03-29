package com.hexaware.springrestjpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

@Entity
@Table(name="employee_table")

public class Employee {

	@Id
	//@Min(100)
	private long eid;
//	@Pattern(regexp="[A-Z][a-z]{3,10}")
//	@Email
	private String ename;
	//@Min(20000)
	//@Max(70000)
	private double salary;
	public Employee() {
		super();
	}
	public Employee(long eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	public long getEid() {
		return eid;
	}
	public void setEid(long eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
