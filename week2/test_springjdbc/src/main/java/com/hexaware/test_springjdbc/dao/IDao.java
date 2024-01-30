package com.hexaware.test_springjdbc.dao;

import java.util.List;

import com.hexaware.test_springjdbc.entity.Country;

public interface IDao {

	List<Country> showAllCountry();
	void addCountry(Country country);
	void updateCountry(Country country);
	void deleteCountry(Country country);
	
}
