package com.hexaware.LMS_hibernate;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hexaware.LMS_hibernate.dao.HibernateUtil;
import com.hexaware.LMS_hibernate.entity.Loans;
import com.hexaware.LMS_hibernate.entity.Users;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
       Session session = sessionFactory.openSession();
       System.out.println(session);
       Users u1  = new Users();
       u1.setUid(101);
       u1.setUname("user1");u1.setAddress("user1");u1.setCity("user1");u1.setCreditScore(1);u1.setDob(LocalDate.now());
       u1.setEmail("user1");u1.setName("user1");u1.setPassword("user1");
       
       Loans l1 = new Loans();
       l1.setLid(201);
       l1.setUsers(u1);
       Loans l2 = new Loans();
       l2.setLid(202);
       l2.setUsers(u1);
       Loans l3 = new Loans();
       l3.setLid(203);
       l3.setUsers(u1);
       
       Users u2 = new Users();
       u2.setUid(102);
       u2.setUname("user2");
       
       u2.addLoans(l2);
       u2.addLoans(l1);
       
       u1.addLoans(l1);
       u1.addLoans(l3);
       u1.addLoans(l2);
       
       Transaction tx = session.beginTransaction();
       session.persist(u1);
       session.persist(u2);
       
       String query = "select u from Users u";
       Query<Users> q =   session.createQuery(query, Users.class);
       List<Users>list = q.getResultList();
       System.out.println(list);
       tx.commit();
       session.close();
    }
}
