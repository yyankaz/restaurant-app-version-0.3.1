package com.yyankaz.restaurant_app_version_031.controller.admin;


import com.yyankaz.restaurant_app_version_031.model.Ingredient;
import com.yyankaz.restaurant_app_version_031.service.admin.AdminIngredientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/admin/ingredient")
public class AdminIngredientController {

    private final AdminIngredientService adminIngredientService;

    @GetMapping("/all_ingredients")
    public List<Ingredient> getAllIngredients() {
        return adminIngredientService.getAllIngredients();
    }

    @PostMapping("/ingredient_creator")
    public void createNewIngredient(@RequestBody Ingredient ingredient) {
        adminIngredientService.createNewIngredient(ingredient);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteIngredientById(@PathVariable Long id) {
        adminIngredientService.deleteIngredientById(id);
    }

    @PutMapping("/update/{id}")
    public void updateIngredientById(@PathVariable Long id, @RequestBody Ingredient ingredient) {
        adminIngredientService.updateIngredientById(id, ingredient);
    }

}
