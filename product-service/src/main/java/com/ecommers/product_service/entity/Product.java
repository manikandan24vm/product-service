package com.ecommers.product_service.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product extends Audit{
    private Long productId;
    private String productName;
    private String description;
    private double price;
    private boolean isStockAvailable;
    private Category category;
}
