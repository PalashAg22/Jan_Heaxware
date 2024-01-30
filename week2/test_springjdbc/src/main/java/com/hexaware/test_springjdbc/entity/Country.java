package com.hexaware.test_springjdbc.entity;

import org.springframework.stereotype.Component;

@Component
public class Country {

	private String cname;
	private String captial;
	private int population;
	public Country() {
		super();
	}
	public Country(String cname, String captial, int population) {
		super();
		this.cname = cname;
		this.captial = captial;
		this.population = population;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaptial() {
		return captial;
	}
	public void setCaptial(String captial) {
		this.captial = captial;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	@Override
	public String toString() {
		return "Country [cname=" + cname + ", captial=" + captial + ", population=" + population + "]";
	}
	
	
	
}
