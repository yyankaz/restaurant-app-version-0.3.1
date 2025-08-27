package com.yyankaz.restaurant_app_version_031.service;

import com.yyankaz.restaurant_app_version_031.model.Drink;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DrinkServiceImpl implements DrinkService{

    private DrinkService drinkService;

    @Override
    public Drink getDrinkById(Long id) {
        return drinkService.getDrinkById(id);
    }

    @Override
    public Drink saveDrink(Drink drink) {
        return drinkService.saveDrink(drink);
    }

    @Override
    public void deleteDrink(Long id) {
        drinkService.deleteDrink(id);
    }

    @Override
    public List<Drink> getDrinksByCategory(Long categoryId) {
        return drinkService.getDrinksByCategory(categoryId);
    }
}
