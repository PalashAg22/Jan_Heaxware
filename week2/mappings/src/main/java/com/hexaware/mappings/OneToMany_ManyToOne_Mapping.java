package com.hexaware.mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappings.entity.Department;
import com.hexaware.mappings.entity.Employee;

public class OneToMany_ManyToOne_Mapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	        
	        Session session = sessionFactory.openSession();
	        System.out.println(session);
		
	        Employee e1 = new Employee(101,"king",55000);
		    Employee e2 = new Employee(102,"smith",45000);  
		    Employee e3 = new  Employee(103,"virat",35000); 
		    Employee e4 = new Employee(104,"rohit",65000); 
		    Department dep1 = new Department();
		   dep1.setDepartmentId(20); 
		   dep1.setDepartmentName("testing"); 
//		   e1.setDepartment(dep1);
//		   e2.setDepartment(dep1);
//		   e3.setDepartment(dep1);
//		  e4.setDepartment(dep1);
		   dep1.addEmployee(e1);
		   dep1.addEmployee(e2);
		  dep1.addEmployee(e3); 
		  dep1.addEmployee(e4);  
			
			    Transaction tx = session.beginTransaction(); 
			     
			  session.persist(dep1);
			    tx.commit();
			 	}

}
