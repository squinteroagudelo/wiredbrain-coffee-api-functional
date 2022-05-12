package com.wiredbraincoffee.apifunctional.repository;

import com.wiredbraincoffee.apifunctional.model.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository
        extends ReactiveMongoRepository<Product, String> {
}
