package com.yyankaz.restaurant_app_version_031.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderedDish {
    @Id
    @GeneratedValue
    private Long id;
    private Integer dishQuantity;
    private Double dishFullPrice;
    @ManyToOne
    private Dish dish;
    @ManyToOne
    private RestaurantOrder restaurantOrder;
}
