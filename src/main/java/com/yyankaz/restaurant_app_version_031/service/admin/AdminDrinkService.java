package com.yyankaz.restaurant_app_version_031.service.admin;

import com.yyankaz.restaurant_app_version_031.model.Drink;

import java.util.List;

public interface AdminDrinkService {
    List<Drink> getAllDrinks();
    void createNewDrink(Drink drink);
    void deleteDrinkById(Long id);
    void updateDrinkById(Long id);
}
