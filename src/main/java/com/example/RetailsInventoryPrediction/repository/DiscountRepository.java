package com.example.RetailsInventoryPrediction.repository;

import com.example.RetailsInventoryPrediction.model.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountRepository extends JpaRepository<Discount,String> {
}
