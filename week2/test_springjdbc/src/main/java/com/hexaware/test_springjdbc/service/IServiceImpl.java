package com.hexaware.test_springjdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.test_springjdbc.dao.IDao;
import com.hexaware.test_springjdbc.entity.Country;

@Service
public class IServiceImpl implements IService {

	@Autowired
	IDao dao;
	@Override
	public List<Country> showAllCountry() {
		// TODO Auto-generated method stub
		return dao.showAllCountry();
	}

	@Override
	public void addCountry(Country country) {
		// TODO Auto-generated method stub
		dao.addCountry(country);
	}

	@Override
	public void updateCountry(Country country) {
		// TODO Auto-generated method stub
		dao.updateCountry(country);
	}

	@Override
	public void deleteCountry(Country country) {
		// TODO Auto-generated method stub
		dao.deleteCountry(country);
	}

}
