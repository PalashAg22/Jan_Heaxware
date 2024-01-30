package com.hexaware.test_springjdbc;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.hexaware.test_springjdbc.*")
@PropertySource("classpath:resources/database.properties")
public class CountryConfig {

	@Autowired
	Environment env;
	
	@Bean
	public DataSource getDataSource() {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		try {
			dataSource.setUrl(env.getProperty("url"));
			dataSource.setUsername(env.getProperty("uname"));
			dataSource.setPassword(env.getProperty("password"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataSource;
	}
}
