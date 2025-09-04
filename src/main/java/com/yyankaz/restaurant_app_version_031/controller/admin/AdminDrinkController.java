package com.yyankaz.restaurant_app_version_031.controller.admin;

import com.yyankaz.restaurant_app_version_031.model.Drink;
import com.yyankaz.restaurant_app_version_031.service.admin.AdminDrinkService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/admin/drinks")
public class AdminDrinkController {

    private final AdminDrinkService adminDrinkService;

    @GetMapping("/all_drinks")
    public List<Drink> getAllDrinks() {
        return adminDrinkService.getAllDrinks();
    }

    @PostMapping("/drink_creator")
    public void createNewDrink(Drink drink) {
        adminDrinkService.createNewDrink(drink);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDrinkById(Long id) {
        adminDrinkService.deleteDrinkById(id);
    }

    @PutMapping("/update/{id}")
    public void updateDrinkById(Long id) {
        adminDrinkService.updateDrinkById(id);
    }
}
