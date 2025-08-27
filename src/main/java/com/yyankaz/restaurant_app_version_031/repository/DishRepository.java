package com.yyankaz.restaurant_app_version_031.repository;

import com.yyankaz.restaurant_app_version_031.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DishRepository extends JpaRepository<Dish, Long> {
    List<Dish> findByCategoryId(Long dishCategoryId);
}
