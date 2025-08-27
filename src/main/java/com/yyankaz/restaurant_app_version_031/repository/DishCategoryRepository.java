package com.yyankaz.restaurant_app_version_031.repository;

import com.yyankaz.restaurant_app_version_031.model.DishCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DishCategoryRepository extends JpaRepository<DishCategory, Long> {
}
