package com.ecommerce.project.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Order {
	@Id
	private String orderId;
	private Products productDetails;
	private String userId;
	private String email;
	private String name;
	private String address;
	private String city;
	private long phone;

	public Order(String orderId, Products productDetails, String userId, String email, String name, String address,
			String city, long phone) {
		super();
		this.orderId = orderId;
		this.productDetails = productDetails;
		this.userId = userId;
		this.email = email;
		this.name = name;
		this.address = address;
		this.city = city;
		this.phone = phone;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Products getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(Products productDetails) {
		this.productDetails = productDetails;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

}