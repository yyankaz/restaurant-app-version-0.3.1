package com.yyankaz.restaurant_app_version_031.service;


import com.yyankaz.restaurant_app_version_031.model.DishCategory;
import com.yyankaz.restaurant_app_version_031.model.DrinkCategory;

import java.util.List;

public interface MenuService {
    List<DishCategory> getDishCategories();
    List<DrinkCategory> getDrinkCategories();
}
