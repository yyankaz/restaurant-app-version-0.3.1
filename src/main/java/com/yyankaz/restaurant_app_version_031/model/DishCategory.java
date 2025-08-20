package com.yyankaz.restaurant_app_version_031.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class DishCategory {
    @Id
    @GeneratedValue
    private Long dishCategoryID;
    private DishCategoryName dishCategoryName;
    @OneToMany
    private List<Dish> dishes;
    @ManyToOne
    private Menu menu;
}
