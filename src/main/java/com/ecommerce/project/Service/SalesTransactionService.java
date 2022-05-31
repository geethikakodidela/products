package com.ecommerce.project.Service;

import java.util.List;

import com.ecommerce.project.model.SalesTransactionModel;

public interface SalesTransactionService {
	public void createSaleTrans(SalesTransactionModel salestransactionmodel);

	public List<SalesTransactionModel> getallsalestransaction();

	public void EditSaleTrans(int userId, SalesTransactionModel salestransactionmodel);

	public void deleteuserData(int userId);
}
