package com.ecommerce.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.project.Service.SalesTransactionService;
import com.ecommerce.project.model.SalesTransactionModel;

@RestController
public class SalesTransController {
	@Autowired
	SalesTransactionService salestransactionservice;

	@PostMapping("/salestrans")
	public ResponseEntity<SalesTransactionModel> create(@RequestBody SalesTransactionModel salestransactionmodel) {
		salestransactionservice.createSaleTrans(salestransactionmodel);
		return new ResponseEntity<>(salestransactionmodel, HttpStatus.CREATED);
	}

	@GetMapping("/salestrans")
	public List<SalesTransactionModel> getallsalestransaction() {
		return salestransactionservice.getallsalestransaction();
	}

	@PutMapping("/updatesalestrans/{userId}")
	public ResponseEntity<SalesTransactionModel> Edit(@PathVariable("userId") int userId,
			@RequestBody SalesTransactionModel salestransactionmodel) {
		salestransactionservice.EditSaleTrans(userId, salestransactionmodel);
		return new ResponseEntity<>(salestransactionmodel, HttpStatus.CREATED);
	}

	@DeleteMapping("/deldata/{userId}")
	public void deleteuserData(@PathVariable int userId) {
		salestransactionservice.deleteuserData(userId);
	}
}
