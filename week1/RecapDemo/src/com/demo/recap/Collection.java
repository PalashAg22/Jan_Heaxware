package com.demo.recap;

import java.util.ArrayList;
import java.util.List;

public class Collection {
public static void main(String[] args) {
	List list = new ArrayList();  // generic type is object 
	list.add(30); // new Integer(30);
	list.add(10);
	list.add(20);
	list.add(40);
	list.add("hello");
	list.add(4.55f);
	list.add(3.5);
	System.out.println(list);
}
}
