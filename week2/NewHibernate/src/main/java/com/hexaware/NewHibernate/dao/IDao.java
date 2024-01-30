package com.hexaware.NewHibernate.dao;

import java.util.List;

import com.hexaware.NewHibernate.entity.User;

public interface IDao {

	void createUser(User user);
	
	void updateUserPassword(User user, String newPassword);
	
	void deleteUserByUserID(int userID);
	
	User getUserByUserID(int userID);
	
	List<User> getUserByName(String name);
	
	List<User> getAllUser();
	
}
