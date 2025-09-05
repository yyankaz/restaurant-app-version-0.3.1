package com.yyankaz.restaurant_app_version_031.service.orders;

import com.yyankaz.restaurant_app_version_031.model.RestaurantOrder;
import com.yyankaz.restaurant_app_version_031.repository.orders.RestaurantOrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RestaurantOrderServiceImpl implements RestaurantOrderService{

    private final RestaurantOrderRepository restaurantOrderRepository;

    @Override
    public RestaurantOrder createOrder(RestaurantOrder restaurantOrder) {
        return restaurantOrderRepository.save(restaurantOrder);
    }

    @Override
    public RestaurantOrder getOrderById(Long id) {
        return restaurantOrderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order with id " + id + " has not been found."));
    }

    @Override
    public void deleteOrderById(Long id) {
        restaurantOrderRepository.deleteById(id);
    }

    @Override
    public RestaurantOrder updateOrder(Long id, RestaurantOrder updatedOrder) {
        RestaurantOrder existing = getOrderById(id);
        existing.setOrderedDishes(updatedOrder.getOrderedDishes());
        existing.setOrderedDrinks(updatedOrder.getOrderedDrinks());
        existing.setCreatedAt(updatedOrder.getCreatedAt());
        return restaurantOrderRepository.save(existing);
    }

}
