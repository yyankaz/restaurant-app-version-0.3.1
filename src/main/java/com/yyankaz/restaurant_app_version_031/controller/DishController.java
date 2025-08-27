package com.yyankaz.restaurant_app_version_031.controller;

import com.yyankaz.restaurant_app_version_031.model.Dish;
import com.yyankaz.restaurant_app_version_031.service.DishServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/dish")
public class DishController {

    private DishServiceImpl dishService;

    @GetMapping("/{id}")
    public Dish getDishById(Long id) {
        return dishService.getDishById(id);
    }

    @PostMapping("/save")
    public Dish saveDish(Dish dish) {
        return dishService.saveDish(dish);
    }

    @DeleteMapping("/delete")
    public void deleteDish(Long id) {
        dishService.deleteDish(id);
    }

    @GetMapping
    public List<Dish> getDishesByCategory(Long categoryId) {
        return dishService.getDishesByCategory(categoryId);
    }

}
