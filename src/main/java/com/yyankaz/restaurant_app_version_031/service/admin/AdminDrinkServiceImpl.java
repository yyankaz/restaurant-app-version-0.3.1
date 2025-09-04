package com.yyankaz.restaurant_app_version_031.service.admin;

import com.yyankaz.restaurant_app_version_031.model.Drink;
import com.yyankaz.restaurant_app_version_031.repository.admin.AdminDrinkRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AdminDrinkServiceImpl implements AdminDrinkService {

    private final AdminDrinkRepository adminDrinkRepository;

    @Override
    public List<Drink> getAllDrinks() {
        return adminDrinkRepository.findAll();
    }

    @Override
    public void createNewDrink(Drink drink) {
        adminDrinkRepository.save(drink);
    }

    @Override
    public void deleteDrinkById(Long id) {
        Drink drink = adminDrinkRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Drink not found with id: " + id));
        adminDrinkRepository.delete(drink);
    }

    @Override
    public void updateDrinkById(Long id, Drink drink) {
        Drink existing = adminDrinkRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Drink not found with id: " + id));
        existing.setDrinkName(drink.getDrinkName());
        existing.setDrinkPrice(drink.getDrinkPrice());
        existing.setDrinkDescription(drink.getDrinkDescription());
        existing.setDrinkImageURL(drink.getDrinkImageURL());
        existing.setIngredients(drink.getIngredients());
        existing.setCategory(drink.getCategory());
        adminDrinkRepository.save(existing);
    }
}
