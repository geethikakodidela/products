package com.ecommerce.project.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.project.Repository.CategoryRepository;
import com.ecommerce.project.Service.CategoryService;
import com.ecommerce.project.model.CategoryModel;

@Service
public class CategoryServiceImplementation implements CategoryService {
	@Autowired
	CategoryRepository categoryrepository;

	public void createcategory(CategoryModel categorymodel) {
		categoryrepository.save(categorymodel);
	}

	public List<CategoryModel> getallcategories() {
		return categoryrepository.findAll();
	}

	public void EditCategory(String categoryId, CategoryModel newcategorymodel) {
		Optional<CategoryModel> data = categoryrepository.findById(categoryId);
		CategoryModel categorymodel = data.get();
		categorymodel.setCategoryName(newcategorymodel.getCategoryName());

		categoryrepository.save(categorymodel);
	}

	public void deleteCategoryData(String categoryId) {
		categoryrepository.deleteById(categoryId);
	}
}
