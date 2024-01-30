package test_nor_jdbc.client;

import test_nor_jdbc.dao.IDao;
import test_nor_jdbc.dao.IDaoImpl;
import test_nor_jdbc.entity.Company;
import test_nor_jdbc.entity.product;

public class Client {

	static IDao dao = new IDaoImpl();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Company c1 = new Company("Samsung","TV",101);
//		Company c2 = new Company("Sony","Mobile",102);
//		Company c3 = new Company("Apple","TV",103);
//		Company c4 = new Company("Samsung","Mobile",104);
//		//dao.addCompany(c1);
//		dao.addCompany(c2);
//		dao.addCompany(c3);
//		dao.addCompany(c4);
//		product p1 = new product("OLED_TV",55000,101);
//		product p2 = new product("eXperia",40000,102);
//		product p3 = new product("LED_TV",55500,103);
//		product p4 = new product("S23 ULTRA",55300,104);
//		dao.addProduct(p1);
//		dao.addProduct(p2);
//		dao.addProduct(p3);
//		dao.addProduct(p4);
		System.out.println(dao.getAllCompany());
		System.out.println(dao.getAllProduct());
	}

}
