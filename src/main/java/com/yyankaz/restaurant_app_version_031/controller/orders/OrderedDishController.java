package com.yyankaz.restaurant_app_version_031.controller.orders;

import com.yyankaz.restaurant_app_version_031.model.OrderedDish;
import com.yyankaz.restaurant_app_version_031.model.OrderedDrink;
import com.yyankaz.restaurant_app_version_031.service.orders.OrderedDishService;
import com.yyankaz.restaurant_app_version_031.service.orders.OrderedDrinkService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/dish_ordering")
public class OrderedDishController {

    private final OrderedDishService orderedDishService;

    @PostMapping
    public OrderedDish createOrderedDish(@RequestBody OrderedDish orderedDish) {
        return orderedDishService.createOrderedDish(orderedDish);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteOrderedDishById(@PathVariable Long id) {
        orderedDishService.deleteOrderedDishById(id);
    }

    @PutMapping("/dish_update/{id}")
    public OrderedDish updateOrderedDishById(@PathVariable Long id, @RequestBody OrderedDish updatedDish) {
        return orderedDishService.updateOrderedDishById(id, updatedDish);
    }

}
