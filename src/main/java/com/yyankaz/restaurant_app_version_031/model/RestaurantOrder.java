package com.yyankaz.restaurant_app_version_031.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class RestaurantOrder {
    @Id
    @GeneratedValue
    private Long orderID;
    private Double totalPrice;
    private LocalDateTime createdAt;
    @OneToMany
    private List<OrderedDish> orderedDishes;
    @OneToMany
    private List<OrderedDrink> orderedDrinks;

}
