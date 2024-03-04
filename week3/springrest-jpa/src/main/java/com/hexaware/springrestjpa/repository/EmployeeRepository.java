package com.hexaware.springrestjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.springrestjpa.entities.Employee;


@Repository // not mandatory to write cuz in JpaRepository it is there
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	List<Employee> findByEname(String ename);
	
	List<Employee> findBySalaryGreaterThan(double salary);

														// :min and :max
	@Query("select e from Employee e where e.salary between ?1 and ?2") // jpl query
	List<Employee> getSalaryByRange(double min, double max);

	
	@Modifying// used cuz otherwise it will consider it as a select query
	@Query("delete from Employee e where e.ename=?1")
	int deleteByEname(String ename);
	
}
