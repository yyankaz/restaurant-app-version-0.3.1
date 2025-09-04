package com.yyankaz.restaurant_app_version_031.controller.admin;

import com.yyankaz.restaurant_app_version_031.model.Dish;
import com.yyankaz.restaurant_app_version_031.service.admin.AdminDishService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/admin/dishes")
public class AdminDishController {
    private final AdminDishService adminDishService;

    @GetMapping("/all_dishes")
    public List<Dish> getAllDishes() {
        return adminDishService.getAllDishes();
    }

    @PostMapping("/dish_creator")
    public void createNewDish(@RequestBody Dish dish) {
        adminDishService.createNewDish(dish);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDishById(@PathVariable Long id) {
        adminDishService.deleteDishById(id);
    }

    @PutMapping("/update/{id}")
    public void updateDishById(@PathVariable Long id) {
        adminDishService.updateDishById(id);
    }
}
