package com.yyankaz.restaurant_app_version_031.repository.admin;

import com.yyankaz.restaurant_app_version_031.model.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminDrinkRepository extends JpaRepository<Drink, Long> {
}
