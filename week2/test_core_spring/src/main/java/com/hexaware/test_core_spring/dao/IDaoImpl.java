package com.hexaware.test_core_spring.dao;

import org.springframework.stereotype.Repository;

@Repository
public class IDaoImpl implements IDao {

	@Override
	public void demo() {
		// TODO Auto-generated method stub

		System.out.println("dao mthd implemented");
	}

}
