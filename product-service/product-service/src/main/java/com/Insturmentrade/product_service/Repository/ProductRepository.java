package com.Insturmentrade.product_service.Repository;

import com.Insturmentrade.product_service.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategoryId(Long categoryId);
    List<Product> findByUserId(Long userId);
}
