package com.yyankaz.restaurant_app_version_031.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;

@Entity
public class OrderedDish {
    @Id
    @GeneratedValue
    private Long id;
    @Getter
    private Integer dishQuantity;
    private Double dishFullPrice;
    @ManyToOne
    private Dish dish;
    @ManyToOne
    private RestaurantOrder restaurantOrder;

    public void setDishQuantity(Integer dishQuantity){
        if (dishQuantity == null || dishQuantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than 0");
        }
        this.dishQuantity = dishQuantity;
    }
}
