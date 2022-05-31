package com.ecommerce.project.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.ecommerce.project.model.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {

}
