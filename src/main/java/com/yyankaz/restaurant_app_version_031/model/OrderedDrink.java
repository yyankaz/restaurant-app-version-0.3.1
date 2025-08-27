package com.yyankaz.restaurant_app_version_031.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderedDrink {
    @Id
    @GeneratedValue
    private Long id;
    private Integer drinkQuantity;
    private Double drinkFullPrice;
    @ManyToOne
    private Drink drink;
    @ManyToOne
    private RestaurantOrder restaurantOrder;
}
