package com.yyankaz.restaurant_app_version_031.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

@Entity
public class OrderedDrink {
    @Id
    @GeneratedValue
    private Long id;
    @Getter
    private Integer drinkQuantity;
    private Double drinkFullPrice;
    @ManyToOne
    private Drink drink;
    @ManyToOne
    private RestaurantOrder restaurantOrder;

    public void setDrinkQuantity(Integer drinkQuantity){
        if (drinkQuantity == null || drinkQuantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than 0");
        }
        this.drinkQuantity = drinkQuantity;
    }
}
