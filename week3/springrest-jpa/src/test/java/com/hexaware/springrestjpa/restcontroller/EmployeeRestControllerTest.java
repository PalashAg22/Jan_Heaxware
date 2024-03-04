package com.hexaware.springrestjpa.restcontroller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.hexaware.springrestjpa.entities.Employee;



@SpringBootTest
class EmployeeRestControllerTest {

	@Autowired
	RestTemplate restTemplate;

	@Test
	void testInsertEmployee() {
		//restTemplate
		//restTemplate
	}

	@Test
	void testUpdateEmployee() {
		//restTemplate.delete / put / postforentity / getforentity
	}

	@Test
	void testGetAll() {
	ResponseEntity<List> response =	restTemplate.getForEntity("http://localhost:8080/api/employees/getAll", List.class);
	
	List <Employee> emp = response.getBody();
	
	List<Employee> emp1 =  restTemplate.getForObject("http://localhost:8080/api/employees/getAll", List.class);

	
	
	}

	@Test
	void testDeleteById() {
		
	}

	@Test
	void testGetEmployeeById() {
		//int eid = 102;
		ResponseEntity<Employee> response = restTemplate.getForEntity("http://localhost:8080/api/employees/getById/102", Employee.class);
		Employee emp =	response.getBody();
		assertNotNull(emp);
		assertEquals(102,emp.getEid());
	}

}
