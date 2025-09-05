package com.yyankaz.restaurant_app_version_031.service.orders;

import com.yyankaz.restaurant_app_version_031.model.RestaurantOrder;

public interface RestaurantOrderService {
    RestaurantOrder createOrder(RestaurantOrder restaurantOrder);
    RestaurantOrder getOrderById(Long id);
    void deleteOrderById(Long id);
    RestaurantOrder updateOrder(Long id, RestaurantOrder updatedOrder);
}
