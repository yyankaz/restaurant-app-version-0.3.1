package com.yyankaz.restaurant_app_version_031.controller;

import com.yyankaz.restaurant_app_version_031.model.DrinkCategory;
import com.yyankaz.restaurant_app_version_031.service.DrinkCategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/drinks_categories")
public class DrinkCategoryController {
    private DrinkCategoryService drinkCategoryService;

    @GetMapping
    public List<DrinkCategory> getAllCategories() {
        return drinkCategoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public DrinkCategory getCategoryById(@PathVariable Long drinkCategoryId) {
        return drinkCategoryService.getCategoryById(drinkCategoryId);
    }
}
