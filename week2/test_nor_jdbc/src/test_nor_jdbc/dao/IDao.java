package test_nor_jdbc.dao;

import java.util.List;

import test_nor_jdbc.entity.Company;
import test_nor_jdbc.entity.product;

public interface IDao {

	void addCompany(Company company);
	void addProduct(product product);
	List<Company> getAllCompany();
	List<product> getAllProduct();
	product getProductById(Company company);
	
}
