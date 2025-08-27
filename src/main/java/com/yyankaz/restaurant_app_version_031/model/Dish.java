package com.yyankaz.restaurant_app_version_031.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Dish {
    @Id
    @GeneratedValue
    private Long id;
    private String dishName;
    private Double dishPrice;
    private String dishDescription;
    private String dishImageURL;
    @ManyToMany
    private List<Ingredient> ingredients;
    @ManyToOne
    private DishCategory category;
    @OneToMany
    private List<OrderedDish> orderedDishes;
}
