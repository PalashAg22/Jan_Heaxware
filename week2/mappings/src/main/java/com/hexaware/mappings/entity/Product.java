package com.hexaware.mappings.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="product_table")
public class Product {

	@Id
	private int productId;
	private String productName;
	
	@ManyToMany(mappedBy="products",fetch=FetchType.LAZY)
	private Set<Order> orders = new HashSet<Order>();

	public Product() {
		super();
	}

	public Product(int productId, String productName, Set<Order> orders) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.orders = orders;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Set<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", orders=" + orders + "]";
	}

	
	
	
}
