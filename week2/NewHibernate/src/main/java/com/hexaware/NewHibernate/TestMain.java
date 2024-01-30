package com.hexaware.NewHibernate;





import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.hexaware.NewHibernate.dao.HibernateUtil;
import com.hexaware.NewHibernate.entity.User;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		
		//Transaction tx = session.beginTransaction();
		
		String q1 = "select u from User u";
		
		Query<User> query = session.createQuery(q1,User.class);
		List<User>list = query.getResultList();
		System.out.println(list);
		
		String q2 = "select u from User u where u.uid=?1";
		Query<User>query2 = session.createQuery(q2);
		query2.setParameter(1, 102);
		
		User user2 = query2.getSingleResult();
		System.out.println(user2);
		
		String q3 = "select u from User u where name= :name";
		Query<User> query3 = session.createQuery(q3);
		query3.setParameter("name", "user2");
		
		List<User> list2 = query3.getResultList();
		System.out.println(list2);
		
		
		// native query same as sql query
		
		String nativequery = "select * from User";
		
		NativeQuery<User> nq = session.createNativeQuery(nativequery,User.class);
		List<User> list3 = nq.getResultList();
		System.out.println(list3);
		
//		String nQuery = "delete from User u where u.uid= ?1";
//		NativeQuery<User> nq2 = session.createNativeQuery(nQuery);
//		nq2.setParameter(1, 102);
//		int count3 = nq2.executeUpdate();
//		System.out.println(count3+" records deleted");
		
		//String query5 = "detele from User u where u.uid=?";
		Query q5 = session.createNamedQuery("deleteUserById");
		q5.setParameter(1, 102);
		Transaction tx = session.beginTransaction();
		int count5 = q5.executeUpdate();
		System.out.println(count5+" rows deleteed");
		tx.commit();
	}

}
