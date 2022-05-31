package com.ecommerce.project.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.project.model.SalesTransactionModel;

@Repository
public interface SalesTransactionRepository extends MongoRepository<SalesTransactionModel, Integer> {

}
