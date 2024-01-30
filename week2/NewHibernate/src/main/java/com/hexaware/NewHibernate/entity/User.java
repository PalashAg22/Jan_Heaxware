package com.hexaware.NewHibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
@Entity
@NamedQueries
(
		{
			@NamedQuery(name="getUserByUserID",query="select u from User u where u.uid=:userID"),
			@NamedQuery(name="getUserByName",query="Select u from User u where u.name= :name"),
			@NamedQuery(name="getAllUser",query="Select u from User u"),
			@NamedQuery(name="deleteUserById", query = "delete from User u where u.uid=?1")
		}
		
)
public class User {

	@Id
	private int uid;
	private String name;
	private String username;
	private String password;
	public User() {
		super();
	}
	public User(int uid, String name, String username, String password) {
		
		this.uid = uid;
		this.name = name;
		this.username = username;
		this.password = password;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", username=" + username + ", password=" + password + "]\n";
	}
	
	
	
}
