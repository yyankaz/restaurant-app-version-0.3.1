package com.yyankaz.restaurant_app_version_031.service;

import com.yyankaz.restaurant_app_version_031.model.Drink;

import java.util.List;

public interface DrinkService {
    Drink getDrinkById(Long drinkId);
    List<Drink> getDrinksByCategory(Long drinkCategoryId);
}
