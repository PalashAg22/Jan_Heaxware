package com.hexaware.springrestjpa.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrestjpa.dto.LoansDTO;
import com.hexaware.springrestjpa.dto.UsersDTO;
import com.hexaware.springrestjpa.entities.Users;
import com.hexaware.springrestjpa.service.IUsersService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	IUsersService service;
	
	@PostMapping("/add")
	public Users addUsers(@RequestBody @Valid UsersDTO userdto) {
		
		return service.registerUser(userdto);
		
	}
	@PostMapping("/applyloan")
	public Users applyLoan(@RequestBody LoansDTO loandto, @PathVariable int uid) {
		return service.userApplyLoan(loandto, uid);
	}
	
}
