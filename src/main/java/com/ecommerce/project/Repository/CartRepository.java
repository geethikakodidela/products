
package com.ecommerce.project.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.project.model.Cart;

@Repository
public interface CartRepository extends MongoRepository<Cart, Integer> {

}
