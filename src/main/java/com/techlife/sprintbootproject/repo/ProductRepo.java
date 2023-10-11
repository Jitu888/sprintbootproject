package com.techlife.sprintbootproject.repo;

import com.techlife.sprintbootproject.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductRepo extends MongoRepository<Product,Integer> {
}
