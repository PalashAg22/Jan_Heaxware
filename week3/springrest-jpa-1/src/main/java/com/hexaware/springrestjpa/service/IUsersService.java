package com.hexaware.springrestjpa.service;

import java.util.List;

import com.hexaware.springrestjpa.dto.LoansDTO;
import com.hexaware.springrestjpa.dto.UsersDTO;
import com.hexaware.springrestjpa.entities.Loans;
import com.hexaware.springrestjpa.entities.Users;

public interface IUsersService {

	Users registerUser(UsersDTO userdto);
	Users loginUser(UsersDTO userdto);
	Users userApplyLoan(LoansDTO loandto, int uid);
	Users userUpdateLoan(LoansDTO loandto, int uid);
	Users userCancelLoan(LoansDTO loandto, int uid);
	List<Loans> viewAppliedLoans(int uid);
	
	
}
