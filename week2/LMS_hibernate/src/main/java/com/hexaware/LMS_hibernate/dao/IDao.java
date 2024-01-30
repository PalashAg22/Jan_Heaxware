package com.hexaware.LMS_hibernate.dao;

import java.util.List;

import com.hexaware.LMS_hibernate.entity.Loans;
import com.hexaware.LMS_hibernate.entity.Users;

public interface IDao {

	//void login();
	//void register();
	void adminAddLoan();
	void addUser();
	void userApplyLoan();
	void userUpdateLoan();
	void userCancelLoan();
	List<Loans> viewAppliedLoans();
	List<Users> adminViewUser();
	List<Loans> adminViewLoans();
	List<Loans> adminSearchLoanByName();
	List<Users> adminSearchUsersNyName();
	Users adminSearchUserByUname();
	void adminApproveLoan(Loans loans);
	void adminRejectLoan(Loans loans);
	List<Loans> pendingLoansForAdmin();
	
	
}
