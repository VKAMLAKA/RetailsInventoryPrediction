package com.example.RetailsInventoryPrediction.controller;

import com.example.RetailsInventoryPrediction.model.Discount;
import com.example.RetailsInventoryPrediction.repository.DiscountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/backend")
public class DiscountController {

    @Autowired
    DiscountRepository discountRepository;

    @GetMapping("/DiscountedProducts")
    public List<Discount> getAllDiscountedProducts(){
         return discountRepository.findAll();
    }

    @GetMapping("/DiscountedProducts/{name}")
    public List<Discount> getAllDiscountedProductsById(@PathVariable String name){
        List<String> ids= new ArrayList<>();
        ids.add(name);
        return discountRepository.findAllById(ids);
    }
}
