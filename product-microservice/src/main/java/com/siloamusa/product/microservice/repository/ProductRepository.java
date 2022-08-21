package com.siloamusa.product.microservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.siloamusa.product.microservice.entity.ProductEntity;

public interface ProductRepository extends MongoRepository <ProductEntity,String>{
    
}
