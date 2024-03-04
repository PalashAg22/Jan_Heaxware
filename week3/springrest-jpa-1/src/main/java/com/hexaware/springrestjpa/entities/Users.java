package com.hexaware.springrestjpa.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name="user_table")
public class Users {

	@Id
	//@Max(300)
	private int uid;
	//@NotBlank
	private String name;
	//@Pattern(regexp="[A-Z][a-z][0-9]{3,10}")
	//@NotBlank
	private String uname;
	//@Pattern(regexp="[A-Z][a-z][0-9][@#%]{8,15}")
	//@NotBlank
	private String password;
	//@Email
	private String email;
	//@NotBlank
	private String address;
	//@NotBlank
	private String city;
	//@NotBlank
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
			String state, LocalDate dob, String role, int creditScore) {
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
		//this.loansList = loansList;
	}
	
	public void addLoansList(Loans loan) {
		List<Loans> list = getLoansList();
		list.add(loan);
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
