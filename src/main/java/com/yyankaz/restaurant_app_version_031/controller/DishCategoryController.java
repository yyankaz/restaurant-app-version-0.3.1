package com.yyankaz.restaurant_app_version_031.controller;

import com.yyankaz.restaurant_app_version_031.model.DishCategory;
import com.yyankaz.restaurant_app_version_031.service.DishCategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/dish_categories")
public class DishCategoryController {
    private DishCategoryService dishCategoryService;

    @GetMapping
    public List<DishCategory> getAllCategories() {
        return dishCategoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public DishCategory getCategoryById(@PathVariable Long dishCategoryId) {
        return dishCategoryService.getCategoryById(dishCategoryId);
    }

}
