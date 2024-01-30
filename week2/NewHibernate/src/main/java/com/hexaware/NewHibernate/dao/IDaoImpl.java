package com.hexaware.NewHibernate.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hexaware.NewHibernate.entity.User;

public class IDaoImpl implements IDao {

	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	Session session = sessionFactory.openSession();
	
	@Override
	public void createUser(User user) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		User user1 = new User(user.getUid(),user.getName(),user.getUsername(),user.getPassword());
		Serializable ser = session.save(user1);
		System.out.println(ser.toString()+" added");
		tx.commit();
		
	}

	@Override
	public void updateUserPassword(User user, String newPassword) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		User user2 = session.get(User.class, user.getUid());
		user2.setPassword(newPassword);
		session.saveOrUpdate(user2);
		System.out.println(user.getUid()+"''s password updated");
		tx.commit();
		
	}

	@Override
	public void deleteUserByUserID(int userID) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		User toDelete = session.get(User.class, userID);
		session.delete(toDelete);
		System.out.println("user with "+userID+" is deleted");
		tx.commit();
	}

	@Override
	public User getUserByUserID(int userID) {
		// TODO Auto-generated method stub
		Query query = session.createNamedQuery("getUserByUserID");
		query.setParameter("userID", userID);
		User user = (User) query.getSingleResult();
		return user;
	}

	@Override
	public List<User> getUserByName(String name) {
		// TODO Auto-generated method stub
		Query query = session.createNamedQuery("getUserByName");
		query.setParameter("name", name);
		List<User> list = query.getResultList();
		return list;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		Query query = session.createNamedQuery("getAllUser");
		List<User> list = query.getResultList();
		return list;
	}

}
