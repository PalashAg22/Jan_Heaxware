package com.hexaware.security.config;

import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.hexaware.security.entities.Customer;
import com.hexaware.security.repository.CustomerRepository;

@Component
public class UserInfoUserDetailsService implements UserDetailsService {

	
	@Autowired
	CustomerRepository repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional <Customer> customer = repo.findByName(username);
		
		return customer.map(UserInfoUserDetails::new)
				.orElseThrow(()->new UsernameNotFoundException("not exists"));
	 }

}
