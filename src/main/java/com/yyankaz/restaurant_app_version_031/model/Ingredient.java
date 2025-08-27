package com.yyankaz.restaurant_app_version_031.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Ingredient {
    @Id
    @GeneratedValue
    private Long ingredientId;
    private String ingredientName;
    private Boolean isAlegric;
    @ManyToMany
    private List<Dish> dishes;
    @ManyToMany
    private List<Drink> drinks;
}
