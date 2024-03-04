package pojo;

import java.util.Comparator;

public class MyComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s1.compareTo(s2); // can use -  to reverse
	}

}
