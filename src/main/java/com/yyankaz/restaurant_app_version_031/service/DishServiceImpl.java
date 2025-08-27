package com.yyankaz.restaurant_app_version_031.service;

import com.yyankaz.restaurant_app_version_031.model.Dish;
import com.yyankaz.restaurant_app_version_031.repository.DishRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DishServiceImpl implements DishService{

    private DishRepository dishRepository;
    private DishCategoryService dishCategoryService;

    @Override
    public Dish getDishById(Long dishId) {
        return dishRepository.findById(dishId)
                .orElseThrow(() -> new RuntimeException("Dish with id " + dishId + " has not been found."));
    }

    @Override
    public Dish saveDish(Dish dish) {
        return dishRepository.save(dish);
    }

    @Override
    public void deleteDish(Long dishId) {
        dishRepository.deleteById(dishId);
    }

    @Override
    public List<Dish> getDishesByCategory(Long dishCategoryId) {
        dishCategoryService.getCategoryById(dishCategoryId);
        return dishRepository.findByCategoryId(dishCategoryId);
    }
}
