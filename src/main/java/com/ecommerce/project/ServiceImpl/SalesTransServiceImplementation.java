package com.ecommerce.project.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.project.Repository.SalesTransactionRepository;
import com.ecommerce.project.Service.SalesTransactionService;
import com.ecommerce.project.model.SalesTransactionModel;

@Service
public class SalesTransServiceImplementation implements SalesTransactionService {
	@Autowired
	SalesTransactionRepository salestransactionrepository;

	public void createSaleTrans(SalesTransactionModel salestransactionmodel) {
		salestransactionrepository.save(salestransactionmodel);
	}

	public List<SalesTransactionModel> getallsalestransaction() {
		return salestransactionrepository.findAll();
	}

	public void EditSaleTrans(int userId, SalesTransactionModel newsalestransactionmodel) {
		Optional<SalesTransactionModel> data = salestransactionrepository.findById(userId);
		SalesTransactionModel salestransactionmodel = data.get();
		salestransactionmodel.setUserId(newsalestransactionmodel.getUserId());
		salestransactionmodel.setTransId(newsalestransactionmodel.getTransId());
		salestransactionmodel.setTransactionDate(newsalestransactionmodel.getTransactionDate());
		salestransactionmodel.setAmount(newsalestransactionmodel.getAmount());
		salestransactionmodel.setCcType(newsalestransactionmodel.getCcType());
		salestransactionmodel.setCcNumber(newsalestransactionmodel.getCcNumber());

		salestransactionrepository.save(salestransactionmodel);
	}

	public void deleteuserData(int userId) {
		salestransactionrepository.deleteById(userId);

	}
}
