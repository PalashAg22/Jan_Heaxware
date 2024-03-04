package pojo;

import java.util.Objects;

public class Employee {

	int eid;
	String ename;
	double salary;
	static String org = "hex";
	
	public Employee() {
	}
	
	public Employee(int eid, String name, double salary) {
		this(); // refer to current class constructor
		//super(); // refers to parent class constructor
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		
	}
	
	public Employee(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}

	//@Override
//	public int hashCode() {
//		return Objects.hash(eid);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		return eid == other.eid;
//	}
	
	
}
