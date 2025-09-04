package com.yyankaz.restaurant_app_version_031.service.admin;


import com.yyankaz.restaurant_app_version_031.model.Drink;
import com.yyankaz.restaurant_app_version_031.model.Ingredient;

import java.util.List;

public interface AdminIngredientService {
    List<Ingredient> getAllIngredients();
    void createNewIngredient(Ingredient ingredient);
    void deleteIngredientById(Long id);
    void updateIngredientById(Long id);
}
