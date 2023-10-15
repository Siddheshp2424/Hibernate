package com.tnsif.manytomany;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
public class OrderMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	private Date purchaseDate;

	@ManyToMany
	@JoinTable(name = "mythird",joinColumns = {@JoinColumn(name="pid")},inverseJoinColumns = {@JoinColumn(name="oid")})
	
	 
	private Set<ProductMaster> products;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Set<ProductMaster> getProducts() {
		return products;
	}

	public void setProducts(Set<ProductMaster> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "OrderMaster [orderId=" + orderId + ", purchaseDate=" + purchaseDate + ", products=" + products + "]";
	}
	
	
	
}
