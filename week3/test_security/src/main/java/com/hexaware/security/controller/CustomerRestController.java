package com.hexaware.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.security.dto.LoginDTO;
import com.hexaware.security.entities.Customer;
import com.hexaware.security.entities.Product;
import com.hexaware.security.service.CustomerService;
import com.hexaware.security.service.JwtService;
import com.hexaware.security.service.ProductService;

@RestController
@RequestMapping("/api/customer")

public class CustomerRestController {

	@Autowired
	JwtService jwtService;
	@Autowired
	CustomerService service;
	@Autowired
	ProductService pService;
	@Autowired
	private AuthenticationManager authenticationManager;
	
	
	@GetMapping("/welcome")
	public String welcome() {
		return "this endpoint is not secured";
	}
	
	
	@PostMapping("/authenticate")
	public String authenticateAndGetToken(@RequestBody LoginDTO loginDto) {
		Authentication authentication = new UsernamePasswordAuthenticationToken(loginDto.getUsername(), loginDto.getPassword());
		if(authentication.isAuthenticated()) {
			return jwtService.generateToken(loginDto.getUsername());
		}else {
			throw new UsernameNotFoundException("invalid");
		}
		
	}
	
	
	
	@GetMapping("/viewAllProduct")
	@PreAuthorize("hasAuthority('USER')")
	public List<Product> getAllProduct(){
		return pService.getAll();
	}
	
	@PostMapping("/newCustomer")
	public Customer addNew(@RequestBody Customer customer) {
		return service.addCustomer(customer);
	}
	
	@GetMapping("/getAll")
	@PreAuthorize("hasAuthority('ADMIN')")
	public List<Customer> getAll(){
		return service.getAll();
	}
	@GetMapping("/login/{username}")
	@PreAuthorize("hasAuthority('USER')")
	public Customer login(@PathVariable String username) {
		return service.getCustomer(username);
	}
	@PostMapping("/addCustomer")
	@PreAuthorize("hasAuthority('ADMIN')")
	public Customer add(@RequestBody Customer customer) {
		return service.addCustomer(customer);
	}
}

