package com.ecommerce.project.controller;

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
import com.ecommerce.project.Service.ProductService;
import com.ecommerce.project.model.Products;

@RestController
public class ProductController {
	@Autowired
	ProductService productservice;

	@PostMapping("/products")
	public ResponseEntity<Object> create(@RequestBody Products productmodel) {
		try {
			return new ResponseEntity<Object>(productservice.createcategory(productmodel), HttpStatus.CREATED);

		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.NOT_FOUND);

		}
	}

	@GetMapping("/products")
	public ResponseEntity<Object> getallcategories() {
		try {
			return new ResponseEntity<Object>(productservice.getallcategories(), HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.NOT_FOUND);

		}
	}

	@PutMapping("/products/{productId}")

	public ResponseEntity<Object> Edit(@PathVariable("productId") String productId,
			@RequestBody Products productmodel) {
		try {
			if (!productservice.readproduct(productId)) {
				throw new IllegalArgumentException("product not found");
			}
			return new ResponseEntity<Object>(productservice.EditProductId(productId, productmodel),
					HttpStatus.CREATED);

		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.NOT_FOUND);

		}
	}

	@DeleteMapping("/products/{productId}")
	public ResponseEntity<Object> create(@PathVariable("productId") String productId) {
		try {
			if (!productservice.readproduct(productId)) {
				throw new IllegalArgumentException("product not found");
			}

			productservice.deleteProductData(productId);
			return new ResponseEntity<Object>("product is deleted", HttpStatus.OK);
		}

		catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.NOT_FOUND);

		}

	}

	@GetMapping("/product/{categoryId}")
	public ResponseEntity<Object> getBycategoryId(@PathVariable("categoryId") String categoryId) {
		try {
			if (productservice.getProductsbyCategoryId(categoryId).isEmpty()) {
				throw new IllegalArgumentException("category not found");
			}

			return new ResponseEntity<Object>(productservice.getProductsbyCategoryId(categoryId), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.NOT_FOUND);

		}
	}

	@GetMapping("/products/{productId}")
	public ResponseEntity<Object> getByproductId(@PathVariable("productId") String productId) {
		try {
			if (!productservice.readproduct(productId)) {
				throw new IllegalArgumentException("product not found");
			}

			return new ResponseEntity<Object>(productservice.getProductsbyproductId(productId), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.NOT_FOUND);

		}

	}
}
