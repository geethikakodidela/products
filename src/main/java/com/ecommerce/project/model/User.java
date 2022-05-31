package com.ecommerce.project.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "USERS")
public class User {
	@Id
	private int userId;
	private String email;
	private String fname;
	private String lname;
	private String password;
	private Date createdOn = new Date();
	private String address;
	private String city;
	private String state;
	private int zipcode;
	private String country;
	private long phone;

	public User(int userId, String email, String fname, String lname, String password, Date createdOn, String address,
			String city, String state, int zipcode, String country, long phone) {
		super();
		this.userId = userId;
		this.email = email;
		this.fname = fname;
		this.lname = lname;
		this.password = password;
		this.createdOn = createdOn;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
		this.phone = phone;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

}