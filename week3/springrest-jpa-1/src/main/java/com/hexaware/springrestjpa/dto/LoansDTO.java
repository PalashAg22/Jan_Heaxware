package com.hexaware.springrestjpa.dto;

import java.time.LocalDate;

public class LoansDTO {

	private int lid;
	private double amount;
	private String type;
	private int duration;
	private String status;
	private double intrest;
	private LocalDate loanDate;
	public LoansDTO() {
		super();
	}
	public LoansDTO(int lid, double amount, String type, int duration, String status, double intrest,
			LocalDate loanDate) {
		super();
		this.lid = lid;
		this.amount = amount;
		this.type = type;
		this.duration = duration;
		this.status = status;
		this.intrest = intrest;
		this.loanDate = loanDate;
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
	
	
}
