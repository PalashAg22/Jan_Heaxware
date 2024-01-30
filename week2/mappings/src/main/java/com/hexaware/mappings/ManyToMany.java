package com.hexaware.mappings;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hexaware.mappings.entity.Order;
import com.hexaware.mappings.entity.Product;

public class ManyToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();
		Product p1 = new Product();
		p1.setProductId(51);
		p1.setProductName("Toys");

		Product p2 = new Product();
		p2.setProductId(52);
		p2.setProductName("Books");

		Product p3 = new Product();
		p3.setProductId(53);
		p3.setProductName("Clothes");

		Order order1 = new Order();
		order1.setOerderId(400);
		order1.setPurchasedDate(LocalDate.now());
		
			order1.addProduct(p1);  order1.addProduct(p3);
		
		
		
		Order order2 = new Order();
		order2.setOerderId(500);
		order2.setPurchasedDate(LocalDate.now());

		order2.addProduct(p1); order2.addProduct(p2);  order2.addProduct(p3);
		
		//Transaction txn =		session.beginTransaction();

//		session.persist(order1);
//		session.persist(order2);
		
		Order o1 = session.get(Order.class, 400);
		System.out.println(o1);
		//txn.commit();
	}

}
