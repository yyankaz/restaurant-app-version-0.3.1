package com.yyankaz.restaurant_app_version_031.service.admin;

import com.yyankaz.restaurant_app_version_031.model.Dish;

import java.util.List;

public interface AdminDishService {
    List<Dish> getAllDishes();
    void createNewDish(Dish dish);
    void deleteDishById(Long id);
    void updateDishById(Long id, Dish dish);
}
