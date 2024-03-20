package com.example.RetailsInventoryPrediction.controller;
import com.example.RetailsInventoryPrediction.model.ProductEntity;
import com.example.RetailsInventoryPrediction.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/backend")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/products")
    public List<ProductEntity> getAllProducts(){
        return productRepository.findAll();
    }

    @GetMapping("/products/{id}")
    public List<ProductEntity> getProductById(@PathVariable Long id){
        List<Long> ids= new ArrayList<>();
        ids.add(id);
        return productRepository.findAllById(ids);
    }



}
