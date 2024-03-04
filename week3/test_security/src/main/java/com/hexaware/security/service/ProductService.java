package com.hexaware.security.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hexaware.security.entities.Product;

@Service
public class ProductService {

	List<Product> list = new ArrayList<>();
	
	public ProductService() {
		this.list.add(new Product("laptop",55000));
		this.list.add(new Product("Mouse",2500));
	}
	
	public List<Product> getAll(){
		return this.list;
	}
	
	public Product getByName(String pname) {
		return this.list.stream().filter(Product -> Product.getPname().equals(pname)).findAny().orElse(null);
	}
}
