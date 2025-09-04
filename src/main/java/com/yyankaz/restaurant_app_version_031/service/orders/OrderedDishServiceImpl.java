package com.yyankaz.restaurant_app_version_031.service.orders;

import com.yyankaz.restaurant_app_version_031.model.OrderedDish;
import com.yyankaz.restaurant_app_version_031.repository.orders.OrderedDishRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderedDishServiceImpl implements OrderedDishService{

    private final OrderedDishRepository orderedDishRepository;

    @Override
    public OrderedDish createOrderedDish(OrderedDish orderedDish) {
        return orderedDishRepository.save(orderedDish);
    }

    @Override
    public void deleteOrderedDishById(Long id) {
        orderedDishRepository.deleteById(id);
    }

    @Override
    public OrderedDish updateOrderedDishById(Long id, OrderedDish updatedDish) {
        OrderedDish existing = orderedDishRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Ordered dish not found with id: " + id));
        existing.setDishQuantity(updatedDish.getDishQuantity());
        return orderedDishRepository.save(existing);
    }
}
