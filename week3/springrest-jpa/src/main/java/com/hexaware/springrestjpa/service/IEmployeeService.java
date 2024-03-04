package com.hexaware.springrestjpa.service;

import java.util.List;

import com.hexaware.springrestjpa.entities.Employee;

public interface IEmployeeService {


	public Employee insertEmployee(Employee emp);
	public Employee updateEmployee(long eid ,Employee emp);
	
	public Employee getEmployeeById(long eid);
	
	public String deleteEmployeeById(long eid);
	
	public List<Employee> getAllEmployee();
	
	public List<Employee> getByName(String ename);
	
	public List<Employee> getBySalaryGT(double salary);

	public List<Employee> getBySalasrySorted();

	public List<Employee> getBySalaryRange(double min, double max);

	public int deleteByEname(String ename);
	
}
