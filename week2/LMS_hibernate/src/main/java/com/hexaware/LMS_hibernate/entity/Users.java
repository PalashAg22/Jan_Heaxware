package com.hexaware.LMS_hibernate.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user_table")
public class Users {

	@Id
	private int uid;
	private String name;
	private String uname;
	private String password;
	private String email;
	private String address;
	private String city;
	private String state;
	private LocalDate dob;
	private String role;
	private int creditScore;
	
	@OneToMany(mappedBy="users",cascade=CascadeType.ALL)
	private List<Loans> loansList = new ArrayList<Loans>();
	

	public Users() {
		super();
	}

	public Users(int uid, String name, String uname, String password, String email, String address, String city,
			String state, LocalDate dob, String role, int creditScore, List<Loans> loansList) {
		super();
		this.uid = uid;
		this.name = name;
		this.uname = uname;
		this.password = password;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.dob = dob;
		this.role = role;
		this.creditScore = creditScore;
		this.loansList = loansList;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}

	public List<Loans> getLoansList() {
		return loansList;
	}

	public void setLoansList(List<Loans> loansList) {
		this.loansList = loansList;
	}
	
	public void addLoans(Loans loans) {
		List<Loans> list = getLoansList();
		list.add(loans);
	}

	@Override
	public String toString() {
		return "Users [uid=" + uid + ", name=" + name + ", uname=" + uname + ", password=" + password + ", email="
				+ email + ", address=" + address + ", city=" + city + ", state=" + state + ", dob=" + dob + ", role="
				+ role + ", creditScore=" + creditScore + ", loansList=" + loansList + "]";
	}
	
}
