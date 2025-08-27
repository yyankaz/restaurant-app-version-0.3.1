package com.yyankaz.restaurant_app_version_031.service;

import com.yyankaz.restaurant_app_version_031.model.DishCategory;
import com.yyankaz.restaurant_app_version_031.model.DrinkCategory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MenuServiceImpl implements MenuService {

    private DrinkCategoryService drinkCategoryService;
    private DishCategoryService dishCategoryService;
    @Override
    public List<DishCategory> getDishCategories() {
        return dishCategoryService.getAllCategories();
    }

    @Override
    public List<DrinkCategory> getDrinkCategories() {
        return drinkCategoryService.getAllCategories();
    }
}
