package com.yyankaz.restaurant_app_version_031.service.orders;

import com.yyankaz.restaurant_app_version_031.model.OrderedDish;

public interface OrderedDishService {
    OrderedDish createOrderedDish(OrderedDish orderedDish);
    void deleteOrderedDishById(Long id);
    OrderedDish updateOrderedDishById(Long id, OrderedDish orderedDish);
}
