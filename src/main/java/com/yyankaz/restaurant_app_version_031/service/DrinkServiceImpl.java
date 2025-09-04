package com.yyankaz.restaurant_app_version_031.service;

import com.yyankaz.restaurant_app_version_031.model.Drink;
import com.yyankaz.restaurant_app_version_031.repository.DrinkRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DrinkServiceImpl implements DrinkService{

    private final DrinkRepository drinkRepository;
    private final DrinkCategoryService drinkCategoryService;

    @Override
    public Drink getDrinkById(Long drinkId) {
        return drinkRepository.findById(drinkId)
                .orElseThrow(() -> new RuntimeException("Drink with id " + drinkId + " has not been found."));
    }


    @Override
    public List<Drink> getDrinksByCategory(Long drinkCategoryId) {
        drinkCategoryService.getCategoryById(drinkCategoryId);
        return drinkRepository.findByCategoryId(drinkCategoryId);
    }
}
