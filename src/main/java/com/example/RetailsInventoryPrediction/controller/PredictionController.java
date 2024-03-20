package com.example.RetailsInventoryPrediction.controller;

import com.example.RetailsInventoryPrediction.model.Prediction;
import com.example.RetailsInventoryPrediction.repository.PredictionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/backend")
public class PredictionController {

    @Autowired
    PredictionRepository predictionRepository;

    @GetMapping("/prediction")
    public List<Prediction> getAllPredicted(){
        return predictionRepository.findAll();
    }

    @GetMapping("/prediction/{id}")
    public List<Prediction> getPredictedById(@PathVariable Long id){
        List<Long> ids= new ArrayList<>();
        ids.add(id);
        return predictionRepository.findAllById(ids);
    }
}
