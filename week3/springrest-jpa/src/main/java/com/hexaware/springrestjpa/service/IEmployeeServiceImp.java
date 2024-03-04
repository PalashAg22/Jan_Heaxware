package com.hexaware.springrestjpa.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.hexaware.springrestjpa.entities.Employee;
import com.hexaware.springrestjpa.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class IEmployeeServiceImp implements IEmployeeService {

	Logger logger = LoggerFactory.getLogger(IEmployeeServiceImp.class);
	
	
	@Autowired
	EmployeeRepository repo;
	
	@Override
	public Employee insertEmployee(Employee emp) {
		// TODO Auto-generated method stub
		logger.info("employee inserted successfully");
		return repo.save(emp);
		
	}

	@Override
	public Employee updateEmployee(long eid ,Employee emp) {
		// TODO Auto-generated method stub
		return repo.save(emp);
	}

	@Override
	public Employee getEmployeeById(long eid) {
		// TODO Auto-generated method stub
		Optional<Employee> optional = repo.findById(eid);
//		Employee e = null;
//		if(optional.isPresent()) {
//			emp = optional.get();
//		}
		return repo.findById(eid).orElse(null);
	}

	@Override
	public String deleteEmployeeById(long eid) {
		// TODO Auto-generated method stub
		logger.warn("getting deleted");
		repo.deleteById(eid);
		logger.info("employee deleted successfully");
		return " record deleted";
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		List<Employee> list = repo.findAll();
		
		return list ;
	}

	@Override
	public List<Employee> getByName(String ename) {
		// TODO Auto-generated method stub
		return repo.findByEname(ename);
	}

	@Override
	public List<Employee> getBySalaryGT(double salary) {
		// TODO Auto-generated method stub
		return repo.findBySalaryGreaterThan(salary);
	}

	@Override
	public List<Employee> getBySalasrySorted() {
		// TODO Auto-generated method stub
		// repo.findAll(Sort.by(Order.desc("salary")));
		return repo.findAll(Sort.by("salary"));
	}

	@Override
	public List<Employee> getBySalaryRange(double min, double max) {
		// TODO Auto-generated method stub
		return repo.getSalaryByRange(min, max);
	}

	@Override
	
	public int deleteByEname(String ename) {
		// TODO Auto-generated method stub
		return repo.deleteByEname(ename);
	}

	public static boolean validateEmployeeData(Employee emp) {
		boolean flag = false;
		
		if(emp.getEname().equals( emp.getEname().toUpperCase())) {
			flag = true;
		}
		return flag;
	}
	
	
}
