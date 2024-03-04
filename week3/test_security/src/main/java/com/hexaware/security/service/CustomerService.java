package com.hexaware.security.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.hexaware.security.entities.Customer;
import com.hexaware.security.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	PasswordEncoder encoder;
	
	@Autowired
	CustomerRepository repo;
	
	public List<Customer> getAll(){
		return repo.findAll();
	}
	public Customer getCustomer(String username) {
		return repo.findByName(username).orElse(null);
//		return this.list.stream().filter(Customer -> Customer.getUsername().equals(username)).findAny().orElse(null);	
	}
	public Customer addCustomer(Customer customer) {
		customer.setPassword(encoder.encode(customer.getPassword()));
		return repo.save(customer);
	}
}
