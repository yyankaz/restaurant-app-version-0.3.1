package com.yyankaz.restaurant_app_version_031.service;

import com.yyankaz.restaurant_app_version_031.model.Dish;

import java.util.List;

public interface DishService {
    Dish getDishById(Long dishId);
    Dish saveDish(Dish dish);
    void deleteDish(Long dishId);
    List<Dish> getDishesByCategory(Long dishCategoryId);
}
