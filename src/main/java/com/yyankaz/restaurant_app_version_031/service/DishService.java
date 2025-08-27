package com.yyankaz.restaurant_app_version_031.service;

import com.yyankaz.restaurant_app_version_031.model.Dish;

import java.util.List;

public interface DishService {
    Dish getDishById(Long id);
    Dish saveDish(Dish dish);
    void deleteDish(Long id);
    List<Dish> getDishesByCategory(Long categoryId);
}
