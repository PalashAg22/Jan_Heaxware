package com.hexaware.test_springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hexaware.test_springjdbc.entity.Country;

public class CountryMapper implements RowMapper<Country> {

	@Override
	public Country mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Country country = new Country();
		country.setCname(rs.getString("country_name"));
		country.setCaptial(rs.getString("country_capital"));
		country.setPopulation(rs.getInt("population"));
		return country;
	}

}
