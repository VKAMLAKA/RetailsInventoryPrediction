package com.example.RetailsInventoryPrediction.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "discount")
@Getter
@Setter
public class Discount {
    @Id
    @Column(name = "product_name")
    private String productName;

    @Column(name="updated_price")
    private double updatedPrice;

    @Column(name="expiry_in_days")
    private int expiryInDays;

    @Column(name="discount")
    private double discount;

    public Discount(){

    }

    public Discount(String productName, double updatedPrice, int expiryInDays, double discount) {
        this.productName = productName;
        this.updatedPrice = updatedPrice;
        this.expiryInDays = expiryInDays;
        this.discount = discount;
    }
}
