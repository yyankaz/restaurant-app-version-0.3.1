package com.yyankaz.restaurant_app_version_031.service;

import com.yyankaz.restaurant_app_version_031.model.DishCategory;
import com.yyankaz.restaurant_app_version_031.repository.DishCategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DishCategoryServiceImpl implements DishCategoryService{

    private DishCategoryRepository dishCategoryRepository;

    @Override
    public List<DishCategory> getAllCategories() {
        return dishCategoryRepository.findAll();
    }

    @Override
    public DishCategory getCategoryById(Long dishCategoryId) {
        return dishCategoryRepository.findById(dishCategoryId)
                .orElseThrow(() -> new RuntimeException("Category with id " + dishCategoryId + " has not been found."));
    }
}
