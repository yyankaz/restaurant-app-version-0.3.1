package com.yyankaz.restaurant_app_version_031.repository.orders;

import com.yyankaz.restaurant_app_version_031.model.RestaurantOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantOrderRepository extends JpaRepository<RestaurantOrder, Long> {
}
