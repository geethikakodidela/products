package com.ecommerce.project.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "SalesTransaction")
public class SalesTransactionModel {
	@Id
	private int transId;
	private int userId;
	private Date transactionDate = new Date();
	private long amount;
	private String ccType;
	private long ccNumber;

	public int getTransId() {
		return transId;
	}

	public void setTransId(int transId) {
		this.transId = transId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getCcType() {
		return ccType;
	}

	public void setCcType(String ccType) {
		this.ccType = ccType;
	}

	public long getCcNumber() {
		return ccNumber;
	}

	public void setCcNumber(long ccNumber) {
		this.ccNumber = ccNumber;
	}

}
