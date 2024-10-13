package com.ecommers.product_service.service.impl;

import com.ecommers.product_service.entity.Category;
import com.ecommers.product_service.service.CategoryService;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {
    @Override
    public Category createCategory(Category category) {
        return null;
    }

    @Override
    public List<Category> getAllCategory() {
        return List.of();
    }

    @Override
    public Category updateCategoryById(Long categoryId, Category category) {
        return null;
    }

    @Override
    public void deleteCategory(Long categoryId) {

    }

    @Override
    public Category getById(Long categoryId, Long categoryName) {
        return null;
    }
}
