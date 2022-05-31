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

import com.ecommerce.project.Service.OrderService;

import com.ecommerce.project.model.Order;

@RestController
public class OrderController {
	@Autowired
	OrderService orderservice;

	@PostMapping("/orderdata")
	public ResponseEntity<Order> Create(@RequestBody Order order) {
		orderservice.CreateOrderData(order);
		return new ResponseEntity<>(order, HttpStatus.CREATED);
	}

	@GetMapping("/orderdata")
	public List<Order> getAllOrderData() {
		return orderservice.getAllOrderData();
	}

	@PutMapping("/updateOrders/{orderId}")
	public ResponseEntity<Order> Edit(@PathVariable("orderId") String orderId, @RequestBody Order order) throws Exception {
		orderservice.EditOrderData(orderId, order);
		return new ResponseEntity<>(order, HttpStatus.CREATED);
	}

	@DeleteMapping("/del/{orderId}")
	public void deleteOrderData(@PathVariable String orderId) {
		orderservice.deleteOrderData(orderId);
	}
}
