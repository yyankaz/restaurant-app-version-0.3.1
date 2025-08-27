package com.yyankaz.restaurant_app_version_031.service;

import com.yyankaz.restaurant_app_version_031.model.DrinkCategory;

import java.util.List;


public interface DrinkCategoryService {
    List<DrinkCategory> getAllCategories();
    DrinkCategory getCategoryById(Long drinkCategoryId);
}
