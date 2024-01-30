package com.hexaware.test_springjdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.test_springjdbc.entity.Country;

@Repository
public class IDaoImpl implements IDao {

	JdbcTemplate jdbcTemplate;
	
	public IDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Country> showAllCountry() {
		// TODO Auto-generated method stub
		String query = "select * from country";
		List<Country> list = jdbcTemplate.query(query, new CountryMapper());
		return list;
	}

	@Override
	public void addCountry(Country country) {
		// TODO Auto-generated method stub
		String query = "Insert into country(country_name,country_capital,population) values(?,?,?)";
		int count = jdbcTemplate.update(query,country.getCname(),country.getCaptial(),country.getPopulation());
		System.out.println(count+" rows affected");
		
	}

	@Override
	public void updateCountry(Country country) {
		// TODO Auto-generated method stub

		String query = "Update country set country_capital=? where country_name=?";
		int count = jdbcTemplate.update(query, country.getCaptial(),country.getCname());
		System.out.println(count+" rows affected");
	}

	@Override
	public void deleteCountry(Country country) {
		// TODO Auto-generated method stub

	}

}
