package com.hexaware.LMS_hibernate.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admin_table")
public class Admin {

	@Id
	private int aid;
	private String name;
	private String uname;
	private String password;
	private String role;
	
	
}
