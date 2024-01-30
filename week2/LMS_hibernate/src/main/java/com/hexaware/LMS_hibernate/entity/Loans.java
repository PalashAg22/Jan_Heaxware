package com.hexaware.LMS_hibernate.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="loan_table")
public class Loans {

	@Id
	private int lid;
	private double amount;
	private String type;
	private int duration;
	private String status;
	private double intrest;
	private LocalDate loanDate;
	
	@ManyToOne
	@JoinColumn(name="uid")
	private Users users;

	public Loans() {
		super();
	}

	public Loans(int lid, double amount, String type, int duration, String status, double intrest, LocalDate loanDate,
			Users users) {
		super();
		this.lid = lid;
		this.amount = amount;
		this.type = type;
		this.duration = duration;
		this.status = status;
		this.intrest = intrest;
		this.loanDate = loanDate;
		this.users = users;
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getIntrest() {
		return intrest;
	}

	public void setIntrest(double intrest) {
		this.intrest = intrest;
	}

	public LocalDate getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(LocalDate loanDate) {
		this.loanDate = loanDate;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Loans [lid=" + lid + ", amount=" + amount + ", type=" + type + ", duration=" + duration + ", status="
				+ status + ", intrest=" + intrest + ", loanDate=" + loanDate + "]";
	}
	
	
}
