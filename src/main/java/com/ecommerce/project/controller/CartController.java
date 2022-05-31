
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

import com.ecommerce.project.Service.CartService;
import com.ecommerce.project.model.Cart;

@RestController
public class CartController {
	@Autowired
	CartService cartservice;

	@PostMapping("/cart")
	public ResponseEntity<Cart> create(@RequestBody Cart cart) {
		cartservice.createcart(cart);
		return new ResponseEntity<>(cart, HttpStatus.CREATED);
	}

	@GetMapping("/cart")
	public List<Cart> getallcartData() {
		return cartservice.getallcartData();
	}

	@PutMapping("/updatecart/{userId}")
	public ResponseEntity<Cart> Edit(@PathVariable("userId") Integer userId, @RequestBody Cart cart) {
		cartservice.EditCart(userId, cart);
		return new ResponseEntity<>(cart, HttpStatus.CREATED);
	}

	@DeleteMapping("/deletecartdata/{userId}")
	public void deleteCartData(@PathVariable int userId) {
		cartservice.deleteCartData(userId);
	}
}
