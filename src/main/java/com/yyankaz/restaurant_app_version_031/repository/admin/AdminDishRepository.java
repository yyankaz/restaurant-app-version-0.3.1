package com.yyankaz.restaurant_app_version_031.repository.admin;

import com.yyankaz.restaurant_app_version_031.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminDishRepository extends JpaRepository<Dish, Long> {
}
