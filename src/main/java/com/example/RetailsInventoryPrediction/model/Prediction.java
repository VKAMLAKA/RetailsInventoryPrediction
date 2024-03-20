package com.example.RetailsInventoryPrediction.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "prediction")
@Getter
@Setter
public class Prediction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "product_category")
    private String productCategory;

    @Column(name = "product_name")
    private String productName;

    @Column(name="image_url")
    private String imageUrl;

    @Column(name="prediction")
    private String prediction;

    public Prediction() {
    }

    public Prediction(long id, String productCategory, String productName, String imageUrl, String prediction) {
        this.id = id;
        this.productCategory = productCategory;
        this.productName = productName;
        this.imageUrl = imageUrl;
        this.prediction = prediction;
    }
}
