package com.yyankaz.restaurant_app_version_031.controller.orders;

import com.yyankaz.restaurant_app_version_031.model.RestaurantOrder;
import com.yyankaz.restaurant_app_version_031.service.orders.RestaurantOrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/order")
public class RestaurantOrderController {

    private final RestaurantOrderService restaurantOrderService;

    @PostMapping("/order_creator")
    public RestaurantOrder createOrder(@RequestBody RestaurantOrder restaurantOrder) {
        return restaurantOrderService.createOrder(restaurantOrder);
    }

    @GetMapping("/{id}")
    public RestaurantOrder getOrderById(@PathVariable Long id) {
        return restaurantOrderService.getOrderById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteOrderById(@PathVariable Long id) {
        restaurantOrderService.deleteOrderById(id);
    }

    @PutMapping("/order_update/{id}")
    public RestaurantOrder updateOrder(@PathVariable Long id, @RequestBody RestaurantOrder updatedOrder) {
        return restaurantOrderService.updateOrder(id, updatedOrder);
    }

}
