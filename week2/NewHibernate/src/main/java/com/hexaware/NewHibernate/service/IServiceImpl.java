package com.hexaware.NewHibernate.service;

import java.util.List;

import com.hexaware.NewHibernate.dao.IDao;
import com.hexaware.NewHibernate.dao.IDaoImpl;
//import com.hexaware.NewHibernate.entity.User;
import com.hexaware.NewHibernate.entity.User;

public class IServiceImpl implements IService {

	static IDao dao = new IDaoImpl();
	
	@Override
	public void createUser(User user) {
		// TODO Auto-generated method stub
		dao.createUser(user);
	}

	@Override
	public void updateUserPassword(User user, String newPassword) {
		// TODO Auto-generated method stub

		dao.updateUserPassword(user, newPassword);
	}

	@Override
	public void deleteUserByUserID(int userID) {
		// TODO Auto-generated method stub

		dao.deleteUserByUserID(userID);
	}

	@Override
	public User getUserByUserID(int userID) {
		// TODO Auto-generated method stub
		return dao.getUserByUserID(userID);
	}

	@Override
	public List<User> getUserByName(String name) {
		// TODO Auto-generated method stub
		return dao.getUserByName(name);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return dao.getAllUser();
	}

}
