package com.yyankaz.restaurant_app_version_031.service;

import com.yyankaz.restaurant_app_version_031.model.Drink;
import com.yyankaz.restaurant_app_version_031.repository.DrinkRepository;

import java.util.List;

public interface DrinkService {
    Drink getDrinkById(Long id);
    Drink saveDrink(Drink drink);
    void deleteDrink(Long id);
    List<Drink> getDrinksByCategory(Long categoryId);
}
