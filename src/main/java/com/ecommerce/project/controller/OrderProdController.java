package com.ecommerce.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.project.Service.OrderProdService;
import com.ecommerce.project.model.OrderproductModel;

@RestController
public class OrderProdController {
	@Autowired
	OrderProdService orderprodService;

	@PostMapping("/orderproddata")
	public ResponseEntity<OrderproductModel> CreateOrderData(@RequestBody OrderproductModel orderproductmodel) {
		orderprodService.CreateOrderProdData(orderproductmodel);
		return new ResponseEntity<>(orderproductmodel, HttpStatus.CREATED);
	}

	@GetMapping("/orderproddata")
	public List<OrderproductModel> getAllOrderProdData() {
		return orderprodService.getAllOrderData();
	}
	
}
