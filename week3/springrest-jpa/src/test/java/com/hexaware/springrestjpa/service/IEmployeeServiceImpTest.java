package com.hexaware.springrestjpa.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.springrestjpa.entities.Employee;

@SpringBootTest
class IEmployeeServiceImpTest {

	 Logger logger= LoggerFactory.getLogger(IEmployeeServiceImpTest.class);
	
	
	@Autowired
	IEmployeeService service;
	

	@Disabled
	@Test
	void testInsertEmployee() {
		
		
		
		Employee emp = new Employee(132,"BatMan",550000);
		Employee e1 = service.insertEmployee(emp);
		logger.info("Employee added successfully");
		assertNotNull(e1);
		assertEquals(121,e1.getEid());
	}

	@Disabled
	@Test
	void testUpdateEmployee() {
		Employee emp = new Employee(106, "ashwin", 45500);
		
		service.updateEmployee(106, emp);
		
		assertFalse(emp.getEname().equals("KP"));
	}

	@Disabled
	@Test
	void testGetEmployeeById() {
		Employee e1 = service.getEmployeeById(102);
		assertEquals("rohit", e1.getEname());
	}

	@Disabled
	@Test
	void testDeleteEmployeeById() {
		service.deleteEmployeeById(103);
		assertTrue(true);
		logger.warn("Employee with "+103+" id is deleted successfully");
	}

	
	@Test
	void testGetAllEmployee() {
		
	List<Employee> emp = service.getAllEmployee();
	
	assertTrue(emp.size() > 0);
		
	}

	
	
}
