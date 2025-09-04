package com.yyankaz.restaurant_app_version_031.controller;

import com.yyankaz.restaurant_app_version_031.model.Drink;
import com.yyankaz.restaurant_app_version_031.service.DrinkService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/drink")
public class DrinkController {

    private DrinkService drinkService;

    @GetMapping("/{drinkId}")
    public Drink getDrinkById(@PathVariable Long drinkId) {
        return drinkService.getDrinkById(drinkId);
    }


    @GetMapping
    public List<Drink> getDrinksByCategory(@RequestParam Long drinkCategoryId) {
        return drinkService.getDrinksByCategory(drinkCategoryId);
    }

}
