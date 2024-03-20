package com.example.RetailsInventoryPrediction.model;

import javax.persistence.*;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "product")
@Getter
@Setter

public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "manufacture_date")
    private Date manufactureDate;

    @Column(name = "expiry_date")
    private Date expiryDate;

    @Column(name="price")
    private double price;

    @Column(name="previous_sales")
    private int previousSales;

    @Column(name="quantity")
    private int quantity;

    public ProductEntity(){

    }

    public ProductEntity(long id, String productName, Date manufactureDate, Date expiryDate, double price, int previousSales, int quantity) {
        this.id = id;
        this.productName = productName;
        this.manufactureDate = manufactureDate;
        this.expiryDate = expiryDate;
        this.price = price;
        this.previousSales = previousSales;
        this.quantity = quantity;
    }
}
