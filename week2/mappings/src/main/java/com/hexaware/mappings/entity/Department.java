package com.hexaware.mappings.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Department {

	@Id
	private int departmentId;
	
	private String departmentName;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="eid")
	private List<Employee> employeeSet = new ArrayList<Employee>();

	
	public Department() {
		super();
	}


	public Department(int departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	

	public Department(int departmentId, String departmentName, List<Employee> employeeSet) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.employeeSet = employeeSet;
	}


	public int getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public List<Employee> getEmployeeSet() {
		return employeeSet;
	}


	public void setEmployeeSet(List<Employee> employeeSet) {
		this.employeeSet = employeeSet;
	}
	
	public void addEmployee(Employee employee) {
		
		List<Employee> list = getEmployeeSet();
		list.add(employee);
		
	}
}
