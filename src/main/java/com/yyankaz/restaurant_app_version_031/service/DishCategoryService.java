package com.yyankaz.restaurant_app_version_031.service;

import com.yyankaz.restaurant_app_version_031.model.DishCategory;

import java.util.List;

public interface DishCategoryService {
    List<DishCategory> getAllCategories();
    DishCategory getCategoryById(Long dishCategoryId);
}
