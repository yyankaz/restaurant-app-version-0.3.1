package com.yyankaz.restaurant_app_version_031.controller.orders;

import com.yyankaz.restaurant_app_version_031.model.OrderedDrink;
import com.yyankaz.restaurant_app_version_031.service.orders.OrderedDrinkService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/drink_ordering")
public class OrderedDrinkController {

    private final OrderedDrinkService orderedDrinkService;

    @PostMapping
    public OrderedDrink createOrderedDrink(@RequestBody OrderedDrink orderedDrink) {
        return orderedDrinkService.createOrderedDrink(orderedDrink);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteOrderedDrinkById(@PathVariable Long id) {
        orderedDrinkService.deleteOrderedDrinkById(id);
    }

    @PutMapping("/drink_update/{id}")
    public OrderedDrink updateOrderedDrinkById(@PathVariable Long id, @RequestBody OrderedDrink updatedDrink) {
        return orderedDrinkService.updateOrderedDrinkById(id, updatedDrink);
    }

}
