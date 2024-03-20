package com.example.RetailsInventoryPrediction.repository;

import com.example.RetailsInventoryPrediction.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Long> {
}
