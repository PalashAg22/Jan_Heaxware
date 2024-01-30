package com.hexaware.LMS_hibernate.dao;

import java.util.List;

import com.hexaware.LMS_hibernate.entity.Loans;
import com.hexaware.LMS_hibernate.entity.Users;

public class IDaoImpl implements IDao {

	@Override
	public void adminAddLoan() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addUser() {
		// TODO Auto-generated method stub

	}

	@Override
	public void userApplyLoan() {
		// TODO Auto-generated method stub

	}

	@Override
	public void userUpdateLoan() {
		// TODO Auto-generated method stub

	}

	@Override
	public void userCancelLoan() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Loans> viewAppliedLoans() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Users> adminViewUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Loans> adminViewLoans() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Loans> adminSearchLoanByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Users> adminSearchUsersNyName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users adminSearchUserByUname() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adminApproveLoan(Loans loans) {
		// TODO Auto-generated method stub

	}

	@Override
	public void adminRejectLoan(Loans loans) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Loans> pendingLoansForAdmin() {
		// TODO Auto-generated method stub
		return null;
	}

}
