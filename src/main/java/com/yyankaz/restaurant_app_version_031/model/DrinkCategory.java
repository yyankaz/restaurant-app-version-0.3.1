package com.yyankaz.restaurant_app_version_031.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class DrinkCategory {
    @Id
    @GeneratedValue
    private Long drinkCategoryId;
    private DrinkCategoryName drinkCategoryName;
    @OneToMany
    private List<Drink> drinks;
    @ManyToOne
    private Menu menu;

}
