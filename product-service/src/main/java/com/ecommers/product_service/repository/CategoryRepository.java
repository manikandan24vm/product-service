package com.ecommers.product_service.repository;

import com.ecommers.product_service.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
