package com.example.RetailsInventoryPrediction.repository;

import com.example.RetailsInventoryPrediction.model.Prediction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PredictionRepository extends JpaRepository<Prediction,Long> {
}
