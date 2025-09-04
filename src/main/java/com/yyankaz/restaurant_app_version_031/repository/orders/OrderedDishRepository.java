package com.yyankaz.restaurant_app_version_031.repository.orders;

import com.yyankaz.restaurant_app_version_031.model.OrderedDish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderedDishRepository extends JpaRepository<OrderedDish, Long> {
}
