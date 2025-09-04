package com.yyankaz.restaurant_app_version_031.service.admin;

import com.yyankaz.restaurant_app_version_031.model.Dish;
import com.yyankaz.restaurant_app_version_031.model.Ingredient;
import com.yyankaz.restaurant_app_version_031.repository.admin.AdminIngredientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AdminIngredientServiceImpl implements AdminIngredientService{

    private final AdminIngredientRepository adminIngredientRepository;

    @Override
    public List<Ingredient> getAllIngredients() {
        return adminIngredientRepository.findAll();
    }

    @Override
    public void createNewIngredient(Ingredient ingredient) {
        adminIngredientRepository.save(ingredient);
    }

    @Override
    public void deleteIngredientById(Long id) {
        Ingredient ingredient = adminIngredientRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Dish not found with id: " + id));
        adminIngredientRepository.delete(ingredient);
    }

    @Override
    public void updateIngredientById(Long id) {
        Ingredient ingredient = adminIngredientRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Dish not found with id: " + id));
        adminIngredientRepository.save(ingredient);
    }
}
