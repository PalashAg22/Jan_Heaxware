package com.hexaware.springrestjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.springrestjpa.entities.Loans;

public interface LoanRepository extends JpaRepository<Loans, Integer> {

}
