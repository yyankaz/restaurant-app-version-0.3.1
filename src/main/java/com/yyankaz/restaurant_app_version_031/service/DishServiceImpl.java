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

    @Override
    public Dish getDishById(Long id) {
        return dishRepository.getById(id);
    }

    @Override
    public Dish saveDish(Dish dish) {
        return dishRepository.save(dish);
    }

    @Override
    public void deleteDish(Long id) {
        dishRepository.deleteById(id);
    }

    @Override
    public List<Dish> getDishesByCategory(Long categoryId) {
        return dishRepository.findByCategoryId(categoryId);
    }
}
