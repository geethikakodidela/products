package com.ecommerce.project.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.ecommerce.project.model.Products;

@Repository
public interface ProductRepository extends MongoRepository<Products, String> {
@Query("{categoryId:?0}")
public List<Products> findBycategoryId(String categoryId);

}
