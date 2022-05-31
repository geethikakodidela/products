package com.ecommerce.project.Service;

import java.util.List;

import com.ecommerce.project.model.CategoryModel;

public interface CategoryService {
	public void createcategory(CategoryModel categorymodel);

	public List<CategoryModel> getallcategories();

	public void EditCategory(String categoryId, CategoryModel newcategorymodel);

	public void deleteCategoryData(String categoryId);
}
