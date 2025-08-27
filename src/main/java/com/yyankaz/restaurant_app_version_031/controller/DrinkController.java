package com.yyankaz.restaurant_app_version_031.controller;

import com.yyankaz.restaurant_app_version_031.model.Drink;
import com.yyankaz.restaurant_app_version_031.service.DrinkServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/drink")
public class DrinkController {

    private DrinkServiceImpl drinkService;

    @GetMapping("/{id}")
    public Drink getDrinkById(Long id) {
        return drinkService.getDrinkById(id);
    }

    @PostMapping("/save")
    public Drink saveDrink(Drink drink) {
        return drinkService.saveDrink(drink);
    }

    @DeleteMapping("/delete")
    public void deleteDrink(Long id) {
        drinkService.deleteDrink(id);
    }

    @GetMapping
    public List<Drink> getDrinksByCategory(Long categoryId) {
        return drinkService.getDrinksByCategory(categoryId);
    }

}
