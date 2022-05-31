package com.ecommerce.project.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.project.model.OrderproductModel;
@Repository
public interface OrderProdRepository extends MongoRepository<OrderproductModel, Integer> {

}
