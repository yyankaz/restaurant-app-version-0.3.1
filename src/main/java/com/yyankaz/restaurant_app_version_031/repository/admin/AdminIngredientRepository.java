package com.yyankaz.restaurant_app_version_031.repository.admin;

import com.yyankaz.restaurant_app_version_031.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminIngredientRepository extends JpaRepository<Ingredient, Long> {
}
