package com.ecommerce.project.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.project.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, Integer> {

}
