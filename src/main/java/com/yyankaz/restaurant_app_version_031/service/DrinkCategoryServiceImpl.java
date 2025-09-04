package com.yyankaz.restaurant_app_version_031.service;

import com.yyankaz.restaurant_app_version_031.model.DrinkCategory;
import com.yyankaz.restaurant_app_version_031.repository.DrinkCategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DrinkCategoryServiceImpl implements DrinkCategoryService{

    private final DrinkCategoryRepository drinkCategoryRepository;

    @Override
    public List<DrinkCategory> getAllCategories() {
        return drinkCategoryRepository.findAll();
    }

    @Override
    public DrinkCategory getCategoryById(Long drinkCategoryId) {
        return drinkCategoryRepository.findById(drinkCategoryId)
                .orElseThrow(() -> new RuntimeException("Category with id " + drinkCategoryId + " has not been found."));
    }
}
