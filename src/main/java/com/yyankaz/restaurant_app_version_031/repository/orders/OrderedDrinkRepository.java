package com.yyankaz.restaurant_app_version_031.repository.orders;

import com.yyankaz.restaurant_app_version_031.model.OrderedDrink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderedDrinkRepository extends JpaRepository<OrderedDrink, Long> {
}
