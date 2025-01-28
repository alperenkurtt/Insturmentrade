package com.Insturmentrade.category_service.Repository;

import com.Insturmentrade.category_service.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
