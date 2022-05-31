package com.ecommerce.project.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.project.model.CategoryModel;

@Repository
public interface CategoryRepository extends MongoRepository<CategoryModel, String> {

}
