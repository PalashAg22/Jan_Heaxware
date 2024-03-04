package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import pojo.Employee;
import pojo.MyComparator;


public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer ,String> map = new HashMap<Integer,String>();
		map.put(103, "ravi");
		map.put(102, null);
		map.put(101, "tom");
		map.put(102, "sai");
		System.out.println(map);//hash order
		Set<Integer> set =  map.keySet();
		Iterator<Integer> i  = set.iterator();
		while(i.hasNext()) {
			Integer in = i.next();
			System.out.println(in);
		}
		Collection<String> list = map.values();
		for(String name: list) {
			System.out.println(name);
		}
		System.out.println();
		Map<Employee,String> tm = new TreeMap<Employee,String>(new MyComparator());
		tm.put(new Employee(101,"palash",1000.00),"hyd");
		tm.put(new Employee(104,"bakd",18490.00),"pune");
		tm.put(new Employee(103,"fnejkj",1324),"bang");
		tm.put(new Employee(102,"temp",1002.00),"Mum");
		System.out.println(tm);
	}

}
