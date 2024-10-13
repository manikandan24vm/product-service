package com.ecommers.product_service.service.impl;

import com.ecommers.product_service.entity.Product;
import com.ecommers.product_service.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product getProductByIdOrName(Long productId, String productName) {
        return null;
    }


    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product updateById(Long productId, Product product) {
        return null;
    }

    @Override
    public void deleteProductById(Long id) {

    }
}
