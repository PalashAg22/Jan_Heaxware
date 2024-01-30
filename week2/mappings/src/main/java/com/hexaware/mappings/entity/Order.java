package com.hexaware.mappings.entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="order_table")
public class Order {

	@Id
	private int oerderId;
	private LocalDate purchasedDate;
	
	 @ManyToMany(cascade = CascadeType.ALL)
	    
	    @JoinTable(name="products_orders_table" , joinColumns = {@JoinColumn(name="order_id")} ,
	       inverseJoinColumns = {@JoinColumn(name="product_id")} )
	 	private Set<Product> products = new HashSet<Product>();

	
	public Order(int oerderId, LocalDate purchasedDate, Set<Product> products) {
		super();
		this.oerderId = oerderId;
		this.purchasedDate = purchasedDate;
		this.products = products;
	}


	public Order() {
		super();
	}


	public int getOerderId() {
		return oerderId;
	}


	public void setOerderId(int oerderId) {
		this.oerderId = oerderId;
	}


	public LocalDate getPurchasedDate() {
		return purchasedDate;
	}


	public void setPurchasedDate(LocalDate purchasedDate) {
		this.purchasedDate = purchasedDate;
	}


	public Set<Product> getProducts() {
		return products;
	}


	public void setProducts(Set<Product> products) {
		this.products = products;
	}


	public void addProduct(Product p) {
		this.getProducts().add(p);
	}


	@Override
	public String toString() {
		return "Order [oerderId=" + oerderId + ", purchasedDate=" + purchasedDate + ", products=" + products + "]";
	}
	
}
