package com.hexaware.springrestjpa.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrestjpa.entities.Employee;
import com.hexaware.springrestjpa.exception.EmployeeNotFoundException;
import com.hexaware.springrestjpa.service.IEmployeeService;
import com.hexaware.springrestjpa.service.IEmployeeServiceImp;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

	@Autowired
	IEmployeeService service;
	
	@PostMapping("/add")
	public Employee InsertEmployee(@RequestBody Employee emp) {
		
		if(IEmployeeServiceImp.validateEmployeeData(emp)) {
			return null;
		}
			return service.insertEmployee(emp);
		 
	}
	
	@PutMapping("/update/{eid}")
	public Employee updateEmployee(@PathVariable   long eid, @RequestBody @Valid Employee emp) {
		return service.updateEmployee(eid, emp);
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAll(){
		return service.getAllEmployee();
	}
	
	@GetMapping("/delete/{eid}")
	public String deleteById(@PathVariable long eid) throws EmployeeNotFoundException {
		Employee emp = service.getEmployeeById(eid);
		if(emp==null) {
			throw new EmployeeNotFoundException();
		}
		service.deleteEmployeeById(eid);
		return " record deleted";
	}
	@GetMapping("/getById/{eid}")
	public Employee getEmployeeById(@PathVariable long eid) throws EmployeeNotFoundException {
		
		Employee emp = service.getEmployeeById(eid);
		if(emp==null)
			throw new EmployeeNotFoundException();
		return emp;
	}
	
	@GetMapping("/getbyename/{ename}") // {name} -> @PathVariable(name)
	public List<Employee> getByEnsme(@PathVariable String ename){
		
		return service.getByName(ename);
	}
	
	// use this for numbers and date
	@GetMapping("getbysalarygt/{salary}")
	public List<Employee> getBySalaryGT(@PathVariable double salary){
		return service.getBySalaryGT(salary);
	}
	
	@GetMapping("getbysalarysort")
	public List<Employee> getBySalarySorted(){
		return service.getBySalasrySorted();
	}
	
	@GetMapping("/getsalarybyrange/{min}/{max}")
	public List<Employee> getSalaryByRange(@PathVariable double min, @PathVariable double max){
		return service.getBySalaryRange(min, max);
	}
	
	@DeleteMapping("/deletebyename/{ename}")
	public String deleteByEname(@PathVariable String ename) {
		return service.deleteByEname(ename)+" record deleted";
	}
}
