package com.mcom.domain;

import java.util.Date;

public class Purchase {
	private int id;
	private Date purchaseDate;
	private String product;
	private String customerName;
	
	public Purchase () {}

	public Purchase(int id, String customerName, Date purchaseDate, String product) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.purchaseDate = purchaseDate;
		this.product = product;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}

	
	
}
