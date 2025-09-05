package com.yyankaz.restaurant_app_version_031.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class RestaurantOrder {
    @Id
    @GeneratedValue
    private Long id;
    private Double totalPrice;
    @Setter
    @Getter
    private LocalDateTime createdAt;
    @OneToMany
    @Setter
    @Getter
    private List<OrderedDish> orderedDishes;
    @OneToMany
    @Setter
    @Getter
    private List<OrderedDrink> orderedDrinks;

}
