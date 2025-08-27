package com.yyankaz.restaurant_app_version_031.controller;

import com.yyankaz.restaurant_app_version_031.model.Dish;
import com.yyankaz.restaurant_app_version_031.service.DishService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/dish")
public class DishController {

    private DishService dishService;

    @GetMapping("/{dishId}")
    public Dish getDishById(@PathVariable Long dishId) {
        return dishService.getDishById(dishId);
    }

    @PostMapping("/save")
    public Dish saveDish(@RequestBody Dish dish) {
        return dishService.saveDish(dish);
    }

    @DeleteMapping("/delete/{dishId}")
    public void deleteDish(@PathVariable Long dishId) {
        dishService.deleteDish(dishId);
    }

    @GetMapping
    public List<Dish> getDishesByCategory(@RequestParam Long dishCategoryId) {
        return dishService.getDishesByCategory(dishCategoryId);
    }

}
