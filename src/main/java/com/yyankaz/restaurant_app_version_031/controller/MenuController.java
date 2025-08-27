package com.yyankaz.restaurant_app_version_031.controller;

import com.yyankaz.restaurant_app_version_031.model.DishCategory;
import com.yyankaz.restaurant_app_version_031.model.DrinkCategory;
import com.yyankaz.restaurant_app_version_031.service.MenuService;
import com.yyankaz.restaurant_app_version_031.service.RestaurantOrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/menu")
public class MenuController {

    private final MenuService menuService;
    //private final RestaurantOrderService restaurantOrderService;

    @GetMapping("/dish_categories")
    public List<DishCategory> getDishCategories() {
        return menuService.getDishCategories();
    }

    @GetMapping("/drink_categories")
    public List<DrinkCategory> getDrinkCategories() {
        return menuService.getDrinkCategories();
    }

}
