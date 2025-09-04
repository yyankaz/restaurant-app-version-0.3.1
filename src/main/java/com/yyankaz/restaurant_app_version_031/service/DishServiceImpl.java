package com.yyankaz.restaurant_app_version_031.service;

import com.yyankaz.restaurant_app_version_031.model.Dish;
import com.yyankaz.restaurant_app_version_031.repository.DishRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DishServiceImpl implements DishService{

    private final DishRepository dishRepository;
    private final DishCategoryService dishCategoryService;

    @Override
    public Dish getDishById(Long dishId) {
        return dishRepository.findById(dishId)
                .orElseThrow(() -> new RuntimeException("Dish with id " + dishId + " has not been found."));
    }


    @Override
    public List<Dish> getDishesByCategory(Long dishCategoryId) {
        dishCategoryService.getCategoryById(dishCategoryId);
        return dishRepository.findByCategoryId(dishCategoryId);
    }
}
