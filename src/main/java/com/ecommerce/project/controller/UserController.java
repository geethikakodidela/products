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

import com.ecommerce.project.Service.UserService;
import com.ecommerce.project.model.User;

@RestController
public class UserController {
	@Autowired
	private UserService userservice;

	@PostMapping("/users")
	public ResponseEntity<User> create(@RequestBody User user) {
		userservice.createUser(user);
		return new ResponseEntity<>(user, HttpStatus.CREATED);
	}

	@GetMapping("/users")
	public List<User> getallUserDetails() {
		return userservice.getallUserDetails();
	}

	@PutMapping("/edituser/{userId}")
	public ResponseEntity<User> Edit(@PathVariable("userId") int userId, @RequestBody User user) {
		userservice.EditUserDetails(userId, user);
		return new ResponseEntity<>(user, HttpStatus.CREATED);
	}

	@DeleteMapping("/delete/{userId}")
	public void deleteUserData(@PathVariable int userId) {
		userservice.deleteUserDetails(userId);
	}
}
