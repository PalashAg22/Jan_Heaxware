package pojo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Employee emp = new Employee();
//		emp.eid=101;
//		emp.ename = "palash";
//		emp.salary = 1000.23;
//		System.out.println(emp.toString());
//		Employee emp2 = new Employee();
//		emp2.eid=102;
//		System.out.println(emp2);
		Set<Employee> set = new HashSet<Employee>();
		set.add(new Employee(101,"palash",1000.00));
		set.add(new Employee(104,"bakd",18490.00));
		set.add(new Employee(103,"fnejkj",1324));
		set.add(new Employee(102,"temp",1002.00));
		
		//System.out.println(set);
		System.out.println();
		Set<Employee> emp = new TreeSet<Employee>(new MyComparator());
		emp.add(new Employee(101,"palash",1000.00));
		emp.add(new Employee(104,"bakd",18490.00));
		emp.add(new Employee(103,"fnejkj",1324));
		emp.add(new Employee(102,"temp",1002.00));
		System.out.println(emp);
	}

}
