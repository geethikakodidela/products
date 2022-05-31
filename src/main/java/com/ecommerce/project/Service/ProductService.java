package com.ecommerce.project.Service;

import java.util.List;

import com.ecommerce.project.model.Products;

public interface ProductService {
	public Products createcategory(Products products);

	public List<Products> getallcategories();

	public Products EditProductId(String id, Products newproduct);

	public void deleteProductData(String id);
	public List<Products> getProductsbyCategoryId(String categoryId);
	public Products getProductsbyproductId(String id);
    public boolean readproduct(String id); 
}
