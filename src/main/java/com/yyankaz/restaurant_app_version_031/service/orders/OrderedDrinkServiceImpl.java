package com.yyankaz.restaurant_app_version_031.service.orders;

import com.yyankaz.restaurant_app_version_031.model.OrderedDish;
import com.yyankaz.restaurant_app_version_031.model.OrderedDrink;
import com.yyankaz.restaurant_app_version_031.repository.orders.OrderedDrinkRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderedDrinkServiceImpl implements OrderedDrinkService{

    private final OrderedDrinkRepository orderedDrinkRepository;

    @Override
    public OrderedDrink createOrderedDrink(OrderedDrink orderedDrink) {
        return orderedDrinkRepository.save(orderedDrink);
    }

    @Override
    public void deleteOrderedDrinkById(Long id) {
        orderedDrinkRepository.deleteById(id);
    }

    @Override
    public OrderedDrink updateOrderedDrinkById(Long id, OrderedDrink updatedDrink) {
        OrderedDrink existing = orderedDrinkRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Ordered drink not found with id: " + id));
        existing.setDrinkQuantity(updatedDrink.getDrinkQuantity());
        return orderedDrinkRepository.save(existing);
    }
}
