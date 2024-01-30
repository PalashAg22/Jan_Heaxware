package com.hexaware.test_core_spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.test_core_spring.dao.IDao;

@Service
public class IServiceImpl implements IService {

	@Autowired
	IDao dao;
	@Override
	public void importantMthd() {
		// TODO Auto-generated method stub

		System.out.println("implemented so that user can use services");
		
		dao.demo();
	}

}
