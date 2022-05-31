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

import com.ecommerce.project.Service.CategoryService;
import com.ecommerce.project.model.CategoryModel;

@RestController
public class CategoryController {
	@Autowired
	CategoryService categoryservice;

	@PostMapping("/category")
	public ResponseEntity<CategoryModel> create(@RequestBody CategoryModel categorymodel) {
		categoryservice.createcategory(categorymodel);
		return new ResponseEntity<>(categorymodel, HttpStatus.CREATED);
	}

	@GetMapping("/categories")
	public List<CategoryModel> getallcategories() {
		return categoryservice.getallcategories();
	}

	@PutMapping("/Update/{categoryId}")
	public ResponseEntity<CategoryModel> Edit(@PathVariable("categoryId") String categoryId,
			@RequestBody CategoryModel categorymodel) {
		categoryservice.EditCategory(categoryId, categorymodel);
		return new ResponseEntity<>(categorymodel, HttpStatus.CREATED);
	}

	@DeleteMapping("/deletecategorydata/{categoryId}")
	public void deleteCategoryData(@PathVariable String categoryId) {
		categoryservice.deleteCategoryData(categoryId);
	}
}