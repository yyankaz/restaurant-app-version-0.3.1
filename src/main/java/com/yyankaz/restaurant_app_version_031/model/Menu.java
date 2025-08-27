package com.yyankaz.restaurant_app_version_031.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Menu {
    @Id
    @GeneratedValue
    private Long id;
    @OneToMany
    private List<DishCategory> dishCategories;
    @OneToMany
    private List<DrinkCategory> drinkCategories;
}
