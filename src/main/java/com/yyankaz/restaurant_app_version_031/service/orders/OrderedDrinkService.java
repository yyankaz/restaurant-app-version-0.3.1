package com.yyankaz.restaurant_app_version_031.service.orders;

import com.yyankaz.restaurant_app_version_031.model.OrderedDish;
import com.yyankaz.restaurant_app_version_031.model.OrderedDrink;

public interface OrderedDrinkService {
    OrderedDrink createOrderedDrink(OrderedDrink orderedDrink);
    void deleteOrderedDrinkById(Long id);
    OrderedDrink updateOrderedDrinkById(Long id, OrderedDrink updatedDrink);
}
