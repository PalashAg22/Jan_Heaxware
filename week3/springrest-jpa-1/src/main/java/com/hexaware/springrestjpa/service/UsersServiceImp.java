package com.hexaware.springrestjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springrestjpa.dto.LoansDTO;
import com.hexaware.springrestjpa.dto.UsersDTO;
import com.hexaware.springrestjpa.entities.Loans;
import com.hexaware.springrestjpa.entities.Users;
import com.hexaware.springrestjpa.repository.LoanRepository;
import com.hexaware.springrestjpa.repository.UserRepoistory;

@Service
public class UsersServiceImp implements IUsersService {

	@Autowired
	UserRepoistory repo;

	@Autowired
	LoanRepository repo2;

	@Override
	public Users registerUser(UsersDTO userdto) {
		// TODO Auto-generated method stub
		Users u1 = new Users();
		u1.setUid(userdto.getUid()); u1.setUname(userdto.getUname()); u1.setName(userdto.getName());
		u1.setPassword(userdto.getPassword()); u1.setAddress(userdto.getAddress()); u1.setCity(userdto.getCity());
		u1.setCreditScore(userdto.getCreditScore());u1.setDob(userdto.getDob());u1.setEmail(userdto.getEmail());
		u1.setState(userdto.getState());u1.setRole(userdto.getRole());
		return repo.save(u1);
	}

	@Override
	public Users loginUser(UsersDTO userdto) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Users userApplyLoan(LoansDTO loandto, int uid) {
		// TODO Auto-generated method stub
		Users u1 = repo.findById(uid).orElse(null);
		Loans loans = new Loans();
		loans.setAmount(loandto.getAmount());loans.setDuration(loandto.getDuration());loans.setIntrest(loandto.getIntrest());
		loans.setLid(loandto.getLid()); loans.setLoanDate(loandto.getLoanDate());loans.setStatus(loandto.getStatus());
		loans.setType(loandto.getType());
		loans.setUsers(u1);
		u1.addLoans(loans);
		repo.save(u1);
		repo2.save(loans);
		return u1;
	}

	@Override
	public Users userUpdateLoan(LoansDTO loandto, int uid) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Users userCancelLoan(LoansDTO loandto, int uid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Loans> viewAppliedLoans(int uid) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
