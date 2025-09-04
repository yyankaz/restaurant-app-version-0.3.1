package com.yyankaz.restaurant_app_version_031.service.admin;


import com.yyankaz.restaurant_app_version_031.model.Dish;
import com.yyankaz.restaurant_app_version_031.repository.admin.AdminDishRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AdminDishServiceImpl implements AdminDishService {

    private final AdminDishRepository adminDishRepository;


    @Override
    public List<Dish> getAllDishes() {
        return adminDishRepository.findAll();
    }

    @Override
    public void createNewDish(Dish dish) {
        adminDishRepository.save(dish);
    }

    @Override
    public void deleteDishById(Long id) {
        Dish dish = adminDishRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Dish not found with id: " + id));
        adminDishRepository.delete(dish);
    }

    @Override
    public void updateDishById(Long id) {
        Dish dish = adminDishRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Dish not found with id: " + id));
        adminDishRepository.save(dish);
    }
}
